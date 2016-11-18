package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class fju extends fhb {
    private static final boolean f13258a = false;
    private String f13259b;
    private String f13260g;
    private String f13261h;
    private String f13262i;
    private int f13263j;
    private String f13264k;
    private Long f13265l;
    private final boolean f13266m;
    private int f13267n;
    private int f13268o;
    private int f13269p;
    private String f13270q;
    private boolean f13271r;
    private hkh f13272s;
    private String f13273t;
    private String f13274u;
    private int f13275v;
    private long f13276w;
    private final long f13277x = (glj.m17963b() * 1000);
    private final Context f13278y;

    static {
        kae kae = glk.f15568o;
    }

    public fju(Context context, bko bko, String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, String str6, String str7, boolean z, hkh hkh, long j, int i4) {
        super(bko);
        this.f13278y = context;
        this.f13259b = str;
        this.f13260g = str2;
        this.f13261h = gwb.m1448S(str3);
        this.f13262i = str4;
        this.f13263j = i;
        this.f13264k = str5;
        this.f13268o = i2;
        this.f13269p = i3;
        this.f13273t = str6;
        this.f13270q = str7;
        this.f13266m = false;
        this.f13271r = z;
        this.f13276w = j;
        this.f13267n = i4;
        this.f13272s = hkh;
    }

    public fju(Context context, bko bko, String str, long j, long j2) {
        super(bko);
        this.f13278y = context;
        if (j != -1) {
            this.f13265l = Long.valueOf(j);
        }
        this.f13259b = str;
        this.f13266m = true;
        this.f13276w = j2;
    }

    public void w_() {
        if (this.f13266m) {
            if (glk.m17973a("Babel", 3)) {
                glk.m17970a("Babel", "retrySendSMS", new Object[0]);
            }
            blo blo = new blo(this.f13278y, this.f5736c.f12721a);
            blo.m6043e(this.f13259b);
            blf.m5782a(blo, this.f13259b, gwb.m1523a(this.f13265l), this.f5737d, this.f13276w, this.f13277x);
            return;
        }
        String str;
        if (glk.m17973a("Babel", 3)) {
            String str2 = "Babel";
            String str3 = this.f13261h != null ? "..." : null;
            String str4 = this.f13262i;
            glk.m17970a(str2, new StringBuilder((String.valueOf(str3).length() + 61) + String.valueOf(str4).length()).append("sendOriginalSms: text=").append(str3).append(", mAttachmentUri=").append(str4).append(", rotation=").append(this.f13263j).toString(), new Object[0]);
        }
        int i = this.f5736c.f12721a;
        ba.m4548a(i, this.f13277x / 1000, 10, ba.m4618c().m12794b(this.f13260g).m12789a(this.f13259b).m12786a(210));
        blo blo2 = new blo(this.f13278y, i);
        if (glk.m17973a("Babel", 3)) {
            str4 = "Babel";
            str = "sendSmsLocally conversationId: ";
            str3 = String.valueOf(this.f13259b);
            if (str3.length() != 0) {
                str3 = str.concat(str3);
            } else {
                str3 = new String(str);
            }
            glk.m17970a(str4, str3, new Object[0]);
        }
        boolean e = ba.m4636e(this.f13273t);
        if (this.f13264k != null) {
            if (glk.m17973a("Babel", 3)) {
                String str5 = "Babel";
                str4 = "sending image picasaPhotoId ";
                str3 = String.valueOf(this.f13264k);
                if (str3.length() != 0) {
                    str3 = str4.concat(str3);
                } else {
                    str3 = new String(str4);
                }
                glk.m17970a(str5, str3, new Object[0]);
            }
        } else if (!(e || this.f13262i == null)) {
            if (glk.m17973a("Babel", 3)) {
                str4 = "Babel";
                str = "sending image ";
                str3 = String.valueOf(this.f13262i);
                if (str3.length() != 0) {
                    str3 = str.concat(str3);
                } else {
                    str3 = new String(str);
                }
                glk.m17970a(str4, str3, new Object[0]);
            }
            if (this.f13262i.startsWith(gwb.m2249i(this.f13278y))) {
                glk.m17970a("Babel", "Sticker cache file found.", new Object[0]);
            } else if (TextUtils.equals(Uri.parse(this.f13262i).getAuthority(), EsProvider.f5998a)) {
                if (glk.m17973a("Babel", 3)) {
                    str4 = "Babel";
                    str = "sending attachment ";
                    str3 = String.valueOf(this.f13262i);
                    glk.m17970a(str4, str3.length() != 0 ? str.concat(str3) : new String(str), new Object[0]);
                }
                if ("hangouts/location".equals(this.f13273t)) {
                    if (m15494a(this.f13262i)) {
                        this.f13273t = "image/jpeg";
                    } else {
                        str4 = "Babel";
                        str = "sending location failed because image not ready ";
                        str3 = String.valueOf(this.f13262i);
                        glk.m17981d(str4, str3.length() != 0 ? str.concat(str3) : new String(str), new Object[0]);
                        this.f13262i = null;
                    }
                }
            } else {
                glk.m17981d("Babel", "trying to send an attachment that doesn't exist", new Object[0]);
                this.f13262i = null;
            }
        }
        i = blo2.m6055g(this.f13259b);
        ba.m4609b(gwb.m2237h(i));
        if (!glq.m18010b(gwb.m1400H())) {
            RealTimeChatService.m9088c(this.f5736c.f12722b);
        }
        this.f13265l = Long.valueOf(m15493a(blo2, i));
    }

    private long m15493a(blo blo, int i) {
        blo.m5958a();
        try {
            String b;
            long d = blo.m6037d(this.f13259b, 1000);
            if (this.f13274u != null) {
                this.f13261h = this.f13278y.getResources().getQuantityString(gwb.ic, this.f13275v > 0 ? this.f13275v : 1, new Object[]{Integer.valueOf(this.f13275v > 0 ? this.f13275v : 1)});
            }
            if (this.f13272s != null && gwb.m2254i(i)) {
                boolean z;
                StringBuilder stringBuilder = new StringBuilder(this.f13261h);
                b = ((dut) jyn.m25426a(this.f13278y, dut.class)).mo1689b(this.f13272s);
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("\n");
                }
                stringBuilder.append(b);
                if (this.f13261h.length() <= 160) {
                    z = true;
                } else {
                    z = false;
                }
                iil.m21874a("Expected condition to be true", z);
                stringBuilder.append("\n");
                stringBuilder.append(this.f13272s.mo1285c());
                CharSequence b2 = this.f13272s.mo1284b();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append("\n");
                    stringBuilder.append(b2);
                }
                this.f13261h = stringBuilder.toString();
            }
            ArrayList arrayList = new ArrayList();
            if ("hangouts/location".equals(this.f13273t)) {
                if (this.f13272s == null) {
                    glk.m17982e("Babel", "mPlace should not be null", new Object[0]);
                } else {
                    dut dut = (dut) jyn.m25426a(this.f13278y, dut.class);
                    arrayList.add(new fpb(new int[]{0}, null, null, this.f13272s.mo1285c().toString(), this.f13272s.mo1286d().f7681a, this.f13272s.mo1286d().f7682b, this.f13272s.mo1284b().toString(), dut.mo1685a(this.f13272s), dut.mo1689b(this.f13272s)));
                }
            } else if (!(this.f13264k == null && this.f13262i == null)) {
                if (this.f13264k != null) {
                    glk.m17979c("Babel", "[SendMessageOp] photo: sending photo with photo id", new Object[0]);
                } else {
                    glk.m17979c("Babel", "[SendMessageOp] photo: sending photo with url", new Object[0]);
                }
                if (this.f13273t == null) {
                    this.f13273t = this.f13278y.getContentResolver().getType(Uri.parse(this.f13262i));
                    if (this.f13273t == null) {
                        this.f13273t = "image/jpg";
                    }
                }
                arrayList.add(new fpc(new int[]{0}, null, null, this.f13264k, null, null, this.f13262i, this.f13268o, this.f13269p, this.f13273t, this.f13263j, null, null, null, null));
            }
            List<String> g = blf.m5824g(blo, this.f13259b);
            fle a = new fea().m15116a(this.f13259b).m15113a(this.f5736c.f12722b.m5632b()).m15134e(d).m15122b(this.f13260g).m15127c(this.f13261h).m15123b((List) arrayList).m15124b(false).m15115a(fwx.SENDING).m15120b(3).m15125c(this.f13271r ? 129 : 0).m15138f(this.f13270q).m15130d(6).m15142h(TextUtils.join(",", g)).m15129c(true).m15133e(this.f13271r ? 1 : 0).m15143i(this.f13274u).m15139g(this.f13275v).m15119a();
            a.m15617a(blo, this.f5737d);
            if (this.f13271r) {
                m8039a(new fjs(this.f13259b, this.f13260g, d).m15485a((String[]) g.toArray(new String[0])).m15484a(this.f13270q).m15487b(this.f13261h).m15489c(this.f13262i).m15491d(this.f13273t).m15482a(this.f13268o).m15486b(this.f13269p).m15488c(this.f13263j).m15492e(this.f13274u).m15490d(this.f13275v).m15483a(a.m15616a()).m15481a());
            } else {
                long a2 = fyi.m16583a(this.f13278y, (List) g);
                String U = blo.m5929U(this.f13259b);
                for (String b3 : g) {
                    m8039a(new fjx(this.f13259b, this.f13260g, d).m15517a(b3).m15519b(this.f13261h).m15516a(a2).m15520c(U).m15518b(a.m15616a()).m15515a());
                }
            }
            Long valueOf = Long.valueOf(a.m15616a());
            blo.m6015b();
            blf.m5821d(blo, this.f13259b);
            if (valueOf == null) {
                return -1;
            }
            return gwb.m1523a(valueOf);
        } finally {
            blo.m6028c();
        }
    }

    private boolean m15494a(String str) {
        String str2;
        String str3;
        String valueOf;
        if (glk.m17973a("Babel", 3)) {
            str2 = "Babel";
            str3 = "Check readiness for location image: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17976b(str2, valueOf, new Object[0]);
        }
        int i = 0;
        while (i < 2) {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f13278y.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null && openFileDescriptor.getStatSize() > 0) {
                    return true;
                }
                Thread.sleep(1000);
                i++;
            } catch (FileNotFoundException e) {
                str3 = "Babel";
                String str4 = "Location image not ready, will retry after 1 second: ";
                valueOf = String.valueOf(str);
                glk.m17981d(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
            } catch (InterruptedException e2) {
                str2 = "Babel";
                str3 = "Location image check interrupted.";
                valueOf = String.valueOf(str);
                glk.m17981d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            }
        }
        str2 = "Babel";
        str3 = "Failed to get location image. Skipping it: ";
        valueOf = String.valueOf(str);
        glk.m17982e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        return false;
    }

    public Object v_() {
        return this.f13265l;
    }
}
