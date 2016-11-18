package p000;

import android.content.res.Resources;
import java.util.concurrent.ConcurrentHashMap;

abstract class huk {
    private final ConcurrentHashMap<Integer, String> f17285a = new ConcurrentHashMap();
    private final Resources f17286b;

    public huk(Resources resources) {
        this.f17286b = resources;
    }

    public String m20847a(int i) {
        if (i == 0) {
            return null;
        }
        String str = (String) this.f17285a.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        str = mo2949a(this.f17286b, i);
        this.f17285a.put(Integer.valueOf(i), str);
        return str;
    }

    protected abstract String mo2949a(Resources resources, int i);
}
