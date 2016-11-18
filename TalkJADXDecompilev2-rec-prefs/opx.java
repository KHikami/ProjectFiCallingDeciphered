package p000;

public final class opx extends nyx<opx> {
    public String[] f33611a;
    public Boolean f33612b;

    public /* synthetic */ nzf m39118a(nyt nyt) {
        return m39116b(nyt);
    }

    public opx() {
        m39117d();
    }

    private opx m39117d() {
        this.f33611a = nzl.f31332f;
        this.f33612b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39119a(nyu nyu) {
        if (this.f33611a != null && this.f33611a.length > 0) {
            for (String str : this.f33611a) {
                if (str != null) {
                    nyu.m37170a(1, str);
                }
            }
        }
        if (this.f33612b != null) {
            nyu.m37172a(2, this.f33612b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39120b() {
        int i = 0;
        int b = super.b();
        if (this.f33611a == null || this.f33611a.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f33611a.length) {
                String str = this.f33611a[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f33612b == null) {
            return i;
        }
        this.f33612b.booleanValue();
        return i + (nyu.m37154h(2) + 1);
    }

    private opx m39116b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    a = this.f33611a == null ? 0 : this.f33611a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33611a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f33611a = obj;
                    continue;
                case 16:
                    this.f33612b = Boolean.valueOf(nyt.m37116i());
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
