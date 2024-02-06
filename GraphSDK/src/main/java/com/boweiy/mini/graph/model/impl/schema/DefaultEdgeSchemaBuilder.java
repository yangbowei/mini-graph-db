package com.boweiy.mini.graph.model.impl.schema;

import com.boweiy.mini.graph.model.schema.PropertySchema;
import com.boweiy.mini.graph.model.schema.VertexSchema;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DefaultEdgeSchemaBuilder {

    private String name;
    private int id;
    private VertexSchema sourceVertexSchema;
    private VertexSchema targetVertexSchema;
    private List<PropertySchema> propertySchemaList = new ArrayList<>();

    public static DefaultEdgeSchemaBuilder getBuilder() {
        return new DefaultEdgeSchemaBuilder();
    }

    public DefaultEdgeSchemaBuilder withID(int id) {
        this.id = id;
        return this;
    }

    public DefaultEdgeSchemaBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public DefaultEdgeSchemaBuilder withSourceVertexSchema(VertexSchema vertexSchema) {
        this.sourceVertexSchema = vertexSchema;
        return this;
    }

    public DefaultEdgeSchemaBuilder withTargetVertexSchema(VertexSchema vertexSchema) {
        this.targetVertexSchema = vertexSchema;
        return this;
    }

    public DefaultEdgeSchemaBuilder withPropertySchemas(List<PropertySchema> propertySchemaList) {
        this.propertySchemaList = new ArrayList<>(propertySchemaList);
        return this;
    }

    public DefaultEdgeSchemaBuilder withPropertySchema(PropertySchema propertySchema) {
        this.propertySchemaList.add(propertySchema);
        return this;
    }

    public DefaultEdgeSchema build() {
        if (id < 0) {
            throw new IllegalArgumentException("ID is less than 0");
        }
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Empty name");
        }
        return new DefaultEdgeSchema(id, sourceVertexSchema, targetVertexSchema, name, propertySchemaList);
    }
}
