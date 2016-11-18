package defpackage;

public final class osh extends nyx<osh> {
    public osg[] a;
    public osg[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public osh() {
        d();
    }

    private osh d() {
        this.a = osg.d();
        this.b = osg.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf2 = this.b[i];
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i2 += nyu.d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf2 = this.b[i];
                if (nzf2 != null) {
                    b += nyu.d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private osh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new osg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osg();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new osg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osg();
                    nyt.a(obj[a]);
                    this.b = obj;
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
