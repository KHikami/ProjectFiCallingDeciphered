package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: kfn */
final class kfn extends AbstractMap<String, Object> {
    final Object a;
    final kfi b;

    public /* synthetic */ Set entrySet() {
        return a();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((String) obj, obj2);
    }

    kfn(Object obj, boolean z) {
        this.a = obj;
        this.b = kfi.a(obj.getClass(), z);
        bc.a(!this.b.a());
    }

    public kfq a() {
        return new kfq(this);
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        kfu a = this.b.a((String) obj);
        if (a != null) {
            return a.a(this.a);
        }
        return null;
    }

    private Object a(String str, Object obj) {
        Object a = this.b.a(str);
        String str2 = "no field of key ";
        String valueOf = String.valueOf(str);
        bc.a(a, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Object a2 = a.a(this.a);
        a.a(this.a, bc.a(obj));
        return a2;
    }
}
