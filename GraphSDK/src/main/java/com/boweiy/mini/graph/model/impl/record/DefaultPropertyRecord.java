package com.boweiy.mini.graph.model.impl.record;

import com.boweiy.mini.graph.model.record.PropertyRecord;
import com.boweiy.mini.graph.model.schema.PropertySchema;

public class DefaultPropertyRecord implements PropertyRecord {
    private final PropertySchema propertySchema;
    private final Object value;

    public DefaultPropertyRecord(PropertySchema schema, Object value) {
        this.propertySchema = schema;
        this.value = value;
    }

    @Override
    public PropertySchema getSchema() {
        return propertySchema;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
