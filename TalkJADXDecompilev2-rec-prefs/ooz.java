package p000;

public final class ooz extends nyx<ooz> {
    private static volatile ooz[] f33511b;
    public oqu f33512a;

    public /* synthetic */ nzf m38992a(nyt nyt) {
        return m38989b(nyt);
    }

    public static ooz[] m38990d() {
        if (f33511b == null) {
            synchronized (nzc.f31309c) {
                if (f33511b == null) {
                    f33511b = new ooz[0];
                }
            }
        }
        return f33511b;
    }

    public ooz() {
        m38991g();
    }

    private ooz m38991g() {
        this.f33512a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38993a(nyu nyu) {
        if (this.f33512a != null) {
            nyu.m37182b(1, this.f33512a);
        }
        super.a(nyu);
    }

    protected int m38994b() {
        int b = super.b();
        if (this.f33512a != null) {
            return b + nyu.m37145d(1, this.f33512a);
        }
        return b;
    }

    private ooz m38989b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33512a == null) {
                        this.f33512a = new oqu();
                    }
                    nyt.m37101a(this.f33512a);
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
