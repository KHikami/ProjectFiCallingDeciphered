package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: mbq */
public final class mbq extends nyx<mbq> {
    public Long a;
    public String b;
    public lsh c;
    public mbx[] d;
    public Integer e;
    public Boolean f;
    public Integer g;
    public mbv h;
    public String i;
    public String j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mbq() {
        d();
    }

    private mbq d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = mbx.d();
        this.f = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.e != null) {
            nyu.a(3, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(4, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(6, this.g.intValue());
        }
        if (this.h != null) {
            nyu.b(7, this.h);
        }
        if (this.a != null) {
            nyu.b(8, this.a.longValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(11, nzf);
                }
            }
        }
        if (this.j != null) {
            nyu.a(99, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.e != null) {
            b += nyu.f(3, this.e.intValue());
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.g != null) {
            b += nyu.f(6, this.g.intValue());
        }
        if (this.h != null) {
            b += nyu.d(7, this.h);
        }
        if (this.a != null) {
            b += nyu.f(8, this.a.longValue());
        }
        if (this.i != null) {
            b += nyu.b(9, this.i);
        }
        if (this.d != null && this.d.length > 0) {
            int i = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i += nyu.d(11, nzf);
                }
            }
            b = i;
        }
        if (this.j != null) {
            return b + nyu.b(99, this.j);
        }
        return b;
    }

    private mbq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new lsh();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.h == null) {
                        this.h = new mbv();
                    }
                    nyt.a(this.h);
                    continue;
                case 64:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 74:
                    this.i = nyt.j();
                    continue;
                case 90:
                    int b = nzl.b(nyt, 90);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    Object obj = new mbx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mbx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mbx();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 794:
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
