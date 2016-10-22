package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lwr */
public final class lwr extends nyx<lwr> {
    public Long a;
    public lox[] b;
    public Long c;
    public lsb d;
    public lqc[] e;
    public lnw f;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lwr() {
        d();
    }

    private lwr d() {
        this.responseHeader = null;
        this.a = null;
        this.b = lox.d();
        this.c = null;
        this.d = null;
        this.e = lqc.d();
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.a(4, this.c.longValue());
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            nyu.b(7, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null) {
            b += nyu.e(2, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.c != null) {
            b += nyu.e(4, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.d(5, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            return b + nyu.d(7, this.f);
        }
        return b;
    }

    private lwr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dI /*16*/:
                    this.a = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new lox[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lox();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lox();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 32:
                    this.c = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new lsb();
                    }
                    nyt.a(this.d);
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 58:
                    if (this.f == null) {
                        this.f = new lnw();
                    }
                    nyt.a(this.f);
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
