import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public class cov extends fhb implements bhe, bhi, bhj, bhm {
    public Context a;
    public final String b;
    private final CharSequence g;
    private final bxn h;
    private final int i;
    private final String j;
    private final boolean k;
    private final String l;

    public cov(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3) {
        super(bko);
        this.a = context;
        this.b = str;
        this.g = gwb.c(charSequence);
        this.h = bxn;
        this.i = i;
        this.j = str2;
        this.k = z;
        this.l = str3;
    }

    protected void a() {
        long b = glj.b();
        dvm a = ba.c().b(this.l).a(this.b).a(201);
        if (b - this.e >= gwb.a(this.a, "babel_slow_scm_logging_delay_thr_ms", fls.A)) {
            a.f(((bhl) jyn.a(this.a, bhl.class)).c());
        }
        ba.a(this.c.a, b, 10, a.a(201));
    }

    protected void d() {
        ba.a(this.c.a, glj.b(), 10, ba.c().b(this.l).a(this.b).a(101));
    }

    protected void e() {
        ba.a(this.c.a, glj.b(), 10, ba.c().b(this.l).a(this.b).a(102));
    }

    public int a(Context context, bhb bhb) {
        this.a = context;
        a();
        blo blo = new blo(context, this.c.a);
        int g = blo.g(this.b);
        if (gwb.h(g)) {
            f();
        } else {
            String u;
            switch (g) {
                case wi.l /*2*/:
                    u = this.c.b.u();
                    break;
                default:
                    u = null;
                    break;
            }
            blo.a();
            d();
            String str = this.b;
            try {
                bls f = blo.f(str);
                if (f == null) {
                    String a;
                    if (blo.a(str)) {
                        a = RealTimeChatService.a(str);
                        if (a != null) {
                            f = blo.f(a);
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
                        glk.d(str2, a, new Object[0]);
                        blo.b();
                    }
                }
                a(blo, blo.b(f.q, 1), g, u, f, str, a(f), a(g, this.h));
                blo.b();
                blo.c();
                e();
                blf.d(blo, str);
            } finally {
                blo.c();
            }
        }
        return bhn.a;
    }

    public String b() {
        return this.b;
    }

    public bhk c() {
        return bhk.NONE;
    }

    cox a(bxn bxn) {
        String str;
        hkh hkh;
        int i;
        String str2;
        int i2;
        String str3;
        int i3 = 0;
        if (bxn != null) {
            switch (cow.a[bxn.c.ordinal()]) {
                case wi.j /*1*/:
                    str = "hangouts/location";
                    hkh = ((bxw) bxn).f;
                    i = 0;
                    str2 = null;
                    i2 = 0;
                    str3 = null;
                    break;
                case wi.l /*2*/:
                case wi.z /*3*/:
                    bxy bxy = (bxy) bxn;
                    str = bxy.d;
                    str3 = bxn.a;
                    i = bxy.g;
                    i3 = bxy.f;
                    i2 = bxy.h;
                    hkh = null;
                    str2 = null;
                    break;
                case wi.h /*4*/:
                    byg byg = (byg) bxn;
                    str = byg.d;
                    str3 = bxn.a;
                    str2 = byg.f;
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

    boolean a(bls bls) {
        switch (this.i) {
            case wi.j /*1*/:
                return true;
            case wi.l /*2*/:
                return false;
            default:
                if (bls.l == 1) {
                    return true;
                }
                return false;
        }
    }

    CharSequence a(int i, bxn bxn) {
        if (bxn == null || bxn.c != bxo.LOCATION) {
            return this.g;
        }
        hkh hkh = a(bxn).g;
        if (hkh == null || !gwb.i(i)) {
            return this.g;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.g);
        CharSequence b = ((dut) jyn.a(this.a, dut.class)).b(hkh);
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("\n");
        }
        spannableStringBuilder.append(b);
        spannableStringBuilder.append("\n");
        spannableStringBuilder.append(hkh.c());
        b = hkh.b();
        if (!TextUtils.isEmpty(b)) {
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(b);
        }
        return spannableStringBuilder;
    }

    protected void a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        a(blo, j, z, i, str, str2, charSequence);
        if (blo.n(str2, h()) != fwx.FAILED_TO_SEND) {
            a(blo, z, i, str, bls, str2, charSequence);
            blo.a(str2, this.l, fwx.SENDING, 0);
        }
    }

    protected long a(blo blo, long j, boolean z, int i, String str, String str2, CharSequence charSequence) {
        List b = gwb.b(charSequence);
        List arrayList = new ArrayList();
        if (this.h != null) {
            arrayList.add(this.h);
        }
        fle a = new fea().a(str2).a(this.c.b.b()).e(j).b(this.l).a(b).b(z).a(fwx.QUEUED).b(i).d(str).c(true).c(arrayList).a();
        a.a(blo, this.d);
        return a.a();
    }

    protected fok a(cpb cpb) {
        return cpb.a();
    }

    String g() {
        return this.b;
    }

    String h() {
        return this.l;
    }

    protected void f() {
        cox a = a(this.h);
        ((for) jyn.a(this.a, for.class)).a(this.c.b, this.b, this.g, a.a, a.b, a.c, a.d, a.e, a.f, this.j, this.k, a.g, this.i, this.l);
    }

    void a(blo blo, boolean z, int i, String str, bls bls, String str2, CharSequence charSequence) {
        fdn fdn = this.c.c;
        String str3;
        String valueOf;
        if (blo.a(str2) || bls.i != 0) {
            if (bls.i == 2 || bls.k == 1) {
                if (bls.i == 2) {
                    glk.c("Babel_ConvService", "Retry invitation accept reply since it permenantly failed", new Object[0]);
                } else {
                    glk.c("Babel_ConvService", "Send invitation accept reply since it is invited", new Object[0]);
                }
                fdn.a(new evh(str2, 1), -1);
            } else if (bls.i == 4) {
                glk.c("Babel_ConvService", "Retry create conversation which was failed to create.", new Object[0]);
                String str4 = "Babel_ConvService";
                str3 = "Retry create conversation which was failed to create. ConversationId: ";
                valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                glk.a(str4, valueOf, new Object[0]);
                RealTimeChatService.h(this.c.b, str2);
            } else {
                glk.c("Babel_ConvService", "sendRequest() enters an invalid state.", new Object[0]);
                glk.a("Babel_ConvService", new StringBuilder(String.valueOf(str2).length() + 93).append("sendRequest() enters an invalid state. ConversationId: ").append(str2).append(", conversationDisposition: ").append(bls.i).toString(), new Object[0]);
            }
        } else if (blo.W(str2)) {
            blf.a(blo.g(), str2, 5);
            fdn.a(new euw(new eup(this.l, 1, null, blf.a(blo.g(), str2), null), str2), -1);
            glk.c("Babel_ConvService", "Checking the server to see if we can move this conversation fromthe contingency state", new Object[0]);
        } else {
            long l = blo.l(str2);
            List arrayList = new ArrayList();
            if (!(this.h == null || this.h.c != bxo.STICKER || blo.ae(((byg) this.h).f) == null)) {
                arrayList.add(gwb.b(this.a, "babel_stickers_account_id", "108618507921641169817"));
            }
            List b = gwb.b(charSequence);
            List arrayList2 = new ArrayList();
            if (this.h != null) {
                arrayList2.add(this.h);
            }
            if (blo.n(str2, this.l) == fwx.PENDING_DELETE) {
                blo.a("conversation_id=? AND message_id=?", new String[]{str2, this.l});
                return;
            }
            long j = 1 + l;
            fok a = a(new cpb(this.l, str2).a(blo.S(str2)).a(l).a(z).b(false).b(str).a(i).b(1).a(b).b(arrayList2).c(arrayList));
            str3 = "Babel_ConvService";
            String str5 = "Sending request for ";
            valueOf = String.valueOf(this.l);
            glk.c(str3, valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5), new Object[0]);
            str3 = String.valueOf(a);
            glk.a("Babel_ConvService", new StringBuilder(String.valueOf(str3).length() + 24).append("Sending request detail: ").append(str3).toString(), new Object[0]);
            fdn.a(a, -1);
            blo.b(str2, j);
        }
    }
}
