import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnGestureListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

public final class crq implements tr {
    static final int a;
    static final int b;
    OnGestureListener c;
    final csi d;
    private final uq e;
    private final dr f;
    private final cvh g;
    private final Handler h;
    private ViewGroup i;
    private cse j;
    private boolean k;
    private csb l;
    private csb m;
    private final Runnable n;
    private final cvm o;

    public crq(ctn ctn, dr drVar) {
        this.h = new Handler();
        this.n = new crr(this);
        this.o = new crt(this);
        this.e = (uq) drVar.getActivity();
        this.f = drVar;
        this.g = ctn.h();
        this.d = (csi) jyn.a(this.e, csi.class);
    }

    void a() {
        Resources resources = this.e.getResources();
        this.i = (ViewGroup) this.f.getView();
        this.j = (cse) this.i.findViewById(gwb.oz);
        this.d.a(csk.b);
        b(resources.getInteger(gwb.pf));
        this.g.a(this.o);
        this.e.g().a(this);
        this.i.setOnTouchListener(new cry(this, new me(this.e, new crx(this))));
        this.i.setOnSystemUiVisibilityChangeListener(new crw(this));
        cse cse = this.j;
        this.c = new crz(this);
        cse.a(new csa(this, new me(this.e, this.c)));
        View findViewById = this.e.findViewById(gwb.oM);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.height = giw.a(this.e);
        marginLayoutParams.topMargin = -marginLayoutParams.height;
        findViewById.setLayoutParams(marginLayoutParams);
        if (VERSION.SDK_INT >= 21) {
            this.e.getWindow().clearFlags(67108864);
        }
        this.m = new csb(this.i.findViewById(gwb.ox), resources.getInteger(gwb.pd), new cru(this));
        this.l = new csb(this.e.findViewById(gwb.ov), resources.getInteger(gwb.pd), new crv(this));
        b(false);
    }

    void b() {
        this.g.b(this.o);
        this.e.g().b(this);
        this.i.setOnTouchListener(null);
        this.i.setOnSystemUiVisibilityChangeListener(null);
        this.j.a(null);
        e();
    }

    void a(int i) {
        if (i != this.d.a()) {
            this.d.a(i);
            c();
            d();
        }
    }

    void c() {
        b(true);
    }

    private void b(boolean z) {
        int i;
        int i2 = 1;
        Resources resources = this.e.getResources();
        if (gwb.m(this.e)) {
            this.d.a(csk.a);
        }
        int a = this.d.a();
        if (a == csk.d) {
            gwb.i(this.e, 3206);
        }
        int size = this.g.c().size();
        int i3 = -this.l.a().getMeasuredHeight();
        int b = giw.b(this.e);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(gwb.oa);
        int b2 = this.m.b();
        switch (crs.a[a - 1]) {
            case wi.j /*1*/:
                if (size > 0) {
                    b2 = 1;
                    i = 1;
                    a = dimensionPixelOffset;
                    break;
                }
                this.d.a(csk.c);
            case wi.l /*2*/:
                if (size > 0) {
                    b2 = resources.getDimensionPixelOffset(gwb.oc);
                    i = 1;
                    a = b2;
                    b2 = 1;
                    break;
                }
            case wi.z /*3*/:
                if (VERSION.SDK_INT >= 19) {
                    b2 = resources.getDimensionPixelOffset(gwb.ob);
                    if (giw.b(this.e) == 0) {
                        i2 = 0;
                    }
                    i = 0;
                    a = b2;
                    b2 = i2;
                    break;
                }
            case wi.h /*4*/:
                b2 = 0;
                i = 0;
                a = giw.a(this.i, this.e);
                break;
            default:
                i = 1;
                a = b2;
                b2 = 1;
                break;
        }
        if (i != 0) {
            i2 = i3;
        } else {
            i2 = 0;
        }
        if (z) {
            this.m.a(a, dimensionPixelOffset, b);
            this.l.a(i2, i3, 0);
        } else {
            this.m.a(a);
            this.l.a(i2);
        }
        i2 = this.i.getSystemUiVisibility() | a;
        if (i != 0) {
            i2 |= 5;
        } else {
            i2 &= -6;
        }
        if (b2 != 0) {
            i2 |= b;
        } else {
            i2 &= b ^ -1;
        }
        this.i.setSystemUiVisibility(i2);
    }

    public void a(boolean z) {
        this.k = z;
        d();
    }

    void d() {
        b(this.e.getResources().getInteger(gwb.pe));
    }

    private void b(int i) {
        e();
        int a = this.d.a();
        if ((a == csk.b || a == csk.a) && !this.k && !gwb.m(this.e)) {
            this.h.postDelayed(this.n, (long) i);
        }
    }

    void e() {
        this.h.removeCallbacks(this.n);
    }

    static {
        int i;
        if (VERSION.SDK_INT >= 19) {
            i = 1792;
        } else {
            i = 1280;
        }
        a = i;
        if (VERSION.SDK_INT >= 19) {
            i = 2050;
        } else {
            i = 0;
        }
        b = i;
    }
}
