import com.google.api.client.http.HttpStatusCodes;

public final class mun extends nyx<mun> {
    public static final nyy<ozo, mun> a;
    private static final mun[] d;
    public muk[] b;
    public muf c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    static {
        a = nyy.a(11, mun.class, 122048994);
        d = new mun[0];
    }

    public mun() {
        d();
    }

    private mun d() {
        this.b = muk.d();
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.b(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.c != null) {
            return b + nyu.d(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, this.c);
        }
        return b;
    }

    private mun b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    int b = nzl.b(nyt, 10);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new muk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new muk();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new muk();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 4002:
                    if (this.c == null) {
                        this.c = new muf();
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
