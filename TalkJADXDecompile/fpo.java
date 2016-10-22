import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fpo extends fpl {
    private static final boolean d;
    private static final long serialVersionUID = 1;
    private final int u;
    private final int v;
    private final List<edo> w;
    private final long x;
    private final String y;

    static {
        kae kae = glk.l;
        d = d;
    }

    public fpo(lqg lqg, int i, long j, lrv lrv) {
        super(lqg, i, j);
        this.u = gwb.m(gwb.a(lrv.a));
        this.v = gwb.a(lrv.g);
        this.w = gwb.a(gwb.H(), lrv.b, null);
        this.x = gwb.a(lrv.c);
        if (lrv.d == null || TextUtils.isEmpty(lrv.d.a)) {
            this.y = null;
        } else {
            this.y = lrv.d.a;
        }
    }

    public List<edo> f() {
        List<edo> arrayList = new ArrayList(this.w);
        if (this.u != 1) {
            arrayList.add(this.b);
        }
        return arrayList;
    }

    public int d() {
        return this.u;
    }

    public int e() {
        return this.v;
    }

    public List<edo> g() {
        return this.w;
    }

    public long h() {
        return this.x;
    }

    public String u() {
        return this.y;
    }

    protected void b(blo blo, fhc fhc) {
        blo.a();
        try {
            Object a = blf.a(blo, this, fhc);
            blo.b();
            if (a != null) {
                blf.d(blo, a());
            }
            new flg(this).b(blo);
        } finally {
            blo.c();
        }
    }
}
