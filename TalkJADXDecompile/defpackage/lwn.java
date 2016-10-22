package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lwn */
public final class lwn extends nyx<lwn> {
    public Long a;
    public lsp[] b;
    public lww[] c;
    public Integer d;
    public Boolean e;
    public Integer f;
    public Integer g;
    public byte[][] h;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lwn() {
        d();
    }

    private lwn d() {
        this.requestHeader = null;
        this.a = null;
        this.b = lsp.d();
        this.c = lww.d();
        this.d = null;
        this.e = null;
        this.g = null;
        this.h = nzl.g;
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
            nyu.a(2, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.g != null) {
            nyu.a(4, this.g.intValue());
        }
        if (this.h != null && this.h.length > 0) {
            for (byte[] bArr : this.h) {
                if (bArr != null) {
                    nyu.a(5, bArr);
                }
            }
        }
        if (this.e != null) {
            nyu.a(6, this.e.booleanValue());
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf2 = this.c[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.d != null) {
            nyu.a(8, this.d.intValue());
        }
        if (this.f != null) {
            nyu.a(9, this.f.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.e(2, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.g != null) {
            b += nyu.f(4, this.g.intValue());
        }
        if (this.h != null && this.h.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (byte[] bArr : this.h) {
                if (bArr != null) {
                    i4++;
                    i3 += nyu.b(bArr);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            while (i2 < this.c.length) {
                nzf nzf2 = this.c[i2];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i2++;
            }
        }
        if (this.d != null) {
            b += nyu.f(8, this.d.intValue());
        }
        if (this.f != null) {
            return b + nyu.f(9, this.f.intValue());
        }
        return b;
    }

    private lwn b(nyt nyt) {
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
                    obj = new lsp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsp();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 32:
                    this.g = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.h == null ? 0 : this.h.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.h = obj;
                    continue;
                case 48:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lww[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lww();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lww();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 64:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
