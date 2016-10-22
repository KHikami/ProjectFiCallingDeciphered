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
    private static final boolean a;
    private String b;
    private String g;
    private String h;
    private String i;
    private int j;
    private String k;
    private Long l;
    private final boolean m;
    private int n;
    private int o;
    private int p;
    private String q;
    private boolean r;
    private hkh s;
    private String t;
    private String u;
    private int v;
    private long w;
    private final long x;
    private final Context y;

    static {
        kae kae = glk.o;
        a = false;
    }

    public fju(Context context, bko bko, String str, String str2, String str3, String str4, int i, String str5, int i2, int i3, String str6, String str7, boolean z, hkh hkh, long j, int i4) {
        super(bko);
        this.x = glj.b() * 1000;
        this.y = context;
        this.b = str;
        this.g = str2;
        this.h = gwb.S(str3);
        this.i = str4;
        this.j = i;
        this.k = str5;
        this.o = i2;
        this.p = i3;
        this.t = str6;
        this.q = str7;
        this.m = false;
        this.r = z;
        this.w = j;
        this.n = i4;
        this.s = hkh;
    }

    public fju(Context context, bko bko, String str, long j, long j2) {
        super(bko);
        this.x = glj.b() * 1000;
        this.y = context;
        if (j != -1) {
            this.l = Long.valueOf(j);
        }
        this.b = str;
        this.m = true;
        this.w = j2;
    }

    public void w_() {
        if (this.m) {
            if (glk.a("Babel", 3)) {
                glk.a("Babel", "retrySendSMS", new Object[0]);
            }
            blo blo = new blo(this.y, this.c.a);
            blo.e(this.b);
            blf.a(blo, this.b, gwb.a(this.l), this.d, this.w, this.x);
            return;
        }
        String str;
        if (glk.a("Babel", 3)) {
            String str2 = "Babel";
            String str3 = this.h != null ? "..." : null;
            String str4 = this.i;
            glk.a(str2, new StringBuilder((String.valueOf(str3).length() + 61) + String.valueOf(str4).length()).append("sendOriginalSms: text=").append(str3).append(", mAttachmentUri=").append(str4).append(", rotation=").append(this.j).toString(), new Object[0]);
        }
        int i = this.c.a;
        ba.a(i, this.x / 1000, 10, ba.c().b(this.g).a(this.b).a(210));
        blo blo2 = new blo(this.y, i);
        if (glk.a("Babel", 3)) {
            str4 = "Babel";
            str = "sendSmsLocally conversationId: ";
            str3 = String.valueOf(this.b);
            if (str3.length() != 0) {
                str3 = str.concat(str3);
            } else {
                str3 = new String(str);
            }
            glk.a(str4, str3, new Object[0]);
        }
        boolean e = ba.e(this.t);
        if (this.k != null) {
            if (glk.a("Babel", 3)) {
                String str5 = "Babel";
                str4 = "sending image picasaPhotoId ";
                str3 = String.valueOf(this.k);
                if (str3.length() != 0) {
                    str3 = str4.concat(str3);
                } else {
                    str3 = new String(str4);
                }
                glk.a(str5, str3, new Object[0]);
            }
        } else if (!(e || this.i == null)) {
            if (glk.a("Babel", 3)) {
                str4 = "Babel";
                str = "sending image ";
                str3 = String.valueOf(this.i);
                if (str3.length() != 0) {
                    str3 = str.concat(str3);
                } else {
                    str3 = new String(str);
                }
                glk.a(str4, str3, new Object[0]);
            }
            if (this.i.startsWith(gwb.i(this.y))) {
                glk.a("Babel", "Sticker cache file found.", new Object[0]);
            } else if (TextUtils.equals(Uri.parse(this.i).getAuthority(), EsProvider.a)) {
                if (glk.a("Babel", 3)) {
                    str4 = "Babel";
                    str = "sending attachment ";
                    str3 = String.valueOf(this.i);
                    glk.a(str4, str3.length() != 0 ? str.concat(str3) : new String(str), new Object[0]);
                }
                if ("hangouts/location".equals(this.t)) {
                    if (a(this.i)) {
                        this.t = "image/jpeg";
                    } else {
                        str4 = "Babel";
                        str = "sending location failed because image not ready ";
                        str3 = String.valueOf(this.i);
                        glk.d(str4, str3.length() != 0 ? str.concat(str3) : new String(str), new Object[0]);
                        this.i = null;
                    }
                }
            } else {
                glk.d("Babel", "trying to send an attachment that doesn't exist", new Object[0]);
                this.i = null;
            }
        }
        i = blo2.g(this.b);
        ba.b(gwb.h(i));
        if (!glq.b(gwb.H())) {
            RealTimeChatService.c(this.c.b);
        }
        this.l = Long.valueOf(a(blo2, i));
    }

    private long a(blo blo, int i) {
        blo.a();
        try {
            String b;
            long d = blo.d(this.b, 1000);
            if (this.u != null) {
                this.h = this.y.getResources().getQuantityString(gwb.ic, this.v > 0 ? this.v : 1, new Object[]{Integer.valueOf(this.v > 0 ? this.v : 1)});
            }
            if (this.s != null && gwb.i(i)) {
                boolean z;
                StringBuilder stringBuilder = new StringBuilder(this.h);
                b = ((dut) jyn.a(this.y, dut.class)).b(this.s);
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("\n");
                }
                stringBuilder.append(b);
                if (this.h.length() <= 160) {
                    z = true;
                } else {
                    z = false;
                }
                iil.a("Expected condition to be true", z);
                stringBuilder.append("\n");
                stringBuilder.append(this.s.c());
                CharSequence b2 = this.s.b();
                if (!TextUtils.isEmpty(b2)) {
                    stringBuilder.append("\n");
                    stringBuilder.append(b2);
                }
                this.h = stringBuilder.toString();
            }
            ArrayList arrayList = new ArrayList();
            if ("hangouts/location".equals(this.t)) {
                if (this.s == null) {
                    glk.e("Babel", "mPlace should not be null", new Object[0]);
                } else {
                    dut dut = (dut) jyn.a(this.y, dut.class);
                    arrayList.add(new fpb(new int[]{0}, null, null, this.s.c().toString(), this.s.d().a, this.s.d().b, this.s.b().toString(), dut.a(this.s), dut.b(this.s)));
                }
            } else if (!(this.k == null && this.i == null)) {
                if (this.k != null) {
                    glk.c("Babel", "[SendMessageOp] photo: sending photo with photo id", new Object[0]);
                } else {
                    glk.c("Babel", "[SendMessageOp] photo: sending photo with url", new Object[0]);
                }
                if (this.t == null) {
                    this.t = this.y.getContentResolver().getType(Uri.parse(this.i));
                    if (this.t == null) {
                        this.t = "image/jpg";
                    }
                }
                arrayList.add(new fpc(new int[]{0}, null, null, this.k, null, null, this.i, this.o, this.p, this.t, this.j, null, null, null, null));
            }
            List<String> g = blf.g(blo, this.b);
            fle a = new fea().a(this.b).a(this.c.b.b()).e(d).b(this.g).c(this.h).b((List) arrayList).b(false).a(fwx.SENDING).b(3).c(this.r ? 129 : 0).f(this.q).d(6).h(TextUtils.join(",", g)).c(true).e(this.r ? 1 : 0).i(this.u).g(this.v).a();
            a.a(blo, this.d);
            if (this.r) {
                a(new fjs(this.b, this.g, d).a((String[]) g.toArray(new String[0])).a(this.q).b(this.h).c(this.i).d(this.t).a(this.o).b(this.p).c(this.j).e(this.u).d(this.v).a(a.a()).a());
            } else {
                long a2 = fyi.a(this.y, (List) g);
                String U = blo.U(this.b);
                for (String b3 : g) {
                    a(new fjx(this.b, this.g, d).a(b3).b(this.h).a(a2).c(U).b(a.a()).a());
                }
            }
            Long valueOf = Long.valueOf(a.a());
            blo.b();
            blf.d(blo, this.b);
            if (valueOf == null) {
                return -1;
            }
            return gwb.a(valueOf);
        } finally {
            blo.c();
        }
    }

    private boolean a(String str) {
        String str2;
        String str3;
        String valueOf;
        if (glk.a("Babel", 3)) {
            str2 = "Babel";
            str3 = "Check readiness for location image: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.b(str2, valueOf, new Object[0]);
        }
        int i = 0;
        while (i < 2) {
            try {
                ParcelFileDescriptor openFileDescriptor = this.y.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null && openFileDescriptor.getStatSize() > 0) {
                    return true;
                }
                Thread.sleep(1000);
                i++;
            } catch (FileNotFoundException e) {
                str3 = "Babel";
                String str4 = "Location image not ready, will retry after 1 second: ";
                valueOf = String.valueOf(str);
                glk.d(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), new Object[0]);
            } catch (InterruptedException e2) {
                str2 = "Babel";
                str3 = "Location image check interrupted.";
                valueOf = String.valueOf(str);
                glk.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            }
        }
        str2 = "Babel";
        str3 = "Failed to get location image. Skipping it: ";
        valueOf = String.valueOf(str);
        glk.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
        return false;
    }

    public Object v_() {
        return this.l;
    }
}
