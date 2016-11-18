package p000;

public final class ocw extends nyx<ocw> {
    public ocx[] f32334a;

    public /* synthetic */ nzf m37800a(nyt nyt) {
        return m37799b(nyt);
    }

    public ocw() {
        this.f32334a = ocx.m37804d();
        this.cachedSize = -1;
    }

    public void m37801a(nyu nyu) {
        if (this.f32334a != null && this.f32334a.length > 0) {
            for (nzf nzf : this.f32334a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m37802b() {
        int b = super.b();
        if (this.f32334a != null && this.f32334a.length > 0) {
            for (nzf nzf : this.f32334a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private ocw m37799b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f32334a == null) {
                        a = 0;
                    } else {
                        a = this.f32334a.length;
                    }
                    Object obj = new ocx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32334a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ocx();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ocx();
                    nyt.m37101a(obj[a]);
                    this.f32334a = obj;
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
