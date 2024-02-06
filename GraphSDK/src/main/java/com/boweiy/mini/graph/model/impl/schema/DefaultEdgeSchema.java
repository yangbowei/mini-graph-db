package com.boweiy.mini.graph.model.impl.schema;

import com.boweiy.mini.graph.model.schema.EdgeSchema;
import com.boweiy.mini.graph.model.schema.PropertySchema;
import com.boweiy.mini.graph.model.schema.VertexSchema;

import java.util.List;

public class DefaultEdgeSchema implements EdgeSchema {

    private final int id;
    private final VertexSchema sourceVertexSchema;
    private final VertexSchema targetVertexSchema;
    private final List<PropertySchema> propertySchemaList;
    private final String name;

    public DefaultEdgeSchema(int id, VertexSchema sourceVertexSchema, VertexSchema targetVertexSchema, String name, List<PropertySchema> propertySchemaList) {
        this.id = id;
        this.name = name;
        this.sourceVertexSchema = sourceVertexSchema;
        this.targetVertexSchema = targetVertexSchema;
        this.propertySchemaList = propertySchemaList;
    }


    @Override
    public VertexSchema getSourceVertexSchema() {
        return sourceVertexSchema;
    }

    @Override
    public VertexSchema getTargetVertexSchema() {
        return targetVertexSchema;
    }

    @Override
    public List<PropertySchema> getPropertySchemas() {
        return propertySchemaList;
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
