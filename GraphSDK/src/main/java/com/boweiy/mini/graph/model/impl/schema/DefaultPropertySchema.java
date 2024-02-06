package com.boweiy.mini.graph.model.impl.schema;

import com.boweiy.mini.graph.model.schema.PropertySchema;
import com.boweiy.mini.graph.model.schema.PropertyType;

public class DefaultPropertySchema implements PropertySchema {
    private final String name;
    private final PropertyType type;
    private final int id;

    public DefaultPropertySchema(int id, String name, PropertyType type) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    @Override
    public PropertyType getPropertyType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return id;
    }
}
