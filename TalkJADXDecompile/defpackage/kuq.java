package defpackage;

import nyt;
import nyu;

/* renamed from: kuq */
public final class kuq extends nyx<kuq> {
    public Long a;
    public Long b;
    public String c;
    public Integer d;
    public kur e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kuq() {
        d();
    }

    private kuq d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.e != null) {
            nyu.b(4, this.e);
        }
        if (this.d != null) {
            nyu.a(5, this.d.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.e != null) {
            b += nyu.d(4, this.e);
        }
        if (this.d != null) {
            return b + nyu.f(5, this.d.intValue());
        }
        return b;
    }

    private kuq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dI /*16*/:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    if (this.e == null) {
                        this.e = new kur();
                    }
                    nyt.a(this.e);
                    continue;
                case 40:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
