package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lxv */
public final class lxv extends nyx<lxv> {
    public String a;
    public String b;
    public lzj c;
    public String d;
    public String[] e;
    public lzg[] f;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lxv() {
        d();
    }

    private lxv d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = nzl.f;
        this.f = lzg.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (String str : this.e) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf = this.f[i];
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.b(2, this.a);
        }
        if (this.b != null) {
            b += nyu.b(3, this.b);
        }
        if (this.c != null) {
            b += nyu.d(4, this.c);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.e) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf = this.f[i];
                if (nzf != null) {
                    b += nyu.d(7, nzf);
                }
                i++;
            }
        }
        return b;
    }

    private lxv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 34:
                    if (this.c == null) {
                        this.c = new lzj();
                    }
                    nyt.a(this.c);
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.e = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new lzg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzg();
                    nyt.a(obj[a]);
                    this.f = obj;
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
