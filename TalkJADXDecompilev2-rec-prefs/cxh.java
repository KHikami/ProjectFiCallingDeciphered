package p000;

import android.content.Context;
import java.util.TreeSet;

final class cxh implements cxg {
    private final Context f9261a;
    private lo<String, cxd> f9262b = new lo();

    cxh(Context context) {
        this.f9261a = context;
        for (cxd cxd : jyn.m25438c(context, cxd.class)) {
            this.f9262b.put(cxd.mo1449a(), cxd);
        }
    }

    public boolean mo1454a(String str) {
        cxd cxd = (cxd) this.f9262b.get(str);
        return cxd != null && cxd.mo1450a(this.f9261a);
    }

    public String mo1453a() {
        Iterable treeSet = new TreeSet();
        for (int i = 0; i < this.f9262b.size(); i++) {
            cxd cxd = (cxd) this.f9262b.m28018c(i);
            String valueOf = String.valueOf(cxd.mo1449a());
            treeSet.add(new StringBuilder(String.valueOf(valueOf).length() + 6).append(valueOf).append(":").append(cxd.mo1450a(this.f9261a)).toString());
        }
        return meu.m31959a(';').m31963a(treeSet);
    }
}
