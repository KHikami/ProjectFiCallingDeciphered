package p000;

public final class oje extends nyx<oje> {
    public ojf[] f33075a;

    public /* synthetic */ nzf m38547a(nyt nyt) {
        return m38545b(nyt);
    }

    public oje() {
        m38546d();
    }

    private oje m38546d() {
        this.f33075a = ojf.m38551d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38548a(nyu nyu) {
        if (this.f33075a != null && this.f33075a.length > 0) {
            for (nzf nzf : this.f33075a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38549b() {
        int b = super.b();
        if (this.f33075a != null && this.f33075a.length > 0) {
            for (nzf nzf : this.f33075a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private oje m38545b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33075a == null) {
                        a = 0;
                    } else {
                        a = this.f33075a.length;
                    }
                    Object obj = new ojf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33075a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ojf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ojf();
                    nyt.m37101a(obj[a]);
                    this.f33075a = obj;
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
