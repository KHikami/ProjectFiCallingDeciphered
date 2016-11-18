package p000;

import java.util.Arrays;

public final class lnj extends nyx<lnj> {
    public lnf f25770a;
    public lnk f25771b;
    public lnl f25772c;
    public lnm f25773d;
    public lng f25774e;
    public mwb f25775f;
    public byte[] f25776g;
    public String f25777h;
    public int f25778i;
    public lnh f25779j;
    public oev f25780k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29613b(nyt);
    }

    public void mo146a(nyu nyu) {
        if (this.f25775f != null) {
            nyu.b(1, this.f25775f);
        }
        if (!(this.f25777h == null || this.f25777h.equals(""))) {
            nyu.a(3, this.f25777h);
        }
        if (!Arrays.equals(this.f25776g, nzl.h)) {
            nyu.a(4, this.f25776g);
        }
        if (this.f25778i != 0) {
            nyu.a(5, this.f25778i);
        }
        if (this.f25779j != null) {
            nyu.b(6, this.f25779j);
        }
        if (this.f25780k != null) {
            nyu.b(7, this.f25780k);
        }
        if (this.f25773d != null) {
            nyu.b(8, this.f25773d);
        }
        if (this.f25774e != null) {
            nyu.b(9, this.f25774e);
        }
        if (this.f25770a != null) {
            nyu.b(10, this.f25770a);
        }
        if (this.f25771b != null) {
            nyu.b(11, this.f25771b);
        }
        if (this.f25772c != null) {
            nyu.b(12, this.f25772c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25775f != null) {
            b += nyu.d(1, this.f25775f);
        }
        if (!(this.f25777h == null || this.f25777h.equals(""))) {
            b += nyu.b(3, this.f25777h);
        }
        if (!Arrays.equals(this.f25776g, nzl.h)) {
            b += nyu.b(4, this.f25776g);
        }
        if (this.f25778i != 0) {
            b += nyu.f(5, this.f25778i);
        }
        if (this.f25779j != null) {
            b += nyu.d(6, this.f25779j);
        }
        if (this.f25780k != null) {
            b += nyu.d(7, this.f25780k);
        }
        if (this.f25773d != null) {
            b += nyu.d(8, this.f25773d);
        }
        if (this.f25774e != null) {
            b += nyu.d(9, this.f25774e);
        }
        if (this.f25770a != null) {
            b += nyu.d(10, this.f25770a);
        }
        if (this.f25771b != null) {
            b += nyu.d(11, this.f25771b);
        }
        if (this.f25772c != null) {
            return b + nyu.d(12, this.f25772c);
        }
        return b;
    }

    private lnj m29613b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25775f == null) {
                        this.f25775f = new mwb();
                    }
                    nyt.a(this.f25775f);
                    continue;
                case wi.dx /*26*/:
                    this.f25777h = nyt.j();
                    continue;
                case 34:
                    this.f25776g = nyt.k();
                    continue;
                case 40:
                    this.f25778i = nyt.f();
                    continue;
                case 50:
                    if (this.f25779j == null) {
                        this.f25779j = new lnh();
                    }
                    nyt.a(this.f25779j);
                    continue;
                case 58:
                    if (this.f25780k == null) {
                        this.f25780k = new oev();
                    }
                    nyt.a(this.f25780k);
                    continue;
                case 66:
                    if (this.f25773d == null) {
                        this.f25773d = new lnm();
                    }
                    nyt.a(this.f25773d);
                    continue;
                case 74:
                    if (this.f25774e == null) {
                        this.f25774e = new lng();
                    }
                    nyt.a(this.f25774e);
                    continue;
                case 82:
                    if (this.f25770a == null) {
                        this.f25770a = new lnf();
                    }
                    nyt.a(this.f25770a);
                    continue;
                case 90:
                    if (this.f25771b == null) {
                        this.f25771b = new lnk();
                    }
                    nyt.a(this.f25771b);
                    continue;
                case 98:
                    if (this.f25772c == null) {
                        this.f25772c = new lnl();
                    }
                    nyt.a(this.f25772c);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
