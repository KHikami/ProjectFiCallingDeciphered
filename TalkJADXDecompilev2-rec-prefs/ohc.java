package p000;

public final class ohc extends nyx<ohc> {
    public String f32817a;
    public String f32818b;
    public String f32819c;
    public ohm[] f32820d;
    public ohm[] f32821e;
    public String f32822f;
    public ohd[] f32823g;

    public /* synthetic */ nzf m38318a(nyt nyt) {
        return m38317b(nyt);
    }

    public ohc() {
        this.f32817a = null;
        this.f32818b = null;
        this.f32819c = null;
        this.f32820d = ohm.m38362d();
        this.f32821e = ohm.m38362d();
        this.f32822f = null;
        this.f32823g = ohd.m38322d();
        this.cachedSize = -1;
    }

    public void m38319a(nyu nyu) {
        int i = 0;
        nyu.m37170a(1, this.f32817a);
        nyu.m37170a(2, this.f32818b);
        if (this.f32820d != null && this.f32820d.length > 0) {
            for (nzf nzf : this.f32820d) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f32823g != null && this.f32823g.length > 0) {
            for (nzf nzf2 : this.f32823g) {
                if (nzf2 != null) {
                    nyu.m37182b(4, nzf2);
                }
            }
        }
        if (this.f32819c != null) {
            nyu.m37170a(5, this.f32819c);
        }
        if (this.f32821e != null && this.f32821e.length > 0) {
            while (i < this.f32821e.length) {
                nzf nzf3 = this.f32821e[i];
                if (nzf3 != null) {
                    nyu.m37182b(7, nzf3);
                }
                i++;
            }
        }
        if (this.f32822f != null) {
            nyu.m37170a(8, this.f32822f);
        }
        super.a(nyu);
    }

    protected int m38320b() {
        int i;
        int i2 = 0;
        int b = (super.b() + nyu.m37137b(1, this.f32817a)) + nyu.m37137b(2, this.f32818b);
        if (this.f32820d != null && this.f32820d.length > 0) {
            i = b;
            for (nzf nzf : this.f32820d) {
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f32823g != null && this.f32823g.length > 0) {
            i = b;
            for (nzf nzf2 : this.f32823g) {
                if (nzf2 != null) {
                    i += nyu.m37145d(4, nzf2);
                }
            }
            b = i;
        }
        if (this.f32819c != null) {
            b += nyu.m37137b(5, this.f32819c);
        }
        if (this.f32821e != null && this.f32821e.length > 0) {
            while (i2 < this.f32821e.length) {
                nzf nzf3 = this.f32821e[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(7, nzf3);
                }
                i2++;
            }
        }
        if (this.f32822f != null) {
            return b + nyu.m37137b(8, this.f32822f);
        }
        return b;
    }

    private ohc m38317b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32817a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32818b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f32820d == null) {
                        a = 0;
                    } else {
                        a = this.f32820d.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32820d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.m37101a(obj[a]);
                    this.f32820d = obj;
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f32823g == null) {
                        a = 0;
                    } else {
                        a = this.f32823g.length;
                    }
                    obj = new ohd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32823g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohd();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohd();
                    nyt.m37101a(obj[a]);
                    this.f32823g = obj;
                    continue;
                case 42:
                    this.f32819c = nyt.m37117j();
                    continue;
                case 58:
                    b = nzl.m37265b(nyt, 58);
                    if (this.f32821e == null) {
                        a = 0;
                    } else {
                        a = this.f32821e.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32821e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.m37101a(obj[a]);
                    this.f32821e = obj;
                    continue;
                case 66:
                    this.f32822f = nyt.m37117j();
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
