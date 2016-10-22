package defpackage;

import nyt;
import nyu;

/* renamed from: lwe */
public final class lwe extends nyx<lwe> {
    public Integer a;
    public ltj b;
    public Long c;
    public Long d;
    public lnr e;
    public byte[] f;
    public String g;
    public String h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lwe() {
        d();
    }

    private lwe d() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.f != null) {
            nyu.a(2, this.f);
        }
        if (this.c != null) {
            nyu.a(3, this.c.longValue());
        }
        if (this.b != null) {
            nyu.b(4, this.b);
        }
        if (this.d != null) {
            nyu.a(5, this.d.longValue());
        }
        if (this.e != null) {
            nyu.b(6, this.e);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.f != null) {
            b += nyu.b(2, this.f);
        }
        if (this.c != null) {
            b += nyu.e(3, this.c.longValue());
        }
        if (this.b != null) {
            b += nyu.d(4, this.b);
        }
        if (this.d != null) {
            b += nyu.e(5, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.d(6, this.e);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            return b + nyu.b(8, this.h);
        }
        return b;
    }

    private lwe b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case 34:
                    if (this.b == null) {
                        this.b = new ltj();
                    }
                    nyt.a(this.b);
                    continue;
                case 40:
                    this.d = Long.valueOf(nyt.d());
                    continue;
                case 50:
                    if (this.e == null) {
                        this.e = new lnr();
                    }
                    nyt.a(this.e);
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.h = nyt.j();
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
