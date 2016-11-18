package p000;

public final class onj extends nyx<onj> {
    public oni f33309a;

    public /* synthetic */ nzf m38803a(nyt nyt) {
        return m38802b(nyt);
    }

    public onj() {
        this.cachedSize = -1;
    }

    public void m38804a(nyu nyu) {
        if (this.f33309a != null) {
            nyu.m37182b(1, this.f33309a);
        }
        super.a(nyu);
    }

    protected int m38805b() {
        int b = super.b();
        if (this.f33309a != null) {
            return b + nyu.m37145d(1, this.f33309a);
        }
        return b;
    }

    private onj m38802b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33309a == null) {
                        this.f33309a = new oni();
                    }
                    nyt.m37101a(this.f33309a);
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
