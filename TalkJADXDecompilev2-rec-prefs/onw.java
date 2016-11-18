package p000;

public final class onw extends nyx<onw> {
    public ono f33336a;

    public /* synthetic */ nzf m38852a(nyt nyt) {
        return m38851b(nyt);
    }

    public onw() {
        this.cachedSize = -1;
    }

    public void m38853a(nyu nyu) {
        if (this.f33336a != null) {
            nyu.m37182b(1, this.f33336a);
        }
        super.a(nyu);
    }

    protected int m38854b() {
        int b = super.b();
        if (this.f33336a != null) {
            return b + nyu.m37145d(1, this.f33336a);
        }
        return b;
    }

    private onw m38851b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33336a == null) {
                        this.f33336a = new ono();
                    }
                    nyt.m37101a(this.f33336a);
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
