package p000;

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
    static int f6881a;
    static int f6882b;
    static int f6883c;
    public static int f6884k = 0;
    static boolean f6885m;
    private static final boolean f6886n = false;
    private static Boolean f6887o = null;
    private String f6888A;
    private String f6889B;
    private String f6890C;
    private String f6891D;
    private int f6892E;
    private String f6893F;
    private String f6894G;
    private long f6895H;
    private String f6896I;
    private int f6897J;
    private String f6898K;
    private String f6899L;
    private String f6900M;
    private int f6901N;
    private boolean f6902O;
    private boolean f6903P;
    private String f6904Q;
    private boolean f6905R;
    private int f6906S;
    private Object f6907T;
    private final azx<Drawable> f6908U;
    private final bnq f6909V;
    private final StringBuilder f6910W;
    bnn f6911d;
    gkt f6912e;
    public String f6913f;
    public int f6914g;
    public int f6915h;
    public int f6916i;
    public dbj f6917j;
    public int f6918l;
    private bnn f6919p;
    private gkt f6920q;
    private dex f6921r;
    private dey f6922s;
    private int f6923t;
    private CharSequence f6924u;
    private CharSequence f6925v;
    private boolean f6926w;
    private int f6927x;
    private String f6928y;
    private int f6929z;

    public abstract void mo1211a(int i);

    public abstract void mo1212a(int i, int i2, int i3);

    public abstract void mo1214a(Bitmap bitmap);

    public abstract void mo1216a(CharSequence charSequence);

    public abstract void mo1217a(boolean z);

    public abstract void mo1218a(boolean z, Bitmap bitmap, boolean z2, Object obj);

    public abstract CharSequence mo1219b();

    public abstract void mo1220b(int i);

    public abstract void mo1221b(Drawable drawable);

    public abstract void mo1222b(CharSequence charSequence);

    public abstract void mo1223b(String str);

    public abstract CharSequence mo1224c();

    public abstract void mo1225c(int i);

    public abstract void mo1226c(Drawable drawable);

    public abstract void mo1227c(CharSequence charSequence);

    public abstract TextView mo1228d();

    public abstract void mo1229d(int i);

    public abstract void mo1230d(CharSequence charSequence);

    public abstract int mo1231e();

    public abstract void mo1232e(int i);

    public abstract CharSequence mo1233f();

    public abstract void mo1234f(int i);

    public abstract CharSequence mo1235g();

    public abstract void mo1236g(int i);

    public abstract int mo1237h();

    public abstract void mo1238h(int i);

    public abstract int mo1239i();

    public abstract void mo1240i(int i);

    public abstract int mo1241j();

    public abstract void mo1242j(int i);

    public abstract int mo1243k();

    public abstract void mo1244k(int i);

    public abstract void mo1245l();

    public abstract void mo1246l(int i);

    public abstract void mo1247m(int i);

    public abstract boolean mo1248m();

    public abstract void mo1249n(int i);

    static {
        kae kae = glk.f15574u;
        gwb.m1835a(new gnp());
    }

    public gno(Context context) {
        this(context, null);
    }

    public gno(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6915h = -1;
        this.f6906S = 0;
        this.f6908U = new gnq(this);
        this.f6909V = new gnr(this);
        this.f6910W = new StringBuilder();
        this.f6926w = false;
        int i = f6884k;
        f6884k = i + 1;
        this.f6918l = i;
        this.f6921r = (dex) jyn.m25426a(context, dex.class);
        this.f6922s = (dey) jyn.m25426a(context, dey.class);
    }

    protected gno(Context context, int i, int i2, boolean z, boolean z2) {
        this(context, null);
        this.f6927x = i;
        this.f6897J = i2;
        this.f6905R = z;
        this.f6902O = z2;
    }

    public void onFinishInflate() {
        f6887o = Boolean.valueOf(dgg.m11692a().m11710c());
        super.onFinishInflate();
    }

    public void m9273a(dbj dbj) {
        this.f6917j = dbj;
    }

    private void m9261c(String str) {
        CharSequence string;
        CharSequence charSequence = null;
        if (this.f6905R) {
            string = getResources().getString(bc.jr, new Object[]{getResources().getString(bc.gZ)});
        } else if (this.f6914g == 2) {
            String str2 = this.f6888A;
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f6893F;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.f6900M;
            }
            if (PhoneNumberUtils.isGlobalPhoneNumber(str2)) {
                str2 = glq.m18038i(getContext(), str2);
            }
            string = getResources().getString(bc.jr, new Object[]{str2});
        } else {
            string = null;
        }
        if (this.f6927x == 9) {
            int a = gld.m17920a(this.f6889B, "://");
            if (a > 0) {
                charSequence = getResources().getQuantityString(gwb.ij, a, new Object[]{Integer.valueOf(a)});
            }
        }
        m9259a(str, string, charSequence);
    }

    private void m9260b(Cursor cursor) {
        int b = (int) ConversationListFragment.m8485b(cursor);
        this.f6899L = EsProvider.m8268b(cursor.getString(20), b);
        this.f6900M = EsProvider.m8268b(cursor.getString(7), b);
        this.f6901N = this.f6900M.split(", ").length;
    }

    void m9268a(Cursor cursor) {
        boolean z = true;
        if (this.f6927x == 8 || this.f6927x == 11) {
            boolean z2;
            Long l = null;
            if (!cursor.isNull(32)) {
                l = Long.valueOf(cursor.getLong(32));
            }
            if (gwb.m1523a(l) > cursor.getLong(27)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f6926w = z2;
            return;
        }
        if (this.f6905R || !this.f6902O) {
            z = false;
        }
        this.f6926w = z;
    }

    public void m9269a(Cursor cursor, bko bko, boolean z, Object obj) {
        String str;
        String str2;
        m9263y();
        this.f6907T = obj;
        TextView textView = (TextView) findViewById(ba.aB);
        long a = ConversationListFragment.m8483a(cursor);
        int i = (int) a;
        this.f6923t = (int) (a >> 32);
        this.f6913f = EsProvider.m8268b(cursor.getString(1), i);
        this.f6927x = EsProvider.m8246a(cursor.getString(8), i);
        if (this.f6927x == 3 && !mo1248m()) {
            this.f6927x = 9;
        }
        this.f6892E = EsProvider.m8246a(cursor.getString(28), i);
        this.f6928y = EsProvider.m8268b(cursor.getString(9), i);
        this.f6929z = EsProvider.m8246a(cursor.getString(29), i);
        this.f6890C = EsProvider.m8268b(cursor.getString(11), i);
        this.f6891D = EsProvider.m8268b(cursor.getString(10), i);
        this.f6889B = EsProvider.m8268b(cursor.getString(12), i);
        this.f6893F = EsProvider.m8268b(cursor.getString(30), i);
        this.f6888A = EsProvider.m8268b(cursor.getString(13), i);
        this.f6902O = EsProvider.m8246a(cursor.getString(25), i) != 0;
        this.f6903P = EsProvider.m8246a(cursor.getString(42), i) != 0;
        this.f6894G = EsProvider.m8268b(cursor.getString(34), i);
        this.f6896I = EsProvider.m8268b(cursor.getString(33), i);
        this.f6897J = EsProvider.m8246a(cursor.getString(36), i);
        int a2 = EsProvider.m8246a(cursor.getString(39), i);
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
        this.f6898K = stringBuilder.toString();
        this.f6906S = EsProvider.m8246a(cursor.getString(29), i);
        m9260b(cursor);
        this.f6914g = cursor.getInt(3);
        boolean z2 = this.f6890C == null || TextUtils.equals(this.f6890C, bko.m5632b().f11245b);
        this.f6905R = z2;
        this.f6916i = cursor.getInt(22);
        if (z) {
            a2 = 4;
        } else if (cursor.getInt(22) != 0) {
            a2 = 1;
        } else if (this.f6927x == 1) {
            a2 = 2;
        } else if (this.f6927x == 8) {
            a2 = 3;
        } else if (this.f6927x == 10) {
            a2 = 5;
        } else if (this.f6927x == 11) {
            a2 = 6;
        } else {
            a2 = 0;
        }
        mo1213a(a2, cursor);
        if (f6886n) {
            str = "bindConversationItem ";
            String valueOf = String.valueOf(this.f6913f);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (f6885m && textView != null) {
            textView.setText(this.f6923t > 1 ? String.format("(%d)", new Object[]{Integer.valueOf(this.f6923t)}) : "");
        }
        Object string = cursor.getString(6);
        if (TextUtils.isEmpty(string)) {
            str2 = this.f6900M;
            if (str2 != null) {
                str = String.valueOf("L");
                str2 = String.valueOf(str2);
                if (str2.length() != 0) {
                    str2 = str.concat(str2);
                } else {
                    str2 = new String(str);
                }
                mo1223b(str2);
            } else {
                mo1223b(ConversationNameView.m9376c(""));
            }
        } else {
            mo1223b(ConversationNameView.m9376c(string));
        }
        long toMicros = TimeUnit.MILLISECONDS.toMicros(glj.m17956a());
        a = cursor.getLong(5);
        if (a > 0 && a < toMicros) {
            RealTimeChatService.m9017a(bko, this.f6913f);
        }
        this.f6895H = cursor.getLong(4) / 1000;
        if (m9314q()) {
            int i3;
            toMicros = glj.m17956a();
            mo1222b(glj.m17958a(this.f6895H, toMicros, false));
            mo1227c(glj.m17958a(this.f6895H, toMicros, true));
            Object obj2 = cursor.getInt(31) == 1 ? 1 : null;
            mo1242j(obj2 != null ? 0 : 8);
            if (cursor.getInt(2) == 10 && obj2 == null) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            mo1238h(i3);
            if (fdq.f12773O.m14370b(bko.m5638g())) {
                if (cursor.getInt(2) == 25 && obj2 == null) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                mo1240i(i3);
            }
            if (cursor.getLong(26) > 0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            mo1244k(i3);
            mo1246l(this.f6927x == 12 ? 0 : 8);
        }
        m9268a(cursor);
        m9260b(cursor);
        str2 = this.f6899L;
        if (mo2323n()) {
            List arrayList = new ArrayList();
            if (this.f6901N > 0) {
                List arrayList2 = new ArrayList();
                gwb.m1871a(str2, arrayList2, arrayList);
                m9276a(arrayList2, this.f6901N - arrayList2.size(), bko, arrayList);
            } else {
                glk.m17981d("Babel", "No participants found for conversation.", new Object[0]);
                m9276a(null, 0, bko, arrayList);
            }
        }
        if (this.f6915h != 1) {
            if (this.f6915h != 4) {
                switch (this.f6927x) {
                    case 1:
                        m9259a(getResources().getString(bc.gF), null, null);
                        break;
                    case 2:
                    case 9:
                        m9261c(this.f6928y);
                        break;
                    case 3:
                        m9258a(this.f6889B, bko);
                        m9261c(getResources().getString(bc.jo));
                        break;
                    case 4:
                        m9259a(gwb.m1658a(bko, this.f6891D, this.f6890C, this.f6894G, false), null, null);
                        break;
                    case 5:
                        m9259a(gwb.m1655a(bko, fwx.values()[this.f6892E], this.f6891D, this.f6890C, this.f6896I, false), null, null);
                        break;
                    case 8:
                        m9259a(getResources().getString(bc.iu), null, null);
                        break;
                    case 10:
                        m9259a(getResources().getString(bc.gG), null, null);
                        break;
                    case 11:
                        m9259a(getResources().getString(bc.iv), null, null);
                        break;
                    case 12:
                        m9259a(getResources().getString(bc.iW), null, null);
                        mo1247m(0);
                        mo1230d(this.f6898K);
                        break;
                    case 13:
                        m9258a(this.f6889B, bko);
                        m9261c(getResources().getString(bc.jp));
                        break;
                    case 15:
                        m9261c(getResources().getString(bc.jw));
                        break;
                    default:
                        break;
                }
            }
        }
        m9259a(getResources().getString(bc.hS), null, null);
        m9264z();
        m9256C();
    }

    public boolean mo2323n() {
        return true;
    }

    public boolean m9312o() {
        boolean z;
        if (this.f6915h != 1 || this.f6916i == 1) {
            z = false;
        } else {
            z = true;
        }
        return z && gwb.m2061b(f6887o);
    }

    public boolean m9313p() {
        boolean z;
        if (this.f6915h == 1 && this.f6916i == 1) {
            z = true;
        } else {
            z = false;
        }
        return (z || this.f6915h == 5) && gwb.m2061b(f6887o);
    }

    public boolean m9314q() {
        return this.f6915h == 0 || this.f6915h == 3 || this.f6915h == 6 || this.f6915h == 2 || this.f6915h == 5;
    }

    public void mo1213a(int i, Cursor cursor) {
        if (this.f6915h != i) {
            this.f6915h = i;
            mo1245l();
            mo1236g(m9314q() ? 0 : 8);
        }
    }

    private void m9259a(String str, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        mo1211a(0);
        this.f6928y = str;
        this.f6924u = charSequence;
        this.f6925v = charSequence2;
        m9257D();
        Context context = getContext();
        CharSequence charSequence4 = this.f6924u;
        String str2 = this.f6928y;
        CharSequence charSequence5 = this.f6925v;
        int i = this.f6929z;
        int i2 = this.f6897J;
        TextView d = mo1228d();
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence4)) {
            spannableStringBuilder.append(charSequence4);
            spannableStringBuilder.append(' ');
        }
        if (TextUtils.isEmpty(str2)) {
            charSequence3 = "";
        } else if (!gwb.m2237h(i) || i2 == 2) {
            charSequence3 = Factory.getInstance().newSpannable(gwb.m2313o(str2));
            for (Object obj : charSequence3.getSpans(0, charSequence3.length(), Object.class)) {
                if (!(obj instanceof byj)) {
                    charSequence3.removeSpan(obj);
                }
            }
        }
        charSequence4 = gob.m18199a(context).mo2307a(charSequence3, null, d);
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
        mo1216a(spannableStringBuilder);
    }

    private void m9258a(String str, bko bko) {
        mo1229d(0);
        String a = gld.m17928a(str);
        if (this.f6921r.mo1511c()) {
            this.f6921r.mo1510b(a, this.f6908U, this.f6922s.mo1519d(f6883c), null);
        } else if (!TextUtils.equals(this.f6904Q, a) || (this.f6911d == null && this.f6912e == null)) {
            m9262x();
            this.f6904Q = a;
            this.f6911d = new bnn(new gkc(a, bko.m5629a()).m5547a(f6883c).m5558d(true), this.f6909V, true, null);
            boolean a2 = ((fsi) jyn.m25426a(getContext(), fsi.class)).mo2072a(this.f6911d);
            if (f6886n) {
                new StringBuilder(40).append("setImageSnippet - image was cached:").append(a2);
            }
        }
    }

    private void m9262x() {
        if (this.f6911d != null) {
            this.f6911d.mo607b();
            this.f6911d = null;
        }
        mo1214a(null);
        if (this.f6912e != null) {
            this.f6912e.mo2292b();
            this.f6912e = null;
        }
        mo1229d(8);
    }

    private void m9263y() {
        mo1211a(8);
        m9257D();
        this.f6928y = null;
        this.f6924u = null;
        this.f6925v = null;
        mo1211a(8);
        m9262x();
        mo1247m(8);
        mo1230d(null);
    }

    private void m9264z() {
        int i;
        int color;
        int i2;
        int i3 = -1;
        boolean z = true;
        boolean z2 = this.f6915h == 1;
        if (z2) {
            i = R$drawable.f5930d;
        } else {
            i = R$drawable.f5929c;
        }
        setBackgroundResource(i);
        if (this.f6926w) {
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
        mo1212a(i3, i, i2);
        mo1232e(this.f6926w ? f6882b : f6881a);
        mo1234f(this.f6926w ? 255 : 127);
        mo1220b(0);
        if (this.f6915h == 2 || this.f6915h == 5) {
            Drawable drawable = getResources().getDrawable(R$drawable.bP);
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.8888888888888888d), (int) (((double) drawable.getIntrinsicHeight()) * 0.8888888888888888d));
            if (this.f6926w) {
                i = getResources().getColor(gwb.dY);
            } else {
                i = getResources().getColor(gwb.dX);
            }
            mo2321a(drawable, i);
            mo1215a(drawable);
        }
        if (this.f6915h == 3 || this.f6915h == 6) {
            Resources resources = getResources();
            if (this.f6915h == 6) {
                i = R$drawable.bM;
            } else {
                i = R$drawable.bX;
            }
            drawable = resources.getDrawable(i);
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.8888888888888888d), (int) (((double) drawable.getIntrinsicHeight()) * 0.8888888888888888d));
            if (this.f6926w) {
                i = getResources().getColor(gwb.dY);
            } else {
                i = getResources().getColor(gwb.dX);
            }
            mo2321a(drawable, i);
            mo1215a(drawable);
        }
        if (this.f6915h == 1) {
            if (m9313p()) {
                i = R$drawable.bR;
            } else {
                i = R$drawable.bZ;
            }
            mo1249n(i);
        } else {
            resources = getResources();
            if (m9313p()) {
                i = R$drawable.bN;
            } else {
                i = R$drawable.bY;
            }
            Drawable drawable2 = resources.getDrawable(i);
            mo2321a(drawable2, getResources().getColor(gwb.dZ));
            mo1226c(drawable2);
        }
        if (this.f6926w) {
            i = 6;
        } else {
            i = 1;
        }
        if (!TextUtils.isEmpty(this.f6925v)) {
            i++;
        }
        if (i != 1) {
            z = false;
        }
        mo1217a(z);
        mo1225c(i);
    }

    public void mo2321a(Drawable drawable, int i) {
        drawable.setColorFilter(i, Mode.SRC_IN);
    }

    public void setSelected(boolean z) {
        boolean isSelected = super.isSelected();
        super.setSelected(z);
        if (z != isSelected) {
            m9264z();
            m9256C();
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
        gld.m17933a((View) this, null, string);
        boolean isActivated = super.isActivated();
        super.setActivated(z);
        if (z != isActivated) {
            int i2;
            m9264z();
            m9256C();
            View findViewById = findViewById(ba.f2684W);
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
            View findViewById2 = findViewById(ba.f2663B);
            if (!z) {
                i = 0;
            }
            findViewById2.setVisibility(i);
        }
    }

    private bjy m9254A() {
        if (!((fzw) jyn.m25426a(getContext(), fzw.class)).mo2155d()) {
            if (gwb.m2291l(this.f6906S)) {
                return bjy.GV;
            }
            if (gwb.m2237h(this.f6906S)) {
                return bjy.CARRIER;
            }
        }
        return bjy.NONE;
    }

    protected void m9276a(List<String> list, int i, bko bko, List<String> list2) {
        boolean z;
        String c = this.f6919p != null ? this.f6919p.mo594c() : this.f6920q == null ? null : this.f6920q.m17901h();
        bjy A = m9254A();
        String a = bko.m5629a();
        int a2 = ((boz) jyn.m25426a(getContext(), boz.class)).mo636a();
        String str = this.f6913f;
        Object obj = this.f6907T;
        if (A != bjy.NONE) {
            z = true;
        } else {
            z = false;
        }
        bnn a3 = bjw.m5528a(list, i, list2, a, a2, str, this, obj, c, z, A, true);
        boolean z2 = (list == null || list.size() == 0) && i == 0;
        boolean z3 = a3 != null || z2;
        boolean z4 = a3 != null;
        if (f6886n) {
            String str2;
            int i2 = this.f6918l;
            String str3 = this.f6913f;
            String p000_bnn = a3 == null ? "null" : a3.toString();
            String h = this.f6920q == null ? "null" : this.f6920q.m17901h();
            if (list == null) {
                str2 = " null";
            } else {
                str2 = Integer.toString(list.size());
            }
            new StringBuilder((((String.valueOf(str3).length() + 119) + String.valueOf(p000_bnn).length()) + String.valueOf(h).length()) + String.valueOf(str2).length()).append("CLIV(").append(i2).append(") setAvatarUrls convId=").append(str3).append(" newRequest=").append(p000_bnn).append(" oldBitmap=").append(h).append(" clearPrev=").append(z3).append(" fetch=").append(z4).append(" setDefault=").append(z2).append(" avatarUrls=").append(str2);
        }
        if (z3) {
            m9255B();
        }
        if (z4) {
            a3.m5521b(false);
            this.f6919p = a3;
            if (((fsi) jyn.m25426a(getContext(), fsi.class)).mo2072a(this.f6919p)) {
                if (f6886n) {
                    new StringBuilder(54).append("CLIV(").append(this.f6918l).append(") loaded setAvatarUrl came from cache.");
                }
                this.f6919p = null;
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = z2;
        }
        if (z4) {
            mo1218a(false, blc.m5740a(m9254A()), true, this.f6907T);
            if (f6886n) {
                int i3 = this.f6918l;
                p000_bnn = c == null ? "true" : "false";
                String num = list == null ? "null" : Integer.toString(list.size());
                new StringBuilder((String.valueOf(p000_bnn).length() + 79) + String.valueOf(num).length()).append("CLIV(").append(i3).append(") setAvatarUrls setting default avatar: oldkeynull=").append(p000_bnn).append(" avatarUrls=").append(num);
            }
        }
    }

    private void m9255B() {
        if (this.f6919p != null) {
            this.f6919p.mo607b();
            this.f6919p = null;
        }
        if (this.f6920q != null) {
            this.f6920q.mo2292b();
            this.f6920q = null;
        }
    }

    public String m9315r() {
        return this.f6913f;
    }

    public boolean m9316s() {
        return this.f6926w;
    }

    private void m9256C() {
        CharSequence g;
        this.f6910W.setLength(0);
        Resources resources = getResources();
        if (isActivated()) {
            gld.m17929a(this.f6910W, resources.getString(bc.iS));
        }
        CharSequence b = mo1219b();
        if (!TextUtils.isEmpty(b)) {
            gld.m17929a(this.f6910W, b.toString());
        }
        if (gwb.m2254i(this.f6906S)) {
            gld.m17929a(this.f6910W, resources.getString(bc.jx));
        }
        if (mo1237h() == 0) {
            gld.m17929a(this.f6910W, resources.getString(bc.iR));
        }
        if (mo1239i() == 0) {
            gld.m17929a(this.f6910W, resources.getString(bc.iQ));
        }
        if (mo1241j() == 0) {
            gld.m17929a(this.f6910W, resources.getString(bc.iO));
        }
        if (mo1243k() == 0) {
            gld.m17929a(this.f6910W, resources.getString(bc.iT));
        }
        if (this.f6926w) {
            gld.m17929a(this.f6910W, resources.getString(bc.iP));
        }
        if (mo1231e() == 0) {
            g = mo1235g();
            if (TextUtils.isEmpty(g)) {
                g = mo1233f();
            }
            if (!TextUtils.isEmpty(g)) {
                gld.m17929a(this.f6910W, g.toString());
            }
        }
        g = mo1224c();
        if (g != null && g.length() > 0) {
            gld.m17929a(this.f6910W, g);
        }
        setContentDescription(this.f6910W);
    }

    private void m9257D() {
        CharSequence c = mo1224c();
        if (c != null && ((c instanceof SpannableString) || (c instanceof SpannedString))) {
            gob.m18199a(getContext()).mo2309a((Spanned) c);
        }
        mo1216a(null);
    }

    public void m9317t() {
        m9263y();
        m9255B();
    }

    public int m9318u() {
        return this.f6914g;
    }

    public int m9319v() {
        return this.f6906S;
    }

    public long m9320w() {
        return this.f6895H;
    }

    public void mo1215a(Drawable drawable) {
    }

    public void mo2322a(boolean z, gkt gkt, boolean z2, Object obj) {
        mo1218a(z, gkt.m17898e(), z2, obj);
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.m21872a("Expected null", (Object) gjo);
        if (f6886n) {
            String str;
            Object obj;
            int i = this.f6918l;
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
        if (this.f6919p != bnn) {
            if (gkt != null) {
                gkt.mo2292b();
            }
            if (f6886n) {
                valueOf = String.valueOf(this.f6907T);
                new StringBuilder(String.valueOf(valueOf).length() + 44).append("setImage leaving early: mAvatarLoadedToken: ").append(valueOf);
                return;
            }
            return;
        }
        this.f6919p = null;
        if (z) {
            iil.m21872a("Expected null", this.f6920q);
            iil.m21875b("Expected non-null", (Object) gkt);
            this.f6920q = gkt;
            mo2322a(!z2, gkt, false, bnn.m5506l());
        }
    }
}
