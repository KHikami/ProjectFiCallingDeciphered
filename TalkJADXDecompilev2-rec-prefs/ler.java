package p000;

public final class ler extends nyx<ler> {
    public Float f24859a;
    public Float f24860b;
    public Float f24861c;
    public Float f24862d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28915b(nyt);
    }

    public ler() {
        m28916d();
    }

    private ler m28916d() {
        this.f24859a = null;
        this.f24860b = null;
        this.f24861c = null;
        this.f24862d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24859a != null) {
            nyu.a(1, this.f24859a.floatValue());
        }
        if (this.f24860b != null) {
            nyu.a(2, this.f24860b.floatValue());
        }
        if (this.f24861c != null) {
            nyu.a(3, this.f24861c.floatValue());
        }
        if (this.f24862d != null) {
            nyu.a(4, this.f24862d.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24859a != null) {
            this.f24859a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f24860b != null) {
            this.f24860b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f24861c != null) {
            this.f24861c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f24862d == null) {
            return b;
        }
        this.f24862d.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private ler m28915b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f24859a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f24860b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f24861c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f24862d = Float.valueOf(nyt.c());
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
