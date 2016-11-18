package p000;

public final class kml extends nyx<kml> {
    public String[] f22368a;
    public kmk f22369b;
    public kmf f22370c;
    public Boolean f22371d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26547b(nyt);
    }

    public kml() {
        m26548d();
    }

    private kml m26548d() {
        this.f22368a = nzl.f;
        this.f22369b = null;
        this.f22370c = null;
        this.f22371d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22368a != null && this.f22368a.length > 0) {
            for (String str : this.f22368a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.f22369b != null) {
            nyu.b(2, this.f22369b);
        }
        if (this.f22370c != null) {
            nyu.b(3, this.f22370c);
        }
        if (this.f22371d != null) {
            nyu.a(4, this.f22371d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22368a == null || this.f22368a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f22368a.length) {
                String str = this.f22368a[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f22369b != null) {
            i += nyu.d(2, this.f22369b);
        }
        if (this.f22370c != null) {
            i += nyu.d(3, this.f22370c);
        }
        if (this.f22371d == null) {
            return i;
        }
        this.f22371d.booleanValue();
        return i + (nyu.h(4) + 1);
    }

    private kml m26547b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    a = this.f22368a == null ? 0 : this.f22368a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22368a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22368a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f22369b == null) {
                        this.f22369b = new kmk();
                    }
                    nyt.a(this.f22369b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22370c == null) {
                        this.f22370c = new kmf();
                    }
                    nyt.a(this.f22370c);
                    continue;
                case 32:
                    this.f22371d = Boolean.valueOf(nyt.i());
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
