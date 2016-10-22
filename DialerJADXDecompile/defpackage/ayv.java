package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: ayv */
public final class ayv extends ayn implements azq {
    private View A;
    private ImageView B;
    private ImageView C;
    private ImageView D;
    private ImageView E;
    private TextView F;
    private Drawable G;
    private TextView H;
    private ImageView I;
    private ImageView J;
    private TextView K;
    private View L;
    private TextView M;
    private View N;
    private View O;
    private View P;
    private ImageView Q;
    private View R;
    private ListView S;
    private LinearLayout T;
    private View U;
    private TextView V;
    private int W;
    private Animation X;
    private air Y;
    private Handler Z;
    int a;
    private boolean aa;
    boolean b;
    boolean c;
    TextView d;
    ImageView f;
    TextView g;
    TextView h;
    View i;
    View j;
    View k;
    View l;
    ajw m;
    View n;
    ImageButton o;
    float p;
    int q;
    boolean r;
    CharSequence s;
    boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private TextView y;
    private TextView z;

    public ayv() {
        this.t = false;
        this.aa = false;
    }

    public final /* synthetic */ bdq g() {
        return this;
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap;
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        }
        int width = createBitmap.getWidth();
        bdf.c("CallCardFragment", "Created bitmap with width " + width + ", height " + createBitmap.getHeight());
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Z = new Handler(Looper.getMainLooper());
        this.a = getResources().getInteger(buf.kL);
        this.q = getResources().getInteger(buf.kM);
        this.W = getResources().getDimensionPixelOffset(buf.kc);
        this.u = getResources().getDimensionPixelOffset(buf.ka);
        this.v = getResources().getDimensionPixelOffset(buf.kb);
        if (bundle != null) {
            this.c = bundle.getBoolean("is_dialpad_showing", false);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ayo k = azs.a.k();
        azz azz = (azo) this.e;
        Context activity = getActivity();
        azz.g = (Context) Objects.requireNonNull(activity);
        azz.b = buf.K(activity).a(azz.g, azz);
        azz.h = buf.M(azz.g);
        azz.a = buf.K(azz.g).a();
        if (k != null) {
            azz.c = k;
            if (azo.a(azz.c)) {
                azq azq = (azq) azz.i;
                if (azq != null) {
                    azq.f();
                }
            }
            azs.a.a(k.d, azz);
            if (k.c(1)) {
                azz.a(null, true);
            } else {
                azz.a(k, true, k.c() == 4);
            }
        }
        azz.a(null, bcj.b().o, azs.a);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("is_dialpad_showing", this.c);
        super.onSaveInstanceState(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Trace.beginSection("CallCardFragment onCreate");
        this.p = (float) getResources().getDimensionPixelSize(buf.jZ);
        View inflate = layoutInflater.inflate(buf.kT, viewGroup, false);
        Trace.endSection();
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.X = AnimationUtils.loadAnimation(view.getContext(), cob.dH);
        this.y = (TextView) view.findViewById(az.ao);
        this.d = (TextView) view.findViewById(az.ah);
        this.z = (TextView) view.findViewById(az.Z);
        this.l = view.findViewById(az.aD);
        this.L = view.findViewById(az.aE);
        view.findViewById(az.s);
        this.Q = (ImageView) view.findViewById(az.ap);
        this.Q.setOnClickListener(new ayw(this));
        this.R = view.findViewById(az.F);
        view.findViewById(az.E);
        this.S = (ListView) view.findViewById(az.D);
        this.T = new LinearLayout(getView().getContext());
        this.S.addHeaderView(this.T);
        this.f = (ImageView) view.findViewById(az.o);
        this.B = (ImageView) view.findViewById(az.aO);
        this.I = (ImageView) view.findViewById(az.aR);
        this.g = (TextView) view.findViewById(az.p);
        this.C = (ImageView) view.findViewById(az.U);
        this.D = (ImageView) view.findViewById(az.R);
        this.E = (ImageView) view.findViewById(az.aH);
        this.i = view.findViewById(az.aa);
        this.h = (TextView) view.findViewById(az.r);
        this.F = (TextView) view.findViewById(az.N);
        this.j = view.findViewById(az.ax);
        view.findViewById(az.aw);
        this.k = view.findViewById(az.m);
        this.J = (ImageView) view.findViewById(az.aq);
        this.J.setVisibility(8);
        this.V = (TextView) view.findViewById(az.C);
        this.P = view.findViewById(az.ay);
        this.n = view.findViewById(az.Q);
        this.o = (ImageButton) view.findViewById(az.P);
        this.o.setOnClickListener(new azc(this));
        this.m = new ajw(getActivity(), this.n, this.o);
        this.l.setOnClickListener(new azd(this));
        this.A = view.findViewById(az.n);
        this.A.setOnLongClickListener(new aze(this));
        this.U = view.findViewById(az.ad);
        this.U.setOnClickListener(new azf(this));
        this.d.setElegantTextHeight(false);
        this.g.setElegantTextHeight(false);
        this.H = (TextView) view.findViewById(az.q);
    }

    public final void a(boolean z) {
        this.P.setVisibility(z ? 0 : 8);
    }

    public final void a(View view) {
        this.T.removeAllViews();
        this.T.addView(view);
    }

    public final void a(ListAdapter listAdapter) {
        this.S.setAdapter(listAdapter);
    }

    public final void b(boolean z) {
        int i = 0;
        a(this.Q, !z);
        a(this.J, z);
        this.j.setElevation(z ? 0.0f : getResources().getDimension(buf.kf));
        View view = this.R;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void c(boolean z) {
        bdf.b((Object) this, "setCallCardVisible : isVisible = " + z);
        boolean c = bcj.c();
        View findViewById = getView().findViewById(az.Y);
        if (findViewById != null) {
            getView().getViewTreeObserver().addOnPreDrawListener(new azg(this, z, findViewById, a(), c));
        }
    }

    public final float a() {
        if (this.b) {
            return (float) (getView().getWidth() - this.j.getWidth());
        }
        int intValue;
        if (this.j.getTag(az.aQ) != null) {
            intValue = ((Integer) this.j.getTag(az.aQ)).intValue();
        } else {
            intValue = this.j.getHeight();
        }
        return (float) (getView().getHeight() - intValue);
    }

    public final void a(Drawable drawable, boolean z) {
        if (drawable != null) {
            b(drawable);
            a(this.Q, z);
        }
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.y.setText(null);
            this.y.setVisibility(8);
            return;
        }
        this.y.setText(buf.a((CharSequence) str));
        this.y.setVisibility(0);
        this.y.setTextDirection(3);
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.z.setVisibility(8);
            return;
        }
        this.z.setText(str);
        this.z.setVisibility(0);
    }

