package defpackage;

public final class luf extends nyx<luf> {
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luf() {
        d();
    }

    private luf d() {
        this.responseHeader = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            return b + nyu.d(1, this.responseHeader);
        }
        return b;
    }

    private luf b(nyt nyt) {
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
