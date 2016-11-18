package defpackage;

public final class mug extends nyx<mug> {
    public muh a;
    private int b;
    private boolean c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mug() {
        d();
    }

    private mug d() {
        this.b = 0;
        this.a = null;
        this.c = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if ((this.b & 1) != 0) {
            nyu.a(2, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if ((this.b & 1) == 0) {
            return b;
        }
        boolean z = this.c;
        return b + (nyu.h(2) + 1);
    }

    private mug b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new muh();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.c = nyt.i();
                    this.b |= 1;
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