    public final void a(String str, String str2, boolean z, String str3, Drawable drawable, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.x = z5;
        bdf.a((Object) this, "Setting primary call");
        if (TextUtils.isEmpty(str2)) {
            this.d.setText(null);
        } else {
            int i;
            TextView textView = this.d;
            if (z) {
                str2 = buf.a((CharSequence) str2);
            }
            textView.setText(str2);
            if (z) {
                i = 3;
            } else {
                i = 0;
            }
            this.d.setTextDirection(i);
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str3) && !z5) {
            this.i.setVisibility(8);
            this.F.setTextAlignment(5);
        } else {
            this.i.setVisibility(0);
            this.F.setTextAlignment(6);
        }
        if (z5) {
            this.E.setVisibility(0);
            b(null);
            c(getString(aq.cy));
        } else {
            this.E.setVisibility(8);
            b(str);
            c(str3);
        }
        if (z2) {
            CharSequence string = getView().getContext().getString(aq.cv);
            this.h.setVisibility(0);
            this.h.setText(string);
        } else {
            this.h.setVisibility(8);
        }
        b(drawable);
        a(this.Q, z3);
        a(this.I, z4);
    }

    public final void a(boolean z, String str, boolean z2, String str2, boolean z3, boolean z4, boolean z5) {
        int i = 8;
        boolean z6 = true;
        int i2 = 0;
        if (z) {
            boolean z7;
            int i3;
            this.aa = true;
            if (TextUtils.isEmpty(str2)) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (this.K == null) {
                this.K = (TextView) getView().findViewById(az.aA);
                this.N = getView().findViewById(az.az);
                this.O = getView().findViewById(az.aC);
            }
            if (this.M == null && z7) {
                this.L.setVisibility(0);
                this.M = (TextView) getView().findViewById(az.aB);
            }
            if (z5) {
                z6 = false;
            }
            d(z6);
            View view = this.N;
            if (z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view.setVisibility(i3);
            View view2 = this.O;
            if (z4) {
                i = 0;
            }
            view2.setVisibility(i);
            TextView textView = this.K;
            if (z2) {
                str = buf.a((CharSequence) str);
            }
            textView.setText(str);
            if (z7) {
                this.M.setText(str2);
            }
            if (z2) {
                i2 = 3;
            }
            this.K.setTextDirection(i2);
            return;
        }
        this.aa = false;
        d(false);
    }

    public final void d(boolean z) {
        boolean isShown = this.l.isShown();
        boolean z2 = z && this.aa;
        bdf.b((Object) this, "setSecondaryInfoVisible: wasVisible = " + isShown + " isVisible = " + z2);
        if (isShown != z2) {
            if (z2) {
                this.l.setVisibility(0);
            } else {
                this.l.setVisibility(8);
            }
            j();
            getView().getViewTreeObserver().addOnPreDrawListener(new azi(this, z2, z));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8, int r9, int r10, android.telecom.DisconnectCause r11, java.lang.String r12, android.graphics.drawable.Drawable r13, java.lang.String r14, boolean r15, boolean r16, boolean r17) {
        /*
        r7 = this;
        r0 = android.text.TextUtils.isEmpty(r14);
        if (r0 != 0) goto L_0x00fa;
    L_0x0006:
        r0 = 1;
    L_0x0007:
        r1 = r7.getView();
        r4 = r1.getContext();
        r2 = 0;
        if (r12 == 0) goto L_0x00fd;
    L_0x0012:
        r1 = 1;
        r3 = r1;
    L_0x0014:
        if (r3 == 0) goto L_0x0101;
    L_0x0016:
        if (r0 != 0) goto L_0x0101;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        r1 = 0;
        switch(r8) {
            case 2: goto L_0x0104;
            case 3: goto L_0x0108;
            case 4: goto L_0x018f;
            case 5: goto L_0x018f;
            case 6: goto L_0x0164;
            case 7: goto L_0x0184;
            case 8: goto L_0x0159;
            case 9: goto L_0x01cb;
            case 10: goto L_0x01d6;
            case 11: goto L_0x01eb;
            case 12: goto L_0x001d;
            case 13: goto L_0x0164;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0 = new java.lang.StringBuilder;
        r3 = 52;
        r0.<init>(r3);
        r3 = "updateCallStateWidgets: unexpected call: ";
        r0 = r0.append(r3);
        r0 = r0.append(r8);
        r0 = r0.toString();
        defpackage.bdf.f(r7, r0);
    L_0x0035:
        r0 = r1;
        r1 = r2;
    L_0x0037:
        r2 = new azm;
        r2.<init>(r7, r1, r0);
        r0 = r2.a;
        r0 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 13;
        r1.<init>(r3);
        r3 = "setCallState ";
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        defpackage.bdf.b(r7, r0);
        r0 = r2.b;
        r1 = new java.lang.StringBuilder;
        r3 = 17;
        r1.<init>(r3);
        r3 = "AutoDismiss ";
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        defpackage.bdf.b(r7, r0);
        r1 = "DisconnectCause ";
        r0 = r11.toString();
        r0 = java.lang.String.valueOf(r0);
        r3 = r0.length();
        if (r3 == 0) goto L_0x01f6;
    L_0x008c:
        r0 = r1.concat(r0);
    L_0x0090:
        defpackage.bdf.b(r7, r0);
        r0 = new java.lang.StringBuilder;
        r1 = java.lang.String.valueOf(r12);
        r1 = r1.length();
        r1 = r1 + 8;
        r3 = java.lang.String.valueOf(r14);
        r3 = r3.length();
        r1 = r1 + r3;
        r0.<init>(r1);
        r1 = "gateway ";
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r0 = r0.append(r14);
        r0 = r0.toString();
        defpackage.bdf.b(r7, r0);
        r0 = defpackage.bdt.a(r9, r8);
        if (r0 != 0) goto L_0x01fd;
    L_0x00c6:
        r0 = 1;
    L_0x00c7:
        r1 = r7.Q;
        if (r0 == 0) goto L_0x0200;
    L_0x00cb:
        r0 = 0;
    L_0x00cc:
        r1.setVisibility(r0);
        r0 = r7.H;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0204;
    L_0x00d7:
        r0 = 1;
    L_0x00d8:
        r1 = r2.a;
        r3 = r7.g;
        r3 = r3.getText();
        r1 = android.text.TextUtils.equals(r1, r3);
        if (r1 == 0) goto L_0x0207;
    L_0x00e6:
        if (r0 != 0) goto L_0x0207;
    L_0x00e8:
        r0 = 3;
        if (r8 == r0) goto L_0x00ef;
    L_0x00eb:
        r0 = 11;
        if (r8 != r0) goto L_0x00f9;
    L_0x00ef:
        r0 = r7.g;
        r0.clearAnimation();
        r0 = r7.f;
        r0.clearAnimation();
    L_0x00f9:
        return;
    L_0x00fa:
        r0 = 0;
        goto L_0x0007;
    L_0x00fd:
        r1 = 0;
        r3 = r1;
        goto L_0x0014;
    L_0x0101:
        r0 = 0;
        goto L_0x0019;
    L_0x0104:
        r0 = r1;
        r1 = r2;
        goto L_0x0037;
    L_0x0108:
        if (r0 != 0) goto L_0x010e;
    L_0x010a:
        if (r15 != 0) goto L_0x010e;
    L_0x010c:
        if (r16 == 0) goto L_0x0114;
    L_0x010e:
        if (r3 == 0) goto L_0x0114;
    L_0x0110:
        r0 = r1;
        r1 = r12;
        goto L_0x0037;
    L_0x0114:
        r0 = 5;
        if (r10 != r0) goto L_0x0120;
    L_0x0117:
        r0 = defpackage.aq.ci;
        r1 = r4.getString(r0);
        r0 = 1;
        goto L_0x0037;
    L_0x0120:
        r0 = 2;
        if (r10 != r0) goto L_0x012c;
    L_0x0123:
        r0 = defpackage.aq.ch;
        r1 = r4.getString(r0);
        r0 = 1;
        goto L_0x0037;
    L_0x012c:
        r0 = 1;
        if (r10 != r0) goto L_0x013a;
    L_0x012f:
        r0 = defpackage.aq.cj;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x013a:
        r0 = 3;
        if (r10 != r0) goto L_0x0148;
    L_0x013d:
        r0 = defpackage.aq.cj;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x0148:
        r0 = defpackage.buf.h(r9);
        if (r0 == 0) goto L_0x0035;
    L_0x014e:
        r0 = defpackage.aq.cg;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x0159:
        r0 = defpackage.aq.ce;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x0164:
        if (r3 == 0) goto L_0x0179;
    L_0x0166:
        if (r15 != 0) goto L_0x0179;
    L_0x0168:
        r0 = defpackage.aq.bU;
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r2[r3] = r12;
        r0 = r4.getString(r0, r2);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x0179:
        r0 = defpackage.aq.bZ;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x0184:
        r0 = defpackage.aq.cf;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x018f:
        if (r15 == 0) goto L_0x0197;
    L_0x0191:
        if (r3 == 0) goto L_0x0197;
    L_0x0193:
        r0 = r1;
        r1 = r12;
        goto L_0x0037;
    L_0x0197:
        if (r0 == 0) goto L_0x01aa;
    L_0x0199:
        r0 = defpackage.aq.cx;
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r2[r3] = r12;
        r0 = r4.getString(r0, r2);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x01aa:
        r0 = defpackage.buf.h(r9);
        if (r0 == 0) goto L_0x01bb;
    L_0x01b0:
        r0 = defpackage.aq.cN;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x01bb:
        if (r17 == 0) goto L_0x01c8;
    L_0x01bd:
        r0 = defpackage.aq.cd;
    L_0x01bf:
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x01c8:
        r0 = defpackage.aq.cc;
        goto L_0x01bf;
    L_0x01cb:
        r0 = defpackage.aq.ca;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x01d6:
        r0 = r11.getLabel();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x02ef;
    L_0x01e0:
        r0 = defpackage.aq.bV;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x01eb:
        r0 = defpackage.aq.bY;
        r0 = r4.getString(r0);
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
    L_0x01f6:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x0090;
    L_0x01fd:
        r0 = 0;
        goto L_0x00c7;
    L_0x0200:
        r0 = 8;
        goto L_0x00cc;
    L_0x0204:
        r0 = 0;
        goto L_0x00d8;
    L_0x0207:
        if (r0 == 0) goto L_0x0268;
    L_0x0209:
        r0 = 0;
        r7.a(r0);
        r13 = 0;
        r0 = r13;
    L_0x020f:
        r1 = r2.a;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x02c2;
    L_0x0217:
        r1 = 3;
        if (r8 == r1) goto L_0x021e;
    L_0x021a:
        r1 = 11;
        if (r8 != r1) goto L_0x02b9;
    L_0x021e:
        r1 = r7.g;
        r1.clearAnimation();
    L_0x0223:
        if (r0 == 0) goto L_0x02d2;
    L_0x0225:
        r1 = r7.f;
        r3 = 0;
        r1.setVisibility(r3);
        r1 = r7.f;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.setAlpha(r3);
        r1 = r7.f;
        r1.setImageDrawable(r0);
        r1 = 3;
        if (r8 == r1) goto L_0x0246;
    L_0x023a:
        r1 = 11;
        if (r8 == r1) goto L_0x0246;
    L_0x023e:
        r1 = r2.a;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 == 0) goto L_0x02c9;
    L_0x0246:
        r1 = r7.f;
        r1.clearAnimation();
    L_0x024b:
        r1 = r0 instanceof android.graphics.drawable.AnimationDrawable;
        if (r1 == 0) goto L_0x0254;
    L_0x024f:
        r0 = (android.graphics.drawable.AnimationDrawable) r0;
        r0.start();
    L_0x0254:
        r0 = defpackage.buf.h(r9);
        if (r0 != 0) goto L_0x0260;
    L_0x025a:
        r0 = 3;
        if (r8 != r0) goto L_0x02e6;
    L_0x025d:
        r0 = 1;
        if (r10 != r0) goto L_0x02e6;
    L_0x0260:
        r0 = r7.B;
        r1 = 0;
        r0.setVisibility(r1);
        goto L_0x00f9;
    L_0x0268:
        r0 = r2.a;
        r0 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 28;
        r1.<init>(r3);
        r3 = "setCallStateLabel : label = ";
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        defpackage.bdf.b(r7, r0);
        r0 = r2.b;
        if (r0 == 0) goto L_0x02a9;
    L_0x0292:
        r0 = 1;
        r7.t = r0;
        r0 = r7.Z;
        r1 = new azk;
        r1.<init>(r7);
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0.postDelayed(r1, r4);
        r0 = r2.a;
        r7.a(r0);
        r0 = r13;
        goto L_0x020f;
    L_0x02a9:
        r0 = r2.a;
        r7.s = r0;
        r0 = r7.t;
        if (r0 != 0) goto L_0x02b6;
    L_0x02b1:
        r0 = r2.a;
        r7.a(r0);
    L_0x02b6:
        r0 = r13;
        goto L_0x020f;
    L_0x02b9:
        r1 = r7.g;
        r3 = r7.X;
        r1.startAnimation(r3);
        goto L_0x0223;
    L_0x02c2:
        r1 = r7.g;
        r1.clearAnimation();
        goto L_0x0223;
    L_0x02c9:
        r1 = r7.f;
        r2 = r7.X;
        r1.startAnimation(r2);
        goto L_0x024b;
    L_0x02d2:
        r0 = r7.f;
        r0.clearAnimation();
        r0 = r7.f;
        r1 = 0;
        r0.setAlpha(r1);
        r0 = r7.f;
        r1 = 8;
        r0.setVisibility(r1);
        goto L_0x0254;
    L_0x02e6:
        r0 = r7.B;
        r1 = 8;
        r0.setVisibility(r1);
        goto L_0x00f9;
    L_0x02ef:
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayv.a(int, int, int, android.telecom.DisconnectCause, java.lang.String, android.graphics.drawable.Drawable, java.lang.String, boolean, boolean, boolean):void");
    }

    final void a(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        bdf.b((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 31).append("changeCallStateLabel : label = ").append(valueOf).toString());
        if (TextUtils.isEmpty(charSequence)) {
            Animation animation = this.g.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            this.g.setText(null);
            this.g.setAlpha(0.0f);
            this.g.setVisibility(8);
            return;
        }
        this.g.setText(charSequence);
        this.g.setAlpha(1.0f);
        this.g.setVisibility(0);
    }

    public final void a(String str, boolean z) {
        if (this.V != null) {
            if (TextUtils.isEmpty(str)) {
                this.V.setVisibility(8);
                return;
            }
            int i;
            String formatNumber = PhoneNumberUtils.formatNumber(str);
            if (z) {
                i = aq.bX;
            } else {
                i = aq.bW;
            }
            this.V.setText(getString(i, new Object[]{formatNumber}));
            this.V.setVisibility(0);
        }
    }

    public final void a(String str) {
        int i = 0;
        int i2 = !TextUtils.isEmpty(str) ? 1 : 0;
        TextView textView = this.H;
        if (i2 == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        if (i2 != 0) {
            this.H.setText(str);
        } else {
            this.H.setText(null);
        }
    }

    public final void a(boolean z, long j) {
        if (z) {
            if (this.F.getVisibility() != 0) {
                ake.b(this.F, -1);
            }
            this.F.setText(DateUtils.formatElapsedTime(j / 1000));
            CharSequence a = buf.a(getView().getContext(), j);
            TextView textView = this.F;
            if (TextUtils.isEmpty(a)) {
                a = null;
            }
            textView.setContentDescription(a);
            return;
        }
        ake.a(this.F, -1);
    }

    private final void b(Drawable drawable) {
        if (drawable == null) {
            drawable = bbc.a(getView().getContext()).a();
        }
        if (this.G != drawable) {
            this.G = drawable;
            this.Q.setImageDrawable(drawable);
            Bitmap a = ayv.a(drawable);
            if (a != null) {
                drawable = buf.a(getResources(), a);
                drawable.a(true);
                drawable.a((float) (a.getHeight() / 2));
            }
            this.J.setImageDrawable(drawable);
        }
    }

    private final void a(ImageView imageView, boolean z) {
        if (imageView.getDrawable() != null) {
            imageView.setVisibility(z ? 0 : 8);
        } else if (z) {
            ake.b(this.F, -1);
        }
    }

    public final void a(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 16384) {
            ayv.a(accessibilityEvent, this.g);
            b(accessibilityEvent);
            ayv.a(accessibilityEvent, this.y);
            ayv.a(accessibilityEvent, this.h);
            ayv.a(accessibilityEvent, this.K);
            ayv.a(accessibilityEvent, this.M);
        } else if (!this.g.isShown() || TextUtils.isEmpty(this.g.getText())) {
            accessibilityEvent.getText().add(TextUtils.expandTemplate(getResources().getText(aq.bN), new CharSequence[]{this.d.getText()}));
        } else {
            ayv.a(accessibilityEvent, this.g);
            b(accessibilityEvent);
            ayv.a(accessibilityEvent, this.h);
            ayv.a(accessibilityEvent, this.y);
        }
    }

    private final void b(AccessibilityEvent accessibilityEvent) {
        if (this.x) {
            accessibilityEvent.getText().add(TextUtils.expandTemplate(getResources().getText(aq.bO), new CharSequence[]{this.d.getText()}));
            return;
        }
        ayv.a(accessibilityEvent, this.d);
    }

    public final void b() {
        this.Z.postDelayed(new azl(this), 500);
    }

    public final void a(boolean z, boolean z2) {
        if (z != this.o.isEnabled()) {
            if (z2) {
                if (z) {
                    this.m.a(0);
                } else {
                    this.m.a();
                }
            } else if (z) {
                this.n.setScaleX(1.0f);
                this.n.setScaleY(1.0f);
                this.n.setVisibility(0);
            } else {
                this.n.setVisibility(8);
            }
            this.o.setEnabled(z);
            i();
        }
    }

    public final void e(boolean z) {
        this.C.setVisibility(z ? 0 : 8);
    }

    public final void f(boolean z) {
        this.D.setVisibility(z ? 0 : 8);
    }

    public final void g(boolean z) {
        this.U.setVisibility(z ? 0 : 8);
    }

    public final boolean c() {
        return this.U.getVisibility() == 0;
    }

    public final boolean d() {
        return this.H.getVisibility() == 0;
    }

    public final void e() {
        air air = bcj.b().y;
        if (air != null) {
            if (this.Y == null || !this.Y.equals(air)) {
                if (getResources().getBoolean(buf.jR)) {
                    ((GradientDrawable) this.j.getBackground()).setColor(air.a);
                } else {
                    this.j.setBackgroundColor(air.a);
                }
                this.k.setBackgroundColor(air.a);
                this.H.setTextColor(air.a);
                this.R.setBackgroundColor(air.a);
                this.Y = air;
            }
        }
    }

    private static void a(AccessibilityEvent accessibilityEvent, View view) {
        if (view != null) {
            List text = accessibilityEvent.getText();
            int size = text.size();
            view.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            if (size == text.size()) {
                text.add(null);
            }
        }
    }

    public final void f() {
        Toast.makeText(getContext(), aq.cB, 1).show();
    }

    public final void h(boolean z) {
        this.c = z;
        i();
    }

    final void i() {
        int i;
        if (this.c) {
            i = 0;
        } else {
            i = this.W;
            if (this.l.isShown() && this.w) {
                i -= this.l.getHeight();
            }
        }
        this.m.a(0, 0, i, true);
        ajw ajw = this.m;
        i = this.c ? this.v : this.u;
        ake.b(ajw.a, i, i);
    }

    public final Context getContext() {
        return getActivity();
    }

    public final void onResume() {
        super.onResume();
        this.b = getResources().getBoolean(buf.jR);
        this.w = getResources().getBoolean(buf.jQ);
        ViewGroup viewGroup = (ViewGroup) this.j.getParent();
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ayz(this, viewGroup.getViewTreeObserver(), viewGroup));
        e();
    }

    final void j() {
        this.l.getViewTreeObserver().addOnGlobalLayoutListener(new aza(this));
    }

    static void b(View view) {
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }

    public final /* synthetic */ bdj h() {
        return new azo();
    }
}
