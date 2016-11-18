package p000;

public final class krm extends nyx<krm> {
    public Float f22911a;
    public Float f22912b;
    public Float f22913c;
    public Float f22914d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27208b(nyt);
    }

    public krm() {
        this.f22911a = null;
        this.f22912b = null;
        this.f22913c = null;
        this.f22914d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22911a != null) {
            nyu.a(1, this.f22911a.floatValue());
        }
        if (this.f22912b != null) {
            nyu.a(2, this.f22912b.floatValue());
        }
        if (this.f22913c != null) {
            nyu.a(3, this.f22913c.floatValue());
        }
        if (this.f22914d != null) {
            nyu.a(4, this.f22914d.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22911a != null) {
            this.f22911a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f22912b != null) {
            this.f22912b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f22913c != null) {
            this.f22913c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f22914d == null) {
            return b;
        }
        this.f22914d.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private krm m27208b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f22911a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f22912b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f22913c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f22914d = Float.valueOf(nyt.c());
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
