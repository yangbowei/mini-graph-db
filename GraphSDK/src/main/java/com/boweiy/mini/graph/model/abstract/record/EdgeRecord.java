package com.boweiy.mini.graph.model.record;

import com.boweiy.mini.graph.model.schema.EdgeSchema;

import java.util.List;

public interface EdgeRecord extends com.boweiy.mini.graph.model.record.DataRecord<EdgeSchema> {
    Object getSourceVertexID();
    Object getTargetVertexID();
    com.boweiy.mini.graph.model.record.EdgeDirection getDirection();
    List<com.boweiy.mini.graph.model.record.PropertyRecord> getProperties();
}
