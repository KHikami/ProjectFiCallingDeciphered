package p000;

public final class nia extends nyx<nia> {
    public njs f29868a;
    public Boolean f29869b;

    public /* synthetic */ nzf m35049a(nyt nyt) {
        return m35047b(nyt);
    }

    public nia() {
        m35048d();
    }

    private nia m35048d() {
        this.f29868a = null;
        this.f29869b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35050a(nyu nyu) {
        if (this.f29868a != null) {
            nyu.m37182b(1, this.f29868a);
        }
        if (this.f29869b != null) {
            nyu.m37172a(2, this.f29869b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35051b() {
        int b = super.b();
        if (this.f29868a != null) {
            b += nyu.m37145d(1, this.f29868a);
        }
        if (this.f29869b == null) {
            return b;
        }
        this.f29869b.booleanValue();
        return b + (nyu.m37154h(2) + 1);
    }

    private nia m35047b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29868a == null) {
                        this.f29868a = new njs();
                    }
                    nyt.m37101a(this.f29868a);
                    continue;
                case 16:
                    this.f29869b = Boolean.valueOf(nyt.m37116i());
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
