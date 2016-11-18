package p000;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;

public final class kfb {
    private final Map<String, kfc> f21552a = new kex();
    private final Map<Field, kfc> f21553b = new kex();
    private final Object f21554c;

    public kfb(Object obj) {
        this.f21554c = obj;
    }

    public void m25703a() {
        for (Entry entry : this.f21552a.entrySet()) {
            ((Map) this.f21554c).put((String) entry.getKey(), ((kfc) entry.getValue()).m25705a());
        }
        for (Entry entry2 : this.f21553b.entrySet()) {
            kfu.m25749a((Field) entry2.getKey(), this.f21554c, ((kfc) entry2.getValue()).m25705a());
        }
    }

    public void m25704a(Field field, Class<?> cls, Object obj) {
        kfc kfc = (kfc) this.f21553b.get(field);
        if (kfc == null) {
            kfc = new kfc(cls);
            this.f21553b.put(field, kfc);
        }
        kfc.m25706a(cls, obj);
    }
}
