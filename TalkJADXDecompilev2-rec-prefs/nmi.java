package p000;

public final class nmi extends nyx<nmi> {
    public String f30228a;
    public nlr[] f30229b;
    public nge[] f30230c;
    public niv[] f30231d;
    public nme[] f30232e;

    public /* synthetic */ nzf m35632a(nyt nyt) {
        return m35630b(nyt);
    }

    public nmi() {
        m35631d();
    }

    private nmi m35631d() {
        this.f30228a = null;
        this.f30229b = nlr.m35540d();
        this.f30230c = nge.m34794d();
        this.f30231d = niv.m35156d();
        this.f30232e = nme.m35610d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35633a(nyu nyu) {
        int i = 0;
        if (this.f30228a != null) {
            nyu.m37170a(1, this.f30228a);
        }
        if (this.f30229b != null && this.f30229b.length > 0) {
            for (nzf nzf : this.f30229b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f30230c != null && this.f30230c.length > 0) {
            for (nzf nzf2 : this.f30230c) {
                if (nzf2 != null) {
                    nyu.m37182b(3, nzf2);
                }
            }
        }
        if (this.f30231d != null && this.f30231d.length > 0) {
            for (nzf nzf22 : this.f30231d) {
                if (nzf22 != null) {
                    nyu.m37182b(4, nzf22);
                }
            }
        }
        if (this.f30232e != null && this.f30232e.length > 0) {
            while (i < this.f30232e.length) {
                nzf nzf3 = this.f30232e[i];
                if (nzf3 != null) {
                    nyu.m37182b(5, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m35634b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f30228a != null) {
            b += nyu.m37137b(1, this.f30228a);
        }
        if (this.f30229b != null && this.f30229b.length > 0) {
            i = b;
            for (nzf nzf : this.f30229b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f30230c != null && this.f30230c.length > 0) {
            i = b;
            for (nzf nzf2 : this.f30230c) {
                if (nzf2 != null) {
                    i += nyu.m37145d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.f30231d != null && this.f30231d.length > 0) {
            i = b;
            for (nzf nzf22 : this.f30231d) {
                if (nzf22 != null) {
                    i += nyu.m37145d(4, nzf22);
                }
            }
            b = i;
        }
        if (this.f30232e != null && this.f30232e.length > 0) {
            while (i2 < this.f30232e.length) {
                nzf nzf3 = this.f30232e[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(5, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private nmi m35630b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30228a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f30229b == null) {
                        a = 0;
                    } else {
                        a = this.f30229b.length;
                    }
                    obj = new nlr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30229b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nlr();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nlr();
                    nyt.m37101a(obj[a]);
                    this.f30229b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f30230c == null) {
                        a = 0;
                    } else {
                        a = this.f30230c.length;
                    }
                    obj = new nge[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30230c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nge();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nge();
                    nyt.m37101a(obj[a]);
                    this.f30230c = obj;
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f30231d == null) {
                        a = 0;
                    } else {
                        a = this.f30231d.length;
                    }
                    obj = new niv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30231d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new niv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new niv();
                    nyt.m37101a(obj[a]);
                    this.f30231d = obj;
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f30232e == null) {
                        a = 0;
                    } else {
                        a = this.f30232e.length;
                    }
                    obj = new nme[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30232e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nme();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nme();
                    nyt.m37101a(obj[a]);
                    this.f30232e = obj;
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
