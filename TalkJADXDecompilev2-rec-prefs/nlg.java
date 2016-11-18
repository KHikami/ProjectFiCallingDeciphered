package p000;

public final class nlg extends nyx<nlg> {
    public Integer f30106a;
    public mzy f30107b;
    public Integer f30108c;
    public nlh f30109d;

    public /* synthetic */ nzf m35486a(nyt nyt) {
        return m35484b(nyt);
    }

    public nlg() {
        m35485d();
    }

    private nlg m35485d() {
        this.f30107b = null;
        this.f30109d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35487a(nyu nyu) {
        if (this.f30106a != null) {
            nyu.m37168a(1, this.f30106a.intValue());
        }
        if (this.f30107b != null) {
            nyu.m37182b(2, this.f30107b);
        }
        if (this.f30108c != null) {
            nyu.m37168a(4, this.f30108c.intValue());
        }
        if (this.f30109d != null) {
            nyu.m37182b(5, this.f30109d);
        }
        super.a(nyu);
    }

    protected int m35488b() {
        int b = super.b();
        if (this.f30106a != null) {
            b += nyu.m37147f(1, this.f30106a.intValue());
        }
        if (this.f30107b != null) {
            b += nyu.m37145d(2, this.f30107b);
        }
        if (this.f30108c != null) {
            b += nyu.m37147f(4, this.f30108c.intValue());
        }
        if (this.f30109d != null) {
            return b + nyu.m37145d(5, this.f30109d);
        }
        return b;
    }

    private nlg m35484b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                            this.f30106a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30107b == null) {
                        this.f30107b = new mzy();
                    }
                    nyt.m37101a(this.f30107b);
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30108c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f30109d == null) {
                        this.f30109d = new nlh();
                    }
                    nyt.m37101a(this.f30109d);
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
