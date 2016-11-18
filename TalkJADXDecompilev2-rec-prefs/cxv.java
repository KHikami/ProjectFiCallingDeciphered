package p000;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;
import java.util.ArrayList;
import java.util.List;

public final class cxv implements cxm {
    static final int f9274a = ba.kw;
    static final int f9275b = ba.kx;
    static final int f9276c = ba.kA;
    static final int f9277d = ba.ky;
    static final int f9278e = ba.kz;
    OnClickListener f9279A;
    volatile boolean f9280B = false;
    private final cyc f9281C = new cyc(this);
    private int f9282D;
    private LinearLayout f9283E;
    private Space f9284F;
    private float f9285G;
    private Menu f9286H;
    private SubMenu f9287I;
    private int f9288J = 0;
    private cxn f9289K;
    private jca f9290L;
    private final bbm f9291M;
    private final fzw f9292N;
    private int f9293O;
    private int f9294P = 0;
    Context f9295f;
    FloatingActionButton f9296g;
    View f9297h;
    FrameLayout f9298i;
    int f9299j;
    int f9300k;
    Dialog f9301l;
    QuickButtonContainer f9302m;
    cxl f9303n;
    cxl f9304o;
    eet f9305p;
    eew f9306q;
    eeu f9307r;
    eev f9308s;
    C0000a f9309t;
    MenuItem f9310u;
    MenuItem f9311v;
    MenuItem f9312w;
    MenuItem f9313x;
    MenuItem f9314y;
    List<OnClickListener> f9315z = new ArrayList();

    cxv(Context context) {
        this.f9295f = context;
        this.f9290L = (jca) jyn.m25426a(context, jca.class);
        this.f9290L.mo2318a(new cyb(this));
        this.f9291M = (bbm) jyn.m25426a(context, bbm.class);
        this.f9292N = (fzw) jyn.m25426a(context, fzw.class);
    }

    void m11249h() {
        if (this.f9292N.mo2146a(this.f9290L.mo2317a())) {
            this.f9305p = null;
            this.f9306q = null;
            this.f9307r = null;
            this.f9309t = null;
        } else {
            bef bef;
            this.f9305p = (eet) jyn.m25433b(this.f9295f, eet.class);
            this.f9306q = (eew) jyn.m25433b(this.f9295f, eew.class);
            if (gwb.m1923a(m11252l(), bnc.GROUP_CONVERSATIONS)) {
                if (!fdq.f12794j.m14370b(this.f9290L.mo2317a())) {
                    this.f9307r = (eeu) jyn.m25433b(this.f9295f, eeu.class);
                    bef = (bef) jyn.m25433b(this.f9295f, bef.class);
                    if (bef != null) {
                        this.f9290L.mo2317a();
                        this.f9309t = bef.m4998b();
                    }
                }
            }
            this.f9307r = null;
            bef = (bef) jyn.m25433b(this.f9295f, bef.class);
            if (bef != null) {
                this.f9290L.mo2317a();
                this.f9309t = bef.m4998b();
            }
        }
        if (this.f9291M.mo444d(this.f9290L.mo2317a())) {
            this.f9308s = (eev) jyn.m25433b(this.f9295f, eev.class);
        } else {
            this.f9308s = null;
        }
    }

