package p000;

import java.util.AbstractMap;
import java.util.Set;

final class kfn extends AbstractMap<String, Object> {
    final Object f21583a;
    final kfi f21584b;

    public /* synthetic */ Set entrySet() {
        return m25730a();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m25729a((String) obj, obj2);
    }

    kfn(Object obj, boolean z) {
        this.f21583a = obj;
        this.f21584b = kfi.m25711a(obj.getClass(), z);
        bc.m4814a(!this.f21584b.m25713a());
    }

    public kfq m25730a() {
        return new kfq(this);
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        kfu a = this.f21584b.m25712a((String) obj);
        if (a != null) {
            return a.m25751a(this.f21583a);
        }
        return null;
    }

    private Object m25729a(String str, Object obj) {
        Object a = this.f21584b.m25712a(str);
        String str2 = "no field of key ";
        String valueOf = String.valueOf(str);
        bc.m4800a(a, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Object a2 = a.m25751a(this.f21583a);
        a.m25753a(this.f21583a, bc.m4799a(obj));
        return a2;
    }
}
