package p000;

public final class mvl extends nyx<mvl> {
    public String f28486a;
    public mvw f28487b;
    public mvh f28488c;
    public String f28489d;
    public int f28490e;
    public mvm[] f28491f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33092b(nyt);
    }

    public mvl() {
        m33093d();
    }

    private mvl m33093d() {
        this.f28486a = "";
        this.f28487b = null;
        this.f28488c = null;
        this.f28489d = "";
        this.f28490e = 0;
        this.f28491f = mvm.m33098d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28486a == null || this.f28486a.equals(""))) {
            nyu.a(1, this.f28486a);
        }
        if (this.f28487b != null) {
            nyu.b(2, this.f28487b);
        }
        if (this.f28488c != null) {
            nyu.b(3, this.f28488c);
        }
        if (!(this.f28489d == null || this.f28489d.equals(""))) {
            nyu.a(4, this.f28489d);
        }
        if (this.f28490e != 0) {
            nyu.a(5, this.f28490e);
        }
        if (this.f28491f != null && this.f28491f.length > 0) {
            for (nzf nzf : this.f28491f) {
                if (nzf != null) {
                    nyu.b(6, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28486a == null || this.f28486a.equals(""))) {
            b += nyu.b(1, this.f28486a);
        }
        if (this.f28487b != null) {
            b += nyu.d(2, this.f28487b);
        }
        if (this.f28488c != null) {
            b += nyu.d(3, this.f28488c);
        }
        if (!(this.f28489d == null || this.f28489d.equals(""))) {
            b += nyu.b(4, this.f28489d);
        }
        if (this.f28490e != 0) {
            b += nyu.f(5, this.f28490e);
        }
        if (this.f28491f == null || this.f28491f.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f28491f) {
            if (nzf != null) {
                i += nyu.d(6, nzf);
            }
        }
        return i;
    }

    private mvl m33092b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28486a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f28487b == null) {
                        this.f28487b = new mvw();
                    }
                    nyt.a(this.f28487b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28488c == null) {
                        this.f28488c = new mvh();
                    }
                    nyt.a(this.f28488c);
                    continue;
                case 34:
                    this.f28489d = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f28490e = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.f28491f == null) {
                        a = 0;
                    } else {
                        a = this.f28491f.length;
                    }
                    Object obj = new mvm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28491f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mvm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mvm();
                    nyt.a(obj[a]);
                    this.f28491f = obj;
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
