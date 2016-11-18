package p000;

public final class ocr extends nyx<ocr> {
    public Boolean f32286a;
    public Boolean f32287b;
    public Boolean f32288c;

    public /* synthetic */ nzf m37779a(nyt nyt) {
        return m37778b(nyt);
    }

    public ocr() {
        this.f32286a = null;
        this.f32287b = null;
        this.f32288c = null;
        this.cachedSize = -1;
    }

    public void m37780a(nyu nyu) {
        if (this.f32286a != null) {
            nyu.m37172a(1, this.f32286a.booleanValue());
        }
        if (this.f32287b != null) {
            nyu.m37172a(2, this.f32287b.booleanValue());
        }
        if (this.f32288c != null) {
            nyu.m37172a(3, this.f32288c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37781b() {
        int b = super.b();
        if (this.f32286a != null) {
            this.f32286a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f32287b != null) {
            this.f32287b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f32288c == null) {
            return b;
        }
        this.f32288c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private ocr m37778b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32286a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f32287b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f32288c = Boolean.valueOf(nyt.m37116i());
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
