package p000;

public final class oht extends nyx<oht> {
    public ohr[] f32936a;

    public /* synthetic */ nzf m38398a(nyt nyt) {
        return m38396b(nyt);
    }

    public oht() {
        m38397d();
    }

    private oht m38397d() {
        this.f32936a = ohr.m38386d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38399a(nyu nyu) {
        if (this.f32936a != null && this.f32936a.length > 0) {
            for (nzf nzf : this.f32936a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38400b() {
        int b = super.b();
        if (this.f32936a != null && this.f32936a.length > 0) {
            for (nzf nzf : this.f32936a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private oht m38396b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f32936a == null) {
                        a = 0;
                    } else {
                        a = this.f32936a.length;
                    }
                    Object obj = new ohr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32936a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohr();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohr();
                    nyt.m37101a(obj[a]);
                    this.f32936a = obj;
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
