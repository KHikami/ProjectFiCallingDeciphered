package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class aul {
    private final Map<Class<?>, aum<?>> f2361a = new HashMap();

    aul() {
    }

    public void m4048a() {
        this.f2361a.clear();
    }

    public <Model> void m4049a(Class<Model> cls, List<auh<Model, ?>> list) {
        if (((aum) this.f2361a.put(cls, new aum(list))) != null) {
            String valueOf = String.valueOf(cls);
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Already cached loaders for model: ").append(valueOf).toString());
        }
    }

    public <Model> List<auh<Model, ?>> m4047a(Class<Model> cls) {
        aum aum = (aum) this.f2361a.get(cls);
        return aum == null ? null : aum.f2362a;
    }
}
