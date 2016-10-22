package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: jyv */
public final class jyv<K, T extends jyu<K>> {
    private final HashMap<K, T> a;

    public jyv(Context context, Class<T> cls) {
        this.a = new HashMap();
        for (jyu jyu : jyn.c(context, cls)) {
            Object a = jyu.a();
            if (a == null) {
                throw new IllegalArgumentException("Extension key must not be null");
            } else if (this.a.put(a, jyu) != null) {
                throw new IllegalArgumentException("Instantiating multiple extensions with the same key");
            }
        }
    }

    public T a(K k) {
        return (jyu) this.a.get(k);
    }
}