    public void mo1461a(dw dwVar, ViewGroup viewGroup, Menu menu) {
        int a = this.f9295f.getResources().getDisplayMetrics().heightPixels - giw.m17749a(this.f9295f);
        int dimensionPixelSize = this.f9295f.getResources().getDimensionPixelSize(gwb.pw);
        int dimensionPixelSize2 = this.f9295f.getResources().getDimensionPixelSize(gwb.pw);
        int dimensionPixelSize3 = this.f9295f.getResources().getDimensionPixelSize(gwb.py);
        int dimensionPixelSize4 = this.f9295f.getResources().getDimensionPixelSize(gwb.pz);
        this.f9293O = (((a - dimensionPixelSize) - dimensionPixelSize2) - dimensionPixelSize4) / (dimensionPixelSize3 + dimensionPixelSize4);
        if (m11252l() == null) {
            glk.m17970a("Babel_FAB", "Not decorating since account is not yet available", new Object[0]);
        } else if (!this.f9292N.mo2146a(this.f9290L.mo2317a()) || this.f9291M.mo444d(this.f9290L.mo2317a())) {
            this.f9298i = (FrameLayout) viewGroup.findViewById(ba.bn);
            LayoutInflater layoutInflater = dwVar.getLayoutInflater();
            layoutInflater.inflate(ba.kC, this.f9298i, true);
            this.f9301l = new Dialog(this.f9295f, 16973833);
            Window window = this.f9301l.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            this.f9301l.setCancelable(false);
            this.f9301l.setOnKeyListener(new cxw(this));
            this.f9302m = (QuickButtonContainer) layoutInflater.inflate(ba.kE, null);
            this.f9302m.setOnClickListener(new cxx(this));
            window.setContentView(this.f9302m);
            this.f9284F = (Space) this.f9302m.findViewById(gwb.pA);
            List arrayList = new ArrayList();
            m11249h();
            arrayList.add(this.f9305p);
            arrayList.add(this.f9307r);
            arrayList.add(this.f9308s);
            arrayList.add(this.f9306q);
            arrayList.add(this.f9309t);
            m11226a(layoutInflater, this.f9302m, arrayList);
            this.f9297h = this.f9298i.findViewById(gwb.pC);
            this.f9296g = (FloatingActionButton) this.f9297h.findViewById(gwb.pB);
            this.f9296g.m8437a(new cxt(this));
            this.f9282D = this.f9296g.getResources().getDimensionPixelSize(gwb.pw);
            this.f9299j = 0;
            Display defaultDisplay = ((WindowManager) this.f9296g.getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            a = point.x;
            this.f9300k = ((a - this.f9282D) / 2) - this.f9296g.getResources().getDimensionPixelSize(gwb.pv);
            mo1457a(this.f9285G, false);
            this.f9296g.m8435a(this.f9302m.m8438a());
            this.f9296g.m8434a(this.f9302m.m8439b());
            if (menu != null && gld.m17937a(this.f9295f)) {
                this.f9286H = menu;
                this.f9287I = this.f9286H.addSubMenu(0, ba.eD, 0, gwb.pN);
                this.f9287I.setIcon(R$drawable.bI);
                gwb.m1790a(this.f9287I.getItem(), 2);
                m11249h();
                if (this.f9305p != null) {
                    this.f9310u = this.f9287I.add(this.f9305p.mo1878B());
                    this.f9310u.setOnMenuItemClickListener(this.f9281C);
                }
                if (this.f9306q != null) {
                    this.f9312w = this.f9287I.add(this.f9306q.mo1878B());
                    this.f9312w.setOnMenuItemClickListener(this.f9281C);
                }
                if (this.f9307r != null) {
                    this.f9311v = this.f9287I.add(this.f9307r.mo1878B());
                    this.f9311v.setOnMenuItemClickListener(this.f9281C);
                }
                if (this.f9308s != null) {
                    this.f9313x = this.f9287I.add(this.f9308s.mo1878B());
                    this.f9313x.setOnMenuItemClickListener(this.f9281C);
                }
                if (this.f9309t != null) {
                    this.f9314y = this.f9287I.add(this.f9309t.mo1878B());
                    this.f9314y.setOnMenuItemClickListener(this.f9281C);
                }
            }
        } else {
            glk.m17970a("Babel_FAB", "Not decorating since account is carrier sms on account but hangouts is not the sms app", new Object[0]);
        }
    }

    static int m11227b(int i) {
        if (i == f9274a || i == f9275b || i == f9276c) {
            return gwb.pN;
        }
        if (i == f9277d) {
            return gwb.pM;
        }
        if (i == f9278e) {
            return gwb.pO;
        }
        iil.m21870a("Content description is not ready for drawable ID: " + i);
        return 0;
    }

    public void mo1457a(float f, boolean z) {
        this.f9285G = f;
        if (this.f9298i != null) {
            if (z) {
                this.f9298i.animate().translationY(-1.0f * f);
            } else {
                this.f9298i.setY(-1.0f * f);
            }
        }
        if (this.f9284F == null) {
            return;
        }
        if (z && this.f9301l.isShowing()) {
            this.f9284F.startAnimation(new gke(this.f9284F, (int) f));
            return;
        }
        LayoutParams layoutParams = this.f9284F.getLayoutParams();
        layoutParams.height = (int) f;
        this.f9284F.setLayoutParams(layoutParams);
    }

    public void mo1456a() {
        m11242b(false);
        if (this.f9298i != null) {
            this.f9298i.removeAllViews();
            this.f9298i = null;
        }
        if (this.f9302m != null) {
            this.f9302m.removeAllViews();
            this.f9302m = null;
        }
        this.f9301l = null;
        this.f9296g = null;
        this.f9284F = null;
        if (this.f9287I != null) {
            this.f9287I.clear();
            this.f9286H.removeItem(this.f9287I.getItem().getItemId());
        }
        this.f9286H = null;
        this.f9287I = null;
        this.f9310u = null;
        this.f9311v = null;
        this.f9312w = null;
        this.f9313x = null;
    }

    private void m11226a(LayoutInflater layoutInflater, ViewGroup viewGroup, List<cxl> list) {
        this.f9283E = (LinearLayout) this.f9302m.findViewById(gwb.pF);
        this.f9294P = 0;
        boolean z = false;
        for (cxl cxl : list) {
            boolean z2;
            boolean z3;
            if (cxl != null) {
                View inflate;
                if (z) {
                    inflate = layoutInflater.inflate(ba.kD, this.f9302m, false);
                    this.f9283E.addView(inflate, 0);
                    this.f9294P++;
                    z2 = z;
                } else {
                    View findViewById = viewGroup.findViewById(gwb.pD);
                    this.f9304o = cxl;
                    z2 = true;
                    inflate = findViewById;
                }
                OnClickListener cxy = new cxy(this, cxl);
                ((TextView) inflate.findViewById(gwb.pG)).setText(cxl.mo1878B());
                ImageView imageView = (ImageView) inflate.findViewById(gwb.pE);
                if (imageView != null) {
                    imageView.setImageResource(cxl.mo1879C());
                }
                inflate.setOnClickListener(cxy);
                z3 = z2;
            } else {
                z3 = z;
            }
            if (this.f9294P == this.f9293O) {
                break;
            }
            z = z3;
        }
        if (this.f9304o == null) {
            int a = this.f9290L.mo2317a();
            int g = m11252l().m5638g();
            z2 = this.f9292N.mo2146a(a);
            glk.m17982e("Babel_FAB", "primaryAction == null; account_id: " + g + " carrier_sms_only: " + z2 + " sms: " + this.f9291M.mo444d(a), new Object[0]);
        }
        iil.m21875b("Primary action must be set at this point", this.f9304o);
    }

    public int m11250i() {
        if (this.f9289K == null || this.f9289K.mo495a() != 1) {
            return f9277d;
        }
        return f9278e;
    }

    public pc mo1463b() {
        return new cxz(this);
    }

    void m11230a(float f) {
        ((ViewGroup) this.f9296g.getParent()).setTranslationX(-f);
    }

    void m11240b(float f) {
        if (gld.m17938a(this.f9296g)) {
            ((ViewGroup) this.f9296g.getParent()).setTranslationX(f);
        } else {
            ((ViewGroup) this.f9296g.getParent()).setTranslationX(-f);
        }
    }

    public void mo1458a(int i) {
        this.f9288J = i;
        if (this.f9296g != null) {
            if (VERSION.SDK_INT >= 17) {
                m11240b(i == 1 ? (float) this.f9300k : (float) this.f9299j);
            } else {
                m11230a(i == 1 ? (float) this.f9300k : (float) this.f9299j);
            }
            if (i == 1) {
                this.f9297h.setVisibility(0);
                int i2 = m11250i();
                this.f9296g.m8432a(i2, cxv.m11227b(i2));
            } else if (gld.m17937a(this.f9295f)) {
                this.f9297h.setVisibility(4);
            } else {
                this.f9296g.m8432a(f9274a, cxv.m11227b(f9274a));
            }
        }
    }

    public void mo1459a(OnClickListener onClickListener) {
        this.f9315z.add(onClickListener);
    }

    public void mo1464b(OnClickListener onClickListener) {
        this.f9315z.remove(onClickListener);
    }

    public void mo1466c(OnClickListener onClickListener) {
        this.f9279A = onClickListener;
    }

    public void mo1460a(cxn cxn) {
        this.f9289K = cxn;
    }

    public void mo1465c() {
        if (this.f9288J == 1) {
            this.f9296g.m8431a(f9278e, cxv.m11227b(f9278e), cxu.f9271a);
        }
    }

    public void mo1467d() {
        if (this.f9288J == 1) {
            this.f9296g.m8432a(f9278e, cxv.m11227b(f9278e));
        }
    }

    public void mo1468e() {
        if (this.f9288J == 1) {
            this.f9296g.m8431a(f9277d, cxv.m11227b(f9277d), cxu.f9272b);
        }
    }

    public void mo1469f() {
        this.f9296g.callOnClick();
    }

    public boolean mo1470g() {
        if (this.f9302m == null || this.f9301l == null || !this.f9301l.isShowing()) {
            return false;
        }
        m11242b(false);
        return true;
    }

    static boolean m11228j() {
        return VERSION.SDK_INT >= 19;
    }

    void m11242b(boolean z) {
        if (this.f9296g != null) {
            this.f9296g.m8431a(f9274a, cxv.m11227b(f9274a), cxu.f9272b);
        }
        if (z && cxv.m11228j()) {
            m11236a(new cyj(1.0f, 0.0f));
            m11233a(255, 0);
            Handler handler = new Handler();
            this.f9280B = true;
            handler.postDelayed(new cya(this), (long) this.f9295f.getResources().getInteger(gwb.pL));
            return;
        }
        m11251k();
    }

    void m11251k() {
        if (this.f9301l != null && this.f9301l.isShowing()) {
            this.f9301l.dismiss();
            this.f9303n = null;
        }
        if (this.f9298i != null) {
            this.f9298i.setBackgroundResource(0);
        }
    }

    void m11236a(cxp cxp) {
        if (this.f9283E != null) {
            int i = this.f9294P;
            int integer = this.f9295f.getResources().getInteger(gwb.pK);
            int i2 = 0;
            int i3 = i;
            while (i2 < this.f9294P) {
                View childAt = this.f9283E.getChildAt(i2);
                TextView textView = (TextView) childAt.findViewById(gwb.pG);
                ImageView imageView = (ImageView) childAt.findViewById(gwb.pE);
                long j = (long) (i3 * integer);
                textView.startAnimation(cxp.mo1472a(this.f9295f, j));
                if (imageView != null) {
                    imageView.startAnimation(cxp.mo1472a(this.f9295f, j));
                }
                i2++;
                i3--;
            }
            ((TextView) this.f9283E.findViewById(gwb.pD).findViewById(gwb.pG)).startAnimation(cxp.mo1472a(this.f9295f, 0));
        }
    }

    void m11233a(int i, int i2) {
        if (this.f9298i != null) {
            int integer = this.f9295f.getResources().getInteger(gwb.pH);
            Drawable background = this.f9298i.getBackground();
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofInt("alpha", new int[]{i, i2});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(background, propertyValuesHolderArr);
            ofPropertyValuesHolder.setDuration((long) integer);
            ofPropertyValuesHolder.setInterpolator(new rk());
            ofPropertyValuesHolder.start();
        }
    }

    public void mo1462a(boolean z) {
        if (this.f9298i != null) {
            this.f9298i.setVisibility(z ? 0 : 4);
        }
    }

    bko m11252l() {
        return fde.m15018e(this.f9290L.mo2317a());
    }
}
