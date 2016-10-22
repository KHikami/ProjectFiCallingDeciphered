package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dun */
final class dun implements duj {
    private final ConcurrentHashMap<Integer, duk> a;
    private final Context b;

    public dun(Context context) {
        this.a = new ConcurrentHashMap();
        this.b = context;
    }

    public frf a(int i) {
        duk duk = (duk) this.a.get(Integer.valueOf(i));
        if (duk != null) {
            return duk;
        }
        if (glk.a("Babel", 3)) {
            glk.a("Babel", "Adding conversation loader for " + i, new Object[0]);
        }
        this.a.putIfAbsent(Integer.valueOf(i), new duk(this.b, i));
        return (duk) this.a.get(Integer.valueOf(i));
    }

    public void b(int i) {
        if (glk.a("Babel", 3)) {
            glk.a("Babel", "Removing conversation loader for " + i, new Object[0]);
        }
        this.a.remove(Integer.valueOf(i));
    }
}
