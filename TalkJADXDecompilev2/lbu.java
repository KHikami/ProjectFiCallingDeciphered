package defpackage;

public final class lbu extends nyx<lbu> {
    public Boolean a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbu() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.booleanValue());
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private lbu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
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
