package navigation;

public class NavigationItem extends NavigationComponent
{
    private String name;
    private String link;

    public NavigationItem(String name, String link) {
        this.name = name;
        this.link = link;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public String getName() {
        return name;
    }

}

