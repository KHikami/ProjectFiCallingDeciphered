package p000;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

final class djs {
    private final did f9962a;
    private final boolean f9963b;
    private final List<edk> f9964c;
    private long f9965d;
    private final ArrayList<edk> f9966e;
    private dju f9967f;
    private final Handler f9968g = new Handler();
    private final Runnable f9969h = new djt(this);

    djs(did did, boolean z, List<edk> list) {
        for (edk edk : list) {
            boolean z2;
            if (edk.f11213b.f11244a == null && edk.f11230s == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            iil.m21874a("Expected condition to be true", z2);
        }
        this.f9962a = did;
        this.f9963b = z;
        this.f9964c = list;
        this.f9966e = new ArrayList(list);
    }

    boolean m12070a() {
        return this.f9963b;
    }

    List<edk> m12072b() {
        return this.f9964c;
    }

    long m12074c() {
        return this.f9965d;
    }

    List<edk> m12075d() {
        return this.f9966e;
    }

    void m12076e() {
        this.f9965d = glj.m17956a();
        if (!this.f9963b) {
            for (itg e : dgg.m11692a().m11731w()) {
                e.mo1560e();
            }
        } else if (!m12067k()) {
            m12079h();
        }
        if (!m12067k()) {
            this.f9968g.postDelayed(this.f9969h, did.m11925D());
        }
    }

    void m12077f() {
        this.f9968g.removeCallbacks(this.f9969h);
        m12080i();
    }

    void m12078g() {
        this.f9968g.removeCallbacks(this.f9969h);
        m12080i();
    }

    private boolean m12066j() {
        return this.f9966e.size() != 0;
    }

    private boolean m12067k() {
        ArrayList arrayList = this.f9966e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((edk) obj).f11212a == edq.PHONE) {
                return true;
            }
        }
        return false;
    }

    private static edk m12065a(iqo iqo, List<edk> list) {
        if (iqo instanceof iqs) {
            iqs iqs = (iqs) iqo;
            for (edk edk : list) {
                if (edk.f11213b.f11244a != null && edk.f11213b.f11244a.equals(iqs.m22978s())) {
                    return edk;
                }
            }
            return null;
        } else if (!(iqo instanceof iqu)) {
            return null;
        } else {
            iqu iqu = (iqu) iqo;
            for (edk edk2 : list) {
                if (edk2.f11213b.f11244a == null && gwb.m2302m(edk2.f11230s, iqu.m22979s())) {
                    return edk2;
                }
            }
            return null;
        }
    }

    boolean m12071a(iqo iqo) {
        return djs.m12065a(iqo, this.f9966e) != null;
    }

    void m12073b(iqo iqo) {
        boolean z;
        if (iqo.m22969k() || iqo.m22963e()) {
            z = true;
        } else {
            z = false;
        }
        iil.m21879b("Expected condition to be false", z);
        edk a = djs.m12065a(iqo, this.f9966e);
        if (a != null) {
            this.f9966e.remove(a);
            if (!m12066j()) {
                m12069a(false, null);
            }
            m12080i();
        }
        if (this.f9963b && this.f9965d == 0) {
            m12069a(false, null);
        }
    }

    void m12068a(iqo iqo, Integer num) {
        iil.m21879b("Expected condition to be false", iqo.m22969k());
        if (iqo.m22964f()) {
            edk a = djs.m12065a(iqo, this.f9966e);
            if (a != null) {
                this.f9966e.remove(a);
                if (!m12066j()) {
                    m12069a(true, num);
                }
            }
        }
    }

    void m12069a(boolean z, Integer num) {
        boolean z2;
        this.f9968g.removeCallbacks(this.f9969h);
        this.f9962a.m11997s().remove(this);
        m12080i();
        if (this.f9962a.m11943H() != 0 || this.f9962a.m11940C()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int i;
            did did = this.f9962a;
            if (!z) {
                i = 11010;
            } else if (gwb.m1507a(num) == 7) {
                i = 11014;
            } else {
                i = 11011;
            }
            did.m11973b(i);
        }
        for (itg b : dgg.m11692a().m11731w()) {
            b.mo2258b(z2);
        }
    }

    void m12079h() {
        if (this.f9963b) {
            if (!this.f9962a.m11988j() && this.f9967f == null) {
                this.f9967f = new dju(this.f9962a.m11946K());
                this.f9967f.m12082a();
            }
            for (itg j : dgg.m11692a().m11731w()) {
                j.mo2259j();
            }
        }
    }

    void m12080i() {
        if (this.f9967f != null) {
            this.f9967f.m12083b();
            this.f9967f = null;
            if (this.f9963b) {
                for (itg c : dgg.m11692a().m11731w()) {
                    c.mo1558c();
                }
            }
        }
    }
}
