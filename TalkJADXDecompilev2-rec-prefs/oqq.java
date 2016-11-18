package p000;

public final class oqq extends nyx<oqq> {
    public String[] f33783a;

    public /* synthetic */ nzf m39221a(nyt nyt) {
        return m39219b(nyt);
    }

    public oqq() {
        m39220d();
    }

    private oqq m39220d() {
        this.f33783a = nzl.f31332f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39222a(nyu nyu) {
        if (this.f33783a != null && this.f33783a.length > 0) {
            for (String str : this.f33783a) {
                if (str != null) {
                    nyu.m37170a(1, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int m39223b() {
        int i = 0;
        int b = super.b();
        if (this.f33783a == null || this.f33783a.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f33783a.length) {
            String str = this.f33783a[i];
            if (str != null) {
                i3++;
                i2 += nyu.m37140b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private oqq m39219b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    a = this.f33783a == null ? 0 : this.f33783a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33783a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f33783a = obj;
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
