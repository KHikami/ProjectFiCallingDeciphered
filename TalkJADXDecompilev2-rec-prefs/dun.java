package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

final class dun implements duj {
    private final ConcurrentHashMap<Integer, duk> f10576a = new ConcurrentHashMap();
    private final Context f10577b;

    public dun(Context context) {
        this.f10577b = context;
    }

    public frf mo1678a(int i) {
        duk duk = (duk) this.f10576a.get(Integer.valueOf(i));
        if (duk != null) {
            return duk;
        }
        if (glk.m17973a("Babel", 3)) {
            glk.m17970a("Babel", "Adding conversation loader for " + i, new Object[0]);
        }
        this.f10576a.putIfAbsent(Integer.valueOf(i), new duk(this.f10577b, i));
        return (duk) this.f10576a.get(Integer.valueOf(i));
    }

    public void mo1679b(int i) {
        if (glk.m17973a("Babel", 3)) {
            glk.m17970a("Babel", "Removing conversation loader for " + i, new Object[0]);
        }
        this.f10576a.remove(Integer.valueOf(i));
    }
}
