package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: lsg */
public final class lsg extends nyx<lsg> {
    private static volatile lsg[] g;
    public lsh a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public byte[] f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lsg[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new lsg[0];
                }
            }
        }
        return g;
    }

    public lsg() {
        g();
    }

    private lsg g() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.f != null) {
            nyu.a(4, this.f);
        }
        if (this.b != null) {
            nyu.a(5, this.b);
        }
        if (this.c != null) {
            nyu.a(6, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.f != null) {
            b += nyu.b(4, this.f);
        }
        if (this.b != null) {
            b += nyu.b(5, this.b);
        }
        if (this.c != null) {
            return b + nyu.f(6, this.c.intValue());
        }
        return b;
    }

    private lsg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new lsh();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    this.f = nyt.k();
                    continue;
                case 42:
                    this.b = nyt.j();
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
