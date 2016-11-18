package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class bjk {
    private String f3512a;
    private String f3513b;
    private final List<bjf> f3514c = new ArrayList();
    private String f3515d;
    private String f3516e;
    private String f3517f;
    private bji f3518g = bji.NONE;
    private String f3519h;
    private boolean f3520i;
    private boolean f3521j;
    private boolean f3522k;
    private boolean f3523l;
    private boolean f3524m;
    private boolean f3525n;
    private boolean f3526o;
    private bjh f3527p;
    private final ArrayList<bje> f3528q = new ArrayList();
    private final ArrayList<bjo> f3529r = new ArrayList();
    private String f3530s;
    private float f3531t;

    public bjk m5443a(String str) {
        this.f3512a = str;
        return this;
    }

    public bjk m5446b(String str) {
        this.f3513b = str;
        return this;
    }

    public bjk m5440a(bjf bjf) {
        this.f3514c.add(bjf);
        return this;
    }

    public bjk m5444a(Collection<bjf> collection) {
        if (collection != null) {
            this.f3514c.addAll(collection);
        }
        return this;
    }

    public bjk m5449c(String str) {
        this.f3515d = str;
        return this;
    }

    public bjk m5452d(String str) {
        this.f3516e = str;
        return this;
    }

    public bjk m5454e(String str) {
        this.f3517f = str;
        return this;
    }

    public bjk m5442a(bji bji) {
        ba.m4536a((Object) bji);
        this.f3518g = bji;
        return this;
    }

    public bjk m5456f(String str) {
        this.f3519h = str;
        return this;
    }

    public bjk m5445a(boolean z) {
        this.f3520i = z;
        return this;
    }

    public bjk m5448b(boolean z) {
        this.f3521j = z;
        return this;
    }

    public bjk m5451c(boolean z) {
        this.f3522k = z;
        return this;
    }

    public bjk m5453d(boolean z) {
        this.f3523l = z;
        return this;
    }

    public bjk m5455e(boolean z) {
        this.f3524m = z;
        return this;
    }

    public bjk m5457f(boolean z) {
        this.f3526o = z;
        return this;
    }

    public bjk m5441a(bjh bjh) {
        this.f3527p = bjh;
        return this;
    }

    public bjk m5458g(String str) {
        if (str != null) {
            this.f3528q.add(new bje(str));
        }
        return this;
    }

    public bjk m5447b(Collection<bje> collection) {
        this.f3528q.addAll(collection);
        return this;
    }

    public bjk m5459h(String str) {
        if (str != null) {
            this.f3529r.add(new bjo(str));
        }
        return this;
    }

    public bjk m5450c(Collection<bjo> collection) {
        this.f3529r.addAll(collection);
        return this;
    }

    public bjk m5460i(String str) {
        this.f3530s = str;
        return this;
    }

    public bjk m5439a(float f) {
        this.f3531t = f;
        return this;
    }

    public bjj m5438a() {
        return new bjj(this.f3512a, this.f3513b, this.f3514c, this.f3515d, this.f3516e, this.f3517f, this.f3518g, this.f3519h, this.f3520i, this.f3521j, this.f3522k, this.f3523l, this.f3524m, this.f3525n, this.f3526o, this.f3527p, this.f3528q, this.f3529r, this.f3530s, this.f3531t);
    }
}
