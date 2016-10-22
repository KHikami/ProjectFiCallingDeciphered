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
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
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

/* compiled from: PG */
public class ql extends qc implements jl, sv {
    private View A;
    private boolean B;
    private boolean C;
    private boolean D;
    private qv[] E;
    private qv F;
    private boolean G;
    private final Runnable H;
    private boolean I;
    private Rect J;
    private Rect K;
    private qy L;
    private qr n;
    wu o;
    rt p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    lv t;
    ViewGroup u;
    boolean v;
    int w;
    private qw x;
    private boolean y;
    private TextView z;

    ql(Context context, Window window, qa qaVar) {
        super(context, window, qaVar);
        this.t = null;
        this.H = new qm(this);
    }

    public void a(Bundle bundle) {
        if ((this.d instanceof Activity) && ei.b((Activity) this.d) != null) {
            pl plVar = this.f;
            if (plVar == null) {
                this.I = true;
            } else {
                plVar.e(true);
            }
        }
    }

    public final void c() {
        n();
    }

    public final void j() {
        n();
        if (this.g && this.f == null) {
            if (this.d instanceof Activity) {
                this.f = new rg((Activity) this.d, this.h);
            } else if (this.d instanceof Dialog) {
                this.f = new rg((Dialog) this.d);
            }
            if (this.f != null) {
                this.f.e(this.I);
            }
        }
    }

    public final View a(int i) {
        n();
        return this.c.findViewById(i);
    }

    public final void a(Configuration configuration) {
        if (this.g && this.y) {
            pl a = a();
            if (a != null) {
                a.a(configuration);
            }
        }
        i();
    }

    public final void d() {
        pl a = a();
        if (a != null) {
            a.f(false);
        }
    }

    public final void e() {
        pl a = a();
        if (a != null) {
            a.f(true);
        }
    }

    public final void a(View view) {
        n();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.d.onContentChanged();
    }

