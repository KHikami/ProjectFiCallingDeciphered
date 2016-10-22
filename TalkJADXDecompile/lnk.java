import java.util.Arrays;

public final class lnk extends nyx<lnk> {
    public byte[] a;
    public mwb b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lnk() {
        d();
    }

    private lnk d() {
        this.a = nzl.h;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!Arrays.equals(this.a, nzl.h)) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!Arrays.equals(this.a, nzl.h)) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(2, this.b);
        }
        return b;
    }

    private lnk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.k();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mwb();
                    }
                    nyt.a(this.b);
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
