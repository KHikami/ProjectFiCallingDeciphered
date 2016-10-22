package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aul */
final class aul {
    private final Map<Class<?>, aum<?>> a;

    aul() {
        this.a = new HashMap();
    }

    public void a() {
        this.a.clear();
    }

    public <Model> void a(Class<Model> cls, List<auh<Model, ?>> list) {
        if (((aum) this.a.put(cls, new aum(list))) != null) {
            String valueOf = String.valueOf(cls);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Already cached loaders for model: ").append(valueOf).toString());
        }
    }

    public <Model> List<auh<Model, ?>> a(Class<Model> cls) {
        aum aum = (aum) this.a.get(cls);
        return aum == null ? null : aum.a;
    }
}
