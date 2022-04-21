package uk.co.jamescarr.buildman.component;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Component {
    private final String name;
    private final String description;
    private final Category category;
    private final Map<Vendor, List<UnitPriceByQuantity>> vendorPricingMap;

    private Component(String name, String description, Category category, Map<Vendor, List<UnitPriceByQuantity>> vendorPricingMap) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.vendorPricingMap = vendorPricingMap;
    }

    public static Component of(String name, Category category) {
        return new Component(name, "", category, Collections.emptyMap());
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", vendorPricingMap=" + vendorPricingMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(name, component.name) && Objects.equals(description, component.description) && Objects.equals(category, component.category) && Objects.equals(vendorPricingMap, component.vendorPricingMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, category, vendorPricingMap);
    }
}
