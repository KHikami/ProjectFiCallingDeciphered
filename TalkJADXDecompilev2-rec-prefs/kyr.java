package p000;

public final class kyr extends nyx<kyr> {
    public kzf[] f24103a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28113b(nyt);
    }

    public kyr() {
        m28114d();
    }

    private kyr m28114d() {
        this.f24103a = kzf.m28212d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24103a != null && this.f24103a.length > 0) {
            for (nzf nzf : this.f24103a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24103a != null && this.f24103a.length > 0) {
            for (nzf nzf : this.f24103a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private kyr m28113b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24103a == null) {
                        a = 0;
                    } else {
                        a = this.f24103a.length;
                    }
                    Object obj = new kzf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24103a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kzf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kzf();
                    nyt.a(obj[a]);
                    this.f24103a = obj;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
