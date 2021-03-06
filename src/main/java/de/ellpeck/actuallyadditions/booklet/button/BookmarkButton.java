package de.ellpeck.actuallyadditions.booklet.button;

import java.util.ArrayList;
import java.util.List;

import de.ellpeck.actuallyadditions.api.booklet.IBookletChapter;
import de.ellpeck.actuallyadditions.api.booklet.IBookletPage;
import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import de.ellpeck.actuallyadditions.booklet.gui.GuiBooklet;
import de.ellpeck.actuallyadditions.booklet.gui.GuiPage;
import de.ellpeck.actuallyadditions.booklet.misc.BookletUtils;
import de.ellpeck.actuallyadditions.common.util.AssetUtil;
import de.ellpeck.actuallyadditions.common.util.StackUtil;
import de.ellpeck.actuallyadditions.common.util.StringUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.client.config.GuiUtils;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class BookmarkButton extends GuiButton {

    private final GuiBooklet booklet;
    public IBookletPage assignedPage;

    public BookmarkButton(int id, int x, int y, GuiBooklet booklet) {
        super(id, x, y, 16, 16, "");
        this.booklet = booklet;
    }

    public void onPressed() {
        if (this.assignedPage != null) {
            if (GuiScreen.isShiftKeyDown()) {
                this.assignedPage = null;
            } else if (!(this.booklet instanceof GuiPage) || ((GuiPage) this.booklet).pages[0] != this.assignedPage) {
                GuiPage gui = BookletUtils.createPageGui(this.booklet.previousScreen, this.booklet, this.assignedPage);
                Minecraft.getMinecraft().displayGuiScreen(gui);
            }
        } else {
            if (this.booklet instanceof GuiPage) {
                this.assignedPage = ((GuiPage) this.booklet).pages[0];
            }
        }
    }

    @Override
    public void drawButton(Minecraft minecraft, int x, int y, float f) {
        if (this.visible) {
            minecraft.getTextureManager().bindTexture(GuiBooklet.RES_LOC_GADGETS);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            this.hovered = x >= this.x && y >= this.y && x < this.x + this.width && y < this.y + this.height;
            int k = this.getHoverState(this.hovered);
            if (k == 0) {
                k = 1;
            }

            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            GlStateManager.blendFunc(770, 771);
            int renderHeight = 25;
            this.drawTexturedModalRect(this.x, this.y, 224 + (this.assignedPage == null ? 0 : 16), 14 - renderHeight + k * renderHeight, this.width, renderHeight);
            this.mouseDragged(minecraft, x, y);

            if (this.assignedPage != null) {
                ItemStack display = this.assignedPage.getChapter().getDisplayItemStack();
                if (StackUtil.isValid(display)) {
                    GlStateManager.pushMatrix();
                    AssetUtil.renderStackToGui(display, this.x + 2, this.y + 1, 0.725F);
                    GlStateManager.popMatrix();
                }
            }
        }
    }

    public void drawHover(int mouseX, int mouseY) {
        if (this.isMouseOver()) {
            List<String> list = new ArrayList<>();

            if (this.assignedPage != null) {
                IBookletChapter chapter = this.assignedPage.getChapter();

                list.add(TextFormatting.GOLD + chapter.getLocalizedName() + ", Page " + (chapter.getPageIndex(this.assignedPage) + 1));
                list.add(StringUtil.localize("booklet." + ActuallyAdditions.MODID + ".bookmarkButton.bookmark.openDesc"));
                list.add(TextFormatting.ITALIC + StringUtil.localize("booklet." + ActuallyAdditions.MODID + ".bookmarkButton.bookmark.removeDesc"));
            } else {
                list.add(TextFormatting.GOLD + StringUtil.localize("booklet." + ActuallyAdditions.MODID + ".bookmarkButton.noBookmark.name"));

                if (this.booklet instanceof GuiPage) {
                    list.add(StringUtil.localize("booklet." + ActuallyAdditions.MODID + ".bookmarkButton.noBookmark.pageDesc"));
                } else {
                    list.add(StringUtil.localize("booklet." + ActuallyAdditions.MODID + ".bookmarkButton.noBookmark.notPageDesc"));
                }
            }

            Minecraft mc = Minecraft.getMinecraft();
            GuiUtils.drawHoveringText(list, mouseX, mouseY, mc.displayWidth, mc.displayHeight, -1, mc.fontRenderer);
        }
    }
}
