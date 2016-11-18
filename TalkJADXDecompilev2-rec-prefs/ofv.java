package p000;

public final class ofv extends nyx<ofv> {
    public ofu[] f32684a;

    public /* synthetic */ nzf m38122a(nyt nyt) {
        return m38120b(nyt);
    }

    public ofv() {
        m38121d();
    }

    private ofv m38121d() {
        this.f32684a = ofu.m38115d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38123a(nyu nyu) {
        if (this.f32684a != null && this.f32684a.length > 0) {
            for (nzf nzf : this.f32684a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38124b() {
        int b = super.b();
        if (this.f32684a != null && this.f32684a.length > 0) {
            for (nzf nzf : this.f32684a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private ofv m38120b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f32684a == null) {
                        a = 0;
                    } else {
                        a = this.f32684a.length;
                    }
                    Object obj = new ofu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32684a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ofu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ofu();
                    nyt.m37101a(obj[a]);
                    this.f32684a = obj;
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
