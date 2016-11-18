package p000;

public final class koz extends nyx<koz> {
    public kqd f22598a;
    public Boolean f22599b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26861b(nyt);
    }

    public koz() {
        m26862d();
    }

    private koz m26862d() {
        this.f22598a = null;
        this.f22599b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22598a != null) {
            nyu.b(1, this.f22598a);
        }
        if (this.f22599b != null) {
            nyu.a(2, this.f22599b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22598a != null) {
            b += nyu.d(1, this.f22598a);
        }
        if (this.f22599b == null) {
            return b;
        }
        this.f22599b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private koz m26861b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22598a == null) {
                        this.f22598a = new kqd();
                    }
                    nyt.a(this.f22598a);
                    continue;
                case 16:
                    this.f22599b = Boolean.valueOf(nyt.i());
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
