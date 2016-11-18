package p000;

public final class mxc extends nyx<mxc> {
    public mxe[] f28662a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33293b(nyt);
    }

    public mxc() {
        m33294d();
    }

    private mxc m33294d() {
        this.f28662a = mxe.m33304d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28662a != null && this.f28662a.length > 0) {
            for (nzf nzf : this.f28662a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28662a != null && this.f28662a.length > 0) {
            for (nzf nzf : this.f28662a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mxc m33293b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28662a == null) {
                        a = 0;
                    } else {
                        a = this.f28662a.length;
                    }
                    Object obj = new mxe[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28662a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxe();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxe();
                    nyt.a(obj[a]);
                    this.f28662a = obj;
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
