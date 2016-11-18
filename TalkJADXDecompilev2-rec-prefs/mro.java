package p000;

public final class mro extends nyx<mro> {
    public static final nyy<ozn, mro> f28185a = nyy.a(11, mro.class, 33251034);
    private static final mro[] f28186e = new mro[0];
    public long f28187b;
    public int f28188c;
    public int f28189d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32777b(nyt);
    }

    public mro() {
        m32778d();
    }

    private mro m32778d() {
        this.f28187b = 0;
        this.f28188c = 0;
        this.f28189d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mro)) {
            return false;
        }
        mro mro = (mro) obj;
        if (this.f28187b != mro.f28187b) {
            return false;
        }
        if (this.f28188c != mro.f28188c) {
            return false;
        }
        if (this.f28189d != mro.f28189d) {
            return false;
        }
        if (this.unknownFieldData != null && !this.unknownFieldData.b()) {
            return this.unknownFieldData.equals(mro.unknownFieldData);
        }
        if (mro.unknownFieldData == null || mro.unknownFieldData.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f28187b ^ (this.f28187b >>> 32)))) * 31) + this.f28188c) * 31) + this.f28189d) * 31;
        if (this.unknownFieldData == null || this.unknownFieldData.b()) {
            i = 0;
        } else {
            i = this.unknownFieldData.hashCode();
        }
        return i + hashCode;
    }

    public void mo146a(nyu nyu) {
        nyu.b(1, this.f28187b);
        nyu.b(2, this.f28188c);
        nyu.b(3, this.f28189d);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.f(1, this.f28187b);
        int i = this.f28188c;
        b += nyu.h(2) + 4;
        i = this.f28189d;
        return b + (nyu.h(3) + 4);
    }

    private mro m32777b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28187b = nyt.e();
                    continue;
                case 21:
                    this.f28188c = nyt.h();
                    continue;
                case 29:
                    this.f28189d = nyt.h();
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
