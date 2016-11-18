package p000;

public final class oor extends nyx<oor> {
    public String f33474a;
    public String f33475b;
    public String[] f33476c;
    public Boolean f33477d;

    public /* synthetic */ nzf m38949a(nyt nyt) {
        return m38947b(nyt);
    }

    public oor() {
        m38948d();
    }

    private oor m38948d() {
        this.f33474a = null;
        this.f33475b = null;
        this.f33476c = nzl.f31332f;
        this.f33477d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38950a(nyu nyu) {
        if (this.f33474a != null) {
            nyu.m37170a(1, this.f33474a);
        }
        if (this.f33476c != null && this.f33476c.length > 0) {
            for (String str : this.f33476c) {
                if (str != null) {
                    nyu.m37170a(2, str);
                }
            }
        }
        if (this.f33475b != null) {
            nyu.m37170a(3, this.f33475b);
        }
        if (this.f33477d != null) {
            nyu.m37172a(4, this.f33477d.booleanValue());
        }
        super.a(nyu);
    }

    protected int m38951b() {
        int i = 0;
        int b = super.b();
        if (this.f33474a != null) {
            b += nyu.m37137b(1, this.f33474a);
        }
        if (this.f33476c != null && this.f33476c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f33476c.length) {
                String str = this.f33476c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f33475b != null) {
            b += nyu.m37137b(3, this.f33475b);
        }
        if (this.f33477d == null) {
            return b;
        }
        this.f33477d.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private oor m38947b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33474a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    a = this.f33476c == null ? 0 : this.f33476c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33476c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f33476c = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f33475b = nyt.m37117j();
                    continue;
                case 32:
                    this.f33477d = Boolean.valueOf(nyt.m37116i());
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
