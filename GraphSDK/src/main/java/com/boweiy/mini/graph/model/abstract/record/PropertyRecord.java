package com.boweiy.mini.graph.model.record;

import com.boweiy.mini.graph.model.schema.PropertySchema;

public interface PropertyRecord {
    PropertySchema getSchema();
    Object getValue();
}
