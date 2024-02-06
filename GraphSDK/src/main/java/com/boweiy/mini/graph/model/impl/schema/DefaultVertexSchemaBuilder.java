package com.boweiy.mini.graph.model.impl.schema;

import com.boweiy.mini.graph.model.schema.PropertySchema;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DefaultVertexSchemaBuilder {

    private String name;
    private int id;
    private List<PropertySchema> propertySchemaList = new ArrayList<>();

    public static DefaultVertexSchemaBuilder getBuilder() {
        return new DefaultVertexSchemaBuilder();
    }

    public DefaultVertexSchemaBuilder withID(int id) {
        this.id = id;
        return this;
    }

    public DefaultVertexSchemaBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public DefaultVertexSchemaBuilder withPropertySchemas(List<PropertySchema> propertySchemaList) {
        this.propertySchemaList = new ArrayList<>(propertySchemaList);
        return this;
    }

    public DefaultVertexSchemaBuilder withPropertySchema(PropertySchema propertySchema) {
        this.propertySchemaList.add(propertySchema);
        return this;
    }

    public DefaultVertexSchema build() {
        if (id < 0) {
            throw new IllegalArgumentException("ID is less than 0");
        }
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Empty name");
        }
        return new DefaultVertexSchema(id, name, propertySchemaList);
    }
}
