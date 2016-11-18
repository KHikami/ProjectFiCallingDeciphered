package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class frz extends bjg {
    private final hwk f13866a;
    private final Context f13867b;

    frz(hwk hwk, Context context) {
        this.f13866a = hwk;
        this.f13867b = context;
    }

    public bjo mo567a() {
        Iterator it = mo568b().iterator();
        if (it.hasNext()) {
            return (bjo) it.next();
        }
        return null;
    }

    public Collection<bjo> mo568b() {
        Collection arrayList = new ArrayList();
        for (hwr hwr : this.f13866a.mo2080d()) {
            arrayList.add(new bjo(hwr.mo2954a(), hwr.mo2955b(), glq.m18021e(this.f13867b, hwr.mo2955b()), hwr.mo2955b(), false));
        }
        return arrayList;
    }

    public String mo569c() {
        Iterator it = mo570d().iterator();
        if (it.hasNext()) {
            return ((bje) it.next()).m5365c();
        }
        return null;
    }

    public Collection<bje> mo570d() {
        Collection arrayList = new ArrayList();
        for (hwm hwm : this.f13866a.mo2079c()) {
            arrayList.add(new bje(hwm.mo2950a(), hwm.mo2951b()));
        }
        return arrayList;
    }

    public String mo571e() {
        return this.f13866a.mo2077a();
    }

    public String mo572f() {
        return this.f13866a.mo2084h();
    }

    public boolean mo573g() {
        throw new UnsupportedOperationException();
    }

    public boolean mo574h() {
        return !TextUtils.isEmpty(this.f13866a.mo2081e());
    }

    public String mo575i() {
        return this.f13866a.mo2081e();
    }

    public Collection<bjf> mo576j() {
        Collection arrayList = new ArrayList();
        if (mo574h()) {
            arrayList.add(new bjf(mo575i()));
        }
        return arrayList;
    }

    public String mo577k() {
        throw new UnsupportedOperationException();
    }

    public String mo578l() {
        throw new UnsupportedOperationException();
    }

    public float mo579m() {
        throw new UnsupportedOperationException();
    }

    public String mo580n() {
        throw new UnsupportedOperationException();
    }

    public boolean mo581o() {
        return this.f13866a.mo2078b().iterator().hasNext();
    }

    public String mo582p() {
        Iterator it = this.f13866a.mo2078b().iterator();
        if (it.hasNext()) {
            return String.valueOf(gwb.m1523a((Long) it.next()));
        }
        return null;
    }

    public bji mo583q() {
        throw new UnsupportedOperationException();
    }

    public String mo584r() {
        throw new UnsupportedOperationException();
    }

    public boolean mo585s() {
        return mo574h();
    }

    public boolean mo586t() {
        throw new UnsupportedOperationException();
    }

    public boolean mo587u() {
        throw new UnsupportedOperationException();
    }

    public boolean mo588v() {
        throw new UnsupportedOperationException();
    }

    public bjh mo589w() {
        throw new UnsupportedOperationException();
    }

    public boolean mo590x() {
        return false;
    }

    public boolean mo591y() {
        return this.f13866a.mo2082f();
    }
}
