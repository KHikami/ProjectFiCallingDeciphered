package defpackage;

public final class oqq extends nyx<oqq> {
    public String[] a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqq() {
        d();
    }

    private oqq d() {
        this.a = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.a.length) {
            String str = this.a[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private oqq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    a = this.a == null ? 0 : this.a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.a = obj;
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
