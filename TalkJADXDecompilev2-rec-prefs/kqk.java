package p000;

public final class kqk extends nyx<kqk> {
    public kqd f22770a;
    public Float f22771b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27059b(nyt);
    }

    public kqk() {
        m27060d();
    }

    private kqk m27060d() {
        this.f22770a = null;
        this.f22771b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22770a != null) {
            nyu.b(1, this.f22770a);
        }
        nyu.a(2, this.f22771b.floatValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22770a != null) {
            b += nyu.d(1, this.f22770a);
        }
        this.f22771b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private kqk m27059b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22770a == null) {
                        this.f22770a = new kqd();
                    }
                    nyt.a(this.f22770a);
                    continue;
                case 21:
                    this.f22771b = Float.valueOf(nyt.c());
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
