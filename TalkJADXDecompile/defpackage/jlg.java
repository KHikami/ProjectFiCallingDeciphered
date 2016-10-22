package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jlg */
final class jlg {
    private final Map<jla, jlh> a;
    private final jlh b;

    jlg() {
        this.a = new HashMap();
        this.b = new jlh(null);
    }

    public void a(jla jla, Bitmap bitmap) {
        jlh jlh = (jlh) this.a.get(jla);
        if (jlh == null) {
            jlh = new jlh(jla);
            this.a.put(jla, jlh);
            jlh.b = this.b.b;
            jlh.a = this.b;
            jlh.b.a = jlh;
            this.b.b = jlh;
        }
        jlh.a(bitmap);
    }

    public Bitmap a(jla jla) {
        jlh jlh = (jlh) this.a.get(jla);
        if (jlh == null) {
            jlh = new jlh(jla);
            this.a.put(jla, jlh);
        } else {
            jlg.a(jlh);
        }
        jlh.b = this.b;
        jlh.a = this.b.a;
        jlh.a.b = jlh;
        this.b.a = jlh;
        return jlh.b();
    }

    public Bitmap a() {
        for (jlh jlh = this.b.b; jlh != this.b; jlh = jlh.b) {
            if (jlh.a() > 0) {
                return jlh.b();
            }
            this.a.remove(jlh.c);
            jlg.a(jlh);
        }
        return null;
    }

    public String toString() {
        Object obj = "GroupedLinkedMap(";
        if (!this.a.isEmpty()) {
            String valueOf;
            for (jlh jlh = this.b.a; jlh != this.b; jlh = jlh.a) {
                valueOf = String.valueOf(valueOf);
                String valueOf2 = String.valueOf(jlh.c);
                valueOf = new StringBuilder((String.valueOf(valueOf).length() + 16) + String.valueOf(valueOf2).length()).append(valueOf).append("{").append(valueOf2).append(", ").append(jlh.a()).append("} ").toString();
            }
            obj = valueOf.substring(0, valueOf.length() - 1);
        }
        return String.valueOf(obj).concat(")");
    }

    private static void a(jlh jlh) {
        jlh.a.b = jlh.b;
        jlh.b.a = jlh.a;
    }
}
