package p000;

public final class kpj extends nyx<kpj> {
    public krc[] f22647a;
    public kra[] f22648b;
    public kqz[] f22649c;
    public krb[] f22650d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26914b(nyt);
    }

    public kpj() {
        m26915d();
    }

    private kpj m26915d() {
        this.f22647a = krc.m27156d();
        this.f22648b = kra.m27144d();
        this.f22649c = kqz.m27137d();
        this.f22650d = krb.m27150d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22647a != null && this.f22647a.length > 0) {
            for (nzf nzf : this.f22647a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f22648b != null && this.f22648b.length > 0) {
            for (nzf nzf2 : this.f22648b) {
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
            }
        }
        if (this.f22649c != null && this.f22649c.length > 0) {
            for (nzf nzf22 : this.f22649c) {
                if (nzf22 != null) {
                    nyu.b(3, nzf22);
                }
            }
        }
        if (this.f22650d != null && this.f22650d.length > 0) {
            while (i < this.f22650d.length) {
                nzf nzf3 = this.f22650d[i];
                if (nzf3 != null) {
                    nyu.b(4, nzf3);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f22647a != null && this.f22647a.length > 0) {
            i = b;
            for (nzf nzf : this.f22647a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f22648b != null && this.f22648b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f22648b) {
                if (nzf2 != null) {
                    i += nyu.d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f22649c != null && this.f22649c.length > 0) {
            i = b;
            for (nzf nzf22 : this.f22649c) {
                if (nzf22 != null) {
                    i += nyu.d(3, nzf22);
                }
            }
            b = i;
        }
        if (this.f22650d != null && this.f22650d.length > 0) {
            while (i2 < this.f22650d.length) {
                nzf nzf3 = this.f22650d[i2];
                if (nzf3 != null) {
                    b += nyu.d(4, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private kpj m26914b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f22647a == null) {
                        a = 0;
                    } else {
                        a = this.f22647a.length;
                    }
                    obj = new krc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22647a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new krc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new krc();
                    nyt.a(obj[a]);
                    this.f22647a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f22648b == null) {
                        a = 0;
                    } else {
                        a = this.f22648b.length;
                    }
                    obj = new kra[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22648b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kra();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kra();
                    nyt.a(obj[a]);
                    this.f22648b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f22649c == null) {
                        a = 0;
                    } else {
                        a = this.f22649c.length;
                    }
                    obj = new kqz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22649c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kqz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kqz();
                    nyt.a(obj[a]);
                    this.f22649c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f22650d == null) {
                        a = 0;
                    } else {
                        a = this.f22650d.length;
                    }
                    obj = new krb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22650d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new krb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new krb();
                    nyt.a(obj[a]);
                    this.f22650d = obj;
                    continue;
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
