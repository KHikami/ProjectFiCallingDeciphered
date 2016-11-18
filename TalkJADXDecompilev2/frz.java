package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class frz extends bjg {
    private final hwk a;
    private final Context b;

    frz(hwk hwk, Context context) {
        this.a = hwk;
        this.b = context;
    }

    public bjo a() {
        Iterator it = b().iterator();
        if (it.hasNext()) {
            return (bjo) it.next();
        }
        return null;
    }

    public Collection<bjo> b() {
        Collection arrayList = new ArrayList();
        for (hwr hwr : this.a.d()) {
            arrayList.add(new bjo(hwr.a(), hwr.b(), glq.e(this.b, hwr.b()), hwr.b(), false));
        }
        return arrayList;
    }

    public String c() {
        Iterator it = d().iterator();
        if (it.hasNext()) {
            return ((bje) it.next()).c();
        }
        return null;
    }

    public Collection<bje> d() {
        Collection arrayList = new ArrayList();
        for (hwm hwm : this.a.c()) {
            arrayList.add(new bje(hwm.a(), hwm.b()));
        }
        return arrayList;
    }

    public String e() {
        return this.a.a();
    }

    public String f() {
        return this.a.h();
    }

    public boolean g() {
        throw new UnsupportedOperationException();
    }

    public boolean h() {
        return !TextUtils.isEmpty(this.a.e());
    }

    public String i() {
        return this.a.e();
    }

    public Collection<bjf> j() {
        Collection arrayList = new ArrayList();
        if (h()) {
            arrayList.add(new bjf(i()));
        }
        return arrayList;
    }

    public String k() {
        throw new UnsupportedOperationException();
    }

    public String l() {
        throw new UnsupportedOperationException();
    }

    public float m() {
        throw new UnsupportedOperationException();
    }

    public String n() {
        throw new UnsupportedOperationException();
    }

    public boolean o() {
        return this.a.b().iterator().hasNext();
    }

    public String p() {
        Iterator it = this.a.b().iterator();
        if (it.hasNext()) {
            return String.valueOf(gwb.a((Long) it.next()));
        }
        return null;
    }

    public bji q() {
        throw new UnsupportedOperationException();
    }

    public String r() {
        throw new UnsupportedOperationException();
    }

    public boolean s() {
        return h();
    }

    public boolean t() {
        throw new UnsupportedOperationException();
    }

    public boolean u() {
        throw new UnsupportedOperationException();
    }

    public boolean v() {
        throw new UnsupportedOperationException();
    }

    public bjh w() {
        throw new UnsupportedOperationException();
    }

    public boolean x() {
        return false;
    }

    public boolean y() {
        return this.a.f();
    }
}
