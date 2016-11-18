package p000;

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
    static final boolean f11037d = false;
    static ecd f11038o = new ecd();
    public String f11039e = null;
    public CharSequence f11040f = null;
    public String f11041g = null;
    public CharSequence f11042h = null;
    public Intent f11043i = null;
    public String f11044j = null;
    public int f11045k = 0;
    public final blo f11046l;
    final List<ebz> f11047m = new ArrayList();
    final eap f11048n;

    static {
        kae kae = glk.f15568o;
    }

    protected CharSequence m13348m() {
        return m13307b(this.f11039e != null ? this.f11039e : this.f11041g, this.f11040f != null ? this.f11040f : this.f11042h, null, 0);
    }

    static CharSequence m13332a(String str) {
        int i = 0;
        CharSequence o = gwb.m2313o(str);
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

    static void m13333a(Context context, int i, eap eap, boolean z, boolean z2) {
        ebz ebz = null;
        if (eap.f11060b.size() > 0) {
            ebz eaq;
            if (((ecj) ((ear) eap.f11060b.get(0)).f11068h.get(0)) instanceof ebq) {
                eaq = new eaq(context, i, eap);
                ecm.m13299a((ecm) eaq);
            } else {
                ecm ecw = new ecw(context, i, eap, z2);
                ecm.m13299a(ecw);
            }
            if (eap.f11060b.size() > 1) {
                ebz = new ecf(context, i, eap, eaq, z2);
                ecm.m13299a((ecm) ebz);
            } else {
                ecf.m13504a(context, i);
                ebz = eaq;
            }
        }
        if (f11037d && ebz != null) {
            String str = ebz.f11041g;
            String valueOf = String.valueOf(ebz.f11042h);
            new StringBuilder((String.valueOf(str).length() + 17) + String.valueOf(valueOf).length()).append("title: ").append(str).append(" content: ").append(valueOf);
        }
        if (ebz == null) {
            ebz.m13334b(context, i);
            return;
        }
        ecw.m13355a(context, i, ebz.t);
        ebz.mo1807a(z);
    }

    public static void m13334b(Context context, int i) {
        ecf.m13504a(context, i);
        ecw.m13355a(context, i, null);
    }

    protected CharSequence m13335a(String str, CharSequence charSequence, String str2, int i) {
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
            spannableStringBuilder.append(m13304a(i));
        }
        return spannableStringBuilder;
    }

    ebz(Context context, int i, eap eap) {
        super(context, i, eap.m13373a());
        this.f11048n = eap;
        this.f11046l = new blo(context, i);
    }

    protected void mo1807a(boolean z) {
        for (ecm a : this.f11047m) {
            a.mo1807a(true);
        }
        Resources resources = this.r.getResources();
        this.y.m16429a(resources.getQuantityString(gwb.ik, this.f11048n.f11059a, new Object[]{Integer.valueOf(this.f11048n.f11059a)}));
        if (this.f11048n.f11059a > 1) {
            this.y.m16436b(resources.getQuantityString(gwb.il, this.f11048n.f11060b.size(), new Object[]{Integer.valueOf(this.f11048n.f11060b.size())}));
        }
        super.mo1807a(z);
    }

    protected void mo1806a() {
        this.w.m16430a("msg");
        super.mo1806a();
    }

    protected void mo1817n() {
        for (ecm n : this.f11047m) {
            n.mo1817n();
        }
        super.mo1817n();
    }

    protected fvd mo1818o() {
        if (this.f11048n.f11060b.size() > 0) {
            return ((ear) this.f11048n.f11060b.get(0)).m13379a();
        }
        return fvd.MESSAGE;
    }

    protected String mo1814j() {
        if (this.f11048n.f11060b.size() > 0) {
            return ((ear) this.f11048n.f11060b.get(0)).f11071k;
        }
        return null;
    }

    protected int mo1810f() {
        return 0;
    }

    protected boolean mo1815k() {
        String str;
        int b;
        fvd o = mo1818o();
        switch (eca.f11162a[o.ordinal()]) {
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
        jcf jcf = (jcf) jyn.m25426a(this.r, jcf.class);
        if (o == fvd.LOCAL_SMS) {
            b = jcf.mo3461b("SMS");
        } else {
            b = this.s;
        }
        if (b != -1) {
            return jcf.mo3456a(b).mo3439a(str, true);
        }
        str = String.valueOf(o);
        glk.m17981d("Babel", new StringBuilder(String.valueOf(str).length() + 44).append("Invalid account in shouldVibrate; notType = ").append(str).toString(), new Object[0]);
        return false;
    }

    protected Intent mo1812h() {
        return new ecb().m13485a(this.r, this.s, this.t.m17808b());
    }

    protected boolean mo1808b() {
        return true;
    }

    protected Intent mo1813i() {
        return this.f11043i;
    }

    protected int mo1811g() {
        return gwb.m1492a(this.r, "babel_notify_chat_priority_level", 1);
    }

    protected int mo1816l() {
        return R$drawable.ca;
    }

    protected void mo1809c() {
        if (eao.m13368a(this.r)) {
            gwb.m1823a(fde.m15018e(this.s), 1930);
        }
    }

    protected final void m13338b(boolean z) {
        List arrayList = new ArrayList();
        if (z) {
            for (ear ear : this.f11048n.f11060b) {
                if (ear.f11068h.get(0) instanceof ebs) {
                    arrayList.add(String.valueOf(((ebs) ear.f11068h.get(0)).f11132j));
                }
            }
        } else {
            for (ear ear2 : this.f11048n.f11060b) {
                if (!TextUtils.isEmpty(ear2.f11061a)) {
                    List list = ear2.f11068h;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) instanceof ebs) {
                            arrayList.add(String.valueOf(((ebs) list.get(i)).f11132j));
                        }
                    }
                }
            }
        }
        this.f11046l.m5966a(glj.m17963b(), arrayList);
    }
}
