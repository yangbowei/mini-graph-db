package com.boweiy.mini.graph.model.impl.schema;

import com.boweiy.mini.graph.model.schema.PropertySchema;
import com.boweiy.mini.graph.model.schema.VertexSchema;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class DefaultVertexSchema implements VertexSchema {
    private final String name;
    private final int id;
    private final List<PropertySchema> propertySchemaList;

    public DefaultVertexSchema(int id, String name, List<PropertySchema> propertySchemaList) {
        this.id = id;
        this.name = name;
        this.propertySchemaList = ImmutableList.copyOf(propertySchemaList);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public List<PropertySchema> getPropertySchemas() {
        return propertySchemaList;
    }
}
