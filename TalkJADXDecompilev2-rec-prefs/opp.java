package p000;

public final class opp extends nyx<opp> {
    private static volatile opp[] f33574d;
    public String f33575a;
    public opl[] f33576b;
    public oqu f33577c;

    public /* synthetic */ nzf m39077a(nyt nyt) {
        return m39074b(nyt);
    }

    public static opp[] m39075d() {
        if (f33574d == null) {
            synchronized (nzc.f31309c) {
                if (f33574d == null) {
                    f33574d = new opp[0];
                }
            }
        }
        return f33574d;
    }

    public opp() {
        m39076g();
    }

    private opp m39076g() {
        this.f33575a = null;
        this.f33576b = opl.m39053d();
        this.f33577c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39078a(nyu nyu) {
        if (this.f33575a != null) {
            nyu.m37170a(1, this.f33575a);
        }
        if (this.f33576b != null && this.f33576b.length > 0) {
            for (nzf nzf : this.f33576b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f33577c != null) {
            nyu.m37182b(3, this.f33577c);
        }
        super.a(nyu);
    }

    protected int m39079b() {
        int b = super.b();
        if (this.f33575a != null) {
            b += nyu.m37137b(1, this.f33575a);
        }
        if (this.f33576b != null && this.f33576b.length > 0) {
            int i = b;
            for (nzf nzf : this.f33576b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f33577c != null) {
            return b + nyu.m37145d(3, this.f33577c);
        }
        return b;
    }

    private opp m39074b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33575a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f33576b == null) {
                        a = 0;
                    } else {
                        a = this.f33576b.length;
                    }
                    Object obj = new opl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33576b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new opl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new opl();
                    nyt.m37101a(obj[a]);
                    this.f33576b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f33577c == null) {
                        this.f33577c = new oqu();
                    }
                    nyt.m37101a(this.f33577c);
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
