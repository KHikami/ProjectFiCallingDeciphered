package defpackage;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

public final class kfb {
    private final Map<String, kfc> a = new kex();
    private final Map<Field, kfc> b = new kex();
    private final Object c;

    public kfb(Object obj) {
        this.c = obj;
    }

    public void a() {
        for (Entry entry : this.a.entrySet()) {
            ((Map) this.c).put((String) entry.getKey(), ((kfc) entry.getValue()).a());
        }
        for (Entry entry2 : this.b.entrySet()) {
            kfu.a((Field) entry2.getKey(), this.c, ((kfc) entry2.getValue()).a());
        }
    }

    public void a(Field field, Class<?> cls, Object obj) {
        kfc kfc = (kfc) this.b.get(field);
        if (kfc == null) {
            kfc = new kfc(cls);
            this.b.put(field, kfc);
        }
        kfc.a(cls, obj);
    }
}
