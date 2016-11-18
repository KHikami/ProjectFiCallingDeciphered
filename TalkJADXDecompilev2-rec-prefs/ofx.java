package p000;

public final class ofx extends nyx<ofx> {
    public ofq[] f32688a;

    public /* synthetic */ nzf m38131a(nyt nyt) {
        return m38130b(nyt);
    }

    public ofx() {
        this.f32688a = ofq.m38095d();
        this.cachedSize = -1;
    }

    public void m38132a(nyu nyu) {
        if (this.f32688a != null && this.f32688a.length > 0) {
            for (nzf nzf : this.f32688a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38133b() {
        int b = super.b();
        if (this.f32688a != null && this.f32688a.length > 0) {
            for (nzf nzf : this.f32688a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private ofx m38130b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f32688a == null) {
                        a = 0;
                    } else {
                        a = this.f32688a.length;
                    }
                    Object obj = new ofq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32688a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ofq();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ofq();
                    nyt.m37101a(obj[a]);
                    this.f32688a = obj;
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
