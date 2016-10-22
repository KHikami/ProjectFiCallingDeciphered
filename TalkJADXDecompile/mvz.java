import java.util.Arrays;

public final class mvz extends nyx<mvz> {
    public String a;
    public byte[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvz() {
        d();
    }

    private mvz d() {
        this.a = "";
        this.b = nzl.h;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!Arrays.equals(this.b, nzl.h)) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (Arrays.equals(this.b, nzl.h)) {
            return b;
        }
        return b + nyu.b(2, this.b);
    }

    private mvz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.k();
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
