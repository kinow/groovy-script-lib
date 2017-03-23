package br.eti.kinoshita.groovy;

import java.util.Map;

public interface Script<T> {

    public T eval();
    
    public <K, V> T eval(Map<K, V> parameters);
}
