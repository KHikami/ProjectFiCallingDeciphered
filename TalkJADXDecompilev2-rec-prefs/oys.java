package p000;

public final class oys extends nyx<oys> {
    public Float f34670a;
    public Float f34671b;
    public Float f34672c;
    public Float f34673d;

    public /* synthetic */ nzf m39958a(nyt nyt) {
        return m39956b(nyt);
    }

    public oys() {
        m39957d();
    }

    private oys m39957d() {
        this.f34670a = null;
        this.f34671b = null;
        this.f34672c = null;
        this.f34673d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39959a(nyu nyu) {
        if (this.f34670a != null) {
            nyu.m37167a(1, this.f34670a.floatValue());
        }
        if (this.f34671b != null) {
            nyu.m37167a(2, this.f34671b.floatValue());
        }
        if (this.f34672c != null) {
            nyu.m37167a(3, this.f34672c.floatValue());
        }
        if (this.f34673d != null) {
            nyu.m37167a(4, this.f34673d.floatValue());
        }
        super.a(nyu);
    }

    protected int m39960b() {
        int b = super.b();
        if (this.f34670a != null) {
            this.f34670a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f34671b != null) {
            this.f34671b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f34672c != null) {
            this.f34672c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f34673d == null) {
            return b;
        }
        this.f34673d.floatValue();
        return b + (nyu.m37154h(4) + 4);
    }

    private oys m39956b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f34670a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f34671b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f34672c = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f34673d = Float.valueOf(nyt.m37106c());
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
