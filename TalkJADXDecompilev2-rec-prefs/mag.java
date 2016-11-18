package p000;

public final class mag extends nyx<mag> {
    private static volatile mag[] f27099e;
    public Float f27100a;
    public Float f27101b;
    public Float f27102c;
    public Float f27103d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31413b(nyt);
    }

    public static mag[] m31414d() {
        if (f27099e == null) {
            synchronized (nzc.c) {
                if (f27099e == null) {
                    f27099e = new mag[0];
                }
            }
        }
        return f27099e;
    }

    public mag() {
        m31415g();
    }

    private mag m31415g() {
        this.f27100a = null;
        this.f27101b = null;
        this.f27102c = null;
        this.f27103d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f27100a.floatValue());
        nyu.a(2, this.f27101b.floatValue());
        nyu.a(3, this.f27102c.floatValue());
        nyu.a(4, this.f27103d.floatValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f27100a.floatValue();
        b += nyu.h(1) + 4;
        this.f27101b.floatValue();
        b += nyu.h(2) + 4;
        this.f27102c.floatValue();
        b += nyu.h(3) + 4;
        this.f27103d.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private mag m31413b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f27100a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f27101b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f27102c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f27103d = Float.valueOf(nyt.c());
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
