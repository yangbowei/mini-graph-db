package com.boweiy.mini.graph.model.record;

import com.boweiy.mini.graph.model.schema.EdgeSchema;
import com.boweiy.mini.graph.model.schema.VertexSchema;

import java.util.List;
import java.util.Map;

public interface VertexRecord extends com.boweiy.mini.graph.model.record.DataRecord<VertexSchema> {
    List<com.boweiy.mini.graph.model.record.PropertyRecord> getProperties();
    Map<EdgeSchema, List<com.boweiy.mini.graph.model.record.EdgeRecord>> getOutEdges();
    Map<EdgeSchema, List<com.boweiy.mini.graph.model.record.EdgeRecord>> getInEdges();
}
