package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import java.util.List;

public abstract class eul implements ead, fok {
    private static final boolean f12199a = false;
    public static final String f12200g;
    private static final long serialVersionUID = 1;
    private final String f12201b = glk.m17967a(new Throwable());
    private String f12202c;
    public int f12203h = 0;
    public transient gmp f12204i;
    public String f12205j;

    public abstract nzf mo1944a(String str, int i, int i2);

    public abstract evz mo1946b(Context context, eaf eaf);

    public abstract String mo1947g();

    static {
        kae kae = glk.f15565l;
        String str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation  https://www.googleapis.com/auth/chat.native";
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        } catch (ClassNotFoundException e) {
            str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation ";
        }
        f12200g = str;
    }

    public void d_(String str) {
        this.f12202c = str;
    }

    public boolean mo2043l() {
        return false;
    }

    public boolean mo1950k() {
        return true;
    }

    public boolean mo1022a(int i) {
        return false;
    }

    public GenericUrl mo1948b(Context context) {
        GenericUrl genericUrl = new GenericUrl(gld.m17943b(mo1943a(context)));
        CharSequence c = mo1953c(context);
        if (!TextUtils.isEmpty(c)) {
            String str = "trace";
            String str2 = "token:";
            String valueOf = String.valueOf(c);
            genericUrl.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        return genericUrl;
    }

    protected String mo1943a(Context context) {
        String valueOf = String.valueOf(((fol) jyn.m25426a(context, fol.class)).m15814a(mo1949j()));
        String valueOf2 = String.valueOf(mo1947g());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    protected fom mo1949j() {
        return fom.HANGOUTS_API;
    }

    protected String mo1953c(Context context) {
        return gwb.m1998b(context, "babel_apiary_trace_token", fls.f13428e);
    }

    public void mo1023b(int i) {
        this.f12203h = i;
    }

    public HttpContent mo1956b(String str, int i, int i2) {
        nzf a = mo1944a(str, i, i2);
        if (a == null) {
            return null;
        }
        this.f12205j = a.toString();
        return new etg(a);
    }

    public static boolean m14388b(String str) {
        long b = ffh.m15192a().m15201b();
        if (b != 0) {
            return Long.toString(b).equals(str);
        }
        return false;
    }

    public void mo1007a(Context context, eaf eaf) {
        evz b = mo1946b(context, eaf);
        if (b != null) {
            b.m8128b(glj.m17963b() * 1000);
            b.mo1960a((fok) this);
            eaf.mo1801a(context, eaf.m13268b(), b);
            return;
        }
        throw new fdo(111);
    }

    public void a_(Context context, int i, fdo fdo) {
        bko e = fde.m15018e(i);
        jyn.m25433b(context, eub.class);
        if (e != null) {
            mo1945a(context, e, fdo);
            RealTimeChatService.m9016a(e, (fok) this, fdo);
        } else if (glk.m17973a("Babel_RequestWriter", 3)) {
            glk.m17970a("Babel_RequestWriter", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
    }

    public int L_() {
        return this.f12203h;
    }

    public boolean mo1018c() {
        return false;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return fjy.m8000a(context, eaf, fdo.m15084c());
    }

    protected boolean mo1955b(Context context, int i, fdo fdo) {
        if (i != 0) {
            return false;
        }
        int c = fdo.m15084c();
        if (c == 104 || c == 103) {
            return true;
        }
        return false;
    }

    protected boolean m14397a(fdo fdo) {
        return fdo.m15084c() == 104;
    }

    public long mo1017b() {
        return gwb.m1519a(gwb.m1400H(), "babel_pending_message_failure_duration", 1200000);
    }

    public boolean mo1015a(ead ead) {
        return false;
    }

    public String K_() {
        return "default_queue";
    }

    public boolean mo1016a(String str) {
        return false;
    }

    public boolean mo1019d() {
        return true;
    }

    public void m14414m() {
        this.f12204i = (gmp) jyn.m25426a(gwb.m1400H(), gmp.class);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName()).append("-").append(hashCode()).append(": ").append(mo1947g());
        if (((biw) jyn.m25426a(gwb.m1400H(), biw.class)).mo564a("babel_server_request_verbose_logging", false)) {
            stringBuilder.append("\nProtoBuf:\n").append(this.f12205j == null ? "not built yet" : this.f12205j).append("\nCreation stack:\n").append(this.f12201b).append("\nOrigin stack:\n").append(this.f12202c);
        }
        return stringBuilder.toString();
    }

    public ead mo1021a() {
        return this;
    }

    public void mo1011f() {
    }

    public List<bhc> mo1010e() {
        return null;
    }
}
