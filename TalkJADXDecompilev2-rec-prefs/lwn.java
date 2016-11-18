package p000;

public final class lwn extends nyx<lwn> {
    public Long f26694a;
    public lsp[] f26695b;
    public lww[] f26696c;
    public Integer f26697d;
    public Boolean f26698e;
    public Integer f26699f;
    public Integer f26700g;
    public byte[][] f26701h;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30888b(nyt);
    }

    public lwn() {
        m30889d();
    }

    private lwn m30889d() {
        this.requestHeader = null;
        this.f26694a = null;
        this.f26695b = lsp.m30346d();
        this.f26696c = lww.m30934d();
        this.f26697d = null;
        this.f26698e = null;
        this.f26700g = null;
        this.f26701h = nzl.g;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26694a != null) {
            nyu.a(2, this.f26694a.longValue());
        }
        if (this.f26695b != null && this.f26695b.length > 0) {
            for (nzf nzf : this.f26695b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f26700g != null) {
            nyu.a(4, this.f26700g.intValue());
        }
        if (this.f26701h != null && this.f26701h.length > 0) {
            for (byte[] bArr : this.f26701h) {
                if (bArr != null) {
                    nyu.a(5, bArr);
                }
            }
        }
        if (this.f26698e != null) {
            nyu.a(6, this.f26698e.booleanValue());
        }
        if (this.f26696c != null && this.f26696c.length > 0) {
            while (i < this.f26696c.length) {
                nzf nzf2 = this.f26696c[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.f26697d != null) {
            nyu.a(8, this.f26697d.intValue());
        }
        if (this.f26699f != null) {
            nyu.a(9, this.f26699f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26694a != null) {
            b += nyu.e(2, this.f26694a.longValue());
        }
        if (this.f26695b != null && this.f26695b.length > 0) {
            i = b;
            for (nzf nzf : this.f26695b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f26700g != null) {
            b += nyu.f(4, this.f26700g.intValue());
        }
        if (this.f26701h != null && this.f26701h.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (byte[] bArr : this.f26701h) {
                if (bArr != null) {
                    i4++;
                    i3 += nyu.b(bArr);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f26698e != null) {
            this.f26698e.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f26696c != null && this.f26696c.length > 0) {
            while (i2 < this.f26696c.length) {
                nzf nzf2 = this.f26696c[i2];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i2++;
            }
        }
        if (this.f26697d != null) {
            b += nyu.f(8, this.f26697d.intValue());
        }
        if (this.f26699f != null) {
            return b + nyu.f(9, this.f26699f.intValue());
        }
        return b;
    }

    private lwn m30888b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case 16:
                    this.f26694a = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26695b == null) {
                        a = 0;
                    } else {
                        a = this.f26695b.length;
                    }
                    obj = new lsp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26695b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsp();
                    nyt.a(obj[a]);
                    this.f26695b = obj;
                    continue;
                case 32:
                    this.f26700g = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    a = this.f26701h == null ? 0 : this.f26701h.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f26701h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f26701h = obj;
                    continue;
                case 48:
                    this.f26698e = Boolean.valueOf(nyt.i());
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f26696c == null) {
                        a = 0;
                    } else {
                        a = this.f26696c.length;
                    }
                    obj = new lww[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26696c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lww();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lww();
                    nyt.a(obj[a]);
                    this.f26696c = obj;
                    continue;
                case 64:
                    this.f26697d = Integer.valueOf(nyt.f());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26699f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
