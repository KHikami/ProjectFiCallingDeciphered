package p000;

public final class nix extends nyx<nix> {
    public String f29938a;
    public String f29939b;
    public Integer f29940c;
    public String[] f29941d;

    public /* synthetic */ nzf m35168a(nyt nyt) {
        return m35166b(nyt);
    }

    public nix() {
        m35167d();
    }

    private nix m35167d() {
        this.f29938a = null;
        this.f29939b = null;
        this.f29940c = null;
        this.f29941d = nzl.f31332f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35169a(nyu nyu) {
        if (this.f29938a != null) {
            nyu.m37170a(1, this.f29938a);
        }
        if (this.f29939b != null) {
            nyu.m37170a(2, this.f29939b);
        }
        if (this.f29940c != null) {
            nyu.m37168a(3, this.f29940c.intValue());
        }
        if (this.f29941d != null && this.f29941d.length > 0) {
            for (String str : this.f29941d) {
                if (str != null) {
                    nyu.m37170a(4, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35170b() {
        int i = 0;
        int b = super.b();
        if (this.f29938a != null) {
            b += nyu.m37137b(1, this.f29938a);
        }
        if (this.f29939b != null) {
            b += nyu.m37137b(2, this.f29939b);
        }
        if (this.f29940c != null) {
            b += nyu.m37147f(3, this.f29940c.intValue());
        }
        if (this.f29941d == null || this.f29941d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f29941d.length) {
            String str = this.f29941d[i];
            if (str != null) {
                i3++;
                i2 += nyu.m37140b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private nix m35166b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29938a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f29939b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f29940c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    int b = nzl.m37265b(nyt, 34);
                    a = this.f29941d == null ? 0 : this.f29941d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29941d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f29941d = obj;
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
