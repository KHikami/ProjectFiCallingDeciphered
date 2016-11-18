package p000;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public class cov extends fhb implements bhe, bhi, bhj, bhm {
    public Context f8729a;
    public final String f8730b;
    private final CharSequence f8731g;
    private final bxn f8732h;
    private final int f8733i;
    private final String f8734j;
    private final boolean f8735k;
    private final String f8736l;

    public cov(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3) {
        super(bko);
        this.f8729a = context;
        this.f8730b = str;
        this.f8731g = gwb.m2082c(charSequence);
        this.f8732h = bxn;
        this.f8733i = i;
        this.f8734j = str2;
        this.f8735k = z;
        this.f8736l = str3;
    }

    protected void mo1365a() {
        long b = glj.m17963b();
        dvm a = ba.m4618c().m12794b(this.f8736l).m12789a(this.f8730b).m12786a(201);
        if (b - this.e >= gwb.m1519a(this.f8729a, "babel_slow_scm_logging_delay_thr_ms", fls.f13422A)) {
            a.m12804f(((bhl) jyn.m25426a(this.f8729a, bhl.class)).mo553c());
        }
        ba.m4548a(this.f5736c.f12721a, b, 10, a.m12786a(201));
    }

    protected void mo1367d() {
        ba.m4548a(this.f5736c.f12721a, glj.m17963b(), 10, ba.m4618c().m12794b(this.f8736l).m12789a(this.f8730b).m12786a(101));
    }

    protected void mo1368e() {
        ba.m4548a(this.f5736c.f12721a, glj.m17963b(), 10, ba.m4618c().m12794b(this.f8736l).m12789a(this.f8730b).m12786a(102));
    }

    public int mo539a(Context context, bhb bhb) {
        this.f8729a = context;
        mo1365a();
        blo blo = new blo(context, this.f5736c.f12721a);
        int g = blo.m6055g(this.f8730b);
        if (gwb.m2237h(g)) {
            mo1369f();
        } else {
            String u;
            switch (g) {
                case 2:
                    u = this.f5736c.f12722b.m5652u();
                    break;
                default:
                    u = null;
                    break;
            }
            blo.m5958a();
            mo1367d();
            String str = this.f8730b;
            try {
                bls f = blo.m6050f(str);
                if (f == null) {
                    String a;
                    if (blo.m5871a(str)) {
                        a = RealTimeChatService.m8987a(str);
                        if (a != null) {
                            f = blo.m6050f(a);
                            str = a;
                        }
                    }
                    if (f == null) {
                        String str2 = "Babel_ConvService";
                        String str3 = "Failed to find conversation: ";
                        a = String.valueOf(str);
                        if (a.length() != 0) {
                            a = str3.concat(a);
                        } else {
                            a = new String(str3);
                        }
                        glk.m17981d(str2, a, new Object[0]);
                        blo.m6015b();
                    }
                }
                mo1366a(blo, blo.m5875b(f.f3771q, 1), g, u, f, str, m10558a(f), m10554a(g, this.f8732h));
                blo.m6015b();
                blo.m6028c();
                mo1368e();
                blf.m5821d(blo, str);
            } finally {
                blo.m6028c();
            }
        }
        return bhn.f3348a;
    }

    public String mo542b() {
        return this.f8730b;
    }

    public bhk mo543c() {
        return bhk.NONE;
    }

    cox m10552a(bxn bxn) {
        String str;
        hkh hkh;
        int i;
        String str2;
        int i2;
        String str3;
        int i3 = 0;
        if (bxn != null) {
            switch (cow.f8745a[bxn.f4741c.ordinal()]) {
                case 1:
                    str = "hangouts/location";
                    hkh = ((bxw) bxn).f4756f;
                    i = 0;
                    str2 = null;
                    i2 = 0;
                    str3 = null;
                    break;
                case 2:
                case 3:
                    bxy bxy = (bxy) bxn;
                    str = bxy.d;
                    str3 = bxn.f4739a;
                    i = bxy.f4758g;
                    i3 = bxy.f4757f;
                    i2 = bxy.f4759h;
                    hkh = null;
                    str2 = null;
                    break;
                case 4:
                    byg byg = (byg) bxn;
                    str = byg.d;
                    str3 = bxn.f4739a;
                    str2 = byg.f4767f;
                    hkh = null;
                    i = 0;
                    i2 = 0;
                    break;
            }
        }
        hkh = null;
        str = null;
        i = 0;
        str2 = null;
        i2 = 0;
        str3 = null;
        return new cox(this, str3, i2, str2, i, i3, str, hkh);
    }

    boolean m10558a(bls bls) {
        switch (this.f8733i) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                if (bls.f3766l == 1) {
                    return true;
                }
                return false;
        }
    }

    CharSequence m10554a(int i, bxn bxn) {
        if (bxn == null || bxn.f4741c != bxo.LOCATION) {
            return this.f8731g;
        }
        hkh hkh = m10552a(bxn).f8752g;
        if (hkh == null || !gwb.m2254i(i)) {
            return this.f8731g;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8731g);
        CharSequence b = ((dut) jyn.m25426a(this.f8729a, dut.class)).mo1689b(hkh);
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("\n");
        }
        spannableStringBuilder.append(b);
        spannableStringBuilder.append("\n");
        spannableStringBuilder.append(hkh.mo1285c());
        b = hkh.mo1284b();
        if (!TextUtils.isEmpty(b)) {
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(b);
        }
        return spannableStringBuilder;
    }

    protected void mo1366a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        m10551a(blo, j, z, i, str, str2, charSequence);
        if (blo.m6090n(str2, m10565h()) != fwx.FAILED_TO_SEND) {
            m10557a(blo, z, i, str, bls, str2, charSequence);
            blo.m5992a(str2, this.f8736l, fwx.SENDING, 0);
        }
    }

    protected long m10551a(blo blo, long j, boolean z, int i, String str, String str2, CharSequence charSequence) {
        List b = gwb.m2005b(charSequence);
        List arrayList = new ArrayList();
        if (this.f8732h != null) {
            arrayList.add(this.f8732h);
        }
        fle a = new fea().m15116a(str2).m15113a(this.f5736c.f12722b.m5632b()).m15134e(j).m15122b(this.f8736l).m15117a(b).m15124b(z).m15115a(fwx.QUEUED).m15120b(i).m15132d(str).m15129c(true).m15128c(arrayList).m15119a();
        a.m15617a(blo, this.f5737d);
        return a.m15616a();
    }

    protected fok mo1370a(cpb cpb) {
        return cpb.m10606a();
    }

    String m10564g() {
        return this.f8730b;
    }

    String m10565h() {
        return this.f8736l;
    }

    protected void mo1369f() {
        cox a = m10552a(this.f8732h);
        ((C0058for) jyn.m25426a(this.f8729a, C0058for.class)).mo2059a(this.f5736c.f12722b, this.f8730b, this.f8731g, a.f8746a, a.f8747b, a.f8748c, a.f8749d, a.f8750e, a.f8751f, this.f8734j, this.f8735k, a.f8752g, this.f8733i, this.f8736l);
    }

    void m10557a(blo blo, boolean z, int i, String str, bls bls, String str2, CharSequence charSequence) {
        fdn fdn = this.f5736c.f12723c;
        String str3;
        String valueOf;
        if (blo.m5871a(str2) || bls.f3763i != 0) {
            if (bls.f3763i == 2 || bls.f3765k == 1) {
                if (bls.f3763i == 2) {
                    glk.m17979c("Babel_ConvService", "Retry invitation accept reply since it permenantly failed", new Object[0]);
                } else {
                    glk.m17979c("Babel_ConvService", "Send invitation accept reply since it is invited", new Object[0]);
                }
                fdn.m15078a(new evh(str2, 1), -1);
            } else if (bls.f3763i == 4) {
                glk.m17979c("Babel_ConvService", "Retry create conversation which was failed to create.", new Object[0]);
                String str4 = "Babel_ConvService";
                str3 = "Retry create conversation which was failed to create. ConversationId: ";
                valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                glk.m17970a(str4, valueOf, new Object[0]);
                RealTimeChatService.m9119h(this.f5736c.f12722b, str2);
            } else {
                glk.m17979c("Babel_ConvService", "sendRequest() enters an invalid state.", new Object[0]);
                glk.m17970a("Babel_ConvService", new StringBuilder(String.valueOf(str2).length() + 93).append("sendRequest() enters an invalid state. ConversationId: ").append(str2).append(", conversationDisposition: ").append(bls.f3763i).toString(), new Object[0]);
            }
        } else if (blo.m5931W(str2)) {
            blf.m5767a(blo.m6056g(), str2, 5);
            fdn.m15078a(new euw(new eup(this.f8736l, 1, null, blf.m5755a(blo.m6056g(), str2), null), str2), -1);
            glk.m17979c("Babel_ConvService", "Checking the server to see if we can move this conversation fromthe contingency state", new Object[0]);
        } else {
            long l = blo.m6080l(str2);
            List arrayList = new ArrayList();
            if (!(this.f8732h == null || this.f8732h.f4741c != bxo.STICKER || blo.ae(((byg) this.f8732h).f4767f) == null)) {
                arrayList.add(gwb.m1998b(this.f8729a, "babel_stickers_account_id", "108618507921641169817"));
            }
            List b = gwb.m2005b(charSequence);
            List arrayList2 = new ArrayList();
            if (this.f8732h != null) {
                arrayList2.add(this.f8732h);
            }
            if (blo.m6090n(str2, this.f8736l) == fwx.PENDING_DELETE) {
                blo.m5936a("conversation_id=? AND message_id=?", new String[]{str2, this.f8736l});
                return;
            }
            long j = 1 + l;
            fok a = mo1370a(new cpb(this.f8736l, str2).m10609a(blo.m5927S(str2)).m10608a(l).m10611a(z).m10615b(false).m10613b(str).m10607a(i).m10612b(1).m10610a(b).m10614b(arrayList2).m10616c(arrayList));
            str3 = "Babel_ConvService";
            String str5 = "Sending request for ";
            valueOf = String.valueOf(this.f8736l);
            glk.m17979c(str3, valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5), new Object[0]);
            str3 = String.valueOf(a);
            glk.m17970a("Babel_ConvService", new StringBuilder(String.valueOf(str3).length() + 24).append("Sending request detail: ").append(str3).toString(), new Object[0]);
            fdn.m15078a(a, -1);
            blo.m6018b(str2, j);
        }
    }
}
