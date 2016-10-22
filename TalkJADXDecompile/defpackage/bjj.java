package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bjj */
public final class bjj extends bjg implements Serializable {
    private final String a;
    private final String b;
    private final List<bjf> c;
    private final String d;
    private final String e;
    private final String f;
    private final bji g;
    private final String h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final bjh p;
    private final List<bje> q;
    private final List<bjo> r;
    private final String s;
    private final float t;

    public /* synthetic */ Collection b() {
        return B();
    }

    public /* synthetic */ Collection d() {
        return C();
    }

    public /* synthetic */ Collection j() {
        return D();
    }

    bjj(String str, String str2, List<bjf> list, String str3, String str4, String str5, bji bji, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bjh bjh, List<bje> list2, List<bjo> list3, String str7, float f) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = bji;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = bjh;
        this.q = list2;
        this.r = list3;
        this.s = str7;
        this.t = f;
    }

    public static bjj a(edk edk, List<String> list, boolean z) {
        Collection arrayList = new ArrayList();
        if (edk.A != null) {
            for (String bjo : edk.A) {
                arrayList.add(new bjo(bjo));
            }
        }
        Collection arrayList2 = new ArrayList();
        if (list != null) {
            for (String bjo2 : list) {
                arrayList2.add(new bjo(bjo2));
            }
        }
        Collection arrayList3 = new ArrayList();
        if (edk.B != null) {
            for (String bjo22 : edk.B) {
                arrayList3.add(new bje(bjo22));
            }
        }
        bjk bjk = new bjk();
        bjk c = bjk.b(edk.h).a(gwb.a(gwb.H(), edk, false)).c(edk.c());
        boolean z2 = z || edk.z;
        c.a(z2).d(gwb.b(edk.i)).e(gwb.a(edk)).c(arrayList).c(arrayList2).b(arrayList3);
        if (edk.b() != null) {
            bjk.a(new bjf(edk.b(), edk.h()));
        }
        if (!TextUtils.isEmpty(edk.c)) {
            bjk.h(edk.c);
        }
        return bjk.a();
    }

    private List<bjo> B() {
        if (this.r != null) {
            return Collections.unmodifiableList(this.r);
        }
        return Collections.emptyList();
    }

    private List<bje> C() {
        if (this.q != null) {
            return Collections.unmodifiableList(this.q);
        }
        return Collections.emptyList();
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public boolean g() {
        return this.j;
    }

    public boolean h() {
        return !this.c.isEmpty();
    }

    public String i() {
        return this.c.isEmpty() ? null : ((bjf) this.c.get(0)).b();
    }

    private List<bjf> D() {
        return Collections.unmodifiableList(this.c);
    }

    public String k() {
        return this.d;
    }

    public String l() {
        return this.s;
    }

    public float m() {
        return this.t;
    }

    public String n() {
        return this.e;
    }

    public boolean o() {
        return !TextUtils.isEmpty(p());
    }

    public String p() {
        return this.f;
    }

    public bji q() {
        return this.g;
    }

    public String r() {
        return this.h;
    }

    public boolean s() {
        return this.i;
    }

    public boolean t() {
        return this.l;
    }

    public boolean u() {
        return this.m;
    }

    public boolean v() {
        return this.o;
    }

    public bjh w() {
        return this.p;
    }

    public boolean x() {
        return this.k;
    }

    public boolean y() {
        return false;
    }

    public bjo a() {
        int i;
        if (this.r == null || this.r.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            return (bjo) this.r.get(0);
        }
        return null;
    }

    public String c() {
        int i;
        if (this.q == null || this.q.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            return ((bje) this.q.get(0)).c();
        }
        return null;
    }
}
