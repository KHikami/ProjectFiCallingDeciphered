package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: grw */
final class grw extends gno {
    gsd n;
    final /* synthetic */ grt o;
    private String p;
    private Uri q;
    private gru r;
    private long s;

    public grw(grt grt, Context context, String str, Uri uri, hxz hxz, long j, gru gru) {
        this.o = grt;
        super(context);
        this.r = gru;
        this.n = new gsd(hxz);
        this.p = str;
        this.q = uri;
        this.n.a(str);
        this.s = j;
    }

    public void a(Cursor cursor, int i, Map<String, String> map) {
        boolean z = true;
        bko e = fde.e(i);
        a(cursor, fde.e(i), false, (Object) this.p);
        this.n.a(this.o.a(i, this.p, 0, map));
        this.n.e(cursor.getString(41));
        int v = v();
        boolean z2 = u() == 2;
        this.n.b(v);
        gsd gsd = this.n;
        if (!gwb.i(v())) {
            v = gsb.a;
        } else if (z2 && fyi.c()) {
            v = gsb.c;
        } else {
            v = gsb.b;
        }
        gsd.a(v);
        this.n.a(w());
        this.n.a(s());
        this.n.b(z2);
        gsd gsd2 = this.n;
        if (cursor.getInt(40) == 1) {
            z = false;
        }
        gsd2.c(z);
        List<edk> a = a(i, this.p);
        ArrayList arrayList = new ArrayList();
        if (!z2) {
            String str;
            edk edk = null;
            edk edk2 = null;
            for (edk edk3 : a) {
                if (e.b().a(edk3.b)) {
                    edk2 = edk3;
                } else {
                    edk = edk3;
                }
            }
            if (edk != null) {
                if (edk2 == null || TextUtils.isEmpty(edk.f) || edk.f.equals(edk2.f)) {
                    str = edk.e;
                } else {
                    str = edk.f;
                }
                if (e.j() && !edk.y) {
                    arrayList.add(str);
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.n.a();
            }
            this.n.d(str);
        } else if (e.j()) {
            for (edk edk32 : a) {
                if (!(edk32.y || !e.j() || e.b().a(edk32.b))) {
                    CharSequence charSequence = edk32.f != null ? edk32.f : edk32.e;
                    if (!TextUtils.isEmpty(charSequence)) {
                        arrayList.add(charSequence);
                    }
                }
            }
        }
        this.n.b(arrayList);
    }

    private List<edk> a(int i, String str) {
        return new blo(this.o.a, i).H(str);
    }

    public boolean n() {
        return w() > this.s;
    }

    public void a(boolean z, Bitmap bitmap, boolean z2, Object obj) {
        if (obj != null && obj.equals(this.p) && !z2) {
            this.r.a(this.q, bitmap);
        }
    }

    public void b(String str) {
        if (str != null && str.length() > 1) {
            this.n.b(str.substring(1));
        }
    }

    public CharSequence b() {
        return null;
    }

    public void b(int i) {
    }

    public void a(boolean z) {
    }

    public void c(int i) {
    }

    public void a(int i) {
    }

    public CharSequence c() {
        return null;
    }

    public void a(CharSequence charSequence) {
        if (charSequence != null) {
            this.n.c(charSequence.toString());
        }
    }

    public TextView d() {
        return null;
    }

    public void a(Bitmap bitmap) {
    }

    public void b(Drawable drawable) {
    }

    public void e(int i) {
    }

    public void f(int i) {
    }

    public void d(int i) {
    }

    public int e() {
        return 0;
    }

    public void g(int i) {
    }

    public CharSequence f() {
        return null;
    }

    public void b(CharSequence charSequence) {
    }

    public CharSequence g() {
        return null;
    }

    public void c(CharSequence charSequence) {
    }

    public int h() {
        return 0;
    }

    public void h(int i) {
    }

    public int i() {
        return 0;
    }

    public void i(int i) {
    }

    public int j() {
        return 0;
    }

    public void j(int i) {
    }

    public void k(int i) {
    }

    public int k() {
        return 0;
    }

    public void l(int i) {
    }

    public void m(int i) {
    }

    public void n(int i) {
    }

    public void c(Drawable drawable) {
    }

    protected void l() {
    }

    public void a(int i, int i2, int i3) {
    }

    public boolean m() {
        return false;
    }

    public void d(CharSequence charSequence) {
    }

    public void a(boolean z, gkt gkt, boolean z2, Object obj) {
        if (grm.a(this.o.a)) {
            a(z, gkt.d(), z2, obj);
        } else {
            super.a(z, gkt, z2, obj);
        }
    }

    protected void a(Drawable drawable, int i) {
    }
}
