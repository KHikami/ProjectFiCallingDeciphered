package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class fde implements jcd, jnh {
    static final boolean f12724a = false;
    public static final ConcurrentHashMap<Integer, fdh> f12725b = new ConcurrentHashMap();
    static Boolean f12726c = null;
    public static fdj f12727d = new fdj();
    static fdg f12728e = new fdg();
    private static final String[] f12729f = new String[]{"Init", "Pending", "Ready", "Err_net", "Err_gcm", "Err_svr", "Err_auth", "Err_profile", "Err_oobe", "Err_transient"};
    private static fdi f12730h = new fdi();
    private static final Comparator<jch> f12731i = new fdf();
    private final Context f12732g;

    static {
        kae kae = glk.f15568o;
    }

    fde(Context context) {
        this.f12732g = context;
    }

    public static void m14996a() {
        jcf jcf = (jcf) jyn.m25426a(gwb.m1400H(), jcf.class);
        Iterator it = f12725b.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            fde.m15002a(jcf, gwb.m1507a(num));
            if (!jcf.mo3467c(gwb.m1507a(num))) {
                it.remove();
            }
        }
    }

    public void mo1774b(int i) {
        glk.m17979c("Babel", "BAM created " + i, new Object[0]);
        jch a = ((jcf) jyn.m25426a(this.f12732g, jcf.class)).mo3456a(i);
        Object b = fde.m15008b(a.mo3440b("account_name"));
        iil.m21875b("babelAccount should not be null", b);
        iil.m21875b("babelAccount.getName() should not be null", b.m15051d());
        f12725b.put(Integer.valueOf(i), b);
        if (a.mo3437a()) {
            RealTimeChatService.m8990a(i);
        }
    }

    public void mo1775c(int i) {
    }

    public void mo609a(int i) {
        glk.m17979c("Babel", "BAM#account updated: " + i, new Object[0]);
        jcf jcf = (jcf) jyn.m25426a(this.f12732g, jcf.class);
        jch a = jcf.mo3456a(i);
        if (a.mo3448c("logged_out")) {
            glk.m17979c("Babel", "BAM, cleanup: " + i, new Object[0]);
            a = ((jcf) jyn.m25426a(this.f12732g, jcf.class)).mo3456a(i);
            RealTimeChatService.m9064b(i);
            if (a.mo3448c("is_sms_account") && fde.m15028i()) {
                fde.m15009b(fde.m15042t());
            }
        } else if (!a.mo3448c("sms_only")) {
            RealTimeChatService.m8990a(i);
        }
        fde.m15002a(jcf, gwb.m1507a(Integer.valueOf(i)));
    }

    public static void m15002a(jcf jcf, int i) {
        try {
            jch a = jcf.mo3456a(i);
            if (a != null) {
                List<Integer> a2 = jcf.mo3453a();
                List arrayList = new ArrayList();
                for (Integer num : a2) {
                    jch a3 = jcf.mo3456a(gwb.m1507a(num));
                    if (a3.mo3440b("account_name").equals(a.mo3440b("account_name")) && a3.mo3440b("effective_gaia_id") != null) {
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
                    glk.m17979c("Babel", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Removing old +Page: ").append(valueOf).toString(), new Object[0]);
                    jcf.mo3471f(gwb.m1507a(num2));
                }
            }
        } catch (jcj e) {
            glk.m17979c("Babel", "Account not found purging plus pages " + i, new Object[0]);
        }
    }

    @Deprecated
    public static long m15006b() {
        return gwb.m1519a(gwb.m1400H(), "babel_ac_registration_renew_days", 7) * 86400000;
    }

    public static long m15012c() {
        return gwb.m1519a(gwb.m1400H(), "babel_ac_setting_renew_minutes", 1440) * 60000;
    }

    public static void m14999a(bko bko, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        String a = bko.m5629a();
        String str2;
        if (fde.m15032k(bko.m5638g()) == null) {
            String str3 = "Babel";
            str2 = "Unable to update voice info for account ";
            a = String.valueOf(glk.m17974b(a));
            if (a.length() != 0) {
                a = str2.concat(a);
            } else {
                a = new String(str2);
            }
            glk.m17981d(str3, a, new Object[0]);
            return;
        }
        Context H = gwb.m1400H();
        if (bkq.f3659a) {
            a = "updateAccountVoiceInfo before: ";
            str3 = String.valueOf(bko.m5621H());
            if (str3.length() != 0) {
                a.concat(str3);
            } else {
                str3 = new String(a);
            }
        }
        fbx fbx = (fbx) jyn.m25426a(H, fbx.class);
        boolean b = fbx.mo1972b(H, bko);
        jci b2 = ((jcf) jyn.m25426a(H, jcf.class)).mo3464b(bko.m5638g());
        b2.m23881b("is_gv_calling_available", z);
        b2.m23881b("gv_should_show_voice_tos", z2);
        b2.m23881b("gv_emergency_dialing_supported", z3);
        b2.m23879b("gv_account_balance", str);
        b2.m23881b("gv_use_tycho_branding", z4);
        b2.m23891d();
        boolean b3 = fbx.mo1972b(H, bko);
        glk.m17970a("Babel", "previousIncomingPhoneCallsWanted: " + b + " newIncomingPhoneCallsWanted: " + b3, new Object[0]);
        if (b != b3) {
            str3 = "Babel";
            str2 = "Re-register account to update the incoming calls preference for account ";
            a = String.valueOf(glk.m17974b(bko.m5629a()));
            glk.m17979c(str3, a.length() != 0 ? str2.concat(a) : new String(str2), new Object[0]);
            fde.m15013c(bko);
        }
        if (bkq.f3659a) {
            a = "updateAccountVoiceInfo after: ";
            str3 = String.valueOf(bko.m5621H());
            if (str3.length() != 0) {
                a.concat(str3);
            } else {
                str3 = new String(a);
            }
        }
    }

    static int[] m15017d(int i) {
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
        bbm bbm = (bbm) jyn.m25426a(gwb.m1400H(), bbm.class);
        fzw fzw = (fzw) jyn.m25426a(gwb.m1400H(), fzw.class);
        for (Integer a : ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3453a()) {
            int a2 = gwb.m1507a(a);
            fdh k = fde.m15032k(a2);
            if (k != null && ((obj3 == null || !k.m15058k()) && (!(obj4 == null && k.m15066s()) && (obj2 == null || k.m15057j())))) {
                if ("SMS".equals(k.m15051d())) {
                    i3 = k.m15052e();
                } else if (obj == null || bbm.mo444d(a2)) {
                    if (k.m15057j()) {
                        int i4 = i2 + 1;
                        arrayList.add(i2, Integer.valueOf(a2));
                        if (fzw.mo2148b(a2)) {
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
        if (obj6 == null && r6 == null && fde.m15028i()) {
            obj6 = (i & 16) != 0 ? 1 : null;
        }
        if (!(obj6 == null || i3 == -1)) {
            arrayList.add(Integer.valueOf(i3));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = gwb.m1508a((Integer) arrayList.get(i5), -1);
        }
        return iArr;
    }

    public static int[] m15016d() {
        return fde.m15017d(0);
    }

    public static int[] m15020e() {
        return fde.m15017d(8);
    }

    public static int[] m15022f() {
        return fde.m15017d(12);
    }

    public static int[] m15024g() {
        return fde.m15017d(4);
    }

    public static int[] m15005a(boolean z, boolean z2) {
        return fde.m15017d(32);
    }

    public static boolean m15026h() {
        return ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3453a().size() - ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3455a("sms_only").size() > 1;
    }

    public static boolean m15028i() {
        return jyn.m25433b(gwb.m1400H(), gae.class) == null && f12727d.m15069a();
    }

    public static void m15003a(boolean z) {
        fdj.m15068a(z);
    }

    public static bko m14992a(bko bko) {
        bbm bbm = (bbm) jyn.m25426a(gwb.m1400H(), bbm.class);
        fzw fzw = (fzw) jyn.m25426a(gwb.m1400H(), fzw.class);
        if (bko != null) {
            int g = bko.m5638g();
            if (bbm.mo444d(g) || fzw.mo2146a(g)) {
                return bko;
            }
        }
        bko = fde.m15028i() ? fde.m15031k() : null;
        return bko == null ? fde.m15029j() : bko;
    }

    public static bko m15029j() {
        for (bko bko : fde.m15037o()) {
            if (bko.m5654w()) {
                return bko;
            }
        }
        return null;
    }

    public static bko m15031k() {
        if (!fde.m15028i()) {
            return null;
        }
        Context H = gwb.m1400H();
        bko a = fde.m14991a(H);
        fzw fzw = (fzw) jyn.m25426a(H, fzw.class);
        if (!(a == null || fzw.mo2148b(a.m5638g()))) {
            fde.m15009b(a);
        }
        return a;
    }

    public static bko m14991a(Context context) {
        if (!glq.m18015c(context)) {
            return null;
        }
        bko l = fde.m15033l();
        if (l == null) {
            l = fde.m15007b(context);
        }
        return (l == null || bkq.m5692d(context, l.m5638g())) ? fde.m15042t() : l;
    }

    static bko m15033l() {
        boolean z;
        List a = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3455a("is_sms_account");
        if (a.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        ba.m4609b(z);
        if (a.size() == 1) {
            return fde.m15018e(gwb.m1508a((Integer) a.get(0), -1));
        }
        return null;
    }

    private static bko m15042t() {
        return fde.m15018e(((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2142a());
    }

    static void m14997a(Context context, boolean z) {
        boolean z2 = true;
        if (glq.m18015c(context)) {
            jci b = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(fde.m15042t().m5638g()).m23881b("logged_in", z);
            String str = "logged_out";
            if (z) {
                z2 = false;
            }
            b.m23881b(str, z2).m23891d();
            return;
        }
        ba.m4577a(!z);
    }

    public static void m15009b(bko bko) {
        boolean z;
        Context H = gwb.m1400H();
        fzw fzw = (fzw) jyn.m25426a(H, fzw.class);
        int g = bko.m5638g();
        boolean a = fzw.mo2146a(g);
        if (a || !bkq.m5692d(H, g)) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        iil.m21874a("Expected condition to be true", fde.m15028i());
        fde.m14997a(H, a);
        if (glk.m17973a("Babel", 3)) {
            String str = "Babel";
            String str2 = "setCarrierSmsAccount: ";
            String valueOf = String.valueOf(glk.m17974b(bko.m5629a()));
            glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        bko l = fde.m15033l();
        if (bko != l) {
            bko bko2;
            if (l != null) {
                int g2 = l.m5638g();
                if (!bkq.m5692d(H, g2) || fzw.mo2146a(g2)) {
                    bko2 = l;
                    if (bko2 != null) {
                        fzb.m16668a(bko2);
                    }
                    bkq.m5678b(H, bko);
                    fvy.m16344a(g, H);
                }
            }
            bko2 = null;
            if (bko2 != null) {
                fzb.m16668a(bko2);
            }
            bkq.m5678b(H, bko);
            fvy.m16344a(g, H);
        }
    }

    public static bko m14993a(edo edo) {
        fde.m14996a();
        fde.m15017d(8);
        for (fdh fdh : f12725b.values()) {
            bko f = fdh.m15053f();
            boolean d = f.m5635d();
            boolean e = f.m5636e();
            boolean z = e && f.m5632b().m13608a(edo);
            String valueOf = String.valueOf(fdh.m15047a());
            glk.m17970a("Babel", new StringBuilder(String.valueOf(valueOf).length() + 52).append("Account ").append(valueOf).append(", valid: ").append(d).append(", matches participantId: ").append(z).toString(), new Object[0]);
            if (!z) {
                if (e) {
                    String valueOf2 = String.valueOf(f.m5632b().toString());
                    String valueOf3 = String.valueOf(edo.toString());
                    glk.m17970a("Babel", new StringBuilder((String.valueOf(valueOf2).length() + 44) + String.valueOf(valueOf3).length()).append("account.getParticipantId(): ").append(valueOf2).append(", participantId:").append(valueOf3).toString(), new Object[0]);
                } else {
                    String valueOf4 = String.valueOf(fdh.m15047a());
                    glk.m17970a("Babel", new StringBuilder(String.valueOf(valueOf4).length() + 37).append("Account ").append(valueOf4).append("does not have a participantId").toString(), new Object[0]);
                }
            }
            if (d && z) {
                return f;
            }
        }
        return null;
    }

    public static bko m14994a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        fdh b = fde.m15008b(str);
        if (b != null) {
            return b.m15053f();
        }
        return null;
    }

    public static bko m15018e(int i) {
        fdh k = fde.m15032k(i);
        if (k != null) {
            return k.m15053f();
        }
        return null;
    }

    @Deprecated
    public static void m15035m() {
        fde.m14996a();
        fde.m15017d(8);
        for (fdh fdh : f12725b.values()) {
            String str;
            String str2;
            String valueOf;
            if (fdh.m15054g() == 101 && !fdh.m15066s()) {
                str = "Babel";
                str2 = "Registering account for ";
                valueOf = String.valueOf(fdh.m15047a());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.m17979c(str, valueOf, new Object[0]);
                fdh.m15048a(false);
            } else if (fdh.m15054g() == 102) {
                if (glk.m17973a("Babel", 3)) {
                    str = "Babel";
                    str2 = "Renewing account registration after babel upgrade. Account: ";
                    valueOf = String.valueOf(fdh.m15047a());
                    glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                }
                fdh.m15062o();
                fdh.m15064q();
            }
        }
    }

    @Deprecated
    public static void m15010b(boolean z) {
        ffh.m15192a().m15209k();
        for (Integer a : ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3453a()) {
            fdh k = fde.m15032k(gwb.m1507a(a));
            if (k.m15054g() == 102 || k.m15054g() == 108 || k.m15067t()) {
                if (z) {
                    k.m15063p();
                }
                k.m15065r();
                if (!k.m15067t()) {
                    k.m15064q();
                }
            }
        }
    }

    public static boolean m15036n() {
        fde.m14996a();
        fde.m15017d(8);
        for (fdh i : f12725b.values()) {
            if (i.m15056i()) {
                return true;
            }
        }
        return false;
    }

    public static bko m15007b(Context context) {
        jcf jcf = (jcf) jyn.m25426a(context, jcf.class);
        fzw fzw = (fzw) jyn.m25426a(context, fzw.class);
        for (Integer a : jcf.mo3453a()) {
            int a2 = gwb.m1507a(a);
            String b = jcf.mo3456a(a2).mo3440b("account_name");
            fdh b2 = fde.m15008b(b);
            if (b2 == null) {
                String str = "Babel";
                String str2 = "Account has not been setup yet. Skip:";
                b = String.valueOf(glk.m17974b(b));
                glk.m17981d(str, b.length() != 0 ? str2.concat(b) : new String(str2), new Object[0]);
            } else {
                bko f = b2.m15053f();
                if (!(fzw.mo2146a(a2) || b2.m15066s())) {
                    return f;
                }
            }
        }
        return null;
    }

    public static List<bko> m15037o() {
        fde.m14996a();
        fde.m15017d(8);
        List<bko> arrayList = new ArrayList(f12725b.size());
        for (fdh fdh : f12725b.values()) {
            if (!fdh.m15066s()) {
                arrayList.add(fdh.m15053f());
            }
        }
        return arrayList;
    }

    public static void m14998a(bko bko, Exception exception) {
        String str = "Babel";
        String str2 = "Account self info failed ";
        String valueOf = String.valueOf(fde.m15032k(bko.m5638g()).m15047a());
        glk.m17980d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), (Throwable) exception);
    }

    public static void m15001a(Exception exception) {
        glk.m17980d("Babel", "onAccountSetSelfInfoBitFailed: ", (Throwable) exception);
    }

    @Deprecated
    public static void m15013c(bko bko) {
        fdh k = fde.m15032k(bko.m5638g());
        if (k != null) {
            k.m15048a(true);
        }
    }

    @Deprecated
    public static void m15021f(int i) {
        fdh k = fde.m15032k(i);
        if (k != null) {
            k.m15048a(true);
        }
    }

    public static String m15023g(int i) {
        fdh k = fde.m15032k(i);
        return k != null ? k.m15059l() : null;
    }

    public static String m15025h(int i) {
        fdh k = fde.m15032k(i);
        return k != null ? k.m15060m() : null;
    }

    public static boolean m15015d(bko bko) {
        if (bko == null) {
            return true;
        }
        fdh k = fde.m15032k(bko.m5638g());
        if (k == null) {
            return true;
        }
        return k.m15066s();
    }

    @Deprecated
    public static void m15027i(int i) {
        fdh k = fde.m15032k(i);
        if (k != null) {
            k.m15061n();
        }
    }

    public static fdn m15019e(bko bko) {
        fdh b = fde.m15008b(bko.m5629a());
        if (b == null) {
            return null;
        }
        return b.m15049b();
    }

    private static fdh m15032k(int i) {
        fde.m14996a();
        jcf jcf = (jcf) jyn.m25426a(gwb.m1400H(), jcf.class);
        if (jcf.mo3467c(i)) {
            fdh fdh = (fdh) f12725b.get(Integer.valueOf(i));
            return fdh == null ? fde.m15008b(jcf.mo3456a(i).mo3440b("account_name")) : fdh;
        } else {
            glk.m17981d("Babel", "BAM#gBA: invalid account id: " + i, new Object[0]);
            f12725b.remove(Integer.valueOf(i));
            return null;
        }
    }

    private static fdh m15008b(String str) {
        fdh fdh;
        fde.m14996a();
        for (fdh fdh2 : f12725b.values()) {
            if (fdh2.m15051d().equals(str)) {
                return fdh2;
            }
        }
        iil.m21875b("Expected non-null", (Object) str);
        if (((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3461b(str) == -1) {
            fdh = null;
        } else {
            fdh = new fdh(bkq.m5660a(gwb.m1400H(), str));
        }
        if (fdh == null) {
            return null;
        }
        String valueOf = String.valueOf(fdh.m15050c());
        glk.m17970a("Babel", new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(valueOf).length()).append("created account ").append(str).append(" => ").append(valueOf).toString(), new Object[0]);
        if (f12724a) {
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
        int g = fdh.m15053f().m5638g();
        f12725b.putIfAbsent(Integer.valueOf(g), fdh);
        return fde.m15032k(g);
    }

    public static boolean m15030j(int i) {
        fdh k = fde.m15032k(i);
        return k != null && k.m15057j();
    }

    private static String m15034l(int i) {
        if (i < 100 || i > 109) {
            return Integer.toString(i);
        }
        return f12729f[i - 100];
    }

    public static void m15000a(PrintWriter printWriter) {
        printWriter.println("Account list:");
        printWriter.println("Name,ID,jid,state");
        fde.m14996a();
        fde.m15017d(8);
        for (fdh fdh : f12725b.values()) {
            bko f = fdh.m15053f();
            String str;
            String valueOf;
            if (f == null) {
                str = "?, ?, ?, ";
                valueOf = String.valueOf(fde.m15034l(fdh.m15054g()));
                printWriter.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            } else {
                if (f.m5636e()) {
                    str = f.m5632b().toString();
                } else {
                    str = "no-participant-id";
                }
                String h = fde.m15025h(f.m5638g());
                String valueOf2 = String.valueOf(f.m5629a());
                valueOf = String.valueOf(fde.m15034l(fdh.m15054g()));
                printWriter.println(new StringBuilder((((String.valueOf(valueOf2).length() + 6) + String.valueOf(str).length()) + String.valueOf(h).length()) + String.valueOf(valueOf).length()).append(valueOf2).append(", ").append(str).append(", ").append(h).append(", ").append(valueOf).toString());
            }
        }
        printWriter.println();
    }

    public static boolean m15038p() {
        return gwb.m1906a(gwb.m1400H(), "babel_allowed_for_domain_bit", true);
    }

    public static boolean m15039q() {
        fde.m14996a();
        jcf jcf = (jcf) jyn.m25426a(gwb.m1400H(), jcf.class);
        for (Integer a : jcf.mo3453a()) {
            if (!jcf.mo3456a(gwb.m1507a(a)).mo3448c("sms_only")) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static int[] m15014c(boolean z) {
        if (z) {
            return fde.m15017d(5);
        }
        return fde.m15017d(0);
    }

    @Deprecated
    public static int[] m15040r() {
        return fde.m15017d(32);
    }

    public static String m14995a(Context context, int i) {
        if (i == -1) {
            return null;
        }
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3440b("account_name");
    }

    public static int[] m15041s() {
        return fde.m15017d(21);
    }

    public static int m15011c(Context context) {
        List a = ((jcf) jyn.m25426a(context, jcf.class)).mo3454a(f12731i);
        if (a.isEmpty()) {
            return -1;
        }
        return gwb.m1508a((Integer) a.get(0), -1);
    }

    static boolean m15004a(jch jch) {
        return jch.mo3440b("account_name").endsWith("@google.com");
    }
}
