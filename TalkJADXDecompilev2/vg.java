package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class vg extends ut implements mw, xz {
    private boolean A;
    private ViewGroup B;
    private TextView C;
    private View D;
    private boolean E;
    private boolean F;
    private boolean G;
    private vq[] H;
    private vq I;
    private boolean J;
    private final Runnable K = new vh(this);
    private boolean L;
    private Rect M;
    private Rect N;
    private vt O;
    abu q;
    wx r;
    ActionBarContextView s;
    PopupWindow t;
    Runnable u;
    pn v = null;
    boolean w;
    int x;
    private vm y;
    private vr z;

    vg(Context context, Window window, ur urVar) {
        super(context, window, urVar);
    }

    public void a(Bundle bundle) {
        if ((this.e instanceof Activity) && fk.c((Activity) this.e) != null) {
            tp tpVar = this.h;
            if (tpVar == null) {
                this.L = true;
            } else {
                tpVar.f(true);
            }
        }
    }

    public void c() {
        s();
    }

    public void l() {
        s();
        if (this.j && this.h == null) {
            if (this.e instanceof Activity) {
                this.h = new we((Activity) this.e, this.k);
            } else if (this.e instanceof Dialog) {
                this.h = new we((Dialog) this.e);
            }
            if (this.h != null) {
                this.h.f(this.L);
            }
        }
    }

    public void a(Toolbar toolbar) {
        if (this.e instanceof Activity) {
            tp a = a();
            if (a instanceof we) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.i = null;
            if (a != null) {
                a.k();
            }
            if (toolbar != null) {
                tp vvVar = new vv(toolbar, ((Activity) this.c).getTitle(), this.f);
                this.h = vvVar;
                this.d.setCallback(vvVar.l());
            } else {
                this.h = null;
                this.d.setCallback(this.f);
            }
            g();
        }
    }

    public View a(int i) {
        s();
        return this.d.findViewById(i);
    }

    public void a(Configuration configuration) {
        if (this.j && this.A) {
            tp a = a();
            if (a != null) {
                a.a(configuration);
            }
        }
        aai.a().a(this.c);
        k();
    }

    public void e() {
        tp a = a();
        if (a != null) {
            a.g(false);
        }
    }

    public void f() {
        tp a = a();
        if (a != null) {
            a.g(true);
        }
    }

    public void a(View view) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.e.onContentChanged();
    }

    public void b(int i) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.c).inflate(i, viewGroup);
        this.e.onContentChanged();
    }

    public void a(View view, LayoutParams layoutParams) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.e.onContentChanged();
    }

    public void b(View view, LayoutParams layoutParams) {
        s();
        ((ViewGroup) this.B.findViewById(16908290)).addView(view, layoutParams);
        this.e.onContentChanged();
    }

    public void h() {
        super.h();
        if (this.h != null) {
            this.h.k();
        }
    }

    private void s() {
        if (!this.A) {
            TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(wi.af);
            if (obtainStyledAttributes.hasValue(wi.aj)) {
                View view;
                View view2;
                if (obtainStyledAttributes.getBoolean(wi.as, false)) {
                    c(1);
                } else if (obtainStyledAttributes.getBoolean(wi.aj, false)) {
                    c(108);
                }
                if (obtainStyledAttributes.getBoolean(wi.ak, false)) {
                    c(109);
                }
                if (obtainStyledAttributes.getBoolean(wi.al, false)) {
                    c(10);
                }
                this.m = obtainStyledAttributes.getBoolean(wi.ah, false);
                obtainStyledAttributes.recycle();
                this.d.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.c);
                if (this.n) {
                    if (this.l) {
                        view = (ViewGroup) from.inflate(gwb.ca, null);
                    } else {
                        view = (ViewGroup) from.inflate(gwb.bZ, null);
                    }
                    if (VERSION.SDK_INT >= 21) {
                        oa.a(view, new vi(this));
                        view2 = view;
                    } else {
                        ((ack) view).a(new acl(this));
                        view2 = view;
                    }
                } else if (this.m) {
                    r0 = (ViewGroup) from.inflate(gwb.bR, null);
                    this.k = false;
                    this.j = false;
                    view2 = r0;
                } else if (this.j) {
                    Context xaVar;
                    TypedValue typedValue = new TypedValue();
                    this.c.getTheme().resolveAttribute(gwb.v, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        xaVar = new xa(this.c, typedValue.resourceId);
                    } else {
                        xaVar = this.c;
                    }
                    r0 = (ViewGroup) LayoutInflater.from(xaVar).inflate(gwb.cb, null);
                    this.q = (abu) r0.findViewById(gwb.bx);
                    this.q.a(this.d.getCallback());
                    if (this.k) {
                        this.q.b(109);
                    }
                    if (this.E) {
                        this.q.b(2);
                    }
                    if (this.F) {
                        this.q.b(5);
                    }
                    view2 = r0;
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.j + ", windowActionBarOverlay: " + this.k + ", android:windowIsFloating: " + this.m + ", windowActionModeOverlay: " + this.l + ", windowNoTitle: " + this.n + " }");
                }
                CharSequence title;
                if (this.q == null) {
                    this.C = (TextView) view2.findViewById(gwb.bJ);
                }
                age.b(view2);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view2.findViewById(gwb.bk);
                ViewGroup viewGroup = (ViewGroup) this.d.findViewById(16908290);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout) viewGroup).setForeground(null);
                    }
                }
                this.d.setContentView(view2);
                contentFrameLayout.a(new abt(this));
                this.B = view2;
                if (this.e instanceof Activity) {
                    title = ((Activity) this.e).getTitle();
                } else {
                    title = this.o;
                }
                if (!TextUtils.isEmpty(title)) {
                    b(title);
                }
                contentFrameLayout = (ContentFrameLayout) this.B.findViewById(16908290);
                view = this.d.getDecorView();
                contentFrameLayout.a(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                TypedArray obtainStyledAttributes2 = this.c.obtainStyledAttributes(wi.af);
                obtainStyledAttributes2.getValue(wi.aq, contentFrameLayout.a());
                obtainStyledAttributes2.getValue(wi.ar, contentFrameLayout.b());
                if (obtainStyledAttributes2.hasValue(wi.ao)) {
                    obtainStyledAttributes2.getValue(wi.ao, contentFrameLayout.c());
                }
                if (obtainStyledAttributes2.hasValue(wi.ap)) {
                    obtainStyledAttributes2.getValue(wi.ap, contentFrameLayout.d());
                }
                if (obtainStyledAttributes2.hasValue(wi.am)) {
                    obtainStyledAttributes2.getValue(wi.am, contentFrameLayout.e());
                }
                if (obtainStyledAttributes2.hasValue(wi.an)) {
                    obtainStyledAttributes2.getValue(wi.an, contentFrameLayout.f());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout.requestLayout();
                this.A = true;
                vq g = g(0);
                if (!this.p) {
                    if (g == null || g.j == null) {
                        f(108);
                        return;
                    }
                    return;
                }
                return;
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    void b(CharSequence charSequence) {
        if (this.q != null) {
            this.q.a(charSequence);
        } else if (this.h != null) {
            this.h.c(charSequence);
        } else if (this.C != null) {
            this.C.setText(charSequence);
        }
    }

    void d(int i) {
        if (i == 108) {
            tp a = a();
            if (a != null) {
                a.h(false);
            }
        } else if (i == 0) {
            vq g = g(i);
            if (g.o) {
                a(g, false);
            }
        }
    }

    boolean e(int i) {
        if (i != 108) {
            return false;
        }
        tp a = a();
        if (a == null) {
            return true;
        }
        a.h(true);
        return true;
    }

    public wx b(wy wyVar) {
        if (this.r != null) {
            this.r.c();
        }
        wy vnVar = new vn(this, wyVar);
        tp a = a();
        if (a != null) {
            this.r = a.a(vnVar);
            if (!(this.r == null || this.g == null)) {
                this.g.a(this.r);
            }
        }
        if (this.r == null) {
            this.r = a(vnVar);
        }
        return this.r;
    }

    public void g() {
        tp a = a();
        if (a == null || !a.h()) {
            f(0);
        }
    }

    wx a(wy wyVar) {
        p();
        if (this.r != null) {
            this.r.c();
        }
        if (this.s == null) {
            if (this.m) {
                Context xaVar;
                TypedValue typedValue = new TypedValue();
                Theme theme = this.c.getTheme();
                theme.resolveAttribute(gwb.v, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Theme newTheme = this.c.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    xaVar = new xa(this.c, 0);
                    xaVar.getTheme().setTo(newTheme);
                } else {
                    xaVar = this.c;
                }
                this.s = new ActionBarContextView(xaVar);
                this.t = new PopupWindow(xaVar, null, gwb.y);
                sz.a(this.t, 2);
                this.t.setContentView(this.s);
                this.t.setWidth(-1);
                xaVar.getTheme().resolveAttribute(gwb.r, typedValue, true);
                this.s.a(TypedValue.complexToDimensionPixelSize(typedValue.data, xaVar.getResources().getDisplayMetrics()));
                this.t.setHeight(-2);
                this.u = new vj(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(gwb.bq);
                if (viewStubCompat != null) {
                    viewStubCompat.a(LayoutInflater.from(m()));
                    this.s = (ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.s != null) {
            boolean z;
            p();
            this.s.e();
            Context context = this.s.getContext();
            ActionBarContextView actionBarContextView = this.s;
            if (this.t == null) {
                z = true;
            } else {
                z = false;
            }
            wx xbVar = new xb(context, actionBarContextView, wyVar, z);
            if (wyVar.a(xbVar, xbVar.b())) {
                xbVar.d();
                this.s.a(xbVar);
                this.r = xbVar;
                if (o()) {
                    oa.c(this.s, 0.0f);
                    this.v = oa.m(this.s).a(1.0f);
                    this.v.a(new vl(this));
                } else {
                    oa.c(this.s, 1.0f);
                    this.s.setVisibility(0);
                    this.s.sendAccessibilityEvent(32);
                    if (this.s.getParent() != null) {
                        oa.o((View) this.s.getParent());
                    }
                }
                if (this.t != null) {
                    this.d.getDecorView().post(this.u);
                }
            } else {
                this.r = null;
            }
        }
        if (!(this.r == null || this.g == null)) {
            this.g.a(this.r);
        }
        return this.r;
    }

    final boolean o() {
        return this.A && this.B != null && oa.q(this.B);
    }

    void p() {
        if (this.v != null) {
            this.v.b();
        }
    }

    boolean q() {
        if (this.r != null) {
            this.r.c();
            return true;
        }
        tp a = a();
        if (a == null || !a.i()) {
            return false;
        }
        return true;
    }

    boolean a(int i, KeyEvent keyEvent) {
        tp a = a();
        if (a != null && a.a(i, keyEvent)) {
            return true;
        }
        if (this.I == null || !a(this.I, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.I == null) {
                vq g = g(0);
                a(g, keyEvent);
                boolean a2 = a(g, keyEvent.getKeyCode(), keyEvent, 1);
                g.m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        } else if (this.I == null) {
            return true;
        } else {
            this.I.n = true;
            return true;
        }
    }

    boolean a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.e.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? c(keyCode, keyEvent) : b(keyCode, keyEvent);
    }

    boolean b(int i, KeyEvent keyEvent) {
        boolean z;
        vq g;
        switch (i) {
            case 4:
                z = this.J;
                this.J = false;
                g = g(0);
                if (g != null && g.o) {
                    if (!z) {
                        a(g, true);
                    }
                    return true;
                } else if (q()) {
                    return true;
                }
                break;
            case 82:
                if (this.r == null) {
                    g = g(0);
                    if (this.q == null || !this.q.g() || om.a(ViewConfiguration.get(this.c))) {
                        if (g.o || g.n) {
                            z = g.o;
                            a(g, true);
                        } else {
                            if (g.m) {
                                if (g.r) {
                                    g.m = false;
                                    z = a(g, keyEvent);
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    b(g, keyEvent);
                                    z = true;
                                }
                            }
                            z = false;
                        }
                    } else if (this.q.h()) {
                        z = this.q.k();
                    } else {
                        if (!this.p && a(g, keyEvent)) {
                            z = this.q.j();
                        }
                        z = false;
                    }
                    if (z) {
                        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                        }
                    }
                }
                return true;
        }
        return false;
    }

    boolean c(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case 4:
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.J = z;
                break;
            case 82:
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                vq g = g(0);
                if (g.o) {
                    return true;
                }
                a(g, keyEvent);
                return true;
        }
        if (VERSION.SDK_INT < 11) {
            a(i, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View b(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
        r7 = this;
        r3 = 1;
        r4 = 0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 >= r1) goto L_0x0052;
    L_0x0008:
        r2 = r3;
    L_0x0009:
        r0 = r7.O;
        if (r0 != 0) goto L_0x0014;
    L_0x000d:
        r0 = new vt;
        r0.<init>();
        r7.O = r0;
    L_0x0014:
        if (r2 == 0) goto L_0x0075;
    L_0x0016:
        r0 = r8;
        r0 = (android.view.ViewParent) r0;
        if (r0 != 0) goto L_0x0054;
    L_0x001b:
        r0 = r4;
    L_0x001c:
        if (r0 == 0) goto L_0x0075;
    L_0x001e:
        r0 = r3;
    L_0x001f:
        r5 = r7.O;
        r1 = aga.a();
        if (r0 == 0) goto L_0x0161;
    L_0x0027:
        if (r8 == 0) goto L_0x0161;
    L_0x0029:
        r0 = r8.getContext();
    L_0x002d:
        r0 = defpackage.vt.a(r0, r11, r2, r3);
        if (r1 == 0) goto L_0x0037;
    L_0x0033:
        r0 = afm.a(r0);
    L_0x0037:
        r1 = 0;
        r2 = -1;
        r6 = r9.hashCode();
        switch(r6) {
            case -1946472170: goto L_0x00eb;
            case -1455429095: goto L_0x00c7;
            case -1346021293: goto L_0x00df;
            case -938935918: goto L_0x0077;
            case -937446323: goto L_0x00a8;
            case -658531749: goto L_0x00f7;
            case -339785223: goto L_0x009e;
            case 776382189: goto L_0x00bc;
            case 1125864064: goto L_0x0080;
            case 1413872058: goto L_0x00d3;
            case 1601505219: goto L_0x00b2;
            case 1666676343: goto L_0x0094;
            case 2001146706: goto L_0x008a;
            default: goto L_0x0040;
        };
    L_0x0040:
        r4 = r2;
    L_0x0041:
        switch(r4) {
            case 0: goto L_0x0103;
            case 1: goto L_0x010a;
            case 2: goto L_0x0111;
            case 3: goto L_0x0118;
            case 4: goto L_0x011f;
            case 5: goto L_0x0126;
            case 6: goto L_0x012d;
            case 7: goto L_0x0134;
            case 8: goto L_0x013b;
            case 9: goto L_0x0142;
            case 10: goto L_0x0149;
            case 11: goto L_0x0150;
            case 12: goto L_0x0157;
            default: goto L_0x0044;
        };
    L_0x0044:
        if (r1 != 0) goto L_0x015e;
    L_0x0046:
        if (r10 == r0) goto L_0x015e;
    L_0x0048:
        r0 = r5.a(r0, r9, r11);
    L_0x004c:
        if (r0 == 0) goto L_0x0051;
    L_0x004e:
        defpackage.vt.a(r0, r11);
    L_0x0051:
        return r0;
    L_0x0052:
        r2 = r4;
        goto L_0x0009;
    L_0x0054:
        r1 = r7.d;
        r5 = r1.getDecorView();
        r1 = r0;
    L_0x005b:
        if (r1 != 0) goto L_0x005f;
    L_0x005d:
        r0 = r3;
        goto L_0x001c;
    L_0x005f:
        if (r1 == r5) goto L_0x006e;
    L_0x0061:
        r0 = r1 instanceof android.view.View;
        if (r0 == 0) goto L_0x006e;
    L_0x0065:
        r0 = r1;
        r0 = (android.view.View) r0;
        r0 = defpackage.oa.s(r0);
        if (r0 == 0) goto L_0x0070;
    L_0x006e:
        r0 = r4;
        goto L_0x001c;
    L_0x0070:
        r1 = r1.getParent();
        goto L_0x005b;
    L_0x0075:
        r0 = r4;
        goto L_0x001f;
    L_0x0077:
        r3 = "TextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x007f:
        goto L_0x0041;
    L_0x0080:
        r4 = "ImageView";
        r4 = r9.equals(r4);
        if (r4 == 0) goto L_0x0040;
    L_0x0088:
        r4 = r3;
        goto L_0x0041;
    L_0x008a:
        r3 = "Button";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x0092:
        r4 = 2;
        goto L_0x0041;
    L_0x0094:
        r3 = "EditText";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x009c:
        r4 = 3;
        goto L_0x0041;
    L_0x009e:
        r3 = "Spinner";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00a6:
        r4 = 4;
        goto L_0x0041;
    L_0x00a8:
        r3 = "ImageButton";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00b0:
        r4 = 5;
        goto L_0x0041;
    L_0x00b2:
        r3 = "CheckBox";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00ba:
        r4 = 6;
        goto L_0x0041;
    L_0x00bc:
        r3 = "RadioButton";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00c4:
        r4 = 7;
        goto L_0x0041;
    L_0x00c7:
        r3 = "CheckedTextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00cf:
        r4 = 8;
        goto L_0x0041;
    L_0x00d3:
        r3 = "AutoCompleteTextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00db:
        r4 = 9;
        goto L_0x0041;
    L_0x00df:
        r3 = "MultiAutoCompleteTextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00e7:
        r4 = 10;
        goto L_0x0041;
    L_0x00eb:
        r3 = "RatingBar";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00f3:
        r4 = 11;
        goto L_0x0041;
    L_0x00f7:
        r3 = "SeekBar";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0040;
    L_0x00ff:
        r4 = 12;
        goto L_0x0041;
    L_0x0103:
        r1 = new abh;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x010a:
        r1 = new aap;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0111:
        r1 = new aae;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0118:
        r1 = new aam;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x011f:
        r1 = new aay;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0126:
        r1 = new aan;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x012d:
        r1 = new aaf;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0134:
        r1 = new aau;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x013b:
        r1 = new aag;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0142:
        r1 = new aab;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0149:
        r1 = new aaq;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0150:
        r1 = new aav;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x0157:
        r1 = new aaw;
        r1.<init>(r0, r11);
        goto L_0x0044;
    L_0x015e:
        r0 = r1;
        goto L_0x004c;
    L_0x0161:
        r0 = r10;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.b(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public void j() {
        LayoutInflater from = LayoutInflater.from(this.c);
        if (from.getFactory() == null) {
            mq.a(from, this);
        } else {
            mq.a.a(from);
        }
    }

    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        View a = a(str, context, attributeSet);
        return a != null ? a : b(view, str, context, attributeSet);
    }

    View a(String str, Context context, AttributeSet attributeSet) {
        if (this.e instanceof Factory) {
            View onCreateView = ((Factory) this.e).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(defpackage.vq r11, android.view.KeyEvent r12) {
        /*
        r10 = this;
        r1 = -1;
        r3 = 0;
        r2 = -2;
        r9 = 1;
        r0 = r11.o;
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r10.p;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r11.a;
        if (r0 != 0) goto L_0x0032;
    L_0x0011:
        r4 = r10.c;
        r0 = r4.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.screenLayout;
        r0 = r0 & 15;
        r5 = 4;
        if (r0 != r5) goto L_0x0048;
    L_0x0022:
        r0 = r9;
    L_0x0023:
        r4 = r4.getApplicationInfo();
        r4 = r4.targetSdkVersion;
        r5 = 11;
        if (r4 < r5) goto L_0x004a;
    L_0x002d:
        r4 = r9;
    L_0x002e:
        if (r0 == 0) goto L_0x0032;
    L_0x0030:
        if (r4 != 0) goto L_0x000c;
    L_0x0032:
        r0 = r10.d;
        r0 = r0.getCallback();
        if (r0 == 0) goto L_0x004c;
    L_0x003a:
        r4 = r11.a;
        r5 = r11.j;
        r0 = r0.onMenuOpened(r4, r5);
        if (r0 != 0) goto L_0x004c;
    L_0x0044:
        r10.a(r11, r9);
        goto L_0x000c;
    L_0x0048:
        r0 = r3;
        goto L_0x0023;
    L_0x004a:
        r4 = r3;
        goto L_0x002e;
    L_0x004c:
        r0 = r10.c;
        r4 = "window";
        r0 = r0.getSystemService(r4);
        r8 = r0;
        r8 = (android.view.WindowManager) r8;
        if (r8 == 0) goto L_0x000c;
    L_0x0059:
        r0 = r10.a(r11, r12);
        if (r0 == 0) goto L_0x000c;
    L_0x005f:
        r0 = r11.g;
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r11.q;
        if (r0 == 0) goto L_0x0127;
    L_0x0067:
        r0 = r11.g;
        if (r0 != 0) goto L_0x00f2;
    L_0x006b:
        r0 = r10.m();
        r11.a(r0);
        r0 = new vp;
        r1 = r11.l;
        r0.<init>(r10, r1);
        r11.g = r0;
        r0 = 81;
        r11.c = r0;
        r0 = r11.g;
        if (r0 == 0) goto L_0x000c;
    L_0x0083:
        r0 = r11.i;
        if (r0 == 0) goto L_0x0104;
    L_0x0087:
        r0 = r11.i;
        r11.h = r0;
        r0 = r9;
    L_0x008c:
        if (r0 == 0) goto L_0x000c;
    L_0x008e:
        r0 = r11.a();
        if (r0 == 0) goto L_0x000c;
    L_0x0094:
        r0 = r11.h;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x0139;
    L_0x009c:
        r0 = new android.view.ViewGroup$LayoutParams;
        r0.<init>(r2, r2);
        r1 = r0;
    L_0x00a2:
        r0 = r11.b;
        r4 = r11.g;
        r4.setBackgroundResource(r0);
        r0 = r11.h;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x00bc;
    L_0x00b1:
        r4 = r0 instanceof android.view.ViewGroup;
        if (r4 == 0) goto L_0x00bc;
    L_0x00b5:
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.h;
        r0.removeView(r4);
    L_0x00bc:
        r0 = r11.g;
        r4 = r11.h;
        r0.addView(r4, r1);
        r0 = r11.h;
        r0 = r0.hasFocus();
        if (r0 != 0) goto L_0x00d0;
    L_0x00cb:
        r0 = r11.h;
        r0.requestFocus();
    L_0x00d0:
        r1 = r2;
    L_0x00d1:
        r11.n = r3;
        r0 = new android.view.WindowManager$LayoutParams;
        r3 = r11.d;
        r4 = r11.e;
        r5 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r6 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r7 = -3;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.c;
        r0.gravity = r1;
        r1 = r11.f;
        r0.windowAnimations = r1;
        r1 = r11.g;
        r8.addView(r1, r0);
        r11.o = r9;
        goto L_0x000c;
    L_0x00f2:
        r0 = r11.q;
        if (r0 == 0) goto L_0x0083;
    L_0x00f6:
        r0 = r11.g;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x0083;
    L_0x00fe:
        r0 = r11.g;
        r0.removeAllViews();
        goto L_0x0083;
    L_0x0104:
        r0 = r11.j;
        if (r0 == 0) goto L_0x0124;
    L_0x0108:
        r0 = r10.z;
        if (r0 != 0) goto L_0x0113;
    L_0x010c:
        r0 = new vr;
        r0.<init>(r10);
        r10.z = r0;
    L_0x0113:
        r0 = r10.z;
        r0 = r11.a(r0);
        r0 = (android.view.View) r0;
        r11.h = r0;
        r0 = r11.h;
        if (r0 == 0) goto L_0x0124;
    L_0x0121:
        r0 = r9;
        goto L_0x008c;
    L_0x0124:
        r0 = r3;
        goto L_0x008c;
    L_0x0127:
        r0 = r11.i;
        if (r0 == 0) goto L_0x0137;
    L_0x012b:
        r0 = r11.i;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x0137;
    L_0x0133:
        r0 = r0.width;
        if (r0 == r1) goto L_0x00d1;
    L_0x0137:
        r1 = r2;
        goto L_0x00d1;
    L_0x0139:
        r1 = r0;
        goto L_0x00a2;
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.b(vq, android.view.KeyEvent):void");
    }

    void b(xy xyVar) {
        if (!this.G) {
            this.G = true;
            this.q.m();
            Callback callback = this.d.getCallback();
            if (!(callback == null || this.p)) {
                callback.onPanelClosed(108, xyVar);
            }
            this.G = false;
        }
    }

    void a(vq vqVar, boolean z) {
        if (z && vqVar.a == 0 && this.q != null && this.q.h()) {
            b(vqVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.c.getSystemService("window");
        if (!(windowManager == null || !vqVar.o || vqVar.g == null)) {
            windowManager.removeView(vqVar.g);
            if (z) {
                a(vqVar.a, vqVar, null);
            }
        }
        vqVar.m = false;
        vqVar.n = false;
        vqVar.o = false;
        vqVar.h = null;
        vqVar.q = true;
        if (this.I == vqVar) {
            this.I = null;
        }
    }

    void a(int i, vq vqVar, Menu menu) {
        if (menu == null) {
            if (vqVar == null && i >= 0 && i < this.H.length) {
                vqVar = this.H[i];
            }
            if (vqVar != null) {
                menu = vqVar.j;
            }
        }
        if ((vqVar == null || vqVar.o) && !this.p) {
            this.e.onPanelClosed(i, menu);
        }
    }

    vq a(Menu menu) {
        vq[] vqVarArr = this.H;
        int length = vqVarArr != null ? vqVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            vq vqVar = vqVarArr[i];
            if (vqVar != null && vqVar.j == menu) {
                return vqVar;
            }
        }
        return null;
    }

    protected vq g(int i) {
        Object obj = this.H;
        if (obj == null || obj.length <= i) {
            Object obj2 = new vq[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.H = obj2;
            obj = obj2;
        }
        vq vqVar = obj[i];
        if (vqVar != null) {
            return vqVar;
        }
        vqVar = new vq(i);
        obj[i] = vqVar;
        return vqVar;
    }

    private boolean a(vq vqVar, int i, KeyEvent keyEvent, int i2) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vqVar.m || a(vqVar, keyEvent)) && vqVar.j != null) {
            return vqVar.j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private void f(int i) {
        this.x |= 1 << i;
        if (!this.w) {
            oa.a(this.d.getDecorView(), this.K);
            this.w = true;
        }
    }

    public int h(int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (this.s == null || !(this.s.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.s.getLayoutParams();
            if (this.s.isShown()) {
                if (this.M == null) {
                    this.M = new Rect();
                    this.N = new Rect();
                }
                Rect rect = this.M;
                Rect rect2 = this.N;
                rect.set(0, i, 0, 0);
                age.a(this.B, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.D == null) {
                        this.D = new View(this.c);
                        this.D.setBackgroundColor(this.c.getResources().getColor(gwb.ag));
                        this.B.addView(this.D, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = this.D.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.D.setLayoutParams(layoutParams);
                        }
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                if (this.D == null) {
                    i3 = 0;
                }
                if (!(this.l || i3 == 0)) {
                    i = 0;
                }
                int i6 = i5;
                i5 = i3;
                i3 = i6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i5 = 0;
            } else {
                i3 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                this.s.setLayoutParams(marginLayoutParams);
            }
            i2 = i5;
        }
        if (this.D != null) {
            View view = this.D;
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }

    private void t() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void r() {
        if (this.q != null) {
            this.q.m();
        }
        if (this.t != null) {
            this.d.getDecorView().removeCallbacks(this.u);
            if (this.t.isShowing()) {
                try {
                    this.t.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.t = null;
        }
        p();
        vq g = g(0);
        if (g != null && g.j != null) {
            g.j.close();
        }
    }

    public boolean c(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.n && i == 108) {
            return false;
        }
        if (this.j && i == 1) {
            this.j = false;
        }
        switch (i) {
            case 1:
                t();
                this.n = true;
                return true;
            case 2:
                t();
                this.E = true;
                return true;
            case 5:
                t();
                this.F = true;
                return true;
            case 10:
                t();
                this.l = true;
                return true;
            case 108:
                t();
                this.j = true;
                return true;
            case 109:
                t();
                this.k = true;
                return true;
            default:
                return this.d.requestFeature(i);
        }
    }

    public boolean a(xy xyVar, MenuItem menuItem) {
        Callback callback = this.d.getCallback();
        if (!(callback == null || this.p)) {
            vq a = a(xyVar.r());
            if (a != null) {
                return callback.onMenuItemSelected(a.a, menuItem);
            }
        }
        return false;
    }

    public void a(xy xyVar) {
        if (this.q == null || !this.q.g() || (om.a(ViewConfiguration.get(this.c)) && !this.q.i())) {
            vq g = g(0);
            g.q = true;
            a(g, false);
            b(g, null);
            return;
        }
        Callback callback = this.d.getCallback();
        if (this.q.h()) {
            this.q.k();
            if (!this.p) {
                callback.onPanelClosed(108, g(0).j);
            }
        } else if (callback != null && !this.p) {
            if (this.w && (this.x & 1) != 0) {
                this.d.getDecorView().removeCallbacks(this.K);
                this.K.run();
            }
            vq g2 = g(0);
            if (g2.j != null && !g2.r && callback.onPreparePanel(0, g2.i, g2.j)) {
                callback.onMenuOpened(108, g2.j);
                this.q.j();
            }
        }
    }

    boolean a(vq vqVar, KeyEvent keyEvent) {
        if (this.p) {
            return false;
        }
        if (vqVar.m) {
            return true;
        }
        if (!(this.I == null || this.I == vqVar)) {
            a(this.I, false);
        }
        Callback callback = this.d.getCallback();
        if (callback != null) {
            vqVar.i = callback.onCreatePanelView(vqVar.a);
        }
        boolean z = vqVar.a == 0 || vqVar.a == 108;
        if (z && this.q != null) {
            this.q.l();
        }
        if (vqVar.i == null && !(z && (this.h instanceof vv))) {
            if (vqVar.j == null || vqVar.r) {
                if (vqVar.j == null) {
                    Context xaVar;
                    xy xyVar;
                    Context context = this.c;
                    if ((vqVar.a == 0 || vqVar.a == 108) && this.q != null) {
                        Theme newTheme;
                        TypedValue typedValue = new TypedValue();
                        Theme theme = context.getTheme();
                        theme.resolveAttribute(gwb.v, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme = context.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            newTheme.resolveAttribute(gwb.w, typedValue, true);
                        } else {
                            theme.resolveAttribute(gwb.w, typedValue, true);
                            newTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (newTheme == null) {
                                newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                            }
                            newTheme.applyStyle(typedValue.resourceId, true);
                        }
                        Theme theme2 = newTheme;
                        if (theme2 != null) {
                            xaVar = new xa(context, 0);
                            xaVar.getTheme().setTo(theme2);
                            xyVar = new xy(xaVar);
                            xyVar.a((xz) this);
                            vqVar.a(xyVar);
                            if (vqVar.j == null) {
                                return false;
                            }
                        }
                    }
                    xaVar = context;
                    xyVar = new xy(xaVar);
                    xyVar.a((xz) this);
                    vqVar.a(xyVar);
                    if (vqVar.j == null) {
                        return false;
                    }
                }
                if (z && this.q != null) {
                    if (this.y == null) {
                        this.y = new vm(this);
                    }
                    this.q.a(vqVar.j, this.y);
                }
                vqVar.j.g();
                if (callback.onCreatePanelMenu(vqVar.a, vqVar.j)) {
                    vqVar.r = false;
                } else {
                    vqVar.a(null);
                    if (!z || this.q == null) {
                        return false;
                    }
                    this.q.a(null, this.y);
                    return false;
                }
            }
            vqVar.j.g();
            if (vqVar.s != null) {
                vqVar.j.b(vqVar.s);
                vqVar.s = null;
            }
            if (callback.onPreparePanel(0, vqVar.i, vqVar.j)) {
                boolean z2;
                if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                vqVar.p = z2;
                vqVar.j.setQwertyMode(vqVar.p);
                vqVar.j.h();
            } else {
                if (z && this.q != null) {
                    this.q.a(null, this.y);
                }
                vqVar.j.h();
                return false;
            }
        }
        vqVar.m = true;
        vqVar.n = false;
        this.I = vqVar;
        return true;
    }
}
