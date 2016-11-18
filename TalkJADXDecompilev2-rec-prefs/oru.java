package p000;

public final class oru extends nyx<oru> {
    public ort[] f34077a;

    public /* synthetic */ nzf m39489a(nyt nyt) {
        return m39487b(nyt);
    }

    public oru() {
        m39488d();
    }

    private oru m39488d() {
        this.f34077a = ort.m39482d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39490a(nyu nyu) {
        if (this.f34077a != null && this.f34077a.length > 0) {
            for (nzf nzf : this.f34077a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39491b() {
        int b = super.b();
        if (this.f34077a != null && this.f34077a.length > 0) {
            for (nzf nzf : this.f34077a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private oru m39487b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f34077a == null) {
                        a = 0;
                    } else {
                        a = this.f34077a.length;
                    }
                    Object obj = new ort[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34077a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ort();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ort();
                    nyt.m37101a(obj[a]);
                    this.f34077a = obj;
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
