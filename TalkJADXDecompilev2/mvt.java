package defpackage;

public final class mvt extends nyx<mvt> {
    public String a;
    public long b;
    public String[] c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvt() {
        d();
    }

    private mvt d() {
        this.a = "";
        this.b = 0;
        this.c = nzl.f;
        this.d = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (this.b != 0) {
            nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (!(this.d == null || this.d.equals(""))) {
            nyu.a(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (this.b != 0) {
            b += nyu.f(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.c.length) {
                String str = this.c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.d == null || this.d.equals("")) {
            return b;
        }
        return b + nyu.b(4, this.d);
    }

    private mvt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = nyt.e();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
                    continue;
                case 34:
                    this.d = nyt.j();
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
