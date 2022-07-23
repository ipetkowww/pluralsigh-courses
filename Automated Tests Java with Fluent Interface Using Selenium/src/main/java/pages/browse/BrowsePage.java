package pages.browse;

public class BrowsePage {

    private BrowsePageActions browsePageActions;

    private BrowsePage(BrowsePageActions browsePageActions) {
        this.browsePageActions = browsePageActions;
    }

    public static BrowsePage create() {
        return new BrowsePage(new BrowsePageActions());
    }

    public BrowsePageActions actions() {
        return browsePageActions;
    }
}
