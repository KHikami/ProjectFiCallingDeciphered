import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.ConversationNameView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class gno extends gmt implements bnq {
    static int a;
    static int b;
    static int c;
    public static int k;
    static boolean m;
    private static final boolean n;
    private static Boolean o;
    private String A;
    private String B;
    private String C;
    private String D;
    private int E;
    private String F;
    private String G;
    private long H;
    private String I;
    private int J;
    private String K;
    private String L;
    private String M;
    private int N;
    private boolean O;
    private boolean P;
    private String Q;
    private boolean R;
    private int S;
    private Object T;
    private final azx<Drawable> U;
    private final bnq V;
    private final StringBuilder W;
    bnn d;
    gkt e;
    public String f;
    public int g;
    public int h;
    public int i;
    public dbj j;
    public int l;
    private bnn p;
    private gkt q;
    private dex r;
    private dey s;
    private int t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private String y;
    private int z;

    public abstract void a(int i);

    public abstract void a(int i, int i2, int i3);

    public abstract void a(Bitmap bitmap);

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    public abstract void a(boolean z, Bitmap bitmap, boolean z2, Object obj);

    public abstract CharSequence b();

    public abstract void b(int i);

    public abstract void b(Drawable drawable);

    public abstract void b(CharSequence charSequence);

    public abstract void b(String str);

    public abstract CharSequence c();

    public abstract void c(int i);

    public abstract void c(Drawable drawable);

    public abstract void c(CharSequence charSequence);

    public abstract TextView d();

    public abstract void d(int i);

    public abstract void d(CharSequence charSequence);

    public abstract int e();

    public abstract void e(int i);

    public abstract CharSequence f();

    public abstract void f(int i);

    public abstract CharSequence g();

    public abstract void g(int i);

    public abstract int h();

    public abstract void h(int i);

    public abstract int i();

    public abstract void i(int i);

    public abstract int j();

    public abstract void j(int i);

    public abstract int k();

    public abstract void k(int i);

    public abstract void l();

    public abstract void l(int i);

    public abstract void m(int i);

    public abstract boolean m();

    public abstract void n(int i);

    static {
        kae kae = glk.u;
        n = false;
        o = null;
        k = 0;
        gwb.a(new gnp());
    }

    public gno(Context context) {
        this(context, null);
    }

    public gno(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        this.S = 0;
        this.U = new gnq(this);
        this.V = new gnr(this);
        this.W = new StringBuilder();
        this.w = false;
        int i = k;
        k = i + 1;
        this.l = i;
        this.r = (dex) jyn.a(context, dex.class);
        this.s = (dey) jyn.a(context, dey.class);
    }

    protected gno(Context context, int i, int i2, boolean z, boolean z2) {
        this(context, null);
        this.x = i;
        this.J = i2;
        this.R = z;
        this.O = z2;
    }

    public void onFinishInflate() {
        o = Boolean.valueOf(dgg.a().c());
        super.onFinishInflate();
    }

    public void a(dbj dbj) {
        this.j = dbj;
    }

    private void c(String str) {
        CharSequence string;
        CharSequence charSequence = null;
        if (this.R) {
            string = getResources().getString(bc.jr, new Object[]{getResources().getString(bc.gZ)});
        } else if (this.g == 2) {
            String str2 = this.A;
            if (TextUtils.isEmpty(str2)) {
                str2 = this.F;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.M;
            }
            if (PhoneNumberUtils.isGlobalPhoneNumber(str2)) {
                str2 = glq.i(getContext(), str2);
            }
            string = getResources().getString(bc.jr, new Object[]{str2});
        } else {
            string = null;
        }
        if (this.x == 9) {
            int a = gld.a(this.B, "://");
            if (a > 0) {
                charSequence = getResources().getQuantityString(gwb.ij, a, new Object[]{Integer.valueOf(a)});
            }
        }
        a(str, string, charSequence);
    }

    private void b(Cursor cursor) {
        int b = (int) ConversationListFragment.b(cursor);
        this.L = EsProvider.b(cursor.getString(20), b);
        this.M = EsProvider.b(cursor.getString(7), b);
        this.N = this.M.split(", ").length;
    }

    void a(Cursor cursor) {
        boolean z = true;
        if (this.x == 8 || this.x == 11) {
            boolean z2;
            Long l = null;
            if (!cursor.isNull(32)) {
                l = Long.valueOf(cursor.getLong(32));
            }
            if (gwb.a(l) > cursor.getLong(27)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.w = z2;
            return;
        }
        if (this.R || !this.O) {
            z = false;
        }
        this.w = z;
    }

    public void a(Cursor cursor, bko bko, boolean z, Object obj) {
        String str;
        String str2;
        y();
        this.T = obj;
        TextView textView = (TextView) findViewById(ba.aB);
        long a = ConversationListFragment.a(cursor);
        int i = (int) a;
        this.t = (int) (a >> 32);
        this.f = EsProvider.b(cursor.getString(1), i);
        this.x = EsProvider.a(cursor.getString(8), i);
        if (this.x == 3 && !m()) {
            this.x = 9;
        }
        this.E = EsProvider.a(cursor.getString(28), i);
        this.y = EsProvider.b(cursor.getString(9), i);
        this.z = EsProvider.a(cursor.getString(29), i);
        this.C = EsProvider.b(cursor.getString(11), i);
        this.D = EsProvider.b(cursor.getString(10), i);
        this.B = EsProvider.b(cursor.getString(12), i);
        this.F = EsProvider.b(cursor.getString(30), i);
        this.A = EsProvider.b(cursor.getString(13), i);
        this.O = EsProvider.a(cursor.getString(25), i) != 0;
        this.P = EsProvider.a(cursor.getString(42), i) != 0;
        this.G = EsProvider.b(cursor.getString(34), i);
        this.I = EsProvider.b(cursor.getString(33), i);
        this.J = EsProvider.a(cursor.getString(36), i);
        int a2 = EsProvider.a(cursor.getString(39), i);
        StringBuilder stringBuilder = new StringBuilder();
        a2 /= 1000;
        int i2 = a2 / 60;
        a2 %= 60;
        stringBuilder.append(i2);
        stringBuilder.append(":");
        if (a2 < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(a2);
        this.K = stringBuilder.toString();
        this.S = EsProvider.a(cursor.getString(29), i);
        b(cursor);
        this.g = cursor.getInt(3);
        boolean z2 = this.C == null || TextUtils.equals(this.C, bko.b().b);
        this.R = z2;
        this.i = cursor.getInt(22);
        if (z) {
            a2 = 4;
        } else if (cursor.getInt(22) != 0) {
            a2 = 1;
        } else if (this.x == 1) {
            a2 = 2;
        } else if (this.x == 8) {
            a2 = 3;
        } else if (this.x == 10) {
            a2 = 5;
        } else if (this.x == 11) {
            a2 = 6;
        } else {
            a2 = 0;
        }
        a(a2, cursor);
        if (n) {
            str = "bindConversationItem ";
            String valueOf = String.valueOf(this.f);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (m && textView != null) {
            textView.setText(this.t > 1 ? String.format("(%d)", new Object[]{Integer.valueOf(this.t)}) : "");
        }
        Object string = cursor.getString(6);
        if (TextUtils.isEmpty(string)) {
            str2 = this.M;
            if (str2 != null) {
                str = String.valueOf("L");
                str2 = String.valueOf(str2);
                if (str2.length() != 0) {
                    str2 = str.concat(str2);
                } else {
                    str2 = new String(str);
                }
                b(str2);
            } else {
                b(ConversationNameView.c(""));
            }
        } else {
            b(ConversationNameView.c(string));
        }
        long toMicros = TimeUnit.MILLISECONDS.toMicros(glj.a());
        a = cursor.getLong(5);
        if (a > 0 && a < toMicros) {
            RealTimeChatService.a(bko, this.f);
        }
        this.H = cursor.getLong(4) / 1000;
        if (q()) {
            int i3;
            toMicros = glj.a();
            b(glj.a(this.H, toMicros, false));
            c(glj.a(this.H, toMicros, true));
            Object obj2 = cursor.getInt(31) == 1 ? 1 : null;
            j(obj2 != null ? 0 : 8);
            if (cursor.getInt(2) == 10 && obj2 == null) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            h(i3);
            if (fdq.O.b(bko.g())) {
                if (cursor.getInt(2) == 25 && obj2 == null) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                i(i3);
            }
            if (cursor.getLong(26) > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            k(i3);
            l(this.x == 12 ? 0 : 8);
        }
        a(cursor);
        b(cursor);
        str2 = this.L;
        if (n()) {
            List arrayList = new ArrayList();
            if (this.N > 0) {
                List arrayList2 = new ArrayList();
                gwb.a(str2, arrayList2, arrayList);
                a(arrayList2, this.N - arrayList2.size(), bko, arrayList);
            } else {
                glk.d("Babel", "No participants found for conversation.", new Object[0]);
                a(null, 0, bko, arrayList);
            }
        }
        if (this.h != 1) {
            if (this.h != 4) {
                switch (this.x) {
                    case wi.j /*1*/:
                        a(getResources().getString(bc.gF), null, null);
                        break;
                    case wi.l /*2*/:
                    case wi.n /*9*/:
                        c(this.y);
                        break;
                    case wi.z /*3*/:
                        a(this.B, bko);
                        c(getResources().getString(bc.jo));
                        break;
                    case wi.h /*4*/:
                        a(gwb.a(bko, this.D, this.C, this.G, false), null, null);
                        break;
                    case wi.p /*5*/:
                        a(gwb.a(bko, fwx.values()[this.E], this.D, this.C, this.I, false), null, null);
                        break;
                    case wi.m /*8*/:
                        a(getResources().getString(bc.iu), null, null);
                        break;
                    case wi.dr /*10*/:
                        a(getResources().getString(bc.gG), null, null);
                        break;
                    case wi.dB /*11*/:
                        a(getResources().getString(bc.iv), null, null);
                        break;
                    case wi.dM /*12*/:
                        a(getResources().getString(bc.iW), null, null);
                        m(0);
                        d(this.K);
                        break;
                    case wi.dD /*13*/:
                        a(this.B, bko);
                        c(getResources().getString(bc.jp));
                        break;
                    case wi.dJ /*15*/:
                        c(getResources().getString(bc.jw));
                        break;
                    default:
                        break;
                }
            }
        }
        a(getResources().getString(bc.hS), null, null);
        z();
        C();
    }

    public boolean n() {
        return true;
    }

    public boolean o() {
        boolean z;
        if (this.h != 1 || this.i == 1) {
            z = false;
        } else {
            z = true;
        }
        return z && gwb.b(o);
    }

    public boolean p() {
        boolean z;
        if (this.h == 1 && this.i == 1) {
            z = true;
        } else {
            z = false;
        }
        return (z || this.h == 5) && gwb.b(o);
    }

    public boolean q() {
        return this.h == 0 || this.h == 3 || this.h == 6 || this.h == 2 || this.h == 5;
    }

    public void a(int i, Cursor cursor) {
        if (this.h != i) {
            this.h = i;
            l();
            g(q() ? 0 : 8);
        }
    }

    private void a(String str, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        a(0);
        this.y = str;
        this.u = charSequence;
        this.v = charSequence2;
        D();
        Context context = getContext();
        CharSequence charSequence4 = this.u;
        String str2 = this.y;
        CharSequence charSequence5 = this.v;
        int i = this.z;
        int i2 = this.J;
        TextView d = d();
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence4)) {
            spannableStringBuilder.append(charSequence4);
            spannableStringBuilder.append(' ');
        }
        if (TextUtils.isEmpty(str2)) {
            charSequence3 = "";
        } else if (!gwb.h(i) || i2 == 2) {
            charSequence3 = Factory.getInstance().newSpannable(gwb.o(str2));
            for (Object obj : charSequence3.getSpans(0, charSequence3.length(), Object.class)) {
                if (!(obj instanceof byj)) {
                    charSequence3.removeSpan(obj);
                }
            }
        }
        charSequence4 = gob.a(context).a(charSequence3, null, d);
        if (charSequence4 == null) {
            spannableStringBuilder.append(charSequence3);
        } else {
            spannableStringBuilder.append(charSequence4);
        }
        if (!TextUtils.isEmpty(charSequence5)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append('\n');
            }
            String valueOf = String.valueOf(charSequence5);
            charSequence3 = new SpannableString(Html.fromHtml(new StringBuilder(String.valueOf(valueOf).length() + 7).append("<i>").append(valueOf).append("</i>").toString()));
            charSequence3.setSpan(new ForegroundColorSpan(-4210753), 0, charSequence3.length(), 33);
            spannableStringBuilder.append(charSequence3);
        }
        a(spannableStringBuilder);
    }

    private void a(String str, bko bko) {
        d(0);
        String a = gld.a(str);
        if (this.r.c()) {
            this.r.b(a, this.U, this.s.d(c), null);
        } else if (!TextUtils.equals(this.Q, a) || (this.d == null && this.e == null)) {
            x();
            this.Q = a;
            this.d = new bnn(new gkc(a, bko.a()).a(c).d(true), this.V, true, null);
            boolean a2 = ((fsi) jyn.a(getContext(), fsi.class)).a(this.d);
            if (n) {
                new StringBuilder(40).append("setImageSnippet - image was cached:").append(a2);
            }
        }
    }

    private void x() {
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
        a(null);
        if (this.e != null) {
            this.e.b();
            this.e = null;
        }
        d(8);
    }

    private void y() {
        a(8);
        D();
        this.y = null;
        this.u = null;
        this.v = null;
        a(8);
        x();
        m(8);
        d(null);
    }

    private void z() {
        int i;
        int color;
        int i2;
        int i3 = -1;
        boolean z = true;
        boolean z2 = this.h == 1;
        if (z2) {
            i = R$drawable.d;
        } else {
            i = R$drawable.c;
        }
        setBackgroundResource(i);
        if (this.w) {
            color = getResources().getColor(gwb.dZ);
            i = getResources().getColor(gwb.dY);
            i2 = 1;
        } else {
            color = getResources().getColor(gwb.dZ);
            i = getResources().getColor(gwb.dX);
            i2 = 0;
        }
        if (z2) {
            i = -1;
        } else {
            i3 = color;
        }
        a(i3, i, i2);
        e(this.w ? b : a);
        f(this.w ? 255 : 127);
        b(0);
        if (this.h == 2 || this.h == 5) {
            Drawable drawable = getResources().getDrawable(R$drawable.bP);
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.8888888888888888d), (int) (((double) drawable.getIntrinsicHeight()) * 0.8888888888888888d));
            if (this.w) {
                i = getResources().getColor(gwb.dY);
            } else {
                i = getResources().getColor(gwb.dX);
            }
            a(drawable, i);
            a(drawable);
        }
        if (this.h == 3 || this.h == 6) {
            Resources resources = getResources();
            if (this.h == 6) {
                i = R$drawable.bM;
            } else {
                i = R$drawable.bX;
            }
            drawable = resources.getDrawable(i);
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.8888888888888888d), (int) (((double) drawable.getIntrinsicHeight()) * 0.8888888888888888d));
            if (this.w) {
                i = getResources().getColor(gwb.dY);
            } else {
                i = getResources().getColor(gwb.dX);
            }
            a(drawable, i);
            a(drawable);
        }
        if (this.h == 1) {
            if (p()) {
                i = R$drawable.bR;
            } else {
                i = R$drawable.bZ;
            }
            n(i);
        } else {
            resources = getResources();
            if (p()) {
                i = R$drawable.bN;
            } else {
                i = R$drawable.bY;
            }
            Drawable drawable2 = resources.getDrawable(i);
            a(drawable2, getResources().getColor(gwb.dZ));
            c(drawable2);
        }
        if (this.w) {
            i = 6;
        } else {
            i = 1;
        }
        if (!TextUtils.isEmpty(this.v)) {
            i++;
        }
        if (i != 1) {
            z = false;
        }
        a(z);
        c(i);
    }

    public void a(Drawable drawable, int i) {
        drawable.setColorFilter(i, Mode.SRC_IN);
    }

    public void setSelected(boolean z) {
        boolean isSelected = super.isSelected();
        super.setSelected(z);
        if (z != isSelected) {
            z();
            C();
        }
    }

    public void setActivated(boolean z) {
        CharSequence string;
        int i = 4;
        Resources resources = getResources();
        if (z) {
            string = resources.getString(bc.iI);
        } else {
            string = resources.getString(bc.iJ);
        }
        gld.a((View) this, null, string);
        boolean isActivated = super.isActivated();
        super.setActivated(z);
        if (z != isActivated) {
            int i2;
            z();
            C();
            View findViewById = findViewById(ba.W);
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
            View findViewById2 = findViewById(ba.B);
            if (!z) {
                i = 0;
            }
            findViewById2.setVisibility(i);
        }
    }

    private bjy A() {
        if (!((fzw) jyn.a(getContext(), fzw.class)).d()) {
            if (gwb.l(this.S)) {
                return bjy.GV;
            }
            if (gwb.h(this.S)) {
                return bjy.CARRIER;
            }
        }
        return bjy.NONE;
    }

    protected void a(List<String> list, int i, bko bko, List<String> list2) {
        boolean z;
        String c = this.p != null ? this.p.c() : this.q == null ? null : this.q.h();
        bjy A = A();
        String a = bko.a();
        int a2 = ((boz) jyn.a(getContext(), boz.class)).a();
        String str = this.f;
        Object obj = this.T;
        if (A != bjy.NONE) {
            z = true;
        } else {
            z = false;
        }
        bnn a3 = bjw.a(list, i, list2, a, a2, str, this, obj, c, z, A, true);
        boolean z2 = (list == null || list.size() == 0) && i == 0;
        boolean z3 = a3 != null || z2;
        boolean z4 = a3 != null;
        if (n) {
            String str2;
            int i2 = this.l;
            String str3 = this.f;
            String bnn = a3 == null ? "null" : a3.toString();
            String h = this.q == null ? "null" : this.q.h();
            if (list == null) {
                str2 = " null";
            } else {
                str2 = Integer.toString(list.size());
            }
            new StringBuilder((((String.valueOf(str3).length() + 119) + String.valueOf(bnn).length()) + String.valueOf(h).length()) + String.valueOf(str2).length()).append("CLIV(").append(i2).append(") setAvatarUrls convId=").append(str3).append(" newRequest=").append(bnn).append(" oldBitmap=").append(h).append(" clearPrev=").append(z3).append(" fetch=").append(z4).append(" setDefault=").append(z2).append(" avatarUrls=").append(str2);
        }
        if (z3) {
            B();
        }
        if (z4) {
            a3.b(false);
            this.p = a3;
            if (((fsi) jyn.a(getContext(), fsi.class)).a(this.p)) {
                if (n) {
                    new StringBuilder(54).append("CLIV(").append(this.l).append(") loaded setAvatarUrl came from cache.");
                }
                this.p = null;
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = z2;
        }
        if (z4) {
            a(false, blc.a(A()), true, this.T);
            if (n) {
                int i3 = this.l;
                bnn = c == null ? "true" : "false";
                String num = list == null ? "null" : Integer.toString(list.size());
                new StringBuilder((String.valueOf(bnn).length() + 79) + String.valueOf(num).length()).append("CLIV(").append(i3).append(") setAvatarUrls setting default avatar: oldkeynull=").append(bnn).append(" avatarUrls=").append(num);
            }
        }
    }

    private void B() {
        if (this.p != null) {
            this.p.b();
            this.p = null;
        }
        if (this.q != null) {
            this.q.b();
            this.q = null;
        }
    }

    public String r() {
        return this.f;
    }

    public boolean s() {
        return this.w;
    }

    private void C() {
        CharSequence g;
        this.W.setLength(0);
        Resources resources = getResources();
        if (isActivated()) {
            gld.a(this.W, resources.getString(bc.iS));
        }
        CharSequence b = b();
        if (!TextUtils.isEmpty(b)) {
            gld.a(this.W, b.toString());
        }
        if (gwb.i(this.S)) {
            gld.a(this.W, resources.getString(bc.jx));
        }
        if (h() == 0) {
            gld.a(this.W, resources.getString(bc.iR));
        }
        if (i() == 0) {
            gld.a(this.W, resources.getString(bc.iQ));
        }
        if (j() == 0) {
            gld.a(this.W, resources.getString(bc.iO));
        }
        if (k() == 0) {
            gld.a(this.W, resources.getString(bc.iT));
        }
        if (this.w) {
            gld.a(this.W, resources.getString(bc.iP));
        }
        if (e() == 0) {
            g = g();
            if (TextUtils.isEmpty(g)) {
                g = f();
            }
            if (!TextUtils.isEmpty(g)) {
                gld.a(this.W, g.toString());
            }
        }
        g = c();
        if (g != null && g.length() > 0) {
            gld.a(this.W, g);
        }
        setContentDescription(this.W);
    }

    private void D() {
        CharSequence c = c();
        if (c != null && ((c instanceof SpannableString) || (c instanceof SpannedString))) {
            gob.a(getContext()).a((Spanned) c);
        }
        a(null);
    }

    public void t() {
        y();
        B();
    }

    public int u() {
        return this.g;
    }

    public int v() {
        return this.S;
    }

    public long w() {
        return this.H;
    }

    public void a(Drawable drawable) {
    }

    public void a(boolean z, gkt gkt, boolean z2, Object obj) {
        a(z, gkt.e(), z2, obj);
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gjo);
        if (n) {
            String str;
            Object obj;
            int i = this.l;
            if (gkt == null) {
                str = null;
            } else {
                str = gkt.toString();
            }
            if (gjo == null) {
                obj = null;
            } else {
                obj = gjo.toString();
            }
            String valueOf = String.valueOf(obj);
            new StringBuilder((String.valueOf(str).length() + 79) + String.valueOf(valueOf).length()).append("CLIV(").append(i).append(") setImageBitmap ").append(str).append(" gifImage=").append(valueOf).append(" success=").append(z).append(" loadedFromCache=").append(z2);
        }
        if (this.p != bnn) {
            if (gkt != null) {
                gkt.b();
            }
            if (n) {
                valueOf = String.valueOf(this.T);
                new StringBuilder(String.valueOf(valueOf).length() + 44).append("setImage leaving early: mAvatarLoadedToken: ").append(valueOf);
                return;
            }
            return;
        }
        this.p = null;
        if (z) {
            iil.a("Expected null", this.q);
            iil.b("Expected non-null", (Object) gkt);
            this.q = gkt;
            a(!z2, gkt, false, bnn.l());
        }
    }
}
