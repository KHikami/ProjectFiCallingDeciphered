import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.android.ex.photo.PhotoViewPager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class agp implements agm, ahb, fh<Cursor>, pc, tr {
    public static int a;
    public static int b;
    public final Handler A;
    private final OnSystemUiVisibilityChangeListener B;
    private String C;
    private String D;
    private int E;
    private String F;
    private String[] G;
    private final Map<Integer, ago> H;
    private final Set<agn> I;
    private boolean J;
    private boolean K;
    private final AccessibilityManager L;
    private long M;
    private int N;
    private final Runnable O;
    final agy c;
    int d;
    public int e;
    public boolean f;
    public View g;
    public View h;
    public PhotoViewPager i;
    public ImageView j;
    public ahf k;
    public boolean l;
    public boolean m;
    public float n;
    public String o;
    public String p;
    boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public agz z;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (Cursor) obj);
    }

    public agp(agy agy) {
        this.e = -1;
        this.H = new HashMap();
        this.I = new HashSet();
        this.m = true;
        this.A = new Handler();
        this.N = -1;
        this.O = new agr(this);
        this.c = agy;
        if (VERSION.SDK_INT < 11) {
            this.B = null;
        } else {
            this.B = new agq(this);
        }
        this.L = (AccessibilityManager) agy.i().getSystemService("accessibility");
    }

    public ahf a(Context context, ed edVar, Cursor cursor, float f) {
        return new ahf(context, edVar, null, f, this.y);
    }

    public agy c() {
        return this.c;
    }

    protected View d(int i) {
        return this.c.findViewById(i);
    }

    protected int d() {
        return gwb.cA;
    }

    protected int e() {
        return gwb.cI;
    }

    protected View f() {
        return d(gwb.cz);
    }

    protected boolean g() {
        return this.h != null;
    }

    protected ImageView h() {
        return (ImageView) d(gwb.cB);
    }

    protected boolean i() {
        return this.j != null;
    }

    public void j() {
        a(this.l, false);
        this.m = false;
        if (this.J) {
            this.J = false;
            this.c.f().a(100, null, this);
        }
    }

    public void k() {
        this.m = true;
    }

    public void l() {
        this.K = true;
    }

    public boolean m() {
        if (this.l && !this.x) {
            a();
        } else if (!this.r) {
            return false;
        } else {
            this.c.getIntent();
            int measuredWidth = this.g.getMeasuredWidth();
            int measuredHeight = this.g.getMeasuredHeight();
            float max = Math.max(((float) this.u) / ((float) measuredWidth), ((float) this.v) / ((float) measuredHeight));
            measuredWidth = a(this.s, this.u, measuredWidth, max);
            measuredHeight = a(this.t, this.v, measuredHeight, max);
            int i = VERSION.SDK_INT;
            if (i >= 14) {
                ViewPropertyAnimator duration;
                if (g()) {
                    this.h.animate().alpha(0.0f).setDuration(250).start();
                    this.h.setVisibility(0);
                }
                Runnable agu = new agu(this);
                if (i() && this.j.getVisibility() == 0) {
                    duration = this.j.animate().scaleX(max).scaleY(max).translationX((float) measuredWidth).translationY((float) measuredHeight).setDuration(250);
                } else {
                    duration = this.i.animate().scaleX(max).scaleY(max).translationX((float) measuredWidth).translationY((float) measuredHeight).setDuration(250);
                }
                if (!this.D.equals(this.F)) {
                    duration.alpha(0.0f);
                }
                if (i >= 16) {
                    duration.withEndAction(agu);
                } else {
                    this.A.postDelayed(agu, 250);
                }
                duration.start();
            } else {
                if (g()) {
                    Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(250);
                    this.h.startAnimation(alphaAnimation);
                    this.h.setVisibility(0);
                }
                Animation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, max, max);
                scaleAnimation.setDuration(250);
                scaleAnimation.setAnimationListener(new agv(this));
                if (i() && this.j.getVisibility() == 0) {
                    this.j.startAnimation(scaleAnimation);
                } else {
                    this.i.startAnimation(scaleAnimation);
                }
            }
        }
        return true;
    }

    public void b(Bundle bundle) {
        bundle.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", this.D);
        bundle.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", this.F);
        bundle.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", this.E);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", this.l);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", this.o);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", this.p);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", this.q);
    }

    public boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                this.c.finish();
                return true;
            default:
                return false;
        }
    }

    public void a(int i, ago ago) {
        this.H.put(Integer.valueOf(i), ago);
    }

    public void c(int i) {
        this.H.remove(Integer.valueOf(i));
    }

    public synchronized void a(agn agn) {
        this.I.add(agn);
    }

    public synchronized void b(agn agn) {
        this.I.remove(agn);
    }

    public boolean b(dr drVar) {
        if (this.i == null || this.k == null || this.k.a() == 0) {
            return this.l;
        }
        return this.l || this.i.c() != this.k.b((Object) drVar);
    }

    public void a() {
        a(!this.l, true);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        if (i == 100) {
            return new ahl(this.c.i(), Uri.parse(this.C), this.G);
        }
        return null;
    }

    public ig a(int i, String str) {
        switch (i) {
            case wi.j /*1*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
                return new ahi(this.c.i(), str);
            default:
                return null;
        }
    }

    public void a(ig<Cursor> igVar, Cursor cursor) {
        if (igVar.p() != 100) {
            return;
        }
        if (cursor == null || cursor.getCount() == 0) {
            this.f = true;
            this.k.a(null);
            return;
        }
        this.e = cursor.getCount();
        if (this.F != null) {
            Uri build;
            int columnIndex = cursor.getColumnIndex("uri");
            if (VERSION.SDK_INT >= 11) {
                build = Uri.parse(this.F).buildUpon().clearQuery().build();
            } else {
                build = Uri.parse(this.F).buildUpon().query(null).build();
            }
            cursor.moveToPosition(-1);
            int i = 0;
            while (cursor.moveToNext()) {
                String string = cursor.getString(columnIndex);
                Object build2;
                if (VERSION.SDK_INT >= 11) {
                    build2 = Uri.parse(string).buildUpon().clearQuery().build();
                } else {
                    build2 = Uri.parse(string).buildUpon().query(null).build();
                }
                if (build != null && build.equals(r3)) {
                    this.E = i;
                    break;
                }
                i++;
            }
        }
        if (this.m) {
            this.J = true;
            this.k.a(null);
            return;
        }
        boolean z = this.f;
        this.f = false;
        this.k.a(cursor);
        if (this.i.b() == null) {
            this.i.a((np) this.k);
        }
        a(cursor);
        if (this.E < 0) {
            this.E = 0;
        }
        this.i.a(this.E, false);
        if (z) {
            e(this.E);
        }
    }

    private synchronized void a(Cursor cursor) {
        for (agn a : this.I) {
            a.a(cursor);
        }
    }

    public void a(int i, float f, int i2) {
        if (((double) f) < 1.0E-4d) {
            ago ago = (ago) this.H.get(Integer.valueOf(i - 1));
            if (ago != null) {
                ago.c();
            }
            ago = (ago) this.H.get(Integer.valueOf(i + 1));
            if (ago != null) {
                ago.c();
            }
        }
    }

    public void a(int i) {
        this.E = i;
        e(i);
    }

    public void b(int i) {
    }

    public boolean a(dr drVar) {
        if (this.i == null || this.k == null || this.i.c() != this.k.b((Object) drVar)) {
            return false;
        }
        return true;
    }

    public int a(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        for (ago ago : this.H.values()) {
            boolean z3;
            if (!z2) {
                z2 = ago.a(f, f2);
            }
            if (z) {
                z3 = z;
            } else {
                z3 = ago.b(f, f2);
            }
            z = z3;
        }
        if (z2) {
            if (z) {
                return aha.d;
            }
            return aha.b;
        } else if (z) {
            return aha.c;
        } else {
            return aha.a;
        }
    }

    protected void a(boolean z, boolean z2) {
        if (ba.a(this.L)) {
            z2 = false;
            z = false;
        }
        boolean z3 = z != this.l;
        this.l = z;
        if (this.l) {
            b(true);
            z();
        } else {
            b(false);
            if (z2) {
                y();
            }
        }
        if (z3) {
            for (ago a : this.H.values()) {
                a.a();
            }
        }
    }

    private void y() {
        if (this.w) {
            this.A.postDelayed(this.O, this.M);
        }
    }

    private void z() {
        this.A.removeCallbacks(this.O);
    }

    protected void b(boolean z) {
        c(z);
    }

    public void e(int i) {
        ago ago = (ago) this.H.get(Integer.valueOf(i));
        if (ago != null) {
            ago.b();
        }
        Cursor p = p();
        this.E = i;
        this.F = p.getString(p.getColumnIndex("uri"));
        n();
        if (this.L.isEnabled() && this.N != i) {
            CharSequence o = o();
            if (o != null) {
                ba.a(this.g, this.L, o);
                this.N = i;
            }
        }
        z();
        y();
    }

    public void n() {
        int c = this.i.c() + 1;
        int i = this.e >= 0 ? 1 : 0;
        Cursor p = p();
        if (p != null) {
            this.o = p.getString(p.getColumnIndex("_display_name"));
        } else {
            this.o = null;
        }
        if (this.f || i == 0 || c <= 0) {
            this.p = null;
        } else {
            this.p = this.c.getResources().getString(gwb.cL, new Object[]{Integer.valueOf(c), Integer.valueOf(this.e)});
        }
        a(this.c.j());
    }

    protected String o() {
        String str = this.o;
        if (this.p == null) {
            return str;
        }
        return this.c.i().getResources().getString(gwb.cM, new Object[]{this.o, this.p});
    }

    public final void a(agi agi) {
        if (agi != null) {
            agi.a(a(this.o));
            agi.b(a(this.p));
        }
    }

    private static final String a(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public Cursor p() {
        if (this.i == null) {
            return null;
        }
        int c = this.i.c();
        Cursor d = this.k.d();
        if (d == null) {
            return null;
        }
        d.moveToPosition(c);
        return d;
    }

    public void a(boolean z) {
        if (z) {
            z();
        } else {
            y();
        }
    }

    public void a(ahg ahg, boolean z) {
        if (i() && this.j.getVisibility() != 8 && TextUtils.equals(ahg.e(), this.F)) {
            if (z) {
                if (i()) {
                    this.j.setVisibility(8);
                }
                this.i.setVisibility(0);
            } else {
                if (i()) {
                    this.j.setVisibility(8);
                }
                this.i.setVisibility(0);
            }
            this.c.f().a(2);
        }
    }

    public ahf b() {
        return this.k;
    }

    public void q() {
        this.q = true;
        this.i.setVisibility(0);
        b(this.l);
    }

    void r() {
        int measuredWidth = this.g.getMeasuredWidth();
        int measuredHeight = this.g.getMeasuredHeight();
        if (i()) {
            this.j.setVisibility(0);
        }
        float max = Math.max(((float) this.u) / ((float) measuredWidth), ((float) this.v) / ((float) measuredHeight));
        measuredWidth = a(this.s, this.u, measuredWidth, max);
        measuredHeight = a(this.t, this.v, measuredHeight, max);
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            if (g()) {
                this.h.setAlpha(0.0f);
                this.h.animate().alpha(1.0f).setDuration(250).start();
                this.h.setVisibility(0);
            }
            if (i()) {
                this.j.setScaleX(max);
                this.j.setScaleY(max);
                this.j.setTranslationX((float) measuredWidth);
                this.j.setTranslationY((float) measuredHeight);
                Runnable ags = new ags(this);
                ViewPropertyAnimator duration = this.j.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250);
                if (i >= 16) {
                    duration.withEndAction(ags);
                } else {
                    this.A.postDelayed(ags, 250);
                }
                duration.start();
                return;
            }
            return;
        }
        if (g()) {
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            this.h.startAnimation(alphaAnimation);
            this.h.setVisibility(0);
        }
        if (i()) {
            alphaAnimation = new TranslateAnimation((float) measuredWidth, (float) measuredHeight, 0.0f, 0.0f);
            alphaAnimation.setDuration(250);
            Animation scaleAnimation = new ScaleAnimation(max, max, 0.0f, 0.0f);
            scaleAnimation.setDuration(250);
            Animation animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setAnimationListener(new agt(this));
            this.j.startAnimation(animationSet);
        }
    }

    private static int a(int i, int i2, int i3, float f) {
        return (i - Math.round((((float) i3) - (((float) i3) * f)) / 2.0f)) - Math.round(((((float) i3) * f) - ((float) i2)) / 2.0f);
    }

    public void s() {
        this.c.j().b();
    }

    public void t() {
        this.c.j().c();
    }

    public boolean u() {
        return this.r;
    }

    public boolean v() {
        return this.q;
    }

    public View w() {
        return this.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(boolean r9) {
        /*
        r8 = this;
        r7 = 16;
        r6 = 11;
        r5 = 19;
        r1 = 1;
        r0 = 0;
        r4 = android.os.Build.VERSION.SDK_INT;
        if (r4 >= r7) goto L_0x002b;
    L_0x000c:
        r3 = r1;
    L_0x000d:
        if (r9 == 0) goto L_0x005d;
    L_0x000f:
        r2 = r8.u();
        if (r2 == 0) goto L_0x001b;
    L_0x0015:
        r2 = r8.v();
        if (r2 == 0) goto L_0x005d;
    L_0x001b:
        if (r4 > r5) goto L_0x0039;
    L_0x001d:
        if (r4 != r5) goto L_0x004e;
    L_0x001f:
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 == r5) goto L_0x002d;
    L_0x0023:
        r0 = new java.lang.IllegalStateException;
        r1 = "kitkatIsSecondary user is only callable on KitKat";
        r0.<init>(r1);
        throw r0;
    L_0x002b:
        r3 = r0;
        goto L_0x000d;
    L_0x002d:
        r2 = android.os.Process.myUid();
        r5 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        if (r2 <= r5) goto L_0x004c;
    L_0x0036:
        r2 = r1;
    L_0x0037:
        if (r2 != 0) goto L_0x004e;
    L_0x0039:
        r0 = 3846; // 0xf06 float:5.39E-42 double:1.9E-320;
    L_0x003b:
        if (r3 == 0) goto L_0x0040;
    L_0x003d:
        r8.t();
    L_0x0040:
        if (r4 < r6) goto L_0x004b;
    L_0x0042:
        r8.d = r0;
        r1 = r8.w();
        r1.setSystemUiVisibility(r0);
    L_0x004b:
        return;
    L_0x004c:
        r2 = r0;
        goto L_0x0037;
    L_0x004e:
        if (r4 < r7) goto L_0x0053;
    L_0x0050:
        r0 = 1285; // 0x505 float:1.8E-42 double:6.35E-321;
        goto L_0x003b;
    L_0x0053:
        r2 = 14;
        if (r4 < r2) goto L_0x0059;
    L_0x0057:
        r0 = r1;
        goto L_0x003b;
    L_0x0059:
        if (r4 < r6) goto L_0x003b;
    L_0x005b:
        r0 = r1;
        goto L_0x003b;
    L_0x005d:
        if (r4 < r5) goto L_0x0067;
    L_0x005f:
        r0 = 1792; // 0x700 float:2.511E-42 double:8.854E-321;
    L_0x0061:
        if (r3 == 0) goto L_0x0040;
    L_0x0063:
        r8.s();
        goto L_0x0040;
    L_0x0067:
        if (r4 < r7) goto L_0x006c;
    L_0x0069:
        r0 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        goto L_0x0061;
    L_0x006c:
        r1 = 14;
        if (r4 >= r1) goto L_0x0061;
    L_0x0070:
        if (r4 < r6) goto L_0x0061;
    L_0x0072:
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: agp.c(boolean):void");
    }

    public OnSystemUiVisibilityChangeListener x() {
        return this.B;
    }

    public void a(Bundle bundle) {
        if (b == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) this.c.i().getSystemService("window");
            int i = ahn.b;
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            switch (agx.a[i - 1]) {
                case wi.j /*1*/:
                    b = (Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) * 800) / 1000;
                    break;
                default:
                    b = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
                    break;
            }
        }
        a = ((ActivityManager) this.c.getApplicationContext().getSystemService("activity")).getMemoryClass();
        Intent intent = this.c.getIntent();
        if (intent.hasExtra("photos_uri")) {
            this.C = intent.getStringExtra("photos_uri");
        }
        this.w = intent.getBooleanExtra("enable_timer_lights_out", true);
        if (intent.getBooleanExtra("scale_up_animation", false)) {
            this.r = true;
            this.s = intent.getIntExtra("start_x_extra", 0);
            this.t = intent.getIntExtra("start_y_extra", 0);
            this.u = intent.getIntExtra("start_width_extra", 0);
            this.v = intent.getIntExtra("start_height_extra", 0);
        }
        boolean z = intent.getBooleanExtra("action_bar_hidden_initially", false) && !ba.a(this.L);
        this.x = z;
        this.y = intent.getBooleanExtra("display_thumbs_fullscreen", false);
        if (intent.hasExtra("projection")) {
            this.G = intent.getStringArrayExtra("projection");
        } else {
            this.G = null;
        }
        this.n = intent.getFloatExtra("max_scale", 1.0f);
        this.F = null;
        this.E = -1;
        if (intent.hasExtra("photo_index")) {
            this.E = intent.getIntExtra("photo_index", -1);
        }
        if (intent.hasExtra("initial_photo_uri")) {
            this.D = intent.getStringExtra("initial_photo_uri");
            this.F = this.D;
        }
        this.f = true;
        if (bundle != null) {
            this.D = bundle.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
            this.F = bundle.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
            this.E = bundle.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
            z = bundle.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", false) && !ba.a(this.L);
            this.l = z;
            this.o = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
            this.p = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
            this.q = bundle.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", false);
        } else {
            this.l = this.x;
        }
        this.c.setContentView(e());
        this.k = a(this.c.i(), this.c.J_(), null, this.n);
        Resources resources = this.c.getResources();
        this.g = d(d());
        if (VERSION.SDK_INT >= 11) {
            this.g.setOnSystemUiVisibilityChangeListener(x());
        }
        this.h = f();
        this.j = h();
        this.i = (PhotoViewPager) d(gwb.cF);
        this.i.a((np) this.k);
        this.i.a((pc) this);
        this.i.a(this);
        this.i.d(resources.getDimensionPixelSize(gwb.cu));
        this.z = new agz(this);
        if (!this.r || this.q) {
            this.c.f().a(100, null, this);
            if (g()) {
                this.h.setVisibility(0);
            }
        } else {
            this.i.setVisibility(8);
            Bundle bundle2 = new Bundle();
            bundle2.putString("image_uri", this.D);
            this.c.f().a(2, bundle2, this.z);
        }
        this.M = (long) resources.getInteger(gwb.cH);
        agi j = this.c.j();
        if (j != null) {
            j.a(true);
            j.a((tr) this);
            j.a();
            a(j);
        }
        if (this.r) {
            b(false);
        } else {
            b(this.l);
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        if (!this.K) {
            this.k.a(null);
        }
    }
}
