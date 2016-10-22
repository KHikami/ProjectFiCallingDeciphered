import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
public final class adr extends ViewGroup implements SelectionBoundsAdjuster {
    static final Pattern a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private Drawable H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private TextView O;
    private ImageView P;
    private TextView Q;
    private ImageView R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private Rect ak;
    final acx b;
    public ArrayList c;
    public ArrayList d;
    public String e;
    aek f;
    boolean g;
    public boolean h;
    public int i;
    boolean j;
    boolean k;
    QuickContactBadge l;
    TextView m;
    TextView n;
    TextView o;
    TextView p;
    ImageView q;
    ImageView r;
    ColorStateList s;
    boolean t;
    boolean u;
    public boolean v;
    CharSequence w;
    int x;
    private int y;
    private int z;

    static {
        a = Pattern.compile("([\\w-\\.]+)@((?:[\\w]+\\.)+)([a-zA-Z]{2,4})|[\\w]+");
    }

    public adr(Context context, AttributeSet attributeSet, boolean z) {
        this(context, null);
        this.h = z;
    }

    public adr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
        charArrayBuffer = new CharArrayBuffer(128);
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 4;
        this.C = 16;
        this.D = 0;
        this.I = 32;
        this.J = 16;
        this.M = 3;
        this.N = 5;
        this.g = false;
        this.h = false;
        this.i = a(false);
        this.k = true;
        this.S = 0;
        this.t = false;
        this.ab = -16777216;
        this.v = true;
        this.ak = new Rect();
        if (abp.a != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, abp.a);
            this.y = obtainStyledAttributes.getDimensionPixelSize(abp.g, this.y);
            this.H = obtainStyledAttributes.getDrawable(abp.b);
            this.z = obtainStyledAttributes.getDimensionPixelOffset(abp.e, this.z);
            this.A = obtainStyledAttributes.getDimensionPixelOffset(abp.f, this.A);
            this.B = obtainStyledAttributes.getDimensionPixelOffset(abp.p, this.B);
            this.C = obtainStyledAttributes.getDimensionPixelOffset(abp.q, this.C);
            this.S = obtainStyledAttributes.getDimensionPixelOffset(abp.o, this.S);
            this.D = obtainStyledAttributes.getDimensionPixelOffset(abp.r, this.D);
            this.E = obtainStyledAttributes.getDimensionPixelOffset(abp.s, this.E);
            this.N = obtainStyledAttributes.getInteger(abp.d, this.N);
            this.M = obtainStyledAttributes.getInteger(abp.h, this.M);
            this.ab = obtainStyledAttributes.getColor(abp.i, this.ab);
            this.F = (int) obtainStyledAttributes.getDimension(abp.j, (float) ((int) getResources().getDimension(buf.cO)));
            this.I = obtainStyledAttributes.getDimensionPixelOffset(abp.u, this.I);
            this.J = obtainStyledAttributes.getDimensionPixelOffset(abp.t, this.J);
            setPaddingRelative(obtainStyledAttributes.getDimensionPixelOffset(abp.l, 0), obtainStyledAttributes.getDimensionPixelOffset(abp.n, 0), obtainStyledAttributes.getDimensionPixelOffset(abp.m, 0), obtainStyledAttributes.getDimensionPixelOffset(abp.k, 0));
            obtainStyledAttributes.recycle();
        }
        this.b = new acx(1);
        if (abp.C != null) {
            obtainStyledAttributes = getContext().obtainStyledAttributes(abp.C);
            this.s = obtainStyledAttributes.getColorStateList(abp.D);
            obtainStyledAttributes.recycle();
        }
        this.G = getResources().getDimensionPixelSize(buf.cP);
        if (this.H != null) {
            this.H.setCallback(this);
        }
        this.c = new ArrayList();
        this.d = new ArrayList();
        setLayoutDirection(3);
    }

    public static final int a(boolean z) {
        switch (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault())) {
            case rq.b /*1*/:
                return adu.b;
            default:
                return adu.a;
        }
    }

    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        View view = null;
        int resolveSize = resolveSize(0, i);
        int i6 = this.y;
        this.aa = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0;
        this.aj = 0;
        this.af = 0;
        this.ag = 0;
        this.ai = 0;
        this.ah = 0;
        if (!this.t) {
            i3 = this.S;
            this.U = i3;
            this.T = i3;
            if (!this.k && this.P == null) {
                if (!this.V) {
                    this.T = 0;
                }
                if (!this.W) {
                    this.U = 0;
                }
            }
            this.t = true;
        }
        if (this.T > 0 || this.V) {
            i3 = ((resolveSize - getPaddingLeft()) - getPaddingRight()) - (this.T + this.z);
        } else {
            i3 = (resolveSize - getPaddingLeft()) - getPaddingRight();
        }
        if (this.j) {
            i3 -= this.G + this.z;
        }
        if (this.h) {
            i3 -= this.I + this.J;
        }
        if (a(view)) {
            view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
            this.ai = view.getMeasuredWidth();
            this.ah = view.getMeasuredHeight();
            i3 -= this.ai + this.z;
        }
        if (a(this.m)) {
            if (this.i != adu.a) {
                i4 = i3 - this.D;
            } else {
                i4 = i3;
            }
            this.m.measure(MeasureSpec.makeMeasureSpec(i4, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            this.aa = this.m.getMeasuredHeight();
        }
        if (a(view)) {
            view.measure(MeasureSpec.makeMeasureSpec(i3, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            this.ac = view.getMeasuredHeight();
        }
        if (a(this.o)) {
            if (a(this.n)) {
                i4 = i3 - this.A;
                i5 = (this.N * i4) / (this.N + this.M);
                i4 = (i4 * this.M) / (this.N + this.M);
            } else {
                i4 = i3;
                i5 = i4;
                i4 = 0;
            }
        } else if (a(this.n)) {
            i4 = i3;
            i5 = 0;
        } else {
            i4 = 0;
            i5 = i4;
            i4 = 0;
        }
        if (a(this.o)) {
            this.o.measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            this.ae = this.o.getMeasuredHeight();
        }
        if (a(this.n)) {
            this.n.measure(MeasureSpec.makeMeasureSpec(i4, oe.INVALID_ID), MeasureSpec.makeMeasureSpec(0, 0));
            this.ad = this.n.getMeasuredHeight();
        }
        this.aj = Math.max(this.ad, this.ae);
        if (a(this.Q)) {
            this.Q.measure(MeasureSpec.makeMeasureSpec(i3, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            this.af = this.Q.getMeasuredHeight();
        }
        if (a(this.q)) {
            this.q.measure(MeasureSpec.makeMeasureSpec(this.C, 1073741824), MeasureSpec.makeMeasureSpec(this.C, 1073741824));
            this.ag = this.q.getMeasuredHeight();
        }
        if (this.h && a(this.r)) {
            this.r.measure(MeasureSpec.makeMeasureSpec(this.I, 1073741824), MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        }
        if (a(this.R)) {
            this.R.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
            this.aa = Math.max(this.aa, this.R.getMeasuredHeight());
        }
        if (a(this.p)) {
            if (a(this.q)) {
                i3 = (i3 - this.q.getMeasuredWidth()) - this.B;
            }
            this.p.measure(MeasureSpec.makeMeasureSpec(i3, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            this.ag = Math.max(this.ag, this.p.getMeasuredHeight());
        }
        i3 = Math.max(Math.max((((this.aa + this.ac) + this.aj) + this.af) + this.ag, (this.U + getPaddingBottom()) + getPaddingTop()), i6);
        if (this.O != null && this.O.getVisibility() == 0) {
            this.O.measure(MeasureSpec.makeMeasureSpec(this.G, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(resolveSize, i3);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        boolean b = aix.b(this);
        if (this.j) {
            if (this.O != null) {
                int measuredHeight = this.O.getMeasuredHeight();
                int i7 = ((i5 - measuredHeight) / 2) + this.E;
                TextView textView = this.O;
                int i8 = b ? paddingRight - this.G : paddingLeft;
                if (b) {
                    i6 = paddingRight;
                } else {
                    i6 = this.G + paddingLeft;
                }
                textView.layout(i8, i7, i6, measuredHeight + i7);
            }
            if (b) {
                paddingRight -= this.G;
                i6 = paddingLeft;
            } else {
                i6 = this.G + paddingLeft;
            }
        } else {
            i6 = paddingLeft;
        }
        this.ak.set(i + i6, 0, i + paddingRight, i5);
        this.K = i + i6;
        this.L = i + paddingRight;
        if (this.j) {
            if (b) {
                paddingRight -= this.z;
            } else {
                i6 += this.z;
            }
        }
        if (this.u && isActivated()) {
            this.H.setBounds(this.ak);
        }
        if (a(null)) {
            paddingLeft = ((i5 - this.ah) / 2) + 0;
            vf vfVar;
            if (this.i == adu.a) {
                vfVar = null;
                vfVar.layout(paddingRight - this.ai, paddingLeft, paddingRight, this.ah + paddingLeft);
            } else {
                vfVar = null;
                vfVar.layout(i6, paddingLeft, this.ai + i6, this.ah + paddingLeft);
            }
        }
        View view = this.l != null ? this.l : this.P;
        if (this.i != adu.a) {
            if (view != null) {
                i8 = ((i5 - this.U) / 2) + 0;
                view.layout(paddingRight - this.T, i8, paddingRight, this.U + i8);
                paddingRight -= this.T + this.z;
            } else if (this.V) {
                paddingRight -= this.T + this.z;
            }
            i6 += this.D;
        } else if (view != null) {
            i8 = ((i5 - this.U) / 2) + 0;
            view.layout(i6, i8, this.T + i6, this.U + i8);
            i6 += this.T + this.z;
        } else if (this.V) {
            i6 += this.T + this.z;
        }
        if (this.h) {
            if (a(this.r)) {
                paddingLeft = ((i5 - this.I) / 2) + 0;
                if (b) {
                    this.r.layout(i6, paddingLeft, this.I + i6, this.I + paddingLeft);
                } else {
                    this.r.layout(paddingRight - this.I, paddingLeft, paddingRight, this.I + paddingLeft);
                }
            }
            if (this.i == adu.a) {
                paddingRight -= this.I + this.J;
            } else {
                i6 += this.I + this.J;
            }
        }
        i5 = ((i5 - ((((this.aa + this.ac) + this.aj) + this.af) + this.ag)) / 2) + this.E;
        paddingLeft = 0;
        if (a(this.R)) {
            i8 = this.R.getMeasuredWidth();
            paddingLeft = this.ai > 0 ? this.ai + this.z : 0;
            if (this.i == adu.a) {
                this.R.layout((paddingRight - i8) - paddingLeft, i5, paddingRight - paddingLeft, this.aa + i5);
                paddingLeft = i8;
            } else {
                this.R.layout(i6 + paddingLeft, i5, paddingLeft + (i6 + i8), this.aa + i5);
                paddingLeft = i8;
            }
        }
        if (a(this.m)) {
            paddingLeft += this.ai > 0 ? this.ai + this.z : 0;
            if (this.i == adu.a) {
                this.m.layout(i6, i5, paddingRight - paddingLeft, this.aa + i5);
            } else {
                this.m.layout(paddingLeft + i6, i5, paddingRight, this.aa + i5);
            }
        }
        if (a(this.m) || a(this.R)) {
            i8 = i5 + this.aa;
        } else {
            i8 = i5;
        }
        if (b) {
            if (a(this.q)) {
                paddingLeft = this.q.getMeasuredWidth();
                this.q.layout(paddingRight - paddingLeft, i8, paddingRight, this.ag + i8);
                paddingLeft = paddingRight - (paddingLeft + this.B);
            } else {
                paddingLeft = paddingRight;
            }
            if (a(this.p)) {
                this.p.layout(i6, i8, paddingLeft, this.ag + i8);
            }
        } else {
            if (a(this.q)) {
                paddingLeft = this.q.getMeasuredWidth();
                this.q.layout(i6, i8, i6 + paddingLeft, this.ag + i8);
                paddingLeft = (paddingLeft + this.B) + i6;
            } else {
                paddingLeft = i6;
            }
            if (a(this.p)) {
                this.p.layout(paddingLeft, i8, paddingRight, this.ag + i8);
            }
        }
        if (a(this.p) || a(this.q)) {
            paddingLeft = this.ag + i8;
        } else {
            paddingLeft = i8;
        }
        if (a(null)) {
            TextView textView2 = null;
            textView2.layout(i6, paddingLeft, paddingRight, this.ac + paddingLeft);
            paddingLeft += this.ac;
        }
        if (!a(this.n)) {
            i8 = paddingRight;
            paddingRight = i6;
        } else if (b) {
            i8 = this.n.getMeasuredWidth() + i6;
            this.n.layout(paddingRight - this.n.getMeasuredWidth(), (this.aj + paddingLeft) - this.ad, paddingRight, this.aj + paddingLeft);
            int i9 = i8;
            i8 = paddingRight - (this.n.getMeasuredWidth() + this.A);
            paddingRight = i9;
        } else {
            this.n.layout(i6, (this.aj + paddingLeft) - this.ad, paddingRight, this.aj + paddingLeft);
            i8 = paddingRight;
            paddingRight = (this.n.getMeasuredWidth() + this.A) + i6;
        }
        if (a(this.o)) {
            if (b) {
                this.o.layout(i8 - this.o.getMeasuredWidth(), (this.aj + paddingLeft) - this.ae, i8, this.aj + paddingLeft);
            } else {
                this.o.layout(paddingRight, (this.aj + paddingLeft) - this.ae, i8, this.aj + paddingLeft);
            }
        }
        if (a(this.n) || a(this.o)) {
            paddingLeft += this.aj;
        }
        if (a(this.Q)) {
            this.Q.layout(i6, paddingLeft, i8, this.af + paddingLeft);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        if (this.v) {
            rect.top += this.ak.top;
            rect.bottom = rect.top + this.ak.height();
            rect.left = this.ak.left;
            rect.right = this.ak.right;
        }
    }

    private static boolean a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    final LayoutParams a() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = this.S;
        generateDefaultLayoutParams.height = generateDefaultLayoutParams.width;
        return generateDefaultLayoutParams;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.u) {
            this.H.setState(getDrawableState());
        }
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.H || super.verifyDrawable(drawable);
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.u) {
            this.H.jumpToCurrentState();
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.u && isActivated()) {
            this.H.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.O == null) {
                this.O = new TextView(getContext());
                this.O.setTextAppearance(getContext(), buf.gX);
                this.O.setGravity(aix.b(this) ? 5 : 3);
                addView(this.O);
            }
            a(this.O, (CharSequence) str);
            this.O.setVisibility(0);
            this.O.setAllCaps(true);
        } else if (this.O != null) {
            this.O.setVisibility(8);
        }
    }

    public final ImageView b() {
        if (this.P == null) {
            this.P = new ImageView(getContext());
            this.P.setLayoutParams(a());
            this.P.setBackground(null);
            addView(this.P);
            this.t = false;
        }
        return this.P;
    }

    public final void a(boolean z, boolean z2) {
        this.t = false;
        this.V = z;
        this.W = z2;
        if (this.P != null) {
            removeView(this.P);
            this.P = null;
        }
        if (this.l != null) {
            removeView(this.l);
            this.l = null;
        }
    }

    public final TextView c() {
        if (this.n == null) {
            this.n = new TextView(getContext());
            this.n.setLayoutParams(new LayoutParams(-2, -2));
            this.n.setSingleLine(true);
            this.n.setEllipsize(TruncateAt.MARQUEE);
            this.n.setTextAppearance(getContext(), buf.gY);
            if (this.i == adu.a) {
                this.n.setAllCaps(true);
            } else {
                this.n.setTypeface(this.n.getTypeface(), 1);
            }
            this.n.setActivated(isActivated());
            this.n.setId(cob.q);
            addView(this.n);
        }
        return this.n;
    }

    public final TextView d() {
        if (this.o == null) {
            this.o = new TextView(getContext());
            this.o.setSingleLine(true);
            this.o.setEllipsize(TruncateAt.MARQUEE);
            this.o.setTextAppearance(getContext(), buf.gY);
            this.o.setTextAlignment(5);
            this.o.setActivated(isActivated());
            this.o.setId(cob.p);
            if (abw.h()) {
                this.o.setElegantTextHeight(false);
            }
            addView(this.o);
        }
        return this.o;
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            acx acx = this.b;
            if (this.Q == null) {
                this.Q = new TextView(getContext());
                this.Q.setSingleLine(true);
                this.Q.setEllipsize(TruncateAt.MARQUEE);
                this.Q.setTextAppearance(getContext(), 16973894);
                this.Q.setTextAlignment(5);
                this.Q.setActivated(isActivated());
                addView(this.Q);
            }
            acx.a(this.Q, str, this.e);
            this.Q.setVisibility(0);
            if (aim.a((CharSequence) str)) {
                this.Q.setContentDescription(buf.a((CharSequence) str));
            } else {
                this.Q.setContentDescription(null);
            }
        } else if (this.Q != null) {
            this.Q.setVisibility(8);
        }
    }

    public final void b(boolean z) {
        int i = 0;
        if (this.R != null) {
            ImageView imageView = this.R;
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        } else if (z) {
            this.R = new ImageView(getContext());
            addView(this.R);
            this.R.setImageResource(buf.dg);
            this.R.setScaleType(ScaleType.CENTER_INSIDE);
            this.R.setVisibility(0);
        }
    }

    static TruncateAt e() {
        return TruncateAt.MARQUEE;
    }

    public final void a(Cursor cursor, int i) {
        a(cursor.getString(i));
        if (this.l != null) {
            this.l.setContentDescription(getContext().getString(buf.ey, new Object[]{this.m.getText()}));
        }
    }

    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.w;
        } else if (this.e != null) {
            charSequence = this.b.a(charSequence, this.e);
        } else if (this.c.size() != 0) {
            CharSequence spannableString = new SpannableString(charSequence);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                adt adt = (adt) it.next();
                this.b.a((SpannableString) spannableString, adt.a, adt.b);
            }
            charSequence = spannableString;
        }
        if (this.m == null) {
            this.m = new TextView(getContext());
            this.m.setSingleLine(true);
            this.m.setEllipsize(TruncateAt.MARQUEE);
            this.m.setTextColor(this.ab);
            this.m.setTextSize(0, (float) this.F);
            this.m.setActivated(isActivated());
            this.m.setGravity(16);
            this.m.setTextAlignment(5);
            this.m.setId(cob.r);
            if (abw.h()) {
                this.m.setElegantTextHeight(false);
            }
            addView(this.m);
        }
        a(this.m, charSequence);
        if (aim.a(charSequence)) {
            this.m.setTextDirection(3);
            this.m.setContentDescription(buf.a(charSequence.toString()));
            return;
        }
        this.m.setContentDescription(charSequence.toString());
    }

    static String a(String str, int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        while (i4 < str.length()) {
            if (!Character.isLetterOrDigit(str.charAt(i4))) {
                break;
            }
            i5--;
            i4++;
        }
        i4 = i;
        i5 = i2;
        int i6 = i5;
        int i7 = i5;
        i5 = i;
        for (i3 = i - 1; i3 >= 0 && i6 > 0; i3--) {
            if (!Character.isLetterOrDigit(str.charAt(i3))) {
                i5 = i3;
                i7 = i6;
            }
            i6--;
        }
        for (i3 = i4; i3 < str.length() && i7 > 0; i3++) {
            if (!Character.isLetterOrDigit(str.charAt(i3))) {
                i4 = i3;
            }
            i7--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (i5 > 0) {
            stringBuilder.append("...");
        }
        stringBuilder.append(str.substring(i5, i4));
        if (i4 < str.length()) {
            stringBuilder.append("...");
        }
        return stringBuilder.toString();
    }

    public final void requestLayout() {
        forceLayout();
    }

    public final void a(int i) {
        ImageView b = b();
        b.setScaleType(ScaleType.CENTER);
        Drawable a = gd.a(getContext(), i);
        int c = gd.c(getContext(), buf.cH);
        if (abw.h()) {
            b.setImageDrawable(a);
            b.setImageTintList(ColorStateList.valueOf(c));
            return;
        }
        a = gr.e(a).mutate();
        gr.a(a, c);
        b.setImageDrawable(a);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!this.ak.contains((int) x, (int) y)) {
            boolean z;
            if (x < ((float) this.K) || x >= ((float) this.L) || y < 0.0f || y >= ((float) (getBottom() - getTop()))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    final void a(TextView textView, CharSequence charSequence) {
        if (TruncateAt.MARQUEE == TruncateAt.MARQUEE) {
            CharSequence spannableString = new SpannableString(charSequence);
            spannableString.setSpan(TruncateAt.MARQUEE, 0, spannableString.length(), 33);
            textView.setText(spannableString);
            return;
        }
        textView.setText(charSequence);
    }
}
