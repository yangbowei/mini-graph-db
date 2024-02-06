package com.boweiy.mini.graph.model.impl.record;

import com.boweiy.mini.graph.model.record.EdgeRecord;
import com.boweiy.mini.graph.model.record.PropertyRecord;
import com.boweiy.mini.graph.model.record.VertexRecord;
import com.boweiy.mini.graph.model.schema.EdgeSchema;
import com.boweiy.mini.graph.model.schema.VertexSchema;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

public class DefaultVertexRecord implements VertexRecord {
    private final VertexSchema vertexSchema;
    private final Map<EdgeSchema, List<EdgeRecord>> outEdges;
    private final Map<EdgeSchema, List<EdgeRecord>> inEdges;
    private final List<PropertyRecord> properties;

    public DefaultVertexRecord(VertexSchema schema, Map<EdgeSchema, List<EdgeRecord>> outEdges, Map<EdgeSchema, List<EdgeRecord>> inEdges, List<PropertyRecord> properties) {
        this.vertexSchema = schema;
        this.outEdges = ImmutableMap.copyOf(outEdges);
        this.inEdges = ImmutableMap.copyOf(inEdges);
        this.properties = ImmutableList.copyOf(properties);
    }

    @Override
    public VertexSchema getSchema() {
        return vertexSchema;
    }

    @Override
    public List<PropertyRecord> getProperties() {
        return properties;
    }

    @Override
    public Map<EdgeSchema, List<EdgeRecord>> getOutEdges() {
        return outEdges;
    }

    @Override
    public Map<EdgeSchema, List<EdgeRecord>> getInEdges() {
        return inEdges;
    }
}
