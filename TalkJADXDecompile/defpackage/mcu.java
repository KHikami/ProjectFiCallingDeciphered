package defpackage;

import nyt;
import nyu;

/* renamed from: mcu */
public final class mcu extends nyx<mcu> {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public mds f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mcu() {
        d();
    }

    private mcu d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i);
        }
        if (this.k != null) {
            nyu.a(10, this.k);
        }
        if (this.l != null) {
            nyu.a(11, this.l);
        }
        if (this.j != null) {
            nyu.a(12, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            b += nyu.b(9, this.i);
        }
        if (this.k != null) {
            b += nyu.b(10, this.k);
        }
        if (this.l != null) {
            b += nyu.b(11, this.l);
        }
        if (this.j != null) {
            return b + nyu.b(12, this.j);
        }
        return b;
    }

    private mcu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new mds();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    this.i = nyt.j();
                    continue;
                case 82:
                    this.k = nyt.j();
                    continue;
                case 90:
                    this.l = nyt.j();
                    continue;
                case 98:
                    this.j = nyt.j();
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
