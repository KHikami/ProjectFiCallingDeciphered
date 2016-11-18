package p000;

public final class npx extends nyx<npx> {
    public npu[] f30465a;

    public /* synthetic */ nzf m36097a(nyt nyt) {
        return m36095b(nyt);
    }

    public npx() {
        m36096d();
    }

    private npx m36096d() {
        this.f30465a = npu.m36080d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36098a(nyu nyu) {
        if (this.f30465a != null && this.f30465a.length > 0) {
            for (nzf nzf : this.f30465a) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m36099b() {
        int b = super.b();
        if (this.f30465a != null && this.f30465a.length > 0) {
            for (nzf nzf : this.f30465a) {
                if (nzf != null) {
                    b += nyu.m37145d(2, nzf);
                }
            }
        }
        return b;
    }

    private npx m36095b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f30465a == null) {
                        a = 0;
                    } else {
                        a = this.f30465a.length;
                    }
                    Object obj = new npu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30465a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new npu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new npu();
                    nyt.m37101a(obj[a]);
                    this.f30465a = obj;
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
