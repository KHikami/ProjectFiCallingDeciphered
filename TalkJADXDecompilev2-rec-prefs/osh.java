package p000;

public final class osh extends nyx<osh> {
    public osg[] f34132a;
    public osg[] f34133b;

    public /* synthetic */ nzf m39559a(nyt nyt) {
        return m39557b(nyt);
    }

    public osh() {
        m39558d();
    }

    private osh m39558d() {
        this.f34132a = osg.m39552d();
        this.f34133b = osg.m39552d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39560a(nyu nyu) {
        int i = 0;
        if (this.f34132a != null && this.f34132a.length > 0) {
            for (nzf nzf : this.f34132a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f34133b != null && this.f34133b.length > 0) {
            while (i < this.f34133b.length) {
                nzf nzf2 = this.f34133b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m39561b() {
        int i = 0;
        int b = super.b();
        if (this.f34132a != null && this.f34132a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f34132a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f34133b != null && this.f34133b.length > 0) {
            while (i < this.f34133b.length) {
                nzf nzf2 = this.f34133b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private osh m39557b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f34132a == null) {
                        a = 0;
                    } else {
                        a = this.f34132a.length;
                    }
                    obj = new osg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34132a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osg();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osg();
                    nyt.m37101a(obj[a]);
                    this.f34132a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f34133b == null) {
                        a = 0;
                    } else {
                        a = this.f34133b.length;
                    }
                    obj = new osg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34133b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osg();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new osg();
                    nyt.m37101a(obj[a]);
                    this.f34133b = obj;
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
