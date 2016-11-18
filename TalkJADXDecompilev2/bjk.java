package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class bjk {
    private String a;
    private String b;
    private final List<bjf> c = new ArrayList();
    private String d;
    private String e;
    private String f;
    private bji g = bji.NONE;
    private String h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private bjh p;
    private final ArrayList<bje> q = new ArrayList();
    private final ArrayList<bjo> r = new ArrayList();
    private String s;
    private float t;

    public bjk a(String str) {
        this.a = str;
        return this;
    }

    public bjk b(String str) {
        this.b = str;
        return this;
    }

    public bjk a(bjf bjf) {
        this.c.add(bjf);
        return this;
    }

    public bjk a(Collection<bjf> collection) {
        if (collection != null) {
            this.c.addAll(collection);
        }
        return this;
    }

    public bjk c(String str) {
        this.d = str;
        return this;
    }

    public bjk d(String str) {
        this.e = str;
        return this;
    }

    public bjk e(String str) {
        this.f = str;
        return this;
    }

    public bjk a(bji bji) {
        ba.a((Object) bji);
        this.g = bji;
        return this;
    }

    public bjk f(String str) {
        this.h = str;
        return this;
    }

    public bjk a(boolean z) {
        this.i = z;
        return this;
    }

    public bjk b(boolean z) {
        this.j = z;
        return this;
    }

    public bjk c(boolean z) {
        this.k = z;
        return this;
    }

    public bjk d(boolean z) {
        this.l = z;
        return this;
    }

    public bjk e(boolean z) {
        this.m = z;
        return this;
    }

    public bjk f(boolean z) {
        this.o = z;
        return this;
    }

    public bjk a(bjh bjh) {
        this.p = bjh;
        return this;
    }

    public bjk g(String str) {
        if (str != null) {
            this.q.add(new bje(str));
        }
        return this;
    }

    public bjk b(Collection<bje> collection) {
        this.q.addAll(collection);
        return this;
    }

    public bjk h(String str) {
        if (str != null) {
            this.r.add(new bjo(str));
        }
        return this;
    }

    public bjk c(Collection<bjo> collection) {
        this.r.addAll(collection);
        return this;
    }

    public bjk i(String str) {
        this.s = str;
        return this;
    }

    public bjk a(float f) {
        this.t = f;
        return this;
    }

    public bjj a() {
        return new bjj(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }
}
