package p000;

public final class ooq extends nyx<ooq> {
    public oop[] f33473a;

    public /* synthetic */ nzf m38944a(nyt nyt) {
        return m38942b(nyt);
    }

    public ooq() {
        m38943d();
    }

    private ooq m38943d() {
        this.f33473a = oop.m38937d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38945a(nyu nyu) {
        if (this.f33473a != null && this.f33473a.length > 0) {
            for (nzf nzf : this.f33473a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38946b() {
        int b = super.b();
        if (this.f33473a != null && this.f33473a.length > 0) {
            for (nzf nzf : this.f33473a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private ooq m38942b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33473a == null) {
                        a = 0;
                    } else {
                        a = this.f33473a.length;
                    }
                    Object obj = new oop[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33473a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oop();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oop();
                    nyt.m37101a(obj[a]);
                    this.f33473a = obj;
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
