package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: mct */
public final class mct extends nyx<mct> {
    public Long a;
    public String[] b;
    public mcj[] c;
    public Boolean d;
    public String e;
    public Boolean f;
    public mdd g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mct() {
        d();
    }

    private mct d() {
        this.a = null;
        this.b = nzl.f;
        this.c = mcj.d();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (String str : this.b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.d != null) {
            nyu.a(3, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null) {
            nyu.a(5, this.f.booleanValue());
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf = this.c[i];
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.b) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf = this.c[i];
                if (nzf != null) {
                    b += nyu.d(6, nzf);
                }
                i++;
            }
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private mct b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 40:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new mcj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mcj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mcj();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new mdd();
                    }
                    nyt.a(this.g);
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
