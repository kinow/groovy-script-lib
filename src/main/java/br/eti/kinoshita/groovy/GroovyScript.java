package br.eti.kinoshita.groovy;

import java.util.Collections;
import java.util.Map;

import javax.annotation.CheckForNull;

import org.apache.commons.lang3.StringUtils;
import org.jenkinsci.plugins.scriptsecurity.sandbox.groovy.SecureGroovyScript;

public class GroovyScript<T> extends AbstractScript<T> {

    private final SecureGroovyScript script;
    private final SecureGroovyScript fallbackScript;

    public GroovyScript(String script) {
        this(script, null);
    }
    
    public GroovyScript(String script, @CheckForNull String fallback) {
        this(new SecureGroovyScript(script, true, null),
                StringUtils.isBlank(fallback) ?
                        null : new SecureGroovyScript(fallback, true, null));
    }

    public GroovyScript(SecureGroovyScript secureGroovyScript, SecureGroovyScript fallbackSecureGroovyScript) {
        this.script = secureGroovyScript;
        this.fallbackScript = fallbackSecureGroovyScript;
    }

    public T eval() {
        return eval(Collections.emptyMap());
    }

    public <K, V> T eval(Map<K, V> parameters) {
        return null;
    }

}
