package p000;

public final class odc extends nyx<odc> {
    public odd[] f32359a;

    public /* synthetic */ nzf m37826a(nyt nyt) {
        return m37825b(nyt);
    }

    public odc() {
        this.f32359a = odd.m37830d();
        this.cachedSize = -1;
    }

    public void m37827a(nyu nyu) {
        if (this.f32359a != null && this.f32359a.length > 0) {
            for (nzf nzf : this.f32359a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m37828b() {
        int b = super.b();
        if (this.f32359a != null && this.f32359a.length > 0) {
            for (nzf nzf : this.f32359a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private odc m37825b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f32359a == null) {
                        a = 0;
                    } else {
                        a = this.f32359a.length;
                    }
                    Object obj = new odd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32359a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odd();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new odd();
                    nyt.m37101a(obj[a]);
                    this.f32359a = obj;
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
