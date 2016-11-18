package p000;

public final class ner extends nyx<ner> {
    public Boolean f29634a;

    public /* synthetic */ nzf m34593a(nyt nyt) {
        return m34591b(nyt);
    }

    public ner() {
        m34592d();
    }

    private ner m34592d() {
        this.f29634a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34594a(nyu nyu) {
        if (this.f29634a != null) {
            nyu.m37172a(1, this.f29634a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34595b() {
        int b = super.b();
        if (this.f29634a == null) {
            return b;
        }
        this.f29634a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ner m34591b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29634a = Boolean.valueOf(nyt.m37116i());
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
