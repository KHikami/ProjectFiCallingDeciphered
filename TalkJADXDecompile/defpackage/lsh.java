package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: lsh */
public final class lsh extends nyx<lsh> {
    private static volatile lsh[] h;
    public String a;
    public String b;
    public String c;
    public muu d;
    public String e;
    public lsi[] f;
    public byte[] g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lsh[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new lsh[0];
                }
            }
        }
        return h;
    }

    public lsh() {
        g();
    }

    private lsh g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = lsi.d();
        this.g = null;
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
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.b(7, this.d);
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
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.f != null && this.f.length > 0) {
            int i = b;
            for (nzf nzf : this.f) {
                if (nzf != null) {
                    i += nyu.d(6, nzf);
                }
            }
            b = i;
        }
        if (this.d != null) {
            return b + nyu.d(7, this.d);
        }
        return b;
    }

    private lsh b(nyt nyt) {
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
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.g = nyt.k();
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    Object obj = new lsi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsi();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 58:
                    if (this.d == null) {
                        this.d = new muu();
                    }
                    nyt.a(this.d);
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
