package p000;

public final class oov extends nyx<oov> {
    public oot[] f33499a;

    public /* synthetic */ nzf m38970a(nyt nyt) {
        return m38968b(nyt);
    }

    public oov() {
        m38969d();
    }

    private oov m38969d() {
        this.f33499a = oot.m38958d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38971a(nyu nyu) {
        if (this.f33499a != null && this.f33499a.length > 0) {
            for (nzf nzf : this.f33499a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38972b() {
        int b = super.b();
        if (this.f33499a != null && this.f33499a.length > 0) {
            for (nzf nzf : this.f33499a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private oov m38968b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33499a == null) {
                        a = 0;
                    } else {
                        a = this.f33499a.length;
                    }
                    Object obj = new oot[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33499a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oot();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oot();
                    nyt.m37101a(obj[a]);
                    this.f33499a = obj;
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
