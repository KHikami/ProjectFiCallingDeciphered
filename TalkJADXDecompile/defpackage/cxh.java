package defpackage;

import android.content.Context;
import java.util.TreeSet;

/* renamed from: cxh */
final class cxh implements cxg {
    private final Context a;
    private lo<String, cxd> b;

    cxh(Context context) {
        this.b = new lo();
        this.a = context;
        for (cxd cxd : jyn.c(context, cxd.class)) {
            this.b.put(cxd.a(), cxd);
        }
    }

    public boolean a(String str) {
        cxd cxd = (cxd) this.b.get(str);
        return cxd != null && cxd.a(this.a);
    }

    public String a() {
        Iterable treeSet = new TreeSet();
        for (int i = 0; i < this.b.size(); i++) {
            cxd cxd = (cxd) this.b.c(i);
            String valueOf = String.valueOf(cxd.a());
            treeSet.add(new StringBuilder(String.valueOf(valueOf).length() + 6).append(valueOf).append(":").append(cxd.a(this.a)).toString());
        }
        return meu.a(';').a(treeSet);
    }
}
