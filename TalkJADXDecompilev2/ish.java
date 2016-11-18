package defpackage;

import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class ish {
    String a;
    String b;
    private final ite c;
    private final isj d = new isj(this);
    private final Map<String, isk> e = new HashMap();
    private final List<a> f = new ArrayList();
    private String g;
    private ViewGroup h;
    private int i = 3;
    private int j = 1;
    private int k = 1;
    private Rect l = new Rect();

    public ish(ite ite) {
        this.c = ite;
        ite.a(this.d);
    }

    public void a() {
        this.c.b(this.d);
        c();
        for (isk isk : this.e.values()) {
            isk.e.a();
        }
        this.e.clear();
    }

    public void a(int i) {
        this.k = 4;
    }

    public void b() {
        for (Entry entry : this.e.entrySet()) {
            if (!((String) entry.getKey()).equals(this.g)) {
                isk isk = (isk) entry.getValue();
                if (((isk) entry.getValue()).d.getGlobalVisibleRect(this.l)) {
                    isk.e.a(this.j);
                } else {
                    isk.e.a(this.k);
                }
            }
        }
    }

    public void a(ViewGroup viewGroup) {
        isk isk = (isk) this.e.get(this.g);
        if (isk != null) {
            a(isk);
        }
        this.h = viewGroup;
        if (isk != null) {
            b(isk);
        }
    }

    public void a(String str, View view, int i, isi isi) {
        String d = d(str);
        if (this.e.containsKey(d)) {
            itx.b("vclib", "View already registered for participant %s", d);
            return;
        }
        TextureView textureView;
        isk isk = new isk();
        isk.a = d;
        isk.b = (ViewGroup) view.getParent();
        isk.c = isk.b.indexOfChild(view);
        isk.d = view;
        isk.f = isi;
        if (view instanceof TextureView) {
            textureView = (TextureView) view;
        } else {
            textureView = (TextureView) view.findViewById(-1);
        }
        isy isy = new isy(this.c, textureView, d);
        isi.a(isy);
        isk.e = isy;
        this.e.put(d, isk);
        if (d.equals(this.g)) {
            b(isk);
        } else if (this.g == null) {
            c(d);
        } else {
            b();
        }
    }

    public void a(String str) {
        String d = d(str);
        if (d.equals(this.g)) {
            c();
        }
        isk isk = (isk) this.e.remove(d);
        if (isk != null) {
            isk.e.a();
        }
        if (d.equals(this.b)) {
            b(null);
        }
    }

    public void b(String str) {
        this.b = d(str);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
        c(this.b == null ? this.a : this.b);
    }

    private void c() {
        if (this.g != null) {
            isk isk = (isk) this.e.get(this.g);
            this.g = null;
            if (isk != null) {
                a(isk);
            }
        }
    }

    private void a(isk isk) {
        if (this.h != null) {
            isk.f.a();
            this.h.removeView(isk.d);
            isk.b.addView(isk.d, isk.c);
            if (isk.d.getGlobalVisibleRect(this.l)) {
                isk.e.a(this.j);
            } else {
                isk.e.a(this.k);
            }
            isk.e.b();
        }
    }

    protected void c(String str) {
        if (str != null && !str.equals(this.g)) {
            c();
            this.g = str;
            isk isk = (isk) this.e.get(str);
            if (isk != null) {
                b(isk);
            }
        }
    }

    private void b(isk isk) {
        if (this.h != null) {
            isk.b.removeView(isk.d);
            this.h.addView(isk.d);
            isk.e.a(this.i);
            isk.e.b();
            isk.f.a(isk.a.equals(this.b));
        }
    }

    private String d(String str) {
        if (str == null) {
            return null;
        }
        ith o = this.c.o();
        return str.equals(o.b() == null ? "localParticipant" : o.b().b()) ? "localParticipant" : str;
    }
}
