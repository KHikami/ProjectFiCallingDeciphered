package p000;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

final class jlg {
    private final Map<jla, jlh> f20411a = new HashMap();
    private final jlh f20412b = new jlh(null);

    jlg() {
    }

    public void m24643a(jla jla, Bitmap bitmap) {
        jlh jlh = (jlh) this.f20411a.get(jla);
        if (jlh == null) {
            jlh = new jlh(jla);
            this.f20411a.put(jla, jlh);
            jlh.f20414b = this.f20412b.f20414b;
            jlh.f20413a = this.f20412b;
            jlh.f20414b.f20413a = jlh;
            this.f20412b.f20414b = jlh;
        }
        jlh.m24645a(bitmap);
    }

    public Bitmap m24642a(jla jla) {
        jlh jlh = (jlh) this.f20411a.get(jla);
        if (jlh == null) {
            jlh = new jlh(jla);
            this.f20411a.put(jla, jlh);
        } else {
            jlg.m24640a(jlh);
        }
        jlh.f20414b = this.f20412b;
        jlh.f20413a = this.f20412b.f20413a;
        jlh.f20413a.f20414b = jlh;
        this.f20412b.f20413a = jlh;
        return jlh.m24646b();
    }

    public Bitmap m24641a() {
        for (jlh jlh = this.f20412b.f20414b; jlh != this.f20412b; jlh = jlh.f20414b) {
            if (jlh.m24644a() > 0) {
                return jlh.m24646b();
            }
            this.f20411a.remove(jlh.f20415c);
            jlg.m24640a(jlh);
        }
        return null;
    }

    public String toString() {
        Object obj = "GroupedLinkedMap(";
        if (!this.f20411a.isEmpty()) {
            String valueOf;
            for (jlh jlh = this.f20412b.f20413a; jlh != this.f20412b; jlh = jlh.f20413a) {
                valueOf = String.valueOf(valueOf);
                String valueOf2 = String.valueOf(jlh.f20415c);
                valueOf = new StringBuilder((String.valueOf(valueOf).length() + 16) + String.valueOf(valueOf2).length()).append(valueOf).append("{").append(valueOf2).append(", ").append(jlh.m24644a()).append("} ").toString();
            }
            obj = valueOf.substring(0, valueOf.length() - 1);
        }
        return String.valueOf(obj).concat(")");
    }

    private static void m24640a(jlh jlh) {
        jlh.f20413a.f20414b = jlh.f20414b;
        jlh.f20414b.f20413a = jlh.f20413a;
    }
}
