package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import com.google.android.apps.hangouts.R$drawable;
import java.util.ArrayList;
import java.util.List;

public class ebz extends ecm {
    static final boolean d = false;
    static ecd o = new ecd();
    public String e = null;
    public CharSequence f = null;
    public String g = null;
    public CharSequence h = null;
    public Intent i = null;
    public String j = null;
    public int k = 0;
    public final blo l;
    final List<ebz> m = new ArrayList();
    final eap n;

    static {
        kae kae = glk.o;
    }

    protected CharSequence m() {
        return b(this.e != null ? this.e : this.g, this.f != null ? this.f : this.h, null, 0);
    }

    static CharSequence a(String str) {
        int i = 0;
        CharSequence o = gwb.o(str);
        if (o instanceof Spannable) {
            Spannable spannable = (Spannable) o;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            int length = uRLSpanArr.length;
            while (i < length) {
                spannable.removeSpan(uRLSpanArr[i]);
                i++;
            }
        }
        return o;
    }

    static void a(Context context, int i, eap eap, boolean z, boolean z2) {
        ebz ebz = null;
        if (eap.b.size() > 0) {
            ebz eaq;
            if (((ecj) ((ear) eap.b.get(0)).h.get(0)) instanceof ebq) {
                eaq = new eaq(context, i, eap);
                ecm.a((ecm) eaq);
            } else {
                ecm ecw = new ecw(context, i, eap, z2);
                ecm.a(ecw);
            }
            if (eap.b.size() > 1) {
                ebz = new ecf(context, i, eap, eaq, z2);
                ecm.a((ecm) ebz);
            } else {
                ecf.a(context, i);
                ebz = eaq;
            }
        }
        if (d && ebz != null) {
            String str = ebz.g;
            String valueOf = String.valueOf(ebz.h);
            new StringBuilder((String.valueOf(str).length() + 17) + String.valueOf(valueOf).length()).append("title: ").append(str).append(" content: ").append(valueOf);
        }
        if (ebz == null) {
            ebz.b(context, i);
            return;
        }
        ecw.a(context, i, ebz.t);
        ebz.a(z);
    }

    public static void b(Context context, int i) {
        ecf.a(context, i);
        ecw.a(context, i, null);
    }

    protected CharSequence a(String str, CharSequence charSequence, String str2, int i) {
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(this.r, gwb.iA);
        TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(this.r, gwb.iB);
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(textAppearanceSpan, 0, str.length(), 0);
        }
        CharSequence string = this.r.getString(bc.hz);
        if (!TextUtils.isEmpty(charSequence)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(string);
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.setSpan(textAppearanceSpan2, length, charSequence.length() + length, 0);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(string);
            }
            spannableStringBuilder.append(a(i));
        }
        return spannableStringBuilder;
    }

    ebz(Context context, int i, eap eap) {
        super(context, i, eap.a());
        this.n = eap;
        this.l = new blo(context, i);
    }

    protected void a(boolean z) {
        for (ecm a : this.m) {
            a.a(true);
        }
        Resources resources = this.r.getResources();
        this.y.a(resources.getQuantityString(gwb.ik, this.n.a, new Object[]{Integer.valueOf(this.n.a)}));
        if (this.n.a > 1) {
            this.y.b(resources.getQuantityString(gwb.il, this.n.b.size(), new Object[]{Integer.valueOf(this.n.b.size())}));
        }
        super.a(z);
    }

    protected void a() {
        this.w.a("msg");
        super.a();
    }

    protected void n() {
        for (ecm n : this.m) {
            n.n();
        }
        super.n();
    }

    protected fvd o() {
        if (this.n.b.size() > 0) {
            return ((ear) this.n.b.get(0)).a();
        }
        return fvd.MESSAGE;
    }

    protected String j() {
        if (this.n.b.size() > 0) {
            return ((ear) this.n.b.get(0)).k;
        }
        return null;
    }

    protected int f() {
        return 0;
    }

    protected boolean k() {
        String str;
        int b;
        fvd o = o();
        switch (eca.a[o.ordinal()]) {
            case 1:
                str = "sms_notification_vibrate_bool_key";
                break;
            case 2:
                str = "gv_sms_vibrate_boolean_key";
                break;
            case 3:
                str = "gv_voicemail_vibrate_boolean_key";
                break;
            default:
                str = "chat_notification_vibrate_bool_key";
                break;
        }
        jcf jcf = (jcf) jyn.a(this.r, jcf.class);
        if (o == fvd.LOCAL_SMS) {
            b = jcf.b("SMS");
        } else {
            b = this.s;
        }
        if (b != -1) {
            return jcf.a(b).a(str, true);
        }
        str = String.valueOf(o);
        glk.d("Babel", new StringBuilder(String.valueOf(str).length() + 44).append("Invalid account in shouldVibrate; notType = ").append(str).toString(), new Object[0]);
        return false;
    }

    protected Intent h() {
        return new ecb().a(this.r, this.s, this.t.b());
    }

    protected boolean b() {
        return true;
    }

    protected Intent i() {
        return this.i;
    }

    protected int g() {
        return gwb.a(this.r, "babel_notify_chat_priority_level", 1);
    }

    protected int l() {
        return R$drawable.ca;
    }

    protected void c() {
        if (eao.a(this.r)) {
            gwb.a(fde.e(this.s), 1930);
        }
    }

    protected final void b(boolean z) {
        List arrayList = new ArrayList();
        if (z) {
            for (ear ear : this.n.b) {
                if (ear.h.get(0) instanceof ebs) {
                    arrayList.add(String.valueOf(((ebs) ear.h.get(0)).j));
                }
            }
        } else {
            for (ear ear2 : this.n.b) {
                if (!TextUtils.isEmpty(ear2.a)) {
                    List list = ear2.h;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) instanceof ebs) {
                            arrayList.add(String.valueOf(((ebs) list.get(i)).j));
                        }
                    }
                }
            }
        }
        this.l.a(glj.b(), arrayList);
    }
}
