package defpackage;

import android.content.res.Resources;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: huk */
abstract class huk {
    private final ConcurrentHashMap<Integer, String> a;
    private final Resources b;

    public huk(Resources resources) {
        this.a = new ConcurrentHashMap();
        this.b = resources;
    }

    public String a(int i) {
        if (i == 0) {
            return null;
        }
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        str = a(this.b, i);
        this.a.put(Integer.valueOf(i), str);
        return str;
    }

    protected abstract String a(Resources resources, int i);
}
