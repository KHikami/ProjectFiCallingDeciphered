package p000;

public final class ohk extends nyx<ohk> {
    public ohl[] f32884a;
    public Boolean f32885b;

    public /* synthetic */ nzf m38353a(nyt nyt) {
        return m38352b(nyt);
    }

    public ohk() {
        this.f32884a = ohl.m38357d();
        this.f32885b = null;
        this.cachedSize = -1;
    }

    public void m38354a(nyu nyu) {
        if (this.f32884a != null && this.f32884a.length > 0) {
            for (nzf nzf : this.f32884a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f32885b != null) {
            nyu.m37172a(2, this.f32885b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m38355b() {
        int b = super.b();
        if (this.f32884a != null && this.f32884a.length > 0) {
            for (nzf nzf : this.f32884a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f32885b == null) {
            return b;
        }
        this.f32885b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private ohk m38352b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f32884a == null) {
                        a = 0;
                    } else {
                        a = this.f32884a.length;
                    }
                    Object obj = new ohl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32884a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohl();
                    nyt.m37101a(obj[a]);
                    this.f32884a = obj;
                    continue;
                case 16:
                    this.f32885b = Boolean.valueOf(nyt.m37116i());
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
