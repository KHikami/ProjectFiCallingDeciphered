package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fde */
public class fde implements jcd, jnh {
    static final boolean a;
    public static final ConcurrentHashMap<Integer, fdh> b;
    static Boolean c;
    public static fdj d;
    static fdg e;
    private static final String[] f;
    private static fdi h;
    private static final Comparator<jch> i;
    private final Context g;

    static {
        kae kae = glk.o;
        a = false;
        f = new String[]{"Init", "Pending", "Ready", "Err_net", "Err_gcm", "Err_svr", "Err_auth", "Err_profile", "Err_oobe", "Err_transient"};
        b = new ConcurrentHashMap();
        c = null;
        h = new fdi();
        d = new fdj();
        e = new fdg();
        i = new fdf();
    }

    fde(Context context) {
        this.g = context;
    }

    public static void a() {
        jcf jcf = (jcf) jyn.a(gwb.H(), jcf.class);
        Iterator it = b.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            fde.a(jcf, gwb.a(num));
            if (!jcf.c(gwb.a(num))) {
                it.remove();
            }
        }
    }

    public void b(int i) {
        glk.c("Babel", "BAM created " + i, new Object[0]);
        jch a = ((jcf) jyn.a(this.g, jcf.class)).a(i);
        Object b = fde.b(a.b("account_name"));
        iil.b("babelAccount should not be null", b);
        iil.b("babelAccount.getName() should not be null", b.d());
        b.put(Integer.valueOf(i), b);
        if (a.a()) {
            RealTimeChatService.a(i);
        }
    }

    public void c(int i) {
    }

    public void a(int i) {
        glk.c("Babel", "BAM#account updated: " + i, new Object[0]);
        jcf jcf = (jcf) jyn.a(this.g, jcf.class);
        jch a = jcf.a(i);
        if (a.c("logged_out")) {
            glk.c("Babel", "BAM, cleanup: " + i, new Object[0]);
            a = ((jcf) jyn.a(this.g, jcf.class)).a(i);
            RealTimeChatService.b(i);
            if (a.c("is_sms_account") && fde.i()) {
                fde.b(fde.t());
            }
        } else if (!a.c("sms_only")) {
            RealTimeChatService.a(i);
        }
        fde.a(jcf, gwb.a(Integer.valueOf(i)));
    }

    public static void a(jcf jcf, int i) {
        try {
            jch a = jcf.a(i);
            if (a != null) {
                List<Integer> a2 = jcf.a();
                List arrayList = new ArrayList();
                for (Integer num : a2) {
                    jch a3 = jcf.a(gwb.a(num));
                    if (a3.b("account_name").equals(a.b("account_name")) && a3.b("effective_gaia_id") != null) {
                        arrayList.add(num);
                    }
                }
                ArrayList arrayList2 = (ArrayList) arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    Integer num2 = (Integer) obj;
                    String valueOf = String.valueOf(num2);
                    glk.c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Removing old +Page: ").append(valueOf).toString(), new Object[0]);
                    jcf.f(gwb.a(num2));
                }
            }
        } catch (jcj e) {
            glk.c("Babel", "Account not found purging plus pages " + i, new Object[0]);
        }
    }

    @Deprecated
    public static long b() {
        return gwb.a(gwb.H(), "babel_ac_registration_renew_days", 7) * 86400000;
    }

    public static long c() {
        return gwb.a(gwb.H(), "babel_ac_setting_renew_minutes", 1440) * 60000;
    }

    public static void a(bko bko, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        String a = bko.a();
        String str2;
        if (fde.k(bko.g()) == null) {
            String str3 = "Babel";
            str2 = "Unable to update voice info for account ";
            a = String.valueOf(glk.b(a));
            if (a.length() != 0) {
                a = str2.concat(a);
            } else {
                a = new String(str2);
            }
            glk.d(str3, a, new Object[0]);
            return;
        }
        Context H = gwb.H();
        if (bkq.a) {
            a = "updateAccountVoiceInfo before: ";
            str3 = String.valueOf(bko.H());
            if (str3.length() != 0) {
                a.concat(str3);
            } else {
                str3 = new String(a);
            }
        }
        fbx fbx = (fbx) jyn.a(H, fbx.class);
        boolean b = fbx.b(H, bko);
        jci b2 = ((jcf) jyn.a(H, jcf.class)).b(bko.g());
        b2.b("is_gv_calling_available", z);
        b2.b("gv_should_show_voice_tos", z2);
        b2.b("gv_emergency_dialing_supported", z3);
        b2.b("gv_account_balance", str);
        b2.b("gv_use_tycho_branding", z4);
        b2.d();
        boolean b3 = fbx.b(H, bko);
        glk.a("Babel", "previousIncomingPhoneCallsWanted: " + b + " newIncomingPhoneCallsWanted: " + b3, new Object[0]);
        if (b != b3) {
            str3 = "Babel";
            str2 = "Re-register account to update the incoming calls preference for account ";
            a = String.valueOf(glk.b(bko.a()));
            glk.c(str3, a.length() != 0 ? str2.concat(a) : new String(str2), new Object[0]);
            fde.c(bko);
        }
        if (bkq.a) {
            a = "updateAccountVoiceInfo after: ";
            str3 = String.valueOf(bko.H());
            if (str3.length() != 0) {
                a.concat(str3);
            } else {
                str3 = new String(a);
            }
        }
    }

    static int[] d(int i) {
        Object obj;
        Object obj2 = (i & 1) != 0 ? 1 : null;
        Object obj3 = (i & 2) != 0 ? 1 : null;
        Object obj4 = (i & 4) == 0 ? 1 : null;
        int i2 = 0;
        Object obj5 = null;
        int i3 = -1;
        List arrayList = new ArrayList();
        if ((i & 32) != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        bbm bbm = (bbm) jyn.a(gwb.H(), bbm.class);
        fzw fzw = (fzw) jyn.a(gwb.H(), fzw.class);
        for (Integer a : ((jcf) jyn.a(gwb.H(), jcf.class)).a()) {
            int a2 = gwb.a(a);
            fdh k = fde.k(a2);
            if (k != null && ((obj3 == null || !k.k()) && (!(obj4 == null && k.s()) && (obj2 == null || k.j())))) {
                if ("SMS".equals(k.d())) {
                    i3 = k.e();
                } else if (obj == null || bbm.d(a2)) {
                    if (k.j()) {
                        int i4 = i2 + 1;
                        arrayList.add(i2, Integer.valueOf(a2));
                        if (fzw.b(a2)) {
                            obj5 = 1;
                            i2 = i4;
                        } else {
                            a2 = i4;
                        }
                    } else {
                        if (obj2 == null) {
                            arrayList.add(Integer.valueOf(a2));
                        }
                        a2 = i2;
                    }
                    i2 = a2;
                }
            }
        }
        Object obj6 = (i & 8) != 0 ? 1 : null;
        if (obj6 == null && r6 == null && fde.i()) {
            obj6 = (i & 16) != 0 ? 1 : null;
        }
        if (!(obj6 == null || i3 == -1)) {
            arrayList.add(Integer.valueOf(i3));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = gwb.a((Integer) arrayList.get(i5), -1);
        }
        return iArr;
    }

    public static int[] d() {
        return fde.d(0);
    }

    public static int[] e() {
        return fde.d(8);
    }

    public static int[] f() {
        return fde.d(12);
    }

    public static int[] g() {
        return fde.d(4);
    }

    public static int[] a(boolean z, boolean z2) {
        return fde.d(32);
    }

    public static boolean h() {
        return ((jcf) jyn.a(gwb.H(), jcf.class)).a().size() - ((jcf) jyn.a(gwb.H(), jcf.class)).a("sms_only").size() > 1;
    }

    public static boolean i() {
        return jyn.b(gwb.H(), gae.class) == null && d.a();
    }

    public static void a(boolean z) {
        fdj.a(z);
    }

    public static bko a(bko bko) {
        bbm bbm = (bbm) jyn.a(gwb.H(), bbm.class);
        fzw fzw = (fzw) jyn.a(gwb.H(), fzw.class);
        if (bko != null) {
            int g = bko.g();
            if (bbm.d(g) || fzw.a(g)) {
                return bko;
            }
        }
        bko = fde.i() ? fde.k() : null;
        return bko == null ? fde.j() : bko;
    }

    public static bko j() {
        for (bko bko : fde.o()) {
            if (bko.w()) {
                return bko;
            }
        }
        return null;
    }

    public static bko k() {
        if (!fde.i()) {
            return null;
        }
        Context H = gwb.H();
        bko a = fde.a(H);
        fzw fzw = (fzw) jyn.a(H, fzw.class);
        if (!(a == null || fzw.b(a.g()))) {
            fde.b(a);
        }
        return a;
    }

    public static bko a(Context context) {
        if (!glq.c(context)) {
            return null;
        }
        bko l = fde.l();
        if (l == null) {
            l = fde.b(context);
        }
        return (l == null || bkq.d(context, l.g())) ? fde.t() : l;
    }

    static bko l() {
        boolean z;
        List a = ((jcf) jyn.a(gwb.H(), jcf.class)).a("is_sms_account");
        if (a.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z);
        if (a.size() == 1) {
            return fde.e(gwb.a((Integer) a.get(0), -1));
        }
        return null;
    }

    private static bko t() {
        return fde.e(((fzw) jyn.a(gwb.H(), fzw.class)).a());
    }

    static void a(Context context, boolean z) {
        boolean z2 = true;
        if (glq.c(context)) {
            jci b = ((jcf) jyn.a(gwb.H(), jcf.class)).b(fde.t().g()).b("logged_in", z);
            String str = "logged_out";
            if (z) {
                z2 = false;
            }
            b.b(str, z2).d();
            return;
        }
        ba.a(!z);
    }

    public static void b(bko bko) {
        boolean z;
        Context H = gwb.H();
        fzw fzw = (fzw) jyn.a(H, fzw.class);
        int g = bko.g();
        boolean a = fzw.a(g);
        if (a || !bkq.d(H, g)) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        iil.a("Expected condition to be true", fde.i());
        fde.a(H, a);
        if (glk.a("Babel", 3)) {
            String str = "Babel";
            String str2 = "setCarrierSmsAccount: ";
            String valueOf = String.valueOf(glk.b(bko.a()));
            glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        bko l = fde.l();
        if (bko != l) {
            bko bko2;
            if (l != null) {
                int g2 = l.g();
                if (!bkq.d(H, g2) || fzw.a(g2)) {
                    bko2 = l;
                    if (bko2 != null) {
                        fzb.a(bko2);
                    }
                    bkq.b(H, bko);
                    fvy.a(g, H);
                }
            }
            bko2 = null;
            if (bko2 != null) {
                fzb.a(bko2);
            }
            bkq.b(H, bko);
            fvy.a(g, H);
        }
    }

    public static bko a(edo edo) {
        fde.a();
        fde.d(8);
        for (fdh fdh : b.values()) {
            bko f = fdh.f();
            boolean d = f.d();
            boolean e = f.e();
            boolean z = e && f.b().a(edo);
            String valueOf = String.valueOf(fdh.a());
            glk.a("Babel", new StringBuilder(String.valueOf(valueOf).length() + 52).append("Account ").append(valueOf).append(", valid: ").append(d).append(", matches participantId: ").append(z).toString(), new Object[0]);
            if (!z) {
                if (e) {
                    String valueOf2 = String.valueOf(f.b().toString());
                    String valueOf3 = String.valueOf(edo.toString());
                    glk.a("Babel", new StringBuilder((String.valueOf(valueOf2).length() + 44) + String.valueOf(valueOf3).length()).append("account.getParticipantId(): ").append(valueOf2).append(", participantId:").append(valueOf3).toString(), new Object[0]);
                } else {
                    String valueOf4 = String.valueOf(fdh.a());
                    glk.a("Babel", new StringBuilder(String.valueOf(valueOf4).length() + 37).append("Account ").append(valueOf4).append("does not have a participantId").toString(), new Object[0]);
                }
            }
            if (d && z) {
                return f;
            }
        }
        return null;
    }

    public static bko a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        fdh b = fde.b(str);
        if (b != null) {
            return b.f();
        }
        return null;
    }

    public static bko e(int i) {
        fdh k = fde.k(i);
        if (k != null) {
            return k.f();
        }
        return null;
    }

    @Deprecated
    public static void m() {
        fde.a();
        fde.d(8);
        for (fdh fdh : b.values()) {
            String str;
            String str2;
            String valueOf;
            if (fdh.g() == 101 && !fdh.s()) {
                str = "Babel";
                str2 = "Registering account for ";
                valueOf = String.valueOf(fdh.a());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.c(str, valueOf, new Object[0]);
                fdh.a(false);
            } else if (fdh.g() == 102) {
                if (glk.a("Babel", 3)) {
                    str = "Babel";
                    str2 = "Renewing account registration after babel upgrade. Account: ";
                    valueOf = String.valueOf(fdh.a());
                    glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
                fdh.o();
                fdh.q();
            }
        }
    }

    @Deprecated
    public static void b(boolean z) {
        ffh.a().k();
        for (Integer a : ((jcf) jyn.a(gwb.H(), jcf.class)).a()) {
            fdh k = fde.k(gwb.a(a));
            if (k.g() == 102 || k.g() == 108 || k.t()) {
                if (z) {
                    k.p();
                }
                k.r();
                if (!k.t()) {
                    k.q();
                }
            }
        }
    }

    public static boolean n() {
        fde.a();
        fde.d(8);
        for (fdh i : b.values()) {
            if (i.i()) {
                return true;
            }
        }
        return false;
    }

    public static bko b(Context context) {
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        fzw fzw = (fzw) jyn.a(context, fzw.class);
        for (Integer a : jcf.a()) {
            int a2 = gwb.a(a);
            String b = jcf.a(a2).b("account_name");
            fdh b2 = fde.b(b);
            if (b2 == null) {
                String str = "Babel";
                String str2 = "Account has not been setup yet. Skip:";
                b = String.valueOf(glk.b(b));
                glk.d(str, b.length() != 0 ? str2.concat(b) : new String(str2), new Object[0]);
            } else {
                bko f = b2.f();
                if (!(fzw.a(a2) || b2.s())) {
                    return f;
                }
            }
        }
        return null;
    }

    public static List<bko> o() {
        fde.a();
        fde.d(8);
        List<bko> arrayList = new ArrayList(b.size());
        for (fdh fdh : b.values()) {
            if (!fdh.s()) {
                arrayList.add(fdh.f());
            }
        }
        return arrayList;
    }

    public static void a(bko bko, Exception exception) {
        String str = "Babel";
        String str2 = "Account self info failed ";
        String valueOf = String.valueOf(fde.k(bko.g()).a());
        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), (Throwable) exception);
    }

    public static void a(Exception exception) {
        glk.d("Babel", "onAccountSetSelfInfoBitFailed: ", (Throwable) exception);
    }

    @Deprecated
    public static void c(bko bko) {
        fdh k = fde.k(bko.g());
        if (k != null) {
            k.a(true);
        }
    }

    @Deprecated
    public static void f(int i) {
        fdh k = fde.k(i);
        if (k != null) {
            k.a(true);
        }
    }

    public static String g(int i) {
        fdh k = fde.k(i);
        return k != null ? k.l() : null;
    }

    public static String h(int i) {
        fdh k = fde.k(i);
        return k != null ? k.m() : null;
    }

    public static boolean d(bko bko) {
        if (bko == null) {
            return true;
        }
        fdh k = fde.k(bko.g());
        if (k == null) {
            return true;
        }
        return k.s();
    }

    @Deprecated
    public static void i(int i) {
        fdh k = fde.k(i);
        if (k != null) {
            k.n();
        }
    }

    public static fdn e(bko bko) {
        fdh b = fde.b(bko.a());
        if (b == null) {
            return null;
        }
        return b.b();
    }

    private static fdh k(int i) {
        fde.a();
        jcf jcf = (jcf) jyn.a(gwb.H(), jcf.class);
        if (jcf.c(i)) {
            fdh fdh = (fdh) b.get(Integer.valueOf(i));
            return fdh == null ? fde.b(jcf.a(i).b("account_name")) : fdh;
        } else {
            glk.d("Babel", "BAM#gBA: invalid account id: " + i, new Object[0]);
            b.remove(Integer.valueOf(i));
            return null;
        }
    }

    private static fdh b(String str) {
        fdh fdh;
        fde.a();
        for (fdh fdh2 : b.values()) {
            if (fdh2.d().equals(str)) {
                return fdh2;
            }
        }
        iil.b("Expected non-null", (Object) str);
        if (((jcf) jyn.a(gwb.H(), jcf.class)).b(str) == -1) {
            fdh = null;
        } else {
            fdh = new fdh(bkq.a(gwb.H(), str));
        }
        if (fdh == null) {
            return null;
        }
        String valueOf = String.valueOf(fdh.c());
        glk.a("Babel", new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(valueOf).length()).append("created account ").append(str).append(" => ").append(valueOf).toString(), new Object[0]);
        if (a) {
            for (StackTraceElement stackTraceElement : new Exception().getStackTrace()) {
                String str2 = "    ";
                String valueOf2 = String.valueOf(stackTraceElement.toString());
                if (valueOf2.length() != 0) {
                    str2.concat(valueOf2);
                } else {
                    valueOf2 = new String(str2);
                }
            }
        }
        int g = fdh.f().g();
        b.putIfAbsent(Integer.valueOf(g), fdh);
        return fde.k(g);
    }

    public static boolean j(int i) {
        fdh k = fde.k(i);
        return k != null && k.j();
    }

    private static String l(int i) {
        if (i < 100 || i > 109) {
            return Integer.toString(i);
        }
        return f[i - 100];
    }

    public static void a(PrintWriter printWriter) {
        printWriter.println("Account list:");
        printWriter.println("Name,ID,jid,state");
        fde.a();
        fde.d(8);
        for (fdh fdh : b.values()) {
            bko f = fdh.f();
            String str;
            String valueOf;
            if (f == null) {
                str = "?, ?, ?, ";
                valueOf = String.valueOf(fde.l(fdh.g()));
                printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } else {
                if (f.e()) {
                    str = f.b().toString();
                } else {
                    str = "no-participant-id";
                }
                String h = fde.h(f.g());
                String valueOf2 = String.valueOf(f.a());
                valueOf = String.valueOf(fde.l(fdh.g()));
                printWriter.println(new StringBuilder((((String.valueOf(valueOf2).length() + 6) + String.valueOf(str).length()) + String.valueOf(h).length()) + String.valueOf(valueOf).length()).append(valueOf2).append(", ").append(str).append(", ").append(h).append(", ").append(valueOf).toString());
            }
        }
        printWriter.println();
    }

    public static boolean p() {
        return gwb.a(gwb.H(), "babel_allowed_for_domain_bit", true);
    }

    public static boolean q() {
        fde.a();
        jcf jcf = (jcf) jyn.a(gwb.H(), jcf.class);
        for (Integer a : jcf.a()) {
            if (!jcf.a(gwb.a(a)).c("sms_only")) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static int[] c(boolean z) {
        if (z) {
            return fde.d(5);
        }
        return fde.d(0);
    }

    @Deprecated
    public static int[] r() {
        return fde.d(32);
    }

    public static String a(Context context, int i) {
        if (i == -1) {
            return null;
        }
        return ((jcf) jyn.a(context, jcf.class)).a(i).b("account_name");
    }

    public static int[] s() {
        return fde.d(21);
    }

    public static int c(Context context) {
        List a = ((jcf) jyn.a(context, jcf.class)).a(i);
        if (a.isEmpty()) {
            return -1;
        }
        return gwb.a((Integer) a.get(0), -1);
    }

    static boolean a(jch jch) {
        return jch.b("account_name").endsWith("@google.com");
    }
}
