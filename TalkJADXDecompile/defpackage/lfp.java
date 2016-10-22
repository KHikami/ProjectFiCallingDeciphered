package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: lfp */
public final class lfp {
    private final Map<String, onc<Set<Annotation>>> a;

    lfp(Map<String, onc<Set<Annotation>>> map) {
        this.a = map;
    }

    public <A extends Annotation> A a(Class<?> cls, Class<A> cls2) {
        onc onc = (onc) this.a.get(cls.getName());
        if (onc != null) {
            for (Annotation annotation : (Set) onc.a()) {
                if (annotation.annotationType().equals(cls2) && cls2.isAssignableFrom(annotation.annotationType())) {
                    return annotation;
                }
            }
        }
        return null;
    }

    public Set<Annotation> a(Class<?> cls) {
        onc onc = (onc) this.a.get(cls.getName());
        if (onc != null) {
            return (Set) onc.a();
        }
        return Collections.emptySet();
    }
}
