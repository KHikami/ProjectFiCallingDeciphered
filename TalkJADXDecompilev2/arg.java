package defpackage;

import java.util.HashMap;
import java.util.Map;

final class arg<K extends aro, V> {
    private final arh<K, V> a = new arh();
    private final Map<K, arh<K, V>> b = new HashMap();

    arg() {
    }

    public void a(K k, V v) {
        arh arh = (arh) this.b.get(k);
        if (arh == null) {
            arh = new arh(k);
            arg.b(arh);
            arh.c = this.a.c;
            arh.b = this.a;
            arg.a(arh);
            this.b.put(k, arh);
        } else {
            k.a();
        }
        arh.a(v);
    }

    public V a(K k) {
        arh arh = (arh) this.b.get(k);
        if (arh == null) {
            arh = new arh(k);
            this.b.put(k, arh);
        } else {
            k.a();
        }
        arg.b(arh);
        arh.c = this.a;
        arh.b = this.a.b;
        arg.a(arh);
        return arh.a();
    }

    public V a() {
        for (arh arh = this.a.c; !arh.equals(this.a); arh = arh.c) {
            V a = arh.a();
            if (a != null) {
                return a;
            }
            arg.b(arh);
            this.b.remove(arh.a);
            ((aro) arh.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (arh arh = this.a.b; !arh.equals(this.a); arh = arh.b) {
            obj = 1;
            stringBuilder.append('{').append(arh.a).append(':').append(arh.b()).append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return stringBuilder.append(" )").toString();
    }

    private static <K, V> void a(arh<K, V> arh_K__V) {
        arh_K__V.b.c = arh_K__V;
        arh_K__V.c.b = arh_K__V;
    }

    private static <K, V> void b(arh<K, V> arh_K__V) {
        arh_K__V.c.b = arh_K__V.b;
        arh_K__V.b.c = arh_K__V.c;
    }
}
