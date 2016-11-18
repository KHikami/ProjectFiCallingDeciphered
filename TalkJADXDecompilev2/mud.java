package defpackage;

public final class mud extends nyx<mud> {
    public long a;
    public long b;
    public ozn c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mud() {
        d();
    }

    private mud d() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.c(1, this.a);
        nyu.c(2, this.b);
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        long j = this.a;
        b += nyu.h(1) + 8;
        j = this.b;
        b += nyu.h(2) + 8;
        if (this.c != null) {
            return b + nyu.d(3, this.c);
        }
        return b;
    }

    private mud b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.a = nyt.g();
                    continue;
                case wi.dK /*17*/:
                    this.b = nyt.g();
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new ozn();
                    }
                    nyt.a(this.c);
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
