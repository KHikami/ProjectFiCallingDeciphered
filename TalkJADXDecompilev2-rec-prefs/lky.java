package p000;

public final class lky extends nyx<lky> {
    private static volatile lky[] f25289c;
    public String f25290a;
    public String f25291b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29293b(nyt);
    }

    public static lky[] m29294d() {
        if (f25289c == null) {
            synchronized (nzc.c) {
                if (f25289c == null) {
                    f25289c = new lky[0];
                }
            }
        }
        return f25289c;
    }

    public lky() {
        m29295g();
    }

    private lky m29295g() {
        this.f25290a = null;
        this.f25291b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(6, this.f25290a);
        if (this.f25291b != null) {
            nyu.a(7, this.f25291b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(6, this.f25290a);
        if (this.f25291b != null) {
            return b + nyu.b(7, this.f25291b);
        }
        return b;
    }

    private lky m29293b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 50:
                    this.f25290a = nyt.j();
                    continue;
                case 58:
                    this.f25291b = nyt.j();
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
