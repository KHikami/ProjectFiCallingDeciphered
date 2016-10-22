package defpackage;

import nyt;
import nyu;
import nzc;

/* renamed from: leo */
public final class leo extends nyx<leo> {
    private static volatile leo[] e;
    public ldx a;
    public Integer b;
    public String c;
    public Boolean d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static leo[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new leo[0];
                }
            }
        }
        return e;
    }

    public leo() {
        g();
    }

    private leo g() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.a != null) {
            nyu.b(3, this.a);
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.f(1, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.a != null) {
            b += nyu.d(3, this.a);
        }
        if (this.d == null) {
            return b;
        }
        this.d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private leo b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.a == null) {
                        this.a = new ldx();
                    }
                    nyt.a(this.a);
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
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
