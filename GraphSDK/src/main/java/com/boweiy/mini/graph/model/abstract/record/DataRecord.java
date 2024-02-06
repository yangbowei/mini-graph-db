package com.boweiy.mini.graph.model.record;

import com.boweiy.mini.graph.model.schema.Schema;

public interface DataRecord<S extends Schema> {
    S getSchema();
}
