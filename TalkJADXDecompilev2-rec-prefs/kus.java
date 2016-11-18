package p000;

public final class kus extends nyx<kus> {
    public String f23495a;
    public oyl f23496b;
    public Boolean f23497c;
    public mzy f23498d;
    public String[] f23499e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27610b(nyt);
    }

    public kus() {
        m27611d();
    }

    private kus m27611d() {
        this.f23495a = null;
        this.f23496b = null;
        this.f23497c = null;
        this.f23498d = null;
        this.f23499e = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23496b != null) {
            nyu.b(1, this.f23496b);
        }
        if (this.f23497c != null) {
            nyu.a(2, this.f23497c.booleanValue());
        }
        if (this.f23498d != null) {
            nyu.b(3, this.f23498d);
        }
        if (this.f23495a != null) {
            nyu.a(4, this.f23495a);
        }
        if (this.f23499e != null && this.f23499e.length > 0) {
            for (String str : this.f23499e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23496b != null) {
            b += nyu.d(1, this.f23496b);
        }
        if (this.f23497c != null) {
            this.f23497c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f23498d != null) {
            b += nyu.d(3, this.f23498d);
        }
        if (this.f23495a != null) {
            b += nyu.b(4, this.f23495a);
        }
        if (this.f23499e == null || this.f23499e.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f23499e.length) {
            String str = this.f23499e[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private kus m27610b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23496b == null) {
                        this.f23496b = new oyl();
                    }
                    nyt.a(this.f23496b);
                    continue;
                case 16:
                    this.f23497c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f23498d == null) {
                        this.f23498d = new mzy();
                    }
                    nyt.a(this.f23498d);
                    continue;
                case 34:
                    this.f23495a = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f23499e == null ? 0 : this.f23499e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23499e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23499e = obj;
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
