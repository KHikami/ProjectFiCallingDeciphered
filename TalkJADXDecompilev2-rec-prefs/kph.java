package p000;

public final class kph extends nyx<kph> {
    public kqd f22643a;
    public Boolean f22644b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26904b(nyt);
    }

    public kph() {
        m26905d();
    }

    private kph m26905d() {
        this.f22643a = null;
        this.f22644b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22643a != null) {
            nyu.b(1, this.f22643a);
        }
        if (this.f22644b != null) {
            nyu.a(2, this.f22644b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22643a != null) {
            b += nyu.d(1, this.f22643a);
        }
        if (this.f22644b == null) {
            return b;
        }
        this.f22644b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private kph m26904b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22643a == null) {
                        this.f22643a = new kqd();
                    }
                    nyt.a(this.f22643a);
                    continue;
                case 16:
                    this.f22644b = Boolean.valueOf(nyt.i());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
