package defpackage;

public final class onp extends nyx<onp> {
    public Long a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public onp() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.c(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.longValue();
            b += nyu.h(1) + 8;
        }
        if (this.b != null) {
            return b + nyu.b(2, this.b);
        }
        return b;
    }

    private onp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.a = Long.valueOf(nyt.g());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
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
