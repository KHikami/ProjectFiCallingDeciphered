package p000;

public final class ogf extends nyx<ogf> {
    public Boolean f32704a;
    public Double f32705b;
    public ogg f32706c;
    public ogg f32707d;
    public ogg[] f32708e;

    public /* synthetic */ nzf m38172a(nyt nyt) {
        return m38170b(nyt);
    }

    public ogf() {
        m38171d();
    }

    private ogf m38171d() {
        this.f32704a = null;
        this.f32705b = null;
        this.f32706c = null;
        this.f32707d = null;
        this.f32708e = ogg.m38176d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38173a(nyu nyu) {
        if (this.f32704a != null) {
            nyu.m37172a(1, this.f32704a.booleanValue());
        }
        if (this.f32705b != null) {
            nyu.m37166a(2, this.f32705b.doubleValue());
        }
        if (this.f32706c != null) {
            nyu.m37182b(3, this.f32706c);
        }
        if (this.f32707d != null) {
            nyu.m37182b(4, this.f32707d);
        }
        if (this.f32708e != null && this.f32708e.length > 0) {
            for (nzf nzf : this.f32708e) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38174b() {
        int b = super.b();
        if (this.f32704a != null) {
            this.f32704a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f32705b != null) {
            this.f32705b.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f32706c != null) {
            b += nyu.m37145d(3, this.f32706c);
        }
        if (this.f32707d != null) {
            b += nyu.m37145d(4, this.f32707d);
        }
        if (this.f32708e == null || this.f32708e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f32708e) {
            if (nzf != null) {
                i += nyu.m37145d(5, nzf);
            }
        }
        return i;
    }

    private ogf m38170b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32704a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dK /*17*/:
                    this.f32705b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dx /*26*/:
                    if (this.f32706c == null) {
                        this.f32706c = new ogg();
                    }
                    nyt.m37101a(this.f32706c);
                    continue;
                case 34:
                    if (this.f32707d == null) {
                        this.f32707d = new ogg();
                    }
                    nyt.m37101a(this.f32707d);
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f32708e == null) {
                        a = 0;
                    } else {
                        a = this.f32708e.length;
                    }
                    Object obj = new ogg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32708e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ogg();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ogg();
                    nyt.m37101a(obj[a]);
                    this.f32708e = obj;
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
