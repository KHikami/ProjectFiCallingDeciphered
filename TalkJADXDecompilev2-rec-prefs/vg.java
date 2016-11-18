package p000;

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
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class vg extends ut implements mw, xz {
    private boolean f35325A;
    private ViewGroup f35326B;
    private TextView f35327C;
    private View f35328D;
    private boolean f35329E;
    private boolean f35330F;
    private boolean f35331G;
    private vq[] f35332H;
    private vq f35333I;
    private boolean f35334J;
    private final Runnable f35335K = new vh(this);
    private boolean f35336L;
    private Rect f35337M;
    private Rect f35338N;
    private vt f35339O;
    abu f35340q;
    wx f35341r;
    ActionBarContextView f35342s;
    PopupWindow f35343t;
    Runnable f35344u;
    pn f35345v = null;
    boolean f35346w;
    int f35347x;
    private vm f35348y;
    private vr f35349z;

    vg(Context context, Window window, ur urVar) {
        super(context, window, urVar);
    }

    public void mo4413a(Bundle bundle) {
        if ((this.e instanceof Activity) && fk.c((Activity) this.e) != null) {
            tp tpVar = this.f35311h;
            if (tpVar == null) {
                this.f35336L = true;
            } else {
                tpVar.mo4471f(true);
            }
        }
    }

    public void mo4424c() {
        m40972s();
    }

    public void mo4431l() {
        m40972s();
        if (this.j && this.h == null) {
            if (this.e instanceof Activity) {
                this.h = new we((Activity) this.e, this.k);
            } else if (this.e instanceof Dialog) {
                this.h = new we((Dialog) this.e);
            }
            if (this.h != null) {
                this.h.mo4471f(this.f35336L);
            }
        }
    }

    public void mo4414a(Toolbar toolbar) {
        if (this.e instanceof Activity) {
            tp a = mo4394a();
            if (a instanceof we) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.i = null;
            if (a != null) {
                a.mo4477k();
            }
            if (toolbar != null) {
                tp vvVar = new vv(toolbar, ((Activity) this.c).getTitle(), this.f);
                this.h = vvVar;
                this.d.setCallback(vvVar.m41094l());
            } else {
                this.h = null;
                this.d.setCallback(this.f);
            }
            mo4429g();
        }
    }

    public View mo4410a(int i) {
        m40972s();
        return this.d.findViewById(i);
    }

    public void mo4412a(Configuration configuration) {
        if (this.j && this.f35325A) {
            tp a = mo4394a();
            if (a != null) {
                a.mo4450a(configuration);
            }
        }
        aai.a().a(this.c);
        mo4402k();
    }

    public void mo4399e() {
        tp a = mo4394a();
        if (a != null) {
            a.mo4472g(false);
        }
    }

    public void mo4428f() {
        tp a = mo4394a();
        if (a != null) {
            a.mo4472g(true);
        }
    }

    public void mo4415a(View view) {
        m40972s();
        ViewGroup viewGroup = (ViewGroup) this.f35326B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.e.onContentChanged();
    }

    public void mo4421b(int i) {
        m40972s();
        ViewGroup viewGroup = (ViewGroup) this.f35326B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.c).inflate(i, viewGroup);
        this.e.onContentChanged();
    }

    public void mo4416a(View view, LayoutParams layoutParams) {
        m40972s();
        ViewGroup viewGroup = (ViewGroup) this.f35326B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.e.onContentChanged();
    }

    public void mo4422b(View view, LayoutParams layoutParams) {
        m40972s();
        ((ViewGroup) this.f35326B.findViewById(16908290)).addView(view, layoutParams);
        this.e.onContentChanged();
    }

    public void mo4400h() {
        super.mo4400h();
        if (this.h != null) {
            this.h.mo4477k();
        }
    }

    private void m40972s() {
        if (!this.f35325A) {
            TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(wi.af);
            if (obtainStyledAttributes.hasValue(wi.aj)) {
                View view;
                View view2;
                if (obtainStyledAttributes.getBoolean(wi.as, false)) {
                    mo4425c(1);
                } else if (obtainStyledAttributes.getBoolean(wi.aj, false)) {
                    mo4425c(108);
                }
                if (obtainStyledAttributes.getBoolean(wi.ak, false)) {
                    mo4425c(109);
                }
                if (obtainStyledAttributes.getBoolean(wi.al, false)) {
                    mo4425c(10);
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
                        oa.m37339a(view, new vi(this));
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
                    this.f35340q = (abu) r0.findViewById(gwb.bx);
                    this.f35340q.a(this.f35307d.getCallback());
                    if (this.k) {
                        this.f35340q.b(109);
                    }
                    if (this.f35329E) {
                        this.f35340q.b(2);
                    }
                    if (this.f35330F) {
                        this.f35340q.b(5);
                    }
                    view2 = r0;
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.j + ", windowActionBarOverlay: " + this.k + ", android:windowIsFloating: " + this.m + ", windowActionModeOverlay: " + this.l + ", windowNoTitle: " + this.n + " }");
                }
                CharSequence title;
                if (this.f35340q == null) {
                    this.f35327C = (TextView) view2.findViewById(gwb.bJ);
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
                this.f35326B = view2;
                if (this.f35308e instanceof Activity) {
                    title = ((Activity) this.f35308e).getTitle();
                } else {
                    title = this.f35318o;
                }
                if (!TextUtils.isEmpty(title)) {
                    mo4423b(title);
                }
                contentFrameLayout = (ContentFrameLayout) this.f35326B.findViewById(16908290);
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
                this.f35325A = true;
                vq g = m41005g(0);
                if (!this.f35319p) {
                    if (g == null || g.f35386j == null) {
                        mo4434f(108);
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

    void mo4423b(CharSequence charSequence) {
        if (this.f35340q != null) {
            this.f35340q.a(charSequence);
        } else if (this.f35311h != null) {
            this.f35311h.mo4465c(charSequence);
        } else if (this.f35327C != null) {
            this.f35327C.setText(charSequence);
        }
    }

    void mo4426d(int i) {
        if (i == 108) {
            tp a = mo4394a();
            if (a != null) {
                a.mo4473h(false);
            }
        } else if (i == 0) {
            vq g = m41005g(i);
            if (g.f35391o) {
                m40985a(g, false);
            }
        }
    }

    boolean mo4427e(int i) {
        if (i != 108) {
            return false;
        }
        tp a = mo4394a();
        if (a == null) {
            return true;
        }
        a.mo4473h(true);
        return true;
    }

    public wx m40992b(wy wyVar) {
        if (this.f35341r != null) {
            this.f35341r.mo4495c();
        }
        wy vnVar = new vn(this, wyVar);
        tp a = mo4394a();
        if (a != null) {
            this.f35341r = a.mo4479a(vnVar);
            if (!(this.f35341r == null || this.g == null)) {
                this.g.a(this.f35341r);
            }
        }
        if (this.f35341r == null) {
            this.f35341r = mo4411a(vnVar);
        }
        return this.f35341r;
    }

    public void mo4429g() {
        tp a = mo4394a();
        if (a == null || !a.mo4474h()) {
            mo4434f(0);
        }
    }

    wx mo4411a(wy wyVar) {
        m41012p();
        if (this.f35341r != null) {
            this.f35341r.mo4495c();
        }
        if (this.f35342s == null) {
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
                this.f35342s = new ActionBarContextView(xaVar);
                this.f35343t = new PopupWindow(xaVar, null, gwb.y);
                sz.m40685a(this.f35343t, 2);
                this.f35343t.setContentView(this.f35342s);
                this.f35343t.setWidth(-1);
                xaVar.getTheme().resolveAttribute(gwb.r, typedValue, true);
                this.f35342s.a(TypedValue.complexToDimensionPixelSize(typedValue.data, xaVar.getResources().getDisplayMetrics()));
                this.f35343t.setHeight(-2);
                this.f35344u = new vj(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.f35326B.findViewById(gwb.bq);
                if (viewStubCompat != null) {
                    viewStubCompat.a(LayoutInflater.from(m40960m()));
                    this.f35342s = (ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.f35342s != null) {
            boolean z;
            m41012p();
            this.f35342s.e();
            Context context = this.f35342s.getContext();
            ActionBarContextView actionBarContextView = this.f35342s;
            if (this.f35343t == null) {
                z = true;
            } else {
                z = false;
            }
            wx xbVar = new xb(context, actionBarContextView, wyVar, z);
            if (wyVar.mo4444a(xbVar, xbVar.mo4492b())) {
                xbVar.mo4496d();
                this.f35342s.a(xbVar);
                this.f35341r = xbVar;
                if (m41011o()) {
                    oa.m37348c(this.f35342s, 0.0f);
                    this.f35345v = oa.m37366m(this.f35342s).m40272a(1.0f);
                    this.f35345v.m40275a(new vl(this));
                } else {
                    oa.m37348c(this.f35342s, 1.0f);
                    this.f35342s.setVisibility(0);
                    this.f35342s.sendAccessibilityEvent(32);
                    if (this.f35342s.getParent() != null) {
                        oa.m37368o((View) this.f35342s.getParent());
                    }
                }
                if (this.f35343t != null) {
                    this.d.getDecorView().post(this.f35344u);
                }
            } else {
                this.f35341r = null;
            }
        }
        if (!(this.f35341r == null || this.g == null)) {
            this.g.a(this.f35341r);
        }
        return this.f35341r;
    }

    final boolean m41011o() {
        return this.f35325A && this.f35326B != null && oa.m37370q(this.f35326B);
    }

    void m41012p() {
        if (this.f35345v != null) {
            this.f35345v.m40279b();
        }
    }

    boolean m41013q() {
        if (this.f35341r != null) {
            this.f35341r.mo4495c();
            return true;
        }
        tp a = mo4394a();
        if (a == null || !a.mo4475i()) {
            return false;
        }
        return true;
    }

    boolean mo4418a(int i, KeyEvent keyEvent) {
        tp a = mo4394a();
        if (a != null && a.mo4456a(i, keyEvent)) {
            return true;
        }
        if (this.f35333I == null || !m40969a(this.f35333I, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f35333I == null) {
                vq g = m41005g(0);
                m40989a(g, keyEvent);
                boolean a2 = m40969a(g, keyEvent.getKeyCode(), keyEvent, 1);
                g.f35389m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        } else if (this.f35333I == null) {
            return true;
        } else {
            this.f35333I.f35390n = true;
            return true;
        }
    }

    boolean mo4419a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.e.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m41000c(keyCode, keyEvent) : m40997b(keyCode, keyEvent);
    }

    boolean m40997b(int i, KeyEvent keyEvent) {
        boolean z;
        vq g;
        switch (i) {
            case 4:
                z = this.f35334J;
                this.f35334J = false;
                g = m41005g(0);
                if (g != null && g.f35391o) {
                    if (!z) {
                        m40985a(g, true);
                    }
                    return true;
                } else if (m41013q()) {
                    return true;
                }
                break;
            case 82:
                if (this.f35341r == null) {
                    g = m41005g(0);
                    if (this.f35340q == null || !this.f35340q.g() || om.m38703a(ViewConfiguration.get(this.c))) {
                        if (g.f35391o || g.f35390n) {
                            z = g.f35391o;
                            m40985a(g, true);
                        } else {
                            if (g.f35389m) {
                                if (g.f35394r) {
                                    g.f35389m = false;
                                    z = m40989a(g, keyEvent);
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    m40970b(g, keyEvent);
                                    z = true;
                                }
                            }
                            z = false;
                        }
                    } else if (this.f35340q.h()) {
                        z = this.f35340q.k();
                    } else {
                        if (!this.f35319p && m40989a(g, keyEvent)) {
                            z = this.f35340q.j();
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

    boolean m41000c(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case 4:
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.f35334J = z;
                break;
            case 82:
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                vq g = m41005g(0);
                if (g.f35391o) {
                    return true;
                }
                m40989a(g, keyEvent);
                return true;
        }
        if (VERSION.SDK_INT < 11) {
            mo4418a(i, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public View m40991b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        vt vtVar;
        boolean a;
        Context context2;
        View view2;
        View view3;
        boolean z2 = false;
        boolean z3 = VERSION.SDK_INT < 21;
        if (this.f35339O == null) {
            this.f35339O = new vt();
        }
        if (z3) {
            ViewParent viewParent = (ViewParent) view;
            if (viewParent == null) {
                z = false;
            } else {
                ViewParent decorView = this.d.getDecorView();
                ViewParent viewParent2 = viewParent;
                while (viewParent2 != null) {
                    if (viewParent2 == decorView || !(viewParent2 instanceof View) || oa.m37372s((View) viewParent2)) {
                        z = false;
                        break;
                    }
                    viewParent2 = viewParent2.getParent();
                }
                z = true;
            }
            if (z) {
                z = true;
                vtVar = this.f35339O;
                a = aga.a();
                if (z || view == null) {
                    context2 = context;
                } else {
                    context2 = view.getContext();
                }
                context2 = vt.m41056a(context2, attributeSet, z3, true);
                if (a) {
                    context2 = afm.a(context2);
                }
                view2 = null;
                switch (str.hashCode()) {
                    case -1946472170:
                        if (str.equals("RatingBar")) {
                            z2 = true;
                            break;
                        }
                    case -1455429095:
                        if (str.equals("CheckedTextView")) {
                            z2 = true;
                            break;
                        }
                    case -1346021293:
                        if (str.equals("MultiAutoCompleteTextView")) {
                            z2 = true;
                            break;
                        }
                    case -938935918:
                        if (str.equals("TextView")) {
                            break;
                        }
                    case -937446323:
                        if (str.equals("ImageButton")) {
                            z2 = true;
                            break;
                        }
                    case -658531749:
                        if (str.equals("SeekBar")) {
                            z2 = true;
                            break;
                        }
                    case -339785223:
                        if (str.equals("Spinner")) {
                            z2 = true;
                            break;
                        }
                    case 776382189:
                        if (str.equals("RadioButton")) {
                            z2 = true;
                            break;
                        }
                    case 1125864064:
                        if (str.equals("ImageView")) {
                            z2 = true;
                            break;
                        }
                    case 1413872058:
                        if (str.equals("AutoCompleteTextView")) {
                            z2 = true;
                            break;
                        }
                    case 1601505219:
                        if (str.equals("CheckBox")) {
                            z2 = true;
                            break;
                        }
                    case 1666676343:
                        if (str.equals("EditText")) {
                            z2 = true;
                            break;
                        }
                    case 2001146706:
                        if (str.equals("Button")) {
                            z2 = true;
                            break;
                        }
                    default:
                        z2 = true;
                        break;
                }
                switch (z2) {
                    case false:
                        view2 = new abh(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aap(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aae(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aam(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aay(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aan(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aaf(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aau(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aag(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aab(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aaq(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aav(context2, attributeSet);
                        break;
                    case true:
                        view2 = new aaw(context2, attributeSet);
                        break;
                }
                if (view2 == null || context == context2) {
                    view3 = view2;
                } else {
                    view3 = vtVar.m41059a(context2, str, attributeSet);
                }
                if (view3 != null) {
                    vt.m41058a(view3, attributeSet);
                }
                return view3;
            }
        }
        z = false;
        vtVar = this.f35339O;
        a = aga.a();
        if (z) {
        }
        context2 = context;
        context2 = vt.m41056a(context2, attributeSet, z3, true);
        if (a) {
            context2 = afm.a(context2);
        }
        view2 = null;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    z2 = true;
                    break;
                }
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    z2 = true;
                    break;
                }
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    z2 = true;
                    break;
                }
            case -938935918:
                if (str.equals("TextView")) {
                    break;
                }
            case -937446323:
                if (str.equals("ImageButton")) {
                    z2 = true;
                    break;
                }
            case -658531749:
                if (str.equals("SeekBar")) {
                    z2 = true;
                    break;
                }
            case -339785223:
                if (str.equals("Spinner")) {
                    z2 = true;
                    break;
                }
            case 776382189:
                if (str.equals("RadioButton")) {
                    z2 = true;
                    break;
                }
            case 1125864064:
                if (str.equals("ImageView")) {
                    z2 = true;
                    break;
                }
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    z2 = true;
                    break;
                }
            case 1601505219:
                if (str.equals("CheckBox")) {
                    z2 = true;
                    break;
                }
            case 1666676343:
                if (str.equals("EditText")) {
                    z2 = true;
                    break;
                }
            case 2001146706:
                if (str.equals("Button")) {
                    z2 = true;
                    break;
                }
            default:
                z2 = true;
                break;
        }
        switch (z2) {
            case false:
                view2 = new abh(context2, attributeSet);
                break;
            case true:
                view2 = new aap(context2, attributeSet);
                break;
            case true:
                view2 = new aae(context2, attributeSet);
                break;
            case true:
                view2 = new aam(context2, attributeSet);
                break;
            case true:
                view2 = new aay(context2, attributeSet);
                break;
            case true:
                view2 = new aan(context2, attributeSet);
                break;
            case true:
                view2 = new aaf(context2, attributeSet);
                break;
            case true:
                view2 = new aau(context2, attributeSet);
                break;
            case true:
                view2 = new aag(context2, attributeSet);
                break;
            case true:
                view2 = new aab(context2, attributeSet);
                break;
            case true:
                view2 = new aaq(context2, attributeSet);
                break;
            case true:
                view2 = new aav(context2, attributeSet);
                break;
            case true:
                view2 = new aaw(context2, attributeSet);
                break;
        }
        if (view2 == null) {
        }
        view3 = view2;
        if (view3 != null) {
            vt.m41058a(view3, attributeSet);
        }
        return view3;
    }

    public void mo4430j() {
        LayoutInflater from = LayoutInflater.from(this.c);
        if (from.getFactory() == null) {
            mq.a(from, this);
        } else {
            mq.a.a(from);
        }
    }

    public final View m40975a(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo4432a(str, context, attributeSet);
        return a != null ? a : m40991b(view, str, context, attributeSet);
    }

    View mo4432a(String str, Context context, AttributeSet attributeSet) {
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
    private void m40970b(vq vqVar, KeyEvent keyEvent) {
        int i = -1;
        if (!vqVar.f35391o && !this.f35319p) {
            boolean z;
            if (vqVar.f35377a == 0) {
                Context context = this.c;
                z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
                boolean z2;
                if (context.getApplicationInfo().targetSdkVersion >= 11) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && r4) {
                    return;
                }
            }
            Callback callback = this.f35307d.getCallback();
            if (callback == null || callback.onMenuOpened(vqVar.f35377a, vqVar.f35386j)) {
                WindowManager windowManager = (WindowManager) this.c.getSystemService("window");
                if (windowManager != null && m40989a(vqVar, keyEvent)) {
                    LayoutParams layoutParams;
                    if (vqVar.f35383g == null || vqVar.f35393q) {
                        if (vqVar.f35383g == null) {
                            vqVar.m41051a(m40960m());
                            vqVar.f35383g = new vp(this, vqVar.f35388l);
                            vqVar.f35379c = 81;
                            if (vqVar.f35383g == null) {
                                return;
                            }
                        } else if (vqVar.f35393q && vqVar.f35383g.getChildCount() > 0) {
                            vqVar.f35383g.removeAllViews();
                        }
                        if (vqVar.f35385i != null) {
                            vqVar.f35384h = vqVar.f35385i;
                            z = true;
                        } else {
                            if (vqVar.f35386j != null) {
                                if (this.f35349z == null) {
                                    this.f35349z = new vr(this);
                                }
                                vqVar.f35384h = (View) vqVar.m41050a(this.f35349z);
                                if (vqVar.f35384h != null) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z && vqVar.m41053a()) {
                            LayoutParams layoutParams2;
                            layoutParams = vqVar.f35384h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams2 = new LayoutParams(-2, -2);
                            } else {
                                layoutParams2 = layoutParams;
                            }
                            vqVar.f35383g.setBackgroundResource(vqVar.f35378b);
                            ViewParent parent = vqVar.f35384h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(vqVar.f35384h);
                            }
                            vqVar.f35383g.addView(vqVar.f35384h, layoutParams2);
                            if (!vqVar.f35384h.hasFocus()) {
                                vqVar.f35384h.requestFocus();
                            }
                            i = -2;
                        } else {
                            return;
                        }
                    }
                    if (vqVar.f35385i != null) {
                        layoutParams = vqVar.f35385i.getLayoutParams();
                        if (layoutParams != null) {
                        }
                    }
                    i = -2;
                    vqVar.f35390n = false;
                    layoutParams = new WindowManager.LayoutParams(i, -2, vqVar.f35380d, vqVar.f35381e, 1002, 8519680, -3);
                    layoutParams.gravity = vqVar.f35379c;
                    layoutParams.windowAnimations = vqVar.f35382f;
                    windowManager.addView(vqVar.f35383g, layoutParams);
                    vqVar.f35391o = true;
                    return;
                }
                return;
            }
            m40985a(vqVar, true);
        }
    }

    void m40996b(xy xyVar) {
        if (!this.f35331G) {
            this.f35331G = true;
            this.f35340q.m();
            Callback callback = this.f35307d.getCallback();
            if (!(callback == null || this.f35319p)) {
                callback.onPanelClosed(108, xyVar);
            }
            this.f35331G = false;
        }
    }

    void m40985a(vq vqVar, boolean z) {
        if (z && vqVar.f35377a == 0 && this.f35340q != null && this.f35340q.h()) {
            m40996b(vqVar.f35386j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.c.getSystemService("window");
        if (!(windowManager == null || !vqVar.f35391o || vqVar.f35383g == null)) {
            windowManager.removeView(vqVar.f35383g);
            if (z) {
                m40979a(vqVar.f35377a, vqVar, null);
            }
        }
        vqVar.f35389m = false;
        vqVar.f35390n = false;
        vqVar.f35391o = false;
        vqVar.f35384h = null;
        vqVar.f35393q = true;
        if (this.f35333I == vqVar) {
            this.f35333I = null;
        }
    }

    void m40979a(int i, vq vqVar, Menu menu) {
        if (menu == null) {
            if (vqVar == null && i >= 0 && i < this.f35332H.length) {
                vqVar = this.f35332H[i];
            }
            if (vqVar != null) {
                menu = vqVar.f35386j;
            }
        }
        if ((vqVar == null || vqVar.f35391o) && !this.f35319p) {
            this.e.onPanelClosed(i, menu);
        }
    }

    vq m40977a(Menu menu) {
        vq[] vqVarArr = this.f35332H;
        int length = vqVarArr != null ? vqVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            vq vqVar = vqVarArr[i];
            if (vqVar != null && vqVar.f35386j == menu) {
                return vqVar;
            }
        }
        return null;
    }

    protected vq m41005g(int i) {
        Object obj = this.f35332H;
        if (obj == null || obj.length <= i) {
            Object obj2 = new vq[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f35332H = obj2;
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

    private boolean m40969a(vq vqVar, int i, KeyEvent keyEvent, int i2) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vqVar.f35389m || m40989a(vqVar, keyEvent)) && vqVar.f35386j != null) {
            return vqVar.f35386j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private void mo4434f(int i) {
        this.f35347x |= 1 << i;
        if (!this.f35346w) {
            oa.m37336a(this.d.getDecorView(), this.f35335K);
            this.f35346w = true;
        }
    }

    public int m41007h(int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (this.f35342s == null || !(this.f35342s.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f35342s.getLayoutParams();
            if (this.f35342s.isShown()) {
                if (this.f35337M == null) {
                    this.f35337M = new Rect();
                    this.f35338N = new Rect();
                }
                Rect rect = this.f35337M;
                Rect rect2 = this.f35338N;
                rect.set(0, i, 0, 0);
                age.a(this.f35326B, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f35328D == null) {
                        this.f35328D = new View(this.c);
                        this.f35328D.setBackgroundColor(this.c.getResources().getColor(gwb.ag));
                        this.f35326B.addView(this.f35328D, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = this.f35328D.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f35328D.setLayoutParams(layoutParams);
                        }
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                if (this.f35328D == null) {
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
                this.f35342s.setLayoutParams(marginLayoutParams);
            }
            i2 = i5;
        }
        if (this.f35328D != null) {
            View view = this.f35328D;
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }

    private void m40973t() {
        if (this.f35325A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public void m41014r() {
        if (this.f35340q != null) {
            this.f35340q.m();
        }
        if (this.f35343t != null) {
            this.d.getDecorView().removeCallbacks(this.f35344u);
            if (this.f35343t.isShowing()) {
                try {
                    this.f35343t.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f35343t = null;
        }
        m41012p();
        vq g = m41005g(0);
        if (g != null && g.f35386j != null) {
            g.f35386j.close();
        }
    }

    public boolean mo4425c(int i) {
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
                m40973t();
                this.n = true;
                return true;
            case 2:
                m40973t();
                this.f35329E = true;
                return true;
            case 5:
                m40973t();
                this.f35330F = true;
                return true;
            case 10:
                m40973t();
                this.l = true;
                return true;
            case 108:
                m40973t();
                this.j = true;
                return true;
            case 109:
                m40973t();
                this.k = true;
                return true;
            default:
                return this.d.requestFeature(i);
        }
    }

    public boolean mo4420a(xy xyVar, MenuItem menuItem) {
        Callback callback = this.f35307d.getCallback();
        if (!(callback == null || this.f35319p)) {
            vq a = m40977a(xyVar.mo4541r());
            if (a != null) {
                return callback.onMenuItemSelected(a.f35377a, menuItem);
            }
        }
        return false;
    }

    public void mo4417a(xy xyVar) {
        if (this.f35340q == null || !this.f35340q.g() || (om.m38703a(ViewConfiguration.get(this.c)) && !this.f35340q.i())) {
            vq g = m41005g(0);
            g.f35393q = true;
            m40985a(g, false);
            m40970b(g, null);
            return;
        }
        Callback callback = this.f35307d.getCallback();
        if (this.f35340q.h()) {
            this.f35340q.k();
            if (!this.f35319p) {
                callback.onPanelClosed(108, m41005g(0).f35386j);
            }
        } else if (callback != null && !this.f35319p) {
            if (this.f35346w && (this.f35347x & 1) != 0) {
                this.d.getDecorView().removeCallbacks(this.f35335K);
                this.f35335K.run();
            }
            vq g2 = m41005g(0);
            if (g2.f35386j != null && !g2.f35394r && callback.onPreparePanel(0, g2.f35385i, g2.f35386j)) {
                callback.onMenuOpened(108, g2.f35386j);
                this.f35340q.j();
            }
        }
    }

    boolean m40989a(vq vqVar, KeyEvent keyEvent) {
        if (this.f35319p) {
            return false;
        }
        if (vqVar.f35389m) {
            return true;
        }
        if (!(this.f35333I == null || this.f35333I == vqVar)) {
            m40985a(this.f35333I, false);
        }
        Callback callback = this.f35307d.getCallback();
        if (callback != null) {
            vqVar.f35385i = callback.onCreatePanelView(vqVar.f35377a);
        }
        boolean z = vqVar.f35377a == 0 || vqVar.f35377a == 108;
        if (z && this.f35340q != null) {
            this.f35340q.l();
        }
        if (vqVar.f35385i == null && !(z && (this.f35311h instanceof vv))) {
            if (vqVar.f35386j == null || vqVar.f35394r) {
                if (vqVar.f35386j == null) {
                    Context xaVar;
                    xy xyVar;
                    Context context = this.c;
                    if ((vqVar.f35377a == 0 || vqVar.f35377a == 108) && this.f35340q != null) {
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
                            xyVar.mo4535a((xz) this);
                            vqVar.m41052a(xyVar);
                            if (vqVar.f35386j == null) {
                                return false;
                            }
                        }
                    }
                    xaVar = context;
                    xyVar = new xy(xaVar);
                    xyVar.mo4535a((xz) this);
                    vqVar.m41052a(xyVar);
                    if (vqVar.f35386j == null) {
                        return false;
                    }
                }
                if (z && this.f35340q != null) {
                    if (this.f35348y == null) {
                        this.f35348y = new vm(this);
                    }
                    this.f35340q.a(vqVar.f35386j, this.f35348y);
                }
                vqVar.f35386j.m41436g();
                if (callback.onCreatePanelMenu(vqVar.f35377a, vqVar.f35386j)) {
                    vqVar.f35394r = false;
                } else {
                    vqVar.m41052a(null);
                    if (!z || this.f35340q == null) {
                        return false;
                    }
                    this.f35340q.a(null, this.f35348y);
                    return false;
                }
            }
            vqVar.f35386j.m41436g();
            if (vqVar.f35395s != null) {
                vqVar.f35386j.m41423b(vqVar.f35395s);
                vqVar.f35395s = null;
            }
            if (callback.onPreparePanel(0, vqVar.f35385i, vqVar.f35386j)) {
                boolean z2;
                if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                vqVar.f35392p = z2;
                vqVar.f35386j.setQwertyMode(vqVar.f35392p);
                vqVar.f35386j.m41437h();
            } else {
                if (z && this.f35340q != null) {
                    this.f35340q.a(null, this.f35348y);
                }
                vqVar.f35386j.m41437h();
                return false;
            }
        }
        vqVar.f35389m = true;
        vqVar.f35390n = false;
        this.f35333I = vqVar;
        return true;
    }
}
