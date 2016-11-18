package p000;

public final class nmf extends nyx<nmf> {
    public njz[] f30215a;
    public String f30216b;
    public njn f30217c;
    public nmg f30218d;

    public /* synthetic */ nzf m35617a(nyt nyt) {
        return m35615b(nyt);
    }

    public nmf() {
        m35616d();
    }

    private nmf m35616d() {
        this.f30215a = njz.m35308d();
        this.f30216b = null;
        this.f30217c = null;
        this.f30218d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35618a(nyu nyu) {
        if (this.f30215a != null && this.f30215a.length > 0) {
            for (nzf nzf : this.f30215a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f30216b != null) {
            nyu.m37170a(2, this.f30216b);
        }
        if (this.f30217c != null) {
            nyu.m37182b(3, this.f30217c);
        }
        if (this.f30218d != null) {
            nyu.m37182b(4, this.f30218d);
        }
        super.a(nyu);
    }

    protected int m35619b() {
        int b = super.b();
        if (this.f30215a != null && this.f30215a.length > 0) {
            for (nzf nzf : this.f30215a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f30216b != null) {
            b += nyu.m37137b(2, this.f30216b);
        }
        if (this.f30217c != null) {
            b += nyu.m37145d(3, this.f30217c);
        }
        if (this.f30218d != null) {
            return b + nyu.m37145d(4, this.f30218d);
        }
        return b;
    }

    private nmf m35615b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f30215a == null) {
                        a = 0;
                    } else {
                        a = this.f30215a.length;
                    }
                    Object obj = new njz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30215a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new njz();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new njz();
                    nyt.m37101a(obj[a]);
                    this.f30215a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.f30216b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f30217c == null) {
                        this.f30217c = new njn();
                    }
                    nyt.m37101a(this.f30217c);
                    continue;
                case 34:
                    if (this.f30218d == null) {
                        this.f30218d = new nmg();
                    }
                    nyt.m37101a(this.f30218d);
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
