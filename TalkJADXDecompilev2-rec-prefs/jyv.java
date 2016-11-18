package p000;

import android.content.Context;
import java.util.HashMap;

public final class jyv<K, T extends jyu<K>> {
    private final HashMap<K, T> f21306a = new HashMap();

    public jyv(Context context, Class<T> cls) {
        for (jyu jyu : jyn.m25438c(context, cls)) {
            Object a = jyu.mo3634a();
            if (a == null) {
                throw new IllegalArgumentException("Extension key must not be null");
            } else if (this.f21306a.put(a, jyu) != null) {
                throw new IllegalArgumentException("Instantiating multiple extensions with the same key");
            }
        }
    }

    public T m25463a(K k) {
        return (jyu) this.f21306a.get(k);
    }
}
