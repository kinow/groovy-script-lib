package br.eti.kinoshita.groovy;

import java.util.Collections;
import java.util.Map;

public class GroovyScript<T> extends AbstractScript<T> {

    public T eval() {
        return eval(Collections.emptyMap());
    }

    public <K, V> T eval(Map<K, V> parameters) {
        return null;
    }

}
