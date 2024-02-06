package com.boweiy.mini.graph.model.schema;

import java.util.List;

public interface VertexSchema extends com.boweiy.mini.graph.model.schema.Schema {
    List<com.boweiy.mini.graph.model.schema.PropertySchema> getPropertySchemas();
}
