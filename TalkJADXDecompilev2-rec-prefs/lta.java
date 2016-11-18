package p000;

public final class lta extends nyx<lta> {
    public Integer f26358a;
    public ltr[] f26359b;
    public Integer f26360c;
    public byte[][] f26361d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30403b(nyt);
    }

    public lta() {
        m30404d();
    }

    private lta m30404d() {
        this.f26359b = ltr.m30492d();
        this.f26361d = nzl.g;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f26358a != null) {
            nyu.a(1, this.f26358a.intValue());
        }
        if (this.f26361d != null && this.f26361d.length > 0) {
            for (byte[] bArr : this.f26361d) {
                if (bArr != null) {
                    nyu.a(2, bArr);
                }
            }
        }
        if (this.f26359b != null && this.f26359b.length > 0) {
            while (i < this.f26359b.length) {
                nzf nzf = this.f26359b[i];
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
                i++;
            }
        }
        if (this.f26360c != null) {
            nyu.a(4, this.f26360c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26358a != null) {
            b += nyu.f(1, this.f26358a.intValue());
        }
        if (this.f26361d != null && this.f26361d.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (byte[] bArr : this.f26361d) {
                if (bArr != null) {
                    i3++;
                    i2 += nyu.b(bArr);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f26359b != null && this.f26359b.length > 0) {
            while (i < this.f26359b.length) {
                nzf nzf = this.f26359b[i];
                if (nzf != null) {
                    b += nyu.d(3, nzf);
                }
                i++;
            }
        }
        if (this.f26360c != null) {
            return b + nyu.f(4, this.f26360c.intValue());
        }
        return b;
    }

    private lta m30403b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26358a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.f26361d == null ? 0 : this.f26361d.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f26361d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f26361d = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26359b == null) {
                        a = 0;
                    } else {
                        a = this.f26359b.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26359b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f26359b = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26360c = Integer.valueOf(a);
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
