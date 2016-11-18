package p000;

public final class nfc extends nyx<nfc> {
    public Boolean f29655a;

    public /* synthetic */ nzf m34648a(nyt nyt) {
        return m34646b(nyt);
    }

    public nfc() {
        m34647d();
    }

    private nfc m34647d() {
        this.f29655a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34649a(nyu nyu) {
        if (this.f29655a != null) {
            nyu.m37172a(1, this.f29655a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34650b() {
        int b = super.b();
        if (this.f29655a == null) {
            return b;
        }
        this.f29655a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nfc m34646b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29655a = Boolean.valueOf(nyt.m37116i());
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
