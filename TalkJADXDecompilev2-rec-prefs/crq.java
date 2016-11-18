package p000;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector.OnGestureListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

public final class crq implements tr {
    static final int f8946a;
    static final int f8947b;
    OnGestureListener f8948c;
    final csi f8949d;
    private final uq f8950e;
    private final dr f8951f;
    private final cvh f8952g;
    private final Handler f8953h = new Handler();
    private ViewGroup f8954i;
    private cse f8955j;
    private boolean f8956k;
    private csb f8957l;
    private csb f8958m;
    private final Runnable f8959n = new crr(this);
    private final cvm f8960o = new crt(this);

    public crq(ctn ctn, dr drVar) {
        this.f8950e = (uq) drVar.getActivity();
        this.f8951f = drVar;
        this.f8952g = ctn.m10976h();
        this.f8949d = (csi) jyn.m25426a(this.f8950e, csi.class);
    }

    void m10836a() {
        Resources resources = this.f8950e.getResources();
        this.f8954i = (ViewGroup) this.f8951f.getView();
        this.f8955j = (cse) this.f8954i.findViewById(gwb.oz);
        this.f8949d.m10859a(csk.f8986b);
        m10834b(resources.getInteger(gwb.pf));
        this.f8952g.m11092a(this.f8960o);
        this.f8950e.m8308g().a(this);
        this.f8954i.setOnTouchListener(new cry(this, new me(this.f8950e, new crx(this))));
        this.f8954i.setOnSystemUiVisibilityChangeListener(new crw(this));
        cse cse = this.f8955j;
        this.f8948c = new crz(this);
        cse.mo1089a(new csa(this, new me(this.f8950e, this.f8948c)));
        View findViewById = this.f8950e.findViewById(gwb.oM);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.height = giw.m17749a(this.f8950e);
        marginLayoutParams.topMargin = -marginLayoutParams.height;
        findViewById.setLayoutParams(marginLayoutParams);
        if (VERSION.SDK_INT >= 21) {
            this.f8950e.getWindow().clearFlags(67108864);
        }
        this.f8958m = new csb(this.f8954i.findViewById(gwb.ox), resources.getInteger(gwb.pd), new cru(this));
        this.f8957l = new csb(this.f8950e.findViewById(gwb.ov), resources.getInteger(gwb.pd), new crv(this));
        m10835b(false);
    }

    void m10839b() {
        this.f8952g.m11098b(this.f8960o);
        this.f8950e.m8308g().b(this);
        this.f8954i.setOnTouchListener(null);
        this.f8954i.setOnSystemUiVisibilityChangeListener(null);
        this.f8955j.mo1089a(null);
        m10842e();
    }

    void m10837a(int i) {
        if (i != this.f8949d.m10858a()) {
            this.f8949d.m10859a(i);
            m10840c();
            m10841d();
        }
    }

    void m10840c() {
        m10835b(true);
    }

    private void m10835b(boolean z) {
        int i;
        int i2 = 1;
        Resources resources = this.f8950e.getResources();
        if (gwb.m2300m(this.f8950e)) {
            this.f8949d.m10859a(csk.f8985a);
        }
        int a = this.f8949d.m10858a();
        if (a == csk.f8988d) {
            gwb.m2251i(this.f8950e, 3206);
        }
        int size = this.f8952g.m11100c().size();
        int i3 = -this.f8957l.m10851a().getMeasuredHeight();
        int b = giw.m17755b(this.f8950e);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(gwb.oa);
        int b2 = this.f8958m.m10854b();
        switch (crs.f8962a[a - 1]) {
            case 1:
                if (size > 0) {
                    b2 = 1;
                    i = 1;
                    a = dimensionPixelOffset;
                    break;
                }
                this.f8949d.m10859a(csk.f8987c);
            case 2:
                if (size > 0) {
                    b2 = resources.getDimensionPixelOffset(gwb.oc);
                    i = 1;
                    a = b2;
                    b2 = 1;
                    break;
                }
            case 3:
                if (VERSION.SDK_INT >= 19) {
                    b2 = resources.getDimensionPixelOffset(gwb.ob);
                    if (giw.m17755b(this.f8950e) == 0) {
                        i2 = 0;
                    }
                    i = 0;
                    a = b2;
                    b2 = i2;
                    break;
                }
            case 4:
                b2 = 0;
                i = 0;
                a = giw.m17751a(this.f8954i, this.f8950e);
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
            this.f8958m.m10853a(a, dimensionPixelOffset, b);
            this.f8957l.m10853a(i2, i3, 0);
        } else {
            this.f8958m.m10852a(a);
            this.f8957l.m10852a(i2);
        }
        i2 = this.f8954i.getSystemUiVisibility() | f8946a;
        if (i != 0) {
            i2 |= 5;
        } else {
            i2 &= -6;
        }
        if (b2 != 0) {
            i2 |= f8947b;
        } else {
            i2 &= f8947b ^ -1;
        }
        this.f8954i.setSystemUiVisibility(i2);
    }

    public void m10838a(boolean z) {
        this.f8956k = z;
        m10841d();
    }

    void m10841d() {
        m10834b(this.f8950e.getResources().getInteger(gwb.pe));
    }

    private void m10834b(int i) {
        m10842e();
        int a = this.f8949d.m10858a();
        if ((a == csk.f8986b || a == csk.f8985a) && !this.f8956k && !gwb.m2300m(this.f8950e)) {
            this.f8953h.postDelayed(this.f8959n, (long) i);
        }
    }

    void m10842e() {
        this.f8953h.removeCallbacks(this.f8959n);
    }

    static {
        int i;
        if (VERSION.SDK_INT >= 19) {
            i = 1792;
        } else {
            i = 1280;
        }
        f8946a = i;
        if (VERSION.SDK_INT >= 19) {
            i = 2050;
        } else {
            i = 0;
        }
        f8947b = i;
    }
}
