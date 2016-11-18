package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
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
    public static int f644a;
    public static int f645b;
    public final Handler f646A = new Handler();
    private final OnSystemUiVisibilityChangeListener f647B;
    private String f648C;
    private String f649D;
    private int f650E;
    private String f651F;
    private String[] f652G;
    private final Map<Integer, ago> f653H = new HashMap();
    private final Set<agn> f654I = new HashSet();
    private boolean f655J;
    private boolean f656K;
    private final AccessibilityManager f657L;
    private long f658M;
    private int f659N = -1;
    private final Runnable f660O = new agr(this);
    final agy f661c;
    int f662d;
    public int f663e = -1;
    public boolean f664f;
    public View f665g;
    public View f666h;
    public PhotoViewPager f667i;
    public ImageView f668j;
    public ahf f669k;
    public boolean f670l;
    public boolean f671m = true;
    public float f672n;
    public String f673o;
    public String f674p;
    boolean f675q;
    public boolean f676r;
    public int f677s;
    public int f678t;
    public int f679u;
    public int f680v;
    public boolean f681w;
    public boolean f682x;
    public boolean f683y;
    public agz f684z;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m1137a(igVar, (Cursor) obj);
    }

    public agp(agy agy) {
        this.f661c = agy;
        if (VERSION.SDK_INT < 11) {
            this.f647B = null;
        } else {
            this.f647B = new agq(this);
        }
        this.f657L = (AccessibilityManager) agy.mo161i().getSystemService("accessibility");
    }

    public ahf mo1891a(Context context, ed edVar, Cursor cursor, float f) {
        return new ahf(context, edVar, null, f, this.f683y);
    }

    public agy m1148c() {
        return this.f661c;
    }

    protected View m1152d(int i) {
        return this.f661c.findViewById(i);
    }

    protected int m1151d() {
        return gwb.cA;
    }

    protected int m1153e() {
        return gwb.cI;
    }

    protected View m1155f() {
        return m1152d(gwb.cz);
    }

    protected boolean m1156g() {
        return this.f666h != null;
    }

    protected ImageView m1157h() {
        return (ImageView) m1152d(gwb.cB);
    }

    protected boolean m1158i() {
        return this.f668j != null;
    }

    public void m1159j() {
        m1139a(this.f670l, false);
        this.f671m = false;
        if (this.f655J) {
            this.f655J = false;
            this.f661c.m1096f().mo1994a(100, null, this);
        }
    }

    public void m1160k() {
        this.f671m = true;
    }

    public void m1161l() {
        this.f656K = true;
    }

    public boolean m1162m() {
        if (this.f670l && !this.f682x) {
            mo173a();
        } else if (!this.f676r) {
            return false;
        } else {
            this.f661c.getIntent();
            int measuredWidth = this.f665g.getMeasuredWidth();
            int measuredHeight = this.f665g.getMeasuredHeight();
            float max = Math.max(((float) this.f679u) / ((float) measuredWidth), ((float) this.f680v) / ((float) measuredHeight));
            measuredWidth = agp.m1121a(this.f677s, this.f679u, measuredWidth, max);
            measuredHeight = agp.m1121a(this.f678t, this.f680v, measuredHeight, max);
            int i = VERSION.SDK_INT;
            if (i >= 14) {
                ViewPropertyAnimator duration;
                if (m1156g()) {
                    this.f666h.animate().alpha(0.0f).setDuration(250).start();
                    this.f666h.setVisibility(0);
                }
                Runnable agu = new agu(this);
                if (m1158i() && this.f668j.getVisibility() == 0) {
                    duration = this.f668j.animate().scaleX(max).scaleY(max).translationX((float) measuredWidth).translationY((float) measuredHeight).setDuration(250);
                } else {
                    duration = this.f667i.animate().scaleX(max).scaleY(max).translationX((float) measuredWidth).translationY((float) measuredHeight).setDuration(250);
                }
                if (!this.f649D.equals(this.f651F)) {
                    duration.alpha(0.0f);
                }
                if (i >= 16) {
                    duration.withEndAction(agu);
                } else {
                    this.f646A.postDelayed(agu, 250);
                }
                duration.start();
            } else {
                if (m1156g()) {
                    Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(250);
                    this.f666h.startAnimation(alphaAnimation);
                    this.f666h.setVisibility(0);
                }
                Animation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, max, max);
                scaleAnimation.setDuration(250);
                scaleAnimation.setAnimationListener(new agv(this));
                if (m1158i() && this.f668j.getVisibility() == 0) {
                    this.f668j.startAnimation(scaleAnimation);
                } else {
                    this.f667i.startAnimation(scaleAnimation);
                }
            }
        }
        return true;
    }

    public void m1145b(Bundle bundle) {
        bundle.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", this.f649D);
        bundle.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", this.f651F);
        bundle.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", this.f650E);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", this.f670l);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", this.f673o);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", this.f674p);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", this.f675q);
    }

    public boolean m1140a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                this.f661c.finish();
                return true;
            default:
                return false;
        }
    }

    public void mo174a(int i, ago ago) {
        this.f653H.put(Integer.valueOf(i), ago);
    }

    public void mo181c(int i) {
        this.f653H.remove(Integer.valueOf(i));
    }

    public synchronized void mo175a(agn agn) {
        this.f654I.add(agn);
    }

    public synchronized void mo179b(agn agn) {
        this.f654I.remove(agn);
    }

    public boolean mo180b(dr drVar) {
        if (this.f667i == null || this.f669k == null || this.f669k.m1184a() == 0) {
            return this.f670l;
        }
        return this.f670l || this.f667i.m3192c() != this.f669k.m1191b((Object) drVar);
    }

    public void mo173a() {
        m1139a(!this.f670l, true);
    }

    public ig<Cursor> onCreateLoader(int i, Bundle bundle) {
        if (i == 100) {
            return new ahl(this.f661c.mo161i(), Uri.parse(this.f648C), this.f652G);
        }
        return null;
    }

    public ig mo172a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return new ahi(this.f661c.mo161i(), str);
            default:
                return null;
        }
    }

    public void m1137a(ig<Cursor> igVar, Cursor cursor) {
        if (igVar.m1287p() != 100) {
            return;
        }
        if (cursor == null || cursor.getCount() == 0) {
            this.f664f = true;
            this.f669k.mo190a(null);
            return;
        }
        this.f663e = cursor.getCount();
        if (this.f651F != null) {
            Uri build;
            int columnIndex = cursor.getColumnIndex("uri");
            if (VERSION.SDK_INT >= 11) {
                build = Uri.parse(this.f651F).buildUpon().clearQuery().build();
            } else {
                build = Uri.parse(this.f651F).buildUpon().query(null).build();
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
                    this.f650E = i;
                    break;
                }
                i++;
            }
        }
        if (this.f671m) {
            this.f655J = true;
            this.f669k.mo190a(null);
            return;
        }
        boolean z = this.f664f;
        this.f664f = false;
        this.f669k.mo190a(cursor);
        if (this.f667i.m3188b() == null) {
            this.f667i.m3181a(this.f669k);
        }
        mo194a(cursor);
        if (this.f650E < 0) {
            this.f650E = 0;
        }
        this.f667i.m3178a(this.f650E, false);
        if (z) {
            m1154e(this.f650E);
        }
    }

    private synchronized void mo194a(Cursor cursor) {
        for (agn a : this.f654I) {
            a.mo194a(cursor);
        }
    }

    public void m1131a(int i, float f, int i2) {
        if (((double) f) < 1.0E-4d) {
            ago ago = (ago) this.f653H.get(Integer.valueOf(i - 1));
            if (ago != null) {
                ago.mo198c();
            }
            ago = (ago) this.f653H.get(Integer.valueOf(i + 1));
            if (ago != null) {
                ago.mo198c();
            }
        }
    }

    public void m1130a(int i) {
        this.f650E = i;
        m1154e(i);
    }

    public void m1143b(int i) {
    }

    public boolean mo177a(dr drVar) {
        if (this.f667i == null || this.f669k == null || this.f667i.m3192c() != this.f669k.m1191b((Object) drVar)) {
            return false;
        }
        return true;
    }

    public int mo171a(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        for (ago ago : this.f653H.values()) {
            boolean z3;
            if (!z2) {
                z2 = ago.mo195a(f, f2);
            }
            if (z) {
                z3 = z;
            } else {
                z3 = ago.mo197b(f, f2);
            }
            z = z3;
        }
        if (z2) {
            if (z) {
                return aha.f698d;
            }
            return aha.f696b;
        } else if (z) {
            return aha.f697c;
        } else {
            return aha.f695a;
        }
    }

    protected void m1139a(boolean z, boolean z2) {
        if (ba.m4584a(this.f657L)) {
            z2 = false;
            z = false;
        }
        boolean z3 = z != this.f670l;
        this.f670l = z;
        if (this.f670l) {
            m1146b(true);
            m1125z();
        } else {
            m1146b(false);
            if (z2) {
                m1124y();
            }
        }
        if (z3) {
            for (ago a : this.f653H.values()) {
                a.mo193a();
            }
        }
    }

    private void m1124y() {
        if (this.f681w) {
            this.f646A.postDelayed(this.f660O, this.f658M);
        }
    }

    private void m1125z() {
        this.f646A.removeCallbacks(this.f660O);
    }

    protected void m1146b(boolean z) {
        m1150c(z);
    }

    public void m1154e(int i) {
        ago ago = (ago) this.f653H.get(Integer.valueOf(i));
        if (ago != null) {
            ago.mo196b();
        }
        Cursor p = m1165p();
        this.f650E = i;
        this.f651F = p.getString(p.getColumnIndex("uri"));
        mo1893n();
        if (this.f657L.isEnabled() && this.f659N != i) {
            CharSequence o = m1164o();
            if (o != null) {
                ba.m4561a(this.f665g, this.f657L, o);
                this.f659N = i;
            }
        }
        m1125z();
        m1124y();
    }

    public void mo1893n() {
        int c = this.f667i.m3192c() + 1;
        int i = this.f663e >= 0 ? 1 : 0;
        Cursor p = m1165p();
        if (p != null) {
            this.f673o = p.getString(p.getColumnIndex("_display_name"));
        } else {
            this.f673o = null;
        }
        if (this.f664f || i == 0 || c <= 0) {
            this.f674p = null;
        } else {
            this.f674p = this.f661c.getResources().getString(gwb.cL, new Object[]{Integer.valueOf(c), Integer.valueOf(this.f663e)});
        }
        m1133a(this.f661c.mo162j());
    }

    protected String m1164o() {
        String str = this.f673o;
        if (this.f674p == null) {
            return str;
        }
        return this.f661c.mo161i().getResources().getString(gwb.cM, new Object[]{this.f673o, this.f674p});
    }

    public final void m1133a(agi agi) {
        if (agi != null) {
            agi.m1066a(agp.m1122a(this.f673o));
            agi.m1070b(agp.m1122a(this.f674p));
        }
    }

    private static final String m1122a(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public Cursor m1165p() {
        if (this.f667i == null) {
            return null;
        }
        int c = this.f667i.m3192c();
        Cursor d = this.f669k.m1192d();
        if (d == null) {
            return null;
        }
        d.moveToPosition(c);
        return d;
    }

    public void m1138a(boolean z) {
        if (z) {
            m1125z();
        } else {
            m1124y();
        }
    }

    public void mo176a(ahg ahg, boolean z) {
        if (m1158i() && this.f668j.getVisibility() != 8 && TextUtils.equals(ahg.m1265e(), this.f651F)) {
            if (z) {
                if (m1158i()) {
                    this.f668j.setVisibility(8);
                }
                this.f667i.setVisibility(0);
            } else {
                if (m1158i()) {
                    this.f668j.setVisibility(8);
                }
                this.f667i.setVisibility(0);
            }
            this.f661c.m1096f().mo1995a(2);
        }
    }

    public ahf mo178b() {
        return this.f669k;
    }

    public void m1166q() {
        this.f675q = true;
        this.f667i.setVisibility(0);
        m1146b(this.f670l);
    }

    void m1167r() {
        int measuredWidth = this.f665g.getMeasuredWidth();
        int measuredHeight = this.f665g.getMeasuredHeight();
        if (m1158i()) {
            this.f668j.setVisibility(0);
        }
        float max = Math.max(((float) this.f679u) / ((float) measuredWidth), ((float) this.f680v) / ((float) measuredHeight));
        measuredWidth = agp.m1121a(this.f677s, this.f679u, measuredWidth, max);
        measuredHeight = agp.m1121a(this.f678t, this.f680v, measuredHeight, max);
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            if (m1156g()) {
                this.f666h.setAlpha(0.0f);
                this.f666h.animate().alpha(1.0f).setDuration(250).start();
                this.f666h.setVisibility(0);
            }
            if (m1158i()) {
                this.f668j.setScaleX(max);
                this.f668j.setScaleY(max);
                this.f668j.setTranslationX((float) measuredWidth);
                this.f668j.setTranslationY((float) measuredHeight);
                Runnable ags = new ags(this);
                ViewPropertyAnimator duration = this.f668j.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250);
                if (i >= 16) {
                    duration.withEndAction(ags);
                } else {
                    this.f646A.postDelayed(ags, 250);
                }
                duration.start();
                return;
            }
            return;
        }
        if (m1156g()) {
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250);
            this.f666h.startAnimation(alphaAnimation);
            this.f666h.setVisibility(0);
        }
        if (m1158i()) {
            alphaAnimation = new TranslateAnimation((float) measuredWidth, (float) measuredHeight, 0.0f, 0.0f);
            alphaAnimation.setDuration(250);
            Animation scaleAnimation = new ScaleAnimation(max, max, 0.0f, 0.0f);
            scaleAnimation.setDuration(250);
            Animation animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setAnimationListener(new agt(this));
            this.f668j.startAnimation(animationSet);
        }
    }

    private static int m1121a(int i, int i2, int i3, float f) {
        return (i - Math.round((((float) i3) - (((float) i3) * f)) / 2.0f)) - Math.round(((((float) i3) * f) - ((float) i2)) / 2.0f);
    }

    public void m1168s() {
        this.f661c.mo162j().m1069b();
    }

    public void m1169t() {
        this.f661c.mo162j().m1071c();
    }

    public boolean m1170u() {
        return this.f676r;
    }

    public boolean m1171v() {
        return this.f675q;
    }

    public View m1172w() {
        return this.f665g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1150c(boolean z) {
        int i = 0;
        int i2 = VERSION.SDK_INT;
        int i3 = i2 < 16 ? 1 : 0;
        if (!z || (m1170u() && !m1171v())) {
            if (i2 >= 19) {
                i = 1792;
            } else if (i2 >= 16) {
                i = 1280;
            } else if (i2 < 14 && i2 >= 11) {
            }
            if (i3 != 0) {
                m1168s();
            }
        } else {
            if (i2 <= 19) {
                if (i2 == 19) {
                    if (VERSION.SDK_INT != 19) {
                        throw new IllegalStateException("kitkatIsSecondary user is only callable on KitKat");
                    } else if (Process.myUid() > 100000) {
                        r2 = 1;
                    } else {
                        r2 = 0;
                    }
                }
                if (i2 >= 16) {
                    i = 1285;
                } else if (i2 >= 14) {
                    i = 1;
                } else if (i2 >= 11) {
                    i = 1;
                }
                if (i3 != 0) {
                    m1169t();
                }
            }
            i = 3846;
            if (i3 != 0) {
                m1169t();
            }
        }
        if (i2 >= 11) {
            this.f662d = i;
            m1172w().setSystemUiVisibility(i);
        }
    }

    public OnSystemUiVisibilityChangeListener m1173x() {
        return this.f647B;
    }

    public void mo1892a(Bundle bundle) {
        if (f645b == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) this.f661c.mo161i().getSystemService("window");
            int i = ahn.f807b;
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            switch (agx.f693a[i - 1]) {
                case 1:
                    f645b = (Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) * 800) / 1000;
                    break;
                default:
                    f645b = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
                    break;
            }
        }
        f644a = ((ActivityManager) this.f661c.getApplicationContext().getSystemService("activity")).getMemoryClass();
        Intent intent = this.f661c.getIntent();
        if (intent.hasExtra("photos_uri")) {
            this.f648C = intent.getStringExtra("photos_uri");
        }
        this.f681w = intent.getBooleanExtra("enable_timer_lights_out", true);
        if (intent.getBooleanExtra("scale_up_animation", false)) {
            this.f676r = true;
            this.f677s = intent.getIntExtra("start_x_extra", 0);
            this.f678t = intent.getIntExtra("start_y_extra", 0);
            this.f679u = intent.getIntExtra("start_width_extra", 0);
            this.f680v = intent.getIntExtra("start_height_extra", 0);
        }
        boolean z = intent.getBooleanExtra("action_bar_hidden_initially", false) && !ba.m4584a(this.f657L);
        this.f682x = z;
        this.f683y = intent.getBooleanExtra("display_thumbs_fullscreen", false);
        if (intent.hasExtra("projection")) {
            this.f652G = intent.getStringArrayExtra("projection");
        } else {
            this.f652G = null;
        }
        this.f672n = intent.getFloatExtra("max_scale", 1.0f);
        this.f651F = null;
        this.f650E = -1;
        if (intent.hasExtra("photo_index")) {
            this.f650E = intent.getIntExtra("photo_index", -1);
        }
        if (intent.hasExtra("initial_photo_uri")) {
            this.f649D = intent.getStringExtra("initial_photo_uri");
            this.f651F = this.f649D;
        }
        this.f664f = true;
        if (bundle != null) {
            this.f649D = bundle.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
            this.f651F = bundle.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
            this.f650E = bundle.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
            z = bundle.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", false) && !ba.m4584a(this.f657L);
            this.f670l = z;
            this.f673o = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
            this.f674p = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
            this.f675q = bundle.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", false);
        } else {
            this.f670l = this.f682x;
        }
        this.f661c.setContentView(m1153e());
        this.f669k = mo1891a(this.f661c.mo161i(), this.f661c.J_(), null, this.f672n);
        Resources resources = this.f661c.getResources();
        this.f665g = m1152d(m1151d());
        if (VERSION.SDK_INT >= 11) {
            this.f665g.setOnSystemUiVisibilityChangeListener(m1173x());
        }
        this.f666h = m1155f();
        this.f668j = m1157h();
        this.f667i = (PhotoViewPager) m1152d(gwb.cF);
        this.f667i.m3181a(this.f669k);
        this.f667i.mo1265a((pc) this);
        this.f667i.m8194a(this);
        this.f667i.m3195d(resources.getDimensionPixelSize(gwb.cu));
        this.f684z = new agz(this);
        if (!this.f676r || this.f675q) {
            this.f661c.m1096f().mo1994a(100, null, this);
            if (m1156g()) {
                this.f666h.setVisibility(0);
            }
        } else {
            this.f667i.setVisibility(8);
            Bundle bundle2 = new Bundle();
            bundle2.putString("image_uri", this.f649D);
            this.f661c.m1096f().mo1994a(2, bundle2, this.f684z);
        }
        this.f658M = (long) resources.getInteger(gwb.cH);
        agi j = this.f661c.mo162j();
        if (j != null) {
            j.m1068a(true);
            j.m1067a((tr) this);
            j.m1064a();
            m1133a(j);
        }
        if (this.f676r) {
            m1146b(false);
        } else {
            m1146b(this.f670l);
        }
    }

    public void onLoaderReset(ig<Cursor> igVar) {
        if (!this.f656K) {
            this.f669k.mo190a(null);
        }
    }
}
