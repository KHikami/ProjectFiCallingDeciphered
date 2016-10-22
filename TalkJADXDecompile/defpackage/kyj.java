package defpackage;

import nyt;
import nyu;
import nzc;
import nzl;

/* renamed from: kyj */
public final class kyj extends nyx<kyj> {
    private static volatile kyj[] j;
    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public kyi[] i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kyj[] d() {
        if (j == null) {
            synchronized (nzc.c) {
                if (j == null) {
                    j = new kyj[0];
                }
            }
        }
        return j;
    }

    public kyj() {
        g();
    }

    private kyj g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = kyi.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
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
            nyu.a(6, this.f);
        }
        if (this.i != null && this.i.length > 0) {
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
            }
        }
        if (this.g != null) {
            nyu.a(8, this.g);
        }
        if (this.h != null) {
            nyu.a(9, this.h.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
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
            b += nyu.b(6, this.f);
        }
        if (this.i != null && this.i.length > 0) {
            int i = b;
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    i += nyu.d(7, nzf);
                }
            }
            b = i;
        }
        if (this.g != null) {
            b += nyu.b(8, this.g);
        }
        if (this.h != null) {
            return b + nyu.f(9, this.h.intValue());
        }
        return b;
    }

    private kyj b(nyt nyt) {
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
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
                    this.f = nyt.j();
                    continue;
                case 58:
                    int b = nzl.b(nyt, 58);
                    if (this.i == null) {
                        a = 0;
                    } else {
                        a = this.i.length;
                    }
                    Object obj = new kyi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kyi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kyi();
                    nyt.a(obj[a]);
                    this.i = obj;
                    continue;
                case 66:
                    this.g = nyt.j();
                    continue;
                case 72:
                    this.h = Integer.valueOf(nyt.f());
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
