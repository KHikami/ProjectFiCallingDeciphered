package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: mcr */
public final class mcr extends nyx<mcr> {
    public Long a;
    public int[] b;
    public Integer c;
    public mcs[] d;
    public Integer e;
    public Integer f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mcr() {
        d();
    }

    private mcr d() {
        this.a = null;
        this.b = nzl.a;
        this.c = null;
        this.d = mcs.d();
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (int c : this.b) {
                nyu.c(2, c);
            }
        }
        if (this.c != null) {
            nyu.c(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf = this.d[i];
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
                i++;
            }
        }
        if (this.e != null) {
            nyu.c(5, this.e.intValue());
        }
        if (this.f != null) {
            nyu.c(6, this.f.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.e(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = 0;
            for (int j : this.b) {
                i2 += nyu.j(j);
            }
            b = (b + i2) + (this.b.length * 1);
        }
        if (this.c != null) {
            b += nyu.g(3, this.c.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf = this.d[i];
                if (nzf != null) {
                    b += nyu.d(4, nzf);
                }
                i++;
            }
        }
        if (this.e != null) {
            b += nyu.g(5, this.e.intValue());
        }
        if (this.f != null) {
            return b + nyu.g(6, this.f.intValue());
        }
        return b;
    }

    private mcr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Long.valueOf(nyt.d());
                    continue;
                case wi.dI /*16*/:
                    b = nzl.b(nyt, 16);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.l();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.l();
                    this.b = obj;
                    continue;
                case wi.dH /*18*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.l();
                        a++;
                    }
                    nyt.f(b);
                    b = this.b == null ? 0 : this.b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.l();
                        b++;
                    }
                    this.b = obj2;
                    nyt.e(d);
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.l());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new mcs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mcs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mcs();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.l());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.l());
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
