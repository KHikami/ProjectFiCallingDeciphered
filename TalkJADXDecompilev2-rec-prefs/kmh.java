package p000;

public final class kmh extends nyx<kmh> {
    public String[] f22355a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26527b(nyt);
    }

    public kmh() {
        m26528d();
    }

    private kmh m26528d() {
        this.f22355a = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22355a != null && this.f22355a.length > 0) {
            for (String str : this.f22355a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22355a == null || this.f22355a.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f22355a.length) {
            String str = this.f22355a[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private kmh m26527b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    a = this.f22355a == null ? 0 : this.f22355a.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22355a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22355a = obj;
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
