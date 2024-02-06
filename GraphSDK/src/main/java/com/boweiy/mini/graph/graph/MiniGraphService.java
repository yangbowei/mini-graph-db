package com.boweiy.mini.graph.graph;

import com.boweiy.mini.graph.api.StorageEngine;
import org.apache.tinkerpop.gremlin.groovy.jsr223.GremlinGroovyScriptEngine;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.DefaultGraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.structure.Graph;

import javax.script.Bindings;
import javax.script.ScriptException;
import javax.script.SimpleBindings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MiniGraphService {

    private GremlinGroovyScriptEngine graphEngine;
    private StorageEngine storageEngine;
    private Graph graphInstance;
    private GraphTraversal graphTraversal;

    public void init() {
        graphInstance = new MiniGraph();
        graphTraversal = new DefaultGraphTraversal(graphInstance);

    }

    public List<Object> eval(String queryScript, Map<String, Object> parameters) {
        final Bindings bindings = new SimpleBindings();
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            bindings.put(entry.getKey(), entry.getValue());
        }

        bindings.put("g", graphInstance.traversal());
        try {
            Object evalResult = graphEngine.eval(queryScript, bindings);
            List<Object> results = new ArrayList<>();
            if (evalResult instanceof Traversal) {
                Traversal traversal = (Traversal) evalResult;
                while (traversal.hasNext()) {
                    results.add(traversal.next());
                }
            } else {
                results.add(evalResult);
            }
            return results;
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }

}
