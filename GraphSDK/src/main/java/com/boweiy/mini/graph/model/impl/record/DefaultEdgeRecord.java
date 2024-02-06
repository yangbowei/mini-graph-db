package com.boweiy.mini.graph.model.impl.record;

import com.boweiy.mini.graph.model.record.EdgeDirection;
import com.boweiy.mini.graph.model.record.EdgeRecord;
import com.boweiy.mini.graph.model.record.PropertyRecord;
import com.boweiy.mini.graph.model.schema.EdgeSchema;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class DefaultEdgeRecord implements EdgeRecord {
    private final EdgeSchema edgeSchema;
    private final Object sourceVertexID;
    private final Object targetVertexID;
    private final EdgeDirection direction;
    private final List<PropertyRecord> properties;

    public DefaultEdgeRecord(EdgeSchema edgeSchema, Object sourceVertexID, Object targetVertexID, EdgeDirection direction, List<PropertyRecord> properties) {
        this.edgeSchema = edgeSchema;
        this.sourceVertexID = sourceVertexID;
        this.targetVertexID = targetVertexID;
        this.direction = direction;
        this.properties = ImmutableList.copyOf(properties);
    }

    @Override
    public EdgeSchema getSchema() {
        return edgeSchema;
    }

    @Override
    public Object getSourceVertexID() {
        return sourceVertexID;
    }

    @Override
    public Object getTargetVertexID() {
        return targetVertexID;
    }

    @Override
    public EdgeDirection getDirection() {
        return direction;
    }

    @Override
    public List<PropertyRecord> getProperties() {
        return properties;
    }
}
