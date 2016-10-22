package defpackage;

import com.google.api.client.http.HttpStatusCodes;
import nyt;
import nyu;
import nyy;
import nzl;
import ozo;

/* renamed from: mty */
public final class mty extends nyx<mty> {
    public static final nyy<ozo, mty> a;
    private static final mty[] k;
    public mtz[] b;
    public mua[] c;
    public mua[] d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public mtz[] h;
    public ozo i;
    public muf j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    static {
        a = nyy.a(11, mty.class, 97670194);
        k = new mty[0];
    }

    public mty() {
        d();
    }

    private mty d() {
        this.b = mtz.d();
        this.c = mua.d();
        this.d = mua.d();
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = mtz.d();
        this.i = null;
        this.j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.a(3, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(4, this.f.booleanValue());
        }
        if (this.h != null && this.h.length > 0) {
            for (nzf nzf2 : this.h) {
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf22 : this.c) {
                if (nzf22 != null) {
                    nyu.b(6, nzf22);
                }
            }
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.i != null) {
            nyu.b(8, this.i);
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf3 = this.d[i];
                if (nzf3 != null) {
                    nyu.b(9, nzf3);
                }
                i++;
            }
        }
        if (this.j != null) {
            nyu.b(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.h != null && this.h.length > 0) {
            i = b;
            for (nzf nzf2 : this.h) {
                if (nzf2 != null) {
                    i += nyu.d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf22 : this.c) {
                if (nzf22 != null) {
                    i += nyu.d(6, nzf22);
                }
            }
            b = i;
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.i != null) {
            b += nyu.d(8, this.i);
        }
        if (this.d != null && this.d.length > 0) {
            while (i2 < this.d.length) {
                nzf nzf3 = this.d[i2];
                if (nzf3 != null) {
                    b += nyu.d(9, nzf3);
                }
                i2++;
            }
        }
        if (this.j != null) {
            return b + nyu.d(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, this.j);
        }
        return b;
    }

    private mty b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new mtz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mtz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mtz();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.h == null) {
                        a = 0;
                    } else {
                        a = this.h.length;
                    }
                    obj = new mtz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mtz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mtz();
                    nyt.a(obj[a]);
                    this.h = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new mua[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mua();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mua();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    if (this.i == null) {
                        this.i = new ozo();
                    }
                    nyt.a(this.i);
                    continue;
                case 74:
                    b = nzl.b(nyt, 74);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new mua[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mua();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mua();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 4002:
                    if (this.j == null) {
                        this.j = new muf();
                    }
                    nyt.a(this.j);
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
