package p000;

public final class nuh extends nyx<nuh> {
    public String f30831a;
    public String f30832b;
    public String f30833c;
    public String f30834d;

    public /* synthetic */ nzf m36589a(nyt nyt) {
        return m36588b(nyt);
    }

    public nuh() {
        this.f30831a = null;
        this.f30832b = null;
        this.f30833c = null;
        this.f30834d = null;
        this.cachedSize = -1;
    }

    public void m36590a(nyu nyu) {
        if (this.f30831a != null) {
            nyu.m37170a(1, this.f30831a);
        }
        if (this.f30832b != null) {
            nyu.m37170a(2, this.f30832b);
        }
        if (this.f30833c != null) {
            nyu.m37170a(3, this.f30833c);
        }
        if (this.f30834d != null) {
            nyu.m37170a(4, this.f30834d);
        }
        super.a(nyu);
    }

    protected int m36591b() {
        int b = super.b();
        if (this.f30831a != null) {
            b += nyu.m37137b(1, this.f30831a);
        }
        if (this.f30832b != null) {
            b += nyu.m37137b(2, this.f30832b);
        }
        if (this.f30833c != null) {
            b += nyu.m37137b(3, this.f30833c);
        }
        if (this.f30834d != null) {
            return b + nyu.m37137b(4, this.f30834d);
        }
        return b;
    }

    private nuh m36588b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30831a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30832b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f30833c = nyt.m37117j();
                    continue;
                case 34:
                    this.f30834d = nyt.m37117j();
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
