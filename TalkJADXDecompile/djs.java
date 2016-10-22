import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

final class djs {
    private final did a;
    private final boolean b;
    private final List<edk> c;
    private long d;
    private final ArrayList<edk> e;
    private dju f;
    private final Handler g;
    private final Runnable h;

    djs(did did, boolean z, List<edk> list) {
        this.g = new Handler();
        this.h = new djt(this);
        for (edk edk : list) {
            boolean z2;
            if (edk.b.a == null && edk.s == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            iil.a("Expected condition to be true", z2);
        }
        this.a = did;
        this.b = z;
        this.c = list;
        this.e = new ArrayList(list);
    }

    boolean a() {
        return this.b;
    }

    List<edk> b() {
        return this.c;
    }

    long c() {
        return this.d;
    }

    List<edk> d() {
        return this.e;
    }

    void e() {
        this.d = glj.a();
        if (!this.b) {
            for (itg e : dgg.a().w()) {
                e.e();
            }
        } else if (!k()) {
            h();
        }
        if (!k()) {
            this.g.postDelayed(this.h, did.D());
        }
    }

    void f() {
        this.g.removeCallbacks(this.h);
        i();
    }

    void g() {
        this.g.removeCallbacks(this.h);
        i();
    }

    private boolean j() {
        return this.e.size() != 0;
    }

    private boolean k() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((edk) obj).a == edq.PHONE) {
                return true;
            }
        }
        return false;
    }

    private static edk a(iqo iqo, List<edk> list) {
        if (iqo instanceof iqs) {
            iqs iqs = (iqs) iqo;
            for (edk edk : list) {
                if (edk.b.a != null && edk.b.a.equals(iqs.s())) {
                    return edk;
                }
            }
            return null;
        } else if (!(iqo instanceof iqu)) {
            return null;
        } else {
            iqu iqu = (iqu) iqo;
            for (edk edk2 : list) {
                if (edk2.b.a == null && gwb.m(edk2.s, iqu.s())) {
                    return edk2;
                }
            }
            return null;
        }
    }

    boolean a(iqo iqo) {
        return a(iqo, this.e) != null;
    }

    void b(iqo iqo) {
        boolean z;
        if (iqo.k() || iqo.e()) {
            z = true;
        } else {
            z = false;
        }
        iil.b("Expected condition to be false", z);
        edk a = a(iqo, this.e);
        if (a != null) {
            this.e.remove(a);
            if (!j()) {
                a(false, null);
            }
            i();
        }
        if (this.b && this.d == 0) {
            a(false, null);
        }
    }

    void a(iqo iqo, Integer num) {
        iil.b("Expected condition to be false", iqo.k());
        if (iqo.f()) {
            edk a = a(iqo, this.e);
            if (a != null) {
                this.e.remove(a);
                if (!j()) {
                    a(true, num);
                }
            }
        }
    }

    void a(boolean z, Integer num) {
        boolean z2;
        this.g.removeCallbacks(this.h);
        this.a.s().remove(this);
        i();
        if (this.a.H() != 0 || this.a.C()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int i;
            did did = this.a;
            if (!z) {
                i = 11010;
            } else if (gwb.a(num) == 7) {
                i = 11014;
            } else {
                i = 11011;
            }
            did.b(i);
        }
        for (itg b : dgg.a().w()) {
            b.b(z2);
        }
    }

    void h() {
        if (this.b) {
            if (!this.a.j() && this.f == null) {
                this.f = new dju(this.a.K());
                this.f.a();
            }
            for (itg j : dgg.a().w()) {
                j.j();
            }
        }
    }

    void i() {
        if (this.f != null) {
            this.f.b();
            this.f = null;
            if (this.b) {
                for (itg c : dgg.a().w()) {
                    c.c();
                }
            }
        }
    }
}
