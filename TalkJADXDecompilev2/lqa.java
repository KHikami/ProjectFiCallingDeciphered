package defpackage;

public final class lqa extends nyx<lqa> {
    public Long a;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lqa() {
        d();
    }

    private lqa d() {
        this.responseHeader = null;
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null) {
            return b + nyu.e(2, this.a.longValue());
        }
        return b;
    }

    private lqa b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case 16:
                    this.a = Long.valueOf(nyt.d());
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
