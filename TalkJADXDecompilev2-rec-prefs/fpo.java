package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fpo extends fpl {
    private static final boolean f13694d = false;
    private static final long serialVersionUID = 1;
    private final int f13695u;
    private final int f13696v;
    private final List<edo> f13697w;
    private final long f13698x;
    private final String f13699y;

    static {
        kae kae = glk.f15565l;
    }

    public fpo(lqg lqg, int i, long j, lrv lrv) {
        super(lqg, i, j);
        this.f13695u = gwb.m2293m(gwb.m1507a(lrv.f26277a));
        this.f13696v = gwb.m1507a(lrv.f26283g);
        this.f13697w = gwb.m1694a(gwb.m1400H(), lrv.f26278b, null);
        this.f13698x = gwb.m1523a(lrv.f26279c);
        if (lrv.f26280d == null || TextUtils.isEmpty(lrv.f26280d.f25931a)) {
            this.f13699y = null;
        } else {
            this.f13699y = lrv.f26280d.f25931a;
        }
    }

    public List<edo> mo2063f() {
        List<edo> arrayList = new ArrayList(this.f13697w);
        if (this.f13695u != 1) {
            arrayList.add(this.b);
        }
        return arrayList;
    }

    public int m15914d() {
        return this.f13695u;
    }

    public int m15915e() {
        return this.f13696v;
    }

    public List<edo> m15917g() {
        return this.f13697w;
    }

    public long m15918h() {
        return this.f13698x;
    }

    public String m15919u() {
        return this.f13699y;
    }

    protected void mo2062b(blo blo, fhc fhc) {
        blo.m5958a();
        try {
            Object a = blf.m5800a(blo, this, fhc);
            blo.m6015b();
            if (a != null) {
                blf.m5821d(blo, m15827a());
            }
            new flg(this).m15632b(blo);
        } finally {
            blo.m6028c();
        }
    }
}
