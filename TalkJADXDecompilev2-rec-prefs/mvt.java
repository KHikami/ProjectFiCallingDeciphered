package p000;

public final class mvt extends nyx<mvt> {
    public String f28517a;
    public long f28518b;
    public String[] f28519c;
    public String f28520d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33130b(nyt);
    }

    public mvt() {
        m33131d();
    }

    private mvt m33131d() {
        this.f28517a = "";
        this.f28518b = 0;
        this.f28519c = nzl.f;
        this.f28520d = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28517a == null || this.f28517a.equals(""))) {
            nyu.a(1, this.f28517a);
        }
        if (this.f28518b != 0) {
            nyu.b(2, this.f28518b);
        }
        if (this.f28519c != null && this.f28519c.length > 0) {
            for (String str : this.f28519c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (!(this.f28520d == null || this.f28520d.equals(""))) {
            nyu.a(4, this.f28520d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (!(this.f28517a == null || this.f28517a.equals(""))) {
            b += nyu.b(1, this.f28517a);
        }
        if (this.f28518b != 0) {
            b += nyu.f(2, this.f28518b);
        }
        if (this.f28519c != null && this.f28519c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f28519c.length) {
                String str = this.f28519c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f28520d == null || this.f28520d.equals("")) {
            return b;
        }
        return b + nyu.b(4, this.f28520d);
    }

    private mvt m33130b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28517a = nyt.j();
                    continue;
                case 16:
                    this.f28518b = nyt.e();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.f28519c == null ? 0 : this.f28519c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28519c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f28519c = obj;
                    continue;
                case 34:
                    this.f28520d = nyt.j();
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
