package com.boweiy.mini.graph.api;

import com.boweiy.mini.graph.model.record.EdgeDirection;
import com.boweiy.mini.graph.model.record.VertexRecord;
import com.boweiy.mini.graph.model.schema.EdgeSchema;
import com.boweiy.mini.graph.model.schema.VertexSchema;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public interface StorageEngine {
    /**
     * Load vertexRecord from storage engine with all vertex's properties and required edges.
     * At most edgeLimit edges in total will be returned.
     * @param vertexSchema the vertex schema
     * @param vertexID id of vertex to load
     * @param requiredEdges direction & schema of required edges
     * @param edgeLimit number of limitation of edges to return
     * @return the vertex record
     */
    VertexRecord queryVertexRecord(VertexSchema vertexSchema, Object vertexID, List<Pair<EdgeSchema, EdgeDirection>> requiredEdges, int edgeLimit);

    /**
     * Update properties of the vertex. This operation should be atomic.
     * @param vertexRecord the vertex record to update
     */
    void updateVertexRecord(VertexRecord vertexRecord);

    /**
     * Update edges of the vertex. This operation should be atomic for every edge set of <EdgeSchema, EdgeDirection> pair
     * @param vertexRecord the edges to update for the vertex
     */
    void updateEdgesForVertex(VertexRecord vertexRecord);
}
