package uk.co.jamescarr.buildman.component;

public class Category {
    private final String name;
    private final Category parent;

    private Category(String name, Category parent) {
        this.name = name;
        this.parent = parent;
    }
}
