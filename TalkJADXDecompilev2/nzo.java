package defpackage;

public final class nzo extends nyx<nzo> {
    public String a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nzo() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        super.a(nyu);
    }

    protected int b() {
        return (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
    }

    private nzo b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
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
