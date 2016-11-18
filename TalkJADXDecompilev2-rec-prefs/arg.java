package p000;

import java.util.HashMap;
import java.util.Map;

final class arg<K extends aro, V> {
    private final arh<K, V> f2210a = new arh();
    private final Map<K, arh<K, V>> f2211b = new HashMap();

    arg() {
    }

    public void m3845a(K k, V v) {
        arh arh = (arh) this.f2211b.get(k);
        if (arh == null) {
            arh = new arh(k);
            arg.m3842b(arh);
            arh.f2214c = this.f2210a.f2214c;
            arh.f2213b = this.f2210a;
            arg.m3841a(arh);
            this.f2211b.put(k, arh);
        } else {
            k.mo356a();
        }
        arh.m3847a(v);
    }

    public V m3844a(K k) {
        arh arh = (arh) this.f2211b.get(k);
        if (arh == null) {
            arh = new arh(k);
            this.f2211b.put(k, arh);
        } else {
            k.mo356a();
        }
        arg.m3842b(arh);
        arh.f2214c = this.f2210a;
        arh.f2213b = this.f2210a.f2213b;
        arg.m3841a(arh);
        return arh.m3846a();
    }

    public V m3843a() {
        for (arh arh = this.f2210a.f2214c; !arh.equals(this.f2210a); arh = arh.f2214c) {
            V a = arh.m3846a();
            if (a != null) {
                return a;
            }
            arg.m3842b(arh);
            this.f2211b.remove(arh.f2212a);
            ((aro) arh.f2212a).mo356a();
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (arh arh = this.f2210a.f2213b; !arh.equals(this.f2210a); arh = arh.f2213b) {
            obj = 1;
            stringBuilder.append('{').append(arh.f2212a).append(':').append(arh.m3848b()).append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return stringBuilder.append(" )").toString();
    }

    private static <K, V> void m3841a(arh<K, V> arh_K__V) {
        arh_K__V.f2213b.f2214c = arh_K__V;
        arh_K__V.f2214c.f2213b = arh_K__V;
    }

    private static <K, V> void m3842b(arh<K, V> arh_K__V) {
        arh_K__V.f2214c.f2213b = arh_K__V.f2213b;
        arh_K__V.f2213b.f2214c = arh_K__V.f2214c;
    }
}
