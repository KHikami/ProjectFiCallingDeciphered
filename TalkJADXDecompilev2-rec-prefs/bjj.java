package p000;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class bjj extends bjg implements Serializable {
    private final String f3492a;
    private final String f3493b;
    private final List<bjf> f3494c;
    private final String f3495d;
    private final String f3496e;
    private final String f3497f;
    private final bji f3498g;
    private final String f3499h;
    private final boolean f3500i;
    private final boolean f3501j;
    private final boolean f3502k;
    private final boolean f3503l;
    private final boolean f3504m;
    private final boolean f3505n;
    private final boolean f3506o;
    private final bjh f3507p;
    private final List<bje> f3508q;
    private final List<bjo> f3509r;
    private final String f3510s;
    private final float f3511t;

    public /* synthetic */ Collection mo568b() {
        return m5409B();
    }

    public /* synthetic */ Collection mo570d() {
        return m5410C();
    }

    public /* synthetic */ Collection mo576j() {
        return m5411D();
    }

    bjj(String str, String str2, List<bjf> list, String str3, String str4, String str5, bji bji, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bjh bjh, List<bje> list2, List<bjo> list3, String str7, float f) {
        this.f3492a = str;
        this.f3493b = str2;
        this.f3494c = list;
        this.f3495d = str3;
        this.f3496e = str4;
        this.f3497f = str5;
        this.f3498g = bji;
        this.f3499h = str6;
        this.f3500i = z;
        this.f3501j = z2;
        this.f3502k = z3;
        this.f3503l = z4;
        this.f3504m = z5;
        this.f3505n = z6;
        this.f3506o = z7;
        this.f3507p = bjh;
        this.f3508q = list2;
        this.f3509r = list3;
        this.f3510s = str7;
        this.f3511t = f;
    }

    public static bjj m5412a(edk edk, List<String> list, boolean z) {
        Collection arrayList = new ArrayList();
        if (edk.f11203A != null) {
            for (String bjo : edk.f11203A) {
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
        if (edk.f11204B != null) {
            for (String bjo22 : edk.f11204B) {
                arrayList3.add(new bje(bjo22));
            }
        }
        bjk bjk = new bjk();
        bjk c = bjk.m5446b(edk.f11219h).m5443a(gwb.m1648a(gwb.m1400H(), edk, false)).m5449c(edk.m13592c());
        boolean z2 = z || edk.f11237z;
        c.m5445a(z2).m5453d(gwb.m2061b(edk.f11220i)).m5455e(gwb.m1925a(edk)).m5450c(arrayList).m5450c(arrayList2).m5447b(arrayList3);
        if (edk.m13590b() != null) {
            bjk.m5440a(new bjf(edk.m13590b(), edk.m13598h()));
        }
        if (!TextUtils.isEmpty(edk.f11214c)) {
            bjk.m5459h(edk.f11214c);
        }
        return bjk.m5438a();
    }

    private List<bjo> m5409B() {
        if (this.f3509r != null) {
            return Collections.unmodifiableList(this.f3509r);
        }
        return Collections.emptyList();
    }

    private List<bje> m5410C() {
        if (this.f3508q != null) {
            return Collections.unmodifiableList(this.f3508q);
        }
        return Collections.emptyList();
    }

    public String mo571e() {
        return this.f3492a;
    }

    public String mo572f() {
        return this.f3493b;
    }

    public boolean mo573g() {
        return this.f3501j;
    }

    public boolean mo574h() {
        return !this.f3494c.isEmpty();
    }

    public String mo575i() {
        return this.f3494c.isEmpty() ? null : ((bjf) this.f3494c.get(0)).m5371b();
    }

    private List<bjf> m5411D() {
        return Collections.unmodifiableList(this.f3494c);
    }

    public String mo577k() {
        return this.f3495d;
    }

    public String mo578l() {
        return this.f3510s;
    }

    public float mo579m() {
        return this.f3511t;
    }

    public String mo580n() {
        return this.f3496e;
    }

    public boolean mo581o() {
        return !TextUtils.isEmpty(mo582p());
    }

    public String mo582p() {
        return this.f3497f;
    }

    public bji mo583q() {
        return this.f3498g;
    }

    public String mo584r() {
        return this.f3499h;
    }

    public boolean mo585s() {
        return this.f3500i;
    }

    public boolean mo586t() {
        return this.f3503l;
    }

    public boolean mo587u() {
        return this.f3504m;
    }

    public boolean mo588v() {
        return this.f3506o;
    }

    public bjh mo589w() {
        return this.f3507p;
    }

    public boolean mo590x() {
        return this.f3502k;
    }

    public boolean mo591y() {
        return false;
    }

    public bjo mo567a() {
        int i;
        if (this.f3509r == null || this.f3509r.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            return (bjo) this.f3509r.get(0);
        }
        return null;
    }

    public String mo569c() {
        int i;
        if (this.f3508q == null || this.f3508q.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            return ((bje) this.f3508q.get(0)).m5365c();
        }
        return null;
    }
}