    public final void b(int i) {
        n();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.b).inflate(i, viewGroup);
        this.d.onContentChanged();
    }

    public final void a(View view, LayoutParams layoutParams) {
        n();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.d.onContentChanged();
    }

    public final void b(View view, LayoutParams layoutParams) {
        n();
        ((ViewGroup) this.u.findViewById(16908290)).addView(view, layoutParams);
        this.d.onContentChanged();
    }

    public final void g() {
        super.g();
        if (this.f != null) {
            this.f.h();
        }
    }

    private final void n() {
        if (!this.y) {
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(rk.U);
            if (obtainStyledAttributes.hasValue(rk.Y)) {
                View view;
                View view2;
                if (obtainStyledAttributes.getBoolean(rk.ah, false)) {
                    c(1);
                } else if (obtainStyledAttributes.getBoolean(rk.Y, false)) {
                    c(108);
                }
                if (obtainStyledAttributes.getBoolean(rk.Z, false)) {
                    c(109);
                }
                if (obtainStyledAttributes.getBoolean(rk.aa, false)) {
                    c(10);
                }
                this.j = obtainStyledAttributes.getBoolean(rk.W, false);
                obtainStyledAttributes.recycle();
                this.c.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.b);
                if (this.k) {
                    if (this.i) {
                        view = (ViewGroup) from.inflate(buf.bX, null);
                    } else {
                        view = (ViewGroup) from.inflate(buf.bW, null);
                    }
                    if (VERSION.SDK_INT >= 21) {
                        kn.a(view, new qn(this));
                        view2 = view;
                    } else {
                        ((xk) view).a(new xl(this));
                        view2 = view;
                    }
                } else if (this.j) {
                    r0 = (ViewGroup) from.inflate(buf.bO, null);
                    this.h = false;
                    this.g = false;
                    view2 = r0;
                } else if (this.g) {
                    Context rwVar;
                    TypedValue typedValue = new TypedValue();
                    this.b.getTheme().resolveAttribute(buf.t, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        rwVar = new rw(this.b, typedValue.resourceId);
                    } else {
                        rwVar = this.b;
                    }
                    r0 = (ViewGroup) LayoutInflater.from(rwVar).inflate(buf.bY, null);
                    this.o = (wu) r0.findViewById(buf.bq);
                    this.o.a(this.c.getCallback());
                    if (this.h) {
                        this.o.b(109);
                    }
                    if (this.B) {
                        this.o.b(2);
                    }
                    if (this.C) {
                        this.o.b(5);
                    }
                    view2 = r0;
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.g + ", windowActionBarOverlay: " + this.h + ", android:windowIsFloating: " + this.j + ", windowActionModeOverlay: " + this.i + ", windowNoTitle: " + this.k + " }");
                }
                CharSequence title;
                if (this.o == null) {
                    this.z = (TextView) view2.findViewById(buf.bF);
                }
                aav.b(view2);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view2.findViewById(buf.bd);
                ViewGroup viewGroup = (ViewGroup) this.c.findViewById(16908290);
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
                this.c.setContentView(view2);
                contentFrameLayout.h = new wt(this);
                this.u = view2;
                if (this.d instanceof Activity) {
                    title = ((Activity) this.d).getTitle();
                } else {
                    title = this.l;
                }
                if (!TextUtils.isEmpty(title)) {
                    b(title);
                }
                contentFrameLayout = (ContentFrameLayout) this.u.findViewById(16908290);
                view = this.c.getDecorView();
                contentFrameLayout.g.set(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                if (kn.p(contentFrameLayout)) {
                    contentFrameLayout.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.b.obtainStyledAttributes(rk.U);
                int i = rk.af;
                if (contentFrameLayout.a == null) {
                    contentFrameLayout.a = new TypedValue();
                }
                obtainStyledAttributes2.getValue(i, contentFrameLayout.a);
                i = rk.ag;
                if (contentFrameLayout.b == null) {
                    contentFrameLayout.b = new TypedValue();
                }
                obtainStyledAttributes2.getValue(i, contentFrameLayout.b);
                if (obtainStyledAttributes2.hasValue(rk.ad)) {
                    i = rk.ad;
                    if (contentFrameLayout.c == null) {
                        contentFrameLayout.c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(i, contentFrameLayout.c);
                }
                if (obtainStyledAttributes2.hasValue(rk.ae)) {
                    i = rk.ae;
                    if (contentFrameLayout.d == null) {
                        contentFrameLayout.d = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(i, contentFrameLayout.d);
                }
                if (obtainStyledAttributes2.hasValue(rk.ab)) {
                    i = rk.ab;
                    if (contentFrameLayout.e == null) {
                        contentFrameLayout.e = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(i, contentFrameLayout.e);
                }
                if (obtainStyledAttributes2.hasValue(rk.ac)) {
                    i = rk.ac;
                    if (contentFrameLayout.f == null) {
                        contentFrameLayout.f = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(i, contentFrameLayout.f);
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout.requestLayout();
                this.y = true;
                qv g = g(0);
                if (!this.m) {
                    if (g == null || g.h == null) {
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

    public final boolean c(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.k && i == 108) {
            return false;
        }
        if (this.g && i == 1) {
            this.g = false;
        }
        switch (i) {
            case rq.b /*1*/:
                o();
                this.k = true;
                return true;
            case rq.c /*2*/:
                o();
                this.B = true;
                return true;
            case rl.g /*5*/:
                o();
                this.C = true;
                return true;
            case rl.m /*10*/:
                o();
                this.i = true;
                return true;
            case 108:
                o();
                this.g = true;
                return true;
            case 109:
                o();
                this.h = true;
                return true;
            default:
                return this.c.requestFeature(i);
        }
    }

    final void b(CharSequence charSequence) {
        if (this.o != null) {
            this.o.a(charSequence);
        } else if (this.f != null) {
            this.f.a(charSequence);
        } else if (this.z != null) {
            this.z.setText(charSequence);
        }
    }

    final void d(int i) {
        if (i == 108) {
            pl a = a();
            if (a != null) {
                a.g(false);
            }
        } else if (i == 0) {
            qv g = g(i);
            if (g.m) {
                a(g, false);
            }
        }
    }

    final boolean e(int i) {
        if (i != 108) {
            return false;
        }
        pl a = a();
        if (a == null) {
            return true;
        }
        a.g(true);
        return true;
    }

    public final void a(su suVar) {
        if (this.o == null || !this.o.d() || (kz.a(ViewConfiguration.get(this.b)) && !this.o.f())) {
            qv g = g(0);
            g.o = true;
            a(g, false);
            b(g, null);
            return;
        }
        Callback callback = this.c.getCallback();
        if (this.o.e()) {
            this.o.h();
            if (!this.m) {
                callback.onPanelClosed(108, g(0).h);
            }
        } else if (callback != null && !this.m) {
            if (this.v && (this.w & 1) != 0) {
                this.c.getDecorView().removeCallbacks(this.H);
                this.H.run();
            }
            qv g2 = g(0);
            if (g2.h != null && !g2.p && callback.onPreparePanel(0, g2.g, g2.h)) {
                callback.onMenuOpened(108, g2.h);
                this.o.g();
            }
        }
    }

    public final void f() {
        pl a = a();
        if (a == null || !a.e()) {
            f(0);
        }
    }

    final void l() {
        if (this.t != null) {
            this.t.a();
        }
    }

    final boolean a(int i, KeyEvent keyEvent) {
        pl a = a();
        if (a != null && a.a(i, keyEvent)) {
            return true;
        }
        if (this.F == null || !a(this.F, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.F == null) {
                qv g = g(0);
                a(g, keyEvent);
                boolean a2 = a(g, keyEvent.getKeyCode(), keyEvent, 1);
                g.k = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        } else if (this.F == null) {
            return true;
        } else {
            this.F.l = true;
            return true;
        }
    }

    final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.d.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            switch (keyCode) {
                case rl.f /*4*/:
                    this.G = (keyEvent.getFlags() & 128) != 0;
                    break;
                case 82:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    qv g = g(0);
                    if (g.m) {
                        return true;
                    }
                    a(g, keyEvent);
                    return true;
            }
            if (VERSION.SDK_INT < 11) {
                a(keyCode, keyEvent);
            }
            return false;
        }
        qv g2;
        switch (keyCode) {
            case rl.f /*4*/:
                z = this.G;
                this.G = false;
                g2 = g(0);
                if (g2 == null || !g2.m) {
                    if (this.p != null) {
                        this.p.c();
                        z = true;
                    } else {
                        pl a = a();
                        if (a == null || !a.f()) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } else if (z) {
                    return true;
                } else {
                    a(g2, true);
                    return true;
                }
                break;
            case 82:
                if (this.p != null) {
                    return true;
                }
                g2 = g(0);
                if (this.o == null || !this.o.d() || kz.a(ViewConfiguration.get(this.b))) {
                    if (g2.m || g2.l) {
                        z = g2.m;
                        a(g2, true);
                    } else {
                        if (g2.k) {
                            if (g2.p) {
                                g2.k = false;
                                z = a(g2, keyEvent);
                            } else {
                                z = true;
                            }
                            if (z) {
                                b(g2, keyEvent);
                                z = true;
                            }
                        }
                        z = false;
                    }
                } else if (this.o.e()) {
                    z = this.o.h();
                } else {
                    if (!this.m && a(g2, keyEvent)) {
                        z = this.o.g();
                    }
                    z = false;
                }
                if (!z) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.b.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
        }
        return false;
    }

    public final void h() {
        LayoutInflater from = LayoutInflater.from(this.b);
        if (from.getFactory() == null) {
            jf.a(from, this);
        } else {
            jf.a.a(from);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
        r7 = this;
        r3 = 1;
        r4 = 0;
        r0 = r7.a(r9, r10, r11);
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 >= r1) goto L_0x0059;
    L_0x000f:
        r2 = r3;
    L_0x0010:
        r0 = r7.L;
        if (r0 != 0) goto L_0x001b;
    L_0x0014:
        r0 = new qy;
        r0.<init>();
        r7.L = r0;
    L_0x001b:
        if (r2 == 0) goto L_0x007c;
    L_0x001d:
        r0 = r8;
        r0 = (android.view.ViewParent) r0;
        if (r0 != 0) goto L_0x005b;
    L_0x0022:
        r0 = r4;
    L_0x0023:
        if (r0 == 0) goto L_0x007c;
    L_0x0025:
        r0 = r3;
    L_0x0026:
        r5 = r7.L;
        r1 = aar.a();
        if (r0 == 0) goto L_0x0168;
    L_0x002e:
        if (r8 == 0) goto L_0x0168;
    L_0x0030:
        r0 = r8.getContext();
    L_0x0034:
        r0 = qy.a(r0, r11, r2, r3);
        if (r1 == 0) goto L_0x003e;
    L_0x003a:
        r0 = aae.a(r0);
    L_0x003e:
        r1 = 0;
        r2 = -1;
        r6 = r9.hashCode();
        switch(r6) {
            case -1946472170: goto L_0x00f2;
            case -1455429095: goto L_0x00ce;
            case -1346021293: goto L_0x00e6;
            case -938935918: goto L_0x007e;
            case -937446323: goto L_0x00af;
            case -658531749: goto L_0x00fe;
            case -339785223: goto L_0x00a5;
            case 776382189: goto L_0x00c3;
            case 1125864064: goto L_0x0087;
            case 1413872058: goto L_0x00da;
            case 1601505219: goto L_0x00b9;
            case 1666676343: goto L_0x009b;
            case 2001146706: goto L_0x0091;
            default: goto L_0x0047;
        };
    L_0x0047:
        r4 = r2;
    L_0x0048:
        switch(r4) {
            case 0: goto L_0x010a;
            case 1: goto L_0x0111;
            case 2: goto L_0x0118;
            case 3: goto L_0x011f;
            case 4: goto L_0x0126;
            case 5: goto L_0x012d;
            case 6: goto L_0x0134;
            case 7: goto L_0x013b;
            case 8: goto L_0x0142;
            case 9: goto L_0x0149;
            case 10: goto L_0x0150;
            case 11: goto L_0x0157;
            case 12: goto L_0x015e;
            default: goto L_0x004b;
        };
    L_0x004b:
        if (r1 != 0) goto L_0x0165;
    L_0x004d:
        if (r10 == r0) goto L_0x0165;
    L_0x004f:
        r0 = r5.a(r0, r9, r11);
    L_0x0053:
        if (r0 == 0) goto L_0x0008;
    L_0x0055:
        qy.a(r0, r11);
        goto L_0x0008;
    L_0x0059:
        r2 = r4;
        goto L_0x0010;
    L_0x005b:
        r1 = r7.c;
        r5 = r1.getDecorView();
        r1 = r0;
    L_0x0062:
        if (r1 != 0) goto L_0x0066;
    L_0x0064:
        r0 = r3;
        goto L_0x0023;
    L_0x0066:
        if (r1 == r5) goto L_0x0075;
    L_0x0068:
        r0 = r1 instanceof android.view.View;
        if (r0 == 0) goto L_0x0075;
    L_0x006c:
        r0 = r1;
        r0 = (android.view.View) r0;
        r0 = kn.r(r0);
        if (r0 == 0) goto L_0x0077;
    L_0x0075:
        r0 = r4;
        goto L_0x0023;
    L_0x0077:
        r1 = r1.getParent();
        goto L_0x0062;
    L_0x007c:
        r0 = r4;
        goto L_0x0026;
    L_0x007e:
        r3 = "TextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x0086:
        goto L_0x0048;
    L_0x0087:
        r4 = "ImageView";
        r4 = r9.equals(r4);
        if (r4 == 0) goto L_0x0047;
    L_0x008f:
        r4 = r3;
        goto L_0x0048;
    L_0x0091:
        r3 = "Button";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x0099:
        r4 = 2;
        goto L_0x0048;
    L_0x009b:
        r3 = "EditText";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00a3:
        r4 = 3;
        goto L_0x0048;
    L_0x00a5:
        r3 = "Spinner";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00ad:
        r4 = 4;
        goto L_0x0048;
    L_0x00af:
        r3 = "ImageButton";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00b7:
        r4 = 5;
        goto L_0x0048;
    L_0x00b9:
        r3 = "CheckBox";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00c1:
        r4 = 6;
        goto L_0x0048;
    L_0x00c3:
        r3 = "RadioButton";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00cb:
        r4 = 7;
        goto L_0x0048;
    L_0x00ce:
        r3 = "CheckedTextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00d6:
        r4 = 8;
        goto L_0x0048;
    L_0x00da:
        r3 = "AutoCompleteTextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00e2:
        r4 = 9;
        goto L_0x0048;
    L_0x00e6:
        r3 = "MultiAutoCompleteTextView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00ee:
        r4 = 10;
        goto L_0x0048;
    L_0x00f2:
        r3 = "RatingBar";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x00fa:
        r4 = 11;
        goto L_0x0048;
    L_0x00fe:
        r3 = "SeekBar";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0047;
    L_0x0106:
        r4 = 12;
        goto L_0x0048;
    L_0x010a:
        r1 = new wi;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0111:
        r1 = new vq;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0118:
        r1 = new ve;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x011f:
        r1 = new vn;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0126:
        r1 = new vz;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x012d:
        r1 = new vo;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0134:
        r1 = new vf;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x013b:
        r1 = new vv;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0142:
        r1 = new vg;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0149:
        r1 = new vc;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0150:
        r1 = new vr;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0157:
        r1 = new vw;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x015e:
        r1 = new vx;
        r1.<init>(r0, r11);
        goto L_0x004b;
    L_0x0165:
        r0 = r1;
        goto L_0x0053;
    L_0x0168:
        r0 = r10;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.a(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    View a(String str, Context context, AttributeSet attributeSet) {
        if (this.d instanceof Factory) {
            View onCreateView = ((Factory) this.d).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(qv r11, android.view.KeyEvent r12) {
        /*
        r10 = this;
        r1 = -1;
        r2 = -2;
        r3 = 0;
        r9 = 1;
        r0 = r11.m;
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r10.m;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r11.a;
        if (r0 != 0) goto L_0x0032;
    L_0x0011:
        r4 = r10.b;
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
        r0 = r10.c;
        r0 = r0.getCallback();
        if (r0 == 0) goto L_0x004c;
    L_0x003a:
        r4 = r11.a;
        r5 = r11.h;
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
        r0 = r10.b;
        r4 = "window";
        r0 = r0.getSystemService(r4);
        r8 = r0;
        r8 = (android.view.WindowManager) r8;
        if (r8 == 0) goto L_0x000c;
    L_0x0059:
        r0 = r10.a(r11, r12);
        if (r0 == 0) goto L_0x000c;
    L_0x005f:
        r0 = r11.e;
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = r11.o;
        if (r0 == 0) goto L_0x01e0;
    L_0x0067:
        r0 = r11.e;
        if (r0 != 0) goto L_0x014f;
    L_0x006b:
        r0 = r10.k();
        r1 = new android.util.TypedValue;
        r1.<init>();
        r4 = r0.getResources();
        r4 = r4.newTheme();
        r5 = r0.getTheme();
        r4.setTo(r5);
        r5 = buf.o;
        r4.resolveAttribute(r5, r1, r9);
        r5 = r1.resourceId;
        if (r5 == 0) goto L_0x0091;
    L_0x008c:
        r5 = r1.resourceId;
        r4.applyStyle(r5, r9);
    L_0x0091:
        r5 = buf.T;
        r4.resolveAttribute(r5, r1, r9);
        r5 = r1.resourceId;
        if (r5 == 0) goto L_0x0148;
    L_0x009a:
        r1 = r1.resourceId;
        r4.applyStyle(r1, r9);
    L_0x009f:
        r1 = new rw;
        r1.<init>(r0, r3);
        r0 = r1.getTheme();
        r0.setTo(r4);
        r11.j = r1;
        r0 = rk.U;
        r0 = r1.obtainStyledAttributes(r0);
        r1 = rk.X;
        r1 = r0.getResourceId(r1, r3);
        r11.b = r1;
        r1 = rk.V;
        r1 = r0.getResourceId(r1, r3);
        r11.d = r1;
        r0.recycle();
        r0 = new qu;
        r1 = r11.j;
        r0.<init>(r10, r1);
        r11.e = r0;
        r0 = 81;
        r11.c = r0;
        r0 = r11.e;
        if (r0 == 0) goto L_0x000c;
    L_0x00d7:
        r0 = r11.g;
        if (r0 == 0) goto L_0x0162;
    L_0x00db:
        r0 = r11.g;
        r11.f = r0;
        r0 = r9;
    L_0x00e0:
        if (r0 == 0) goto L_0x000c;
    L_0x00e2:
        r0 = r11.f;
        if (r0 == 0) goto L_0x01dd;
    L_0x00e6:
        r0 = r11.g;
        if (r0 == 0) goto L_0x01ce;
    L_0x00ea:
        r0 = r9;
    L_0x00eb:
        if (r0 == 0) goto L_0x000c;
    L_0x00ed:
        r0 = r11.f;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x01f3;
    L_0x00f5:
        r0 = new android.view.ViewGroup$LayoutParams;
        r0.<init>(r2, r2);
        r1 = r0;
    L_0x00fb:
        r0 = r11.b;
        r4 = r11.e;
        r4.setBackgroundResource(r0);
        r0 = r11.f;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x0115;
    L_0x010a:
        r4 = r0 instanceof android.view.ViewGroup;
        if (r4 == 0) goto L_0x0115;
    L_0x010e:
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.f;
        r0.removeView(r4);
    L_0x0115:
        r0 = r11.e;
        r4 = r11.f;
        r0.addView(r4, r1);
        r0 = r11.f;
        r0 = r0.hasFocus();
        if (r0 != 0) goto L_0x0129;
    L_0x0124:
        r0 = r11.f;
        r0.requestFocus();
    L_0x0129:
        r1 = r2;
    L_0x012a:
        r11.l = r3;
        r0 = new android.view.WindowManager$LayoutParams;
        r5 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r6 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r7 = -3;
        r4 = r3;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.c;
        r0.gravity = r1;
        r1 = r11.d;
        r0.windowAnimations = r1;
        r1 = r11.e;
        r8.addView(r1, r0);
        r11.m = r9;
        goto L_0x000c;
    L_0x0148:
        r1 = buf.cf;
        r4.applyStyle(r1, r9);
        goto L_0x009f;
    L_0x014f:
        r0 = r11.o;
        if (r0 == 0) goto L_0x00d7;
    L_0x0153:
        r0 = r11.e;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x00d7;
    L_0x015b:
        r0 = r11.e;
        r0.removeAllViews();
        goto L_0x00d7;
    L_0x0162:
        r0 = r11.h;
        if (r0 == 0) goto L_0x01cb;
    L_0x0166:
        r0 = r10.x;
        if (r0 != 0) goto L_0x0171;
    L_0x016a:
        r0 = new qw;
        r0.<init>(r10);
        r10.x = r0;
    L_0x0171:
        r0 = r10.x;
        r1 = r11.h;
        if (r1 != 0) goto L_0x0183;
    L_0x0177:
        r0 = 0;
    L_0x0178:
        r0 = (android.view.View) r0;
        r11.f = r0;
        r0 = r11.f;
        if (r0 == 0) goto L_0x01cb;
    L_0x0180:
        r0 = r9;
        goto L_0x00e0;
    L_0x0183:
        r1 = r11.i;
        if (r1 != 0) goto L_0x019d;
    L_0x0187:
        r1 = new sr;
        r4 = r11.j;
        r5 = buf.bS;
        r1.<init>(r4, r5);
        r11.i = r1;
        r1 = r11.i;
        r1.e = r0;
        r0 = r11.h;
        r1 = r11.i;
        r0.a(r1);
    L_0x019d:
        r1 = r11.i;
        r0 = r11.e;
        r4 = r1.c;
        if (r4 != 0) goto L_0x01c8;
    L_0x01a5:
        r4 = r1.a;
        r5 = buf.bP;
        r0 = r4.inflate(r5, r0, r3);
        r0 = (android.support.v7.view.menu.ExpandedMenuView) r0;
        r1.c = r0;
        r0 = r1.f;
        if (r0 != 0) goto L_0x01bc;
    L_0x01b5:
        r0 = new ss;
        r0.<init>(r1);
        r1.f = r0;
    L_0x01bc:
        r0 = r1.c;
        r4 = r1.f;
        r0.setAdapter(r4);
        r0 = r1.c;
        r0.setOnItemClickListener(r1);
    L_0x01c8:
        r0 = r1.c;
        goto L_0x0178;
    L_0x01cb:
        r0 = r3;
        goto L_0x00e0;
    L_0x01ce:
        r0 = r11.i;
        r0 = r0.b();
        r0 = r0.getCount();
        if (r0 <= 0) goto L_0x01dd;
    L_0x01da:
        r0 = r9;
        goto L_0x00eb;
    L_0x01dd:
        r0 = r3;
        goto L_0x00eb;
    L_0x01e0:
        r0 = r11.g;
        if (r0 == 0) goto L_0x01f0;
    L_0x01e4:
        r0 = r11.g;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x01f0;
    L_0x01ec:
        r0 = r0.width;
        if (r0 == r1) goto L_0x012a;
    L_0x01f0:
        r1 = r2;
        goto L_0x012a;
    L_0x01f3:
        r1 = r0;
        goto L_0x00fb;
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.b(qv, android.view.KeyEvent):void");
    }

    final boolean a(qv qvVar, KeyEvent keyEvent) {
        if (this.m) {
            return false;
        }
        if (qvVar.k) {
            return true;
        }
        if (!(this.F == null || this.F == qvVar)) {
            a(this.F, false);
        }
        Callback callback = this.c.getCallback();
        if (callback != null) {
            qvVar.g = callback.onCreatePanelView(qvVar.a);
        }
        boolean z = qvVar.a == 0 || qvVar.a == 108;
        if (z && this.o != null) {
            this.o.i();
        }
        if (qvVar.g == null && !(z && (this.f instanceof ra))) {
            if (qvVar.h == null || qvVar.p) {
                if (qvVar.h == null) {
                    Context rwVar;
                    su suVar;
                    Context context = this.b;
                    if ((qvVar.a == 0 || qvVar.a == 108) && this.o != null) {
                        Theme newTheme;
                        TypedValue typedValue = new TypedValue();
                        Theme theme = context.getTheme();
                        theme.resolveAttribute(buf.t, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme = context.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            newTheme.resolveAttribute(buf.u, typedValue, true);
                        } else {
                            theme.resolveAttribute(buf.u, typedValue, true);
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
                            rwVar = new rw(context, 0);
                            rwVar.getTheme().setTo(theme2);
                            suVar = new su(rwVar);
                            suVar.a((sv) this);
                            qvVar.a(suVar);
                            if (qvVar.h == null) {
                                return false;
                            }
                        }
                    }
                    rwVar = context;
                    suVar = new su(rwVar);
                    suVar.a((sv) this);
                    qvVar.a(suVar);
                    if (qvVar.h == null) {
                        return false;
                    }
                }
                if (z && this.o != null) {
                    if (this.n == null) {
                        this.n = new qr(this);
                    }
                    this.o.a(qvVar.h, this.n);
                }
                qvVar.h.d();
                if (callback.onCreatePanelMenu(qvVar.a, qvVar.h)) {
                    qvVar.p = false;
                } else {
                    qvVar.a(null);
                    if (!z || this.o == null) {
                        return false;
                    }
                    this.o.a(null, this.n);
                    return false;
                }
            }
            qvVar.h.d();
            if (qvVar.q != null) {
                qvVar.h.b(qvVar.q);
                qvVar.q = null;
            }
            if (callback.onPreparePanel(0, qvVar.g, qvVar.h)) {
                boolean z2;
                if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qvVar.n = z2;
                qvVar.h.setQwertyMode(qvVar.n);
                qvVar.h.e();
            } else {
                if (z && this.o != null) {
                    this.o.a(null, this.n);
                }
                qvVar.h.e();
                return false;
            }
        }
        qvVar.k = true;
        qvVar.l = false;
        this.F = qvVar;
        return true;
    }

    final void b(su suVar) {
        if (!this.D) {
            this.D = true;
            this.o.j();
            Callback callback = this.c.getCallback();
            if (!(callback == null || this.m)) {
                callback.onPanelClosed(108, suVar);
            }
            this.D = false;
        }
    }

    final void a(qv qvVar, boolean z) {
        if (z && qvVar.a == 0 && this.o != null && this.o.e()) {
            b(qvVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (!(windowManager == null || !qvVar.m || qvVar.e == null)) {
            windowManager.removeView(qvVar.e);
            if (z) {
                a(qvVar.a, qvVar, null);
            }
        }
        qvVar.k = false;
        qvVar.l = false;
        qvVar.m = false;
        qvVar.f = null;
        qvVar.o = true;
        if (this.F == qvVar) {
            this.F = null;
        }
    }

    final void a(int i, qv qvVar, Menu menu) {
        if (menu == null) {
            if (qvVar == null && i >= 0 && i < this.E.length) {
                qvVar = this.E[i];
            }
            if (qvVar != null) {
                menu = qvVar.h;
            }
        }
        if ((qvVar == null || qvVar.m) && !this.m) {
            this.d.onPanelClosed(i, menu);
        }
    }

    final qv a(Menu menu) {
        qv[] qvVarArr = this.E;
        int length = qvVarArr != null ? qvVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            qv qvVar = qvVarArr[i];
            if (qvVar != null && qvVar.h == menu) {
                return qvVar;
            }
        }
        return null;
    }

    protected final qv g(int i) {
        Object obj = this.E;
        if (obj == null || obj.length <= i) {
            Object obj2 = new qv[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.E = obj2;
            obj = obj2;
        }
        qv qvVar = obj[i];
        if (qvVar != null) {
            return qvVar;
        }
        qvVar = new qv(i);
        obj[i] = qvVar;
        return qvVar;
    }

    private final boolean a(qv qvVar, int i, KeyEvent keyEvent, int i2) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qvVar.k || a(qvVar, keyEvent)) && qvVar.h != null) {
            return qvVar.h.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private final void f(int i) {
        this.w |= 1 << i;
        if (!this.v) {
            kn.a(this.c.getDecorView(), this.H);
            this.v = true;
        }
    }

    public final int h(int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (this.q == null || !(this.q.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.q.getLayoutParams();
            if (this.q.isShown()) {
                if (this.J == null) {
                    this.J = new Rect();
                    this.K = new Rect();
                }
                Rect rect = this.J;
                Rect rect2 = this.K;
                rect.set(0, i, 0, 0);
                aav.a(this.u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.A == null) {
                        this.A = new View(this.b);
                        this.A.setBackgroundColor(this.b.getResources().getColor(buf.ac));
                        this.u.addView(this.A, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = this.A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.A.setLayoutParams(layoutParams);
                        }
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                if (this.A == null) {
                    i3 = 0;
                }
                if (!(this.i || i3 == 0)) {
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
                this.q.setLayoutParams(marginLayoutParams);
            }
            i2 = i5;
        }
        if (this.A != null) {
            View view = this.A;
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }

    private final void o() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void m() {
        if (this.o != null) {
            this.o.j();
        }
        if (this.r != null) {
            this.c.getDecorView().removeCallbacks(this.s);
            if (this.r.isShowing()) {
                try {
                    this.r.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.r = null;
        }
        l();
        qv g = g(0);
        if (g != null && g.h != null) {
            g.h.close();
        }
    }

    public final boolean a(su suVar, MenuItem menuItem) {
        Callback callback = this.c.getCallback();
        if (!(callback == null || this.m)) {
            qv a = a(suVar.k());
            if (a != null) {
                return callback.onMenuItemSelected(a.a, menuItem);
            }
        }
        return false;
    }
}
