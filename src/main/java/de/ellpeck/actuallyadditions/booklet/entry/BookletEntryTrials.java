package de.ellpeck.actuallyadditions.booklet.entry;

public class BookletEntryTrials extends BookletEntry {

    public BookletEntryTrials(String identifier) {
        super(identifier, -Integer.MAX_VALUE);
    }

    @Override
    public boolean visibleOnFrontPage() {
        return false;
    }
}
