package p000;

public final class mwc extends nyx<mwc> {
    public mwe[] f28546a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33177b(nyt);
    }

    public mwc() {
        m33178d();
    }

    private mwc m33178d() {
        this.f28546a = mwe.m33186d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28546a != null && this.f28546a.length > 0) {
            for (nzf nzf : this.f28546a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28546a != null && this.f28546a.length > 0) {
            for (nzf nzf : this.f28546a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mwc m33177b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28546a == null) {
                        a = 0;
                    } else {
                        a = this.f28546a.length;
                    }
                    Object obj = new mwe[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28546a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwe();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwe();
                    nyt.a(obj[a]);
                    this.f28546a = obj;
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
