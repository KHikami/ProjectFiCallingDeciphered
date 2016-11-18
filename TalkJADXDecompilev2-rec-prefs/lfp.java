package p000;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class lfp {
    private final Map<String, onc<Set<Annotation>>> f24925a;

    lfp(Map<String, onc<Set<Annotation>>> map) {
        this.f24925a = map;
    }

    public <A extends Annotation> A m28995a(Class<?> cls, Class<A> cls2) {
        onc onc = (onc) this.f24925a.get(cls.getName());
        if (onc != null) {
            for (Annotation annotation : (Set) onc.mo1297a()) {
                if (annotation.annotationType().equals(cls2) && cls2.isAssignableFrom(annotation.annotationType())) {
                    return annotation;
                }
            }
        }
        return null;
    }

    public Set<Annotation> m28996a(Class<?> cls) {
        onc onc = (onc) this.f24925a.get(cls.getName());
        if (onc != null) {
            return (Set) onc.mo1297a();
        }
        return Collections.emptySet();
    }
}
