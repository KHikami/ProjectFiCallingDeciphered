package p000;

public final class koa extends nyx<koa> {
    public Float f22467a;
    public Float f22468b;
    public Float f22469c;
    public Float f22470d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26753b(nyt);
    }

    public koa() {
        m26754d();
    }

    private koa m26754d() {
        this.f22467a = null;
        this.f22468b = null;
        this.f22469c = null;
        this.f22470d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22467a != null) {
            nyu.a(1, this.f22467a.floatValue());
        }
        if (this.f22468b != null) {
            nyu.a(2, this.f22468b.floatValue());
        }
        if (this.f22469c != null) {
            nyu.a(3, this.f22469c.floatValue());
        }
        if (this.f22470d != null) {
            nyu.a(4, this.f22470d.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22467a != null) {
            this.f22467a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f22468b != null) {
            this.f22468b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f22469c != null) {
            this.f22469c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f22470d == null) {
            return b;
        }
        this.f22470d.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private koa m26753b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f22467a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f22468b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f22469c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f22470d = Float.valueOf(nyt.c());
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
