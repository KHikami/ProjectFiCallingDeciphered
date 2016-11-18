package p000;

public final class ncq extends nyx<ncq> {
    public nch[] f29519a;

    public /* synthetic */ nzf m34339a(nyt nyt) {
        return m34338b(nyt);
    }

    public ncq() {
        this.f29519a = nch.m34301d();
        this.cachedSize = -1;
    }

    public void m34340a(nyu nyu) {
        if (this.f29519a != null && this.f29519a.length > 0) {
            for (nzf nzf : this.f29519a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34341b() {
        int b = super.b();
        if (this.f29519a != null && this.f29519a.length > 0) {
            for (nzf nzf : this.f29519a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private ncq m34338b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29519a == null) {
                        a = 0;
                    } else {
                        a = this.f29519a.length;
                    }
                    Object obj = new nch[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29519a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nch();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nch();
                    nyt.m37101a(obj[a]);
                    this.f29519a = obj;
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
