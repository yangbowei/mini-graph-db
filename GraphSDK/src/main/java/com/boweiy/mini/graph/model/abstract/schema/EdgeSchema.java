package com.boweiy.mini.graph.model.schema;

import java.util.List;

public interface EdgeSchema extends com.boweiy.mini.graph.model.schema.Schema {
    com.boweiy.mini.graph.model.schema.VertexSchema getSourceVertexSchema();

    com.boweiy.mini.graph.model.schema.VertexSchema getTargetVertexSchema();

    List<com.boweiy.mini.graph.model.schema.PropertySchema> getPropertySchemas();
}
