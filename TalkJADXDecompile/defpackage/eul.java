package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import java.util.List;

/* renamed from: eul */
public abstract class eul implements ead, fok {
    private static final boolean a;
    public static final String g;
    private static final long serialVersionUID = 1;
    private final String b;
    private String c;
    public int h;
    public transient gmp i;
    public String j;

    public abstract nzf a(String str, int i, int i2);

    public abstract evz b(Context context, eaf eaf);

    public abstract String g();

    static {
        kae kae = glk.l;
        a = a;
        String str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation  https://www.googleapis.com/auth/chat.native";
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        } catch (ClassNotFoundException e) {
            str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation ";
        }
        g = str;
    }

    public eul() {
        this.h = 0;
        this.b = glk.a(new Throwable());
    }

    public void d_(String str) {
        this.c = str;
    }

    public boolean l() {
        return a;
    }

    public boolean k() {
        return true;
    }

    public boolean a(int i) {
        return a;
    }

    public GenericUrl b(Context context) {
        GenericUrl genericUrl = new GenericUrl(gld.b(a(context)));
        CharSequence c = c(context);
        if (!TextUtils.isEmpty(c)) {
            String str = "trace";
            String str2 = "token:";
            String valueOf = String.valueOf(c);
            genericUrl.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        return genericUrl;
    }

    protected String a(Context context) {
        String valueOf = String.valueOf(((fol) jyn.a(context, fol.class)).a(j()));
        String valueOf2 = String.valueOf(g());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    protected fom j() {
        return fom.HANGOUTS_API;
    }

    protected String c(Context context) {
        return gwb.b(context, "babel_apiary_trace_token", fls.e);
    }

    public void b(int i) {
        this.h = i;
    }

    public HttpContent b(String str, int i, int i2) {
        nzf a = a(str, i, i2);
        if (a == null) {
            return null;
        }
        this.j = a.toString();
        return new etg(a);
    }

    public static boolean b(String str) {
        long b = ffh.a().b();
        if (b != 0) {
            return Long.toString(b).equals(str);
        }
        return a;
    }

    public void a(Context context, eaf eaf) {
        evz b = b(context, eaf);
        if (b != null) {
            b.b(glj.b() * 1000);
            b.a((fok) this);
            eaf.a(context, eaf.b(), b);
            return;
        }
        throw new fdo(111);
    }

    public void a_(Context context, int i, fdo fdo) {
        bko e = fde.e(i);
        jyn.b(context, eub.class);
        if (e != null) {
            a(context, e, fdo);
            RealTimeChatService.a(e, (fok) this, fdo);
        } else if (glk.a("Babel_RequestWriter", 3)) {
            glk.a("Babel_RequestWriter", "Skipping request failure for invalid account: " + i, new Object[0]);
        }
    }

    public void a(Context context, bko bko, fdo fdo) {
    }

    public int L_() {
        return this.h;
    }

    public boolean c() {
        return a;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return fjy.a(context, eaf, fdo.c());
    }

    protected boolean b(Context context, int i, fdo fdo) {
        if (i != 0) {
            return a;
        }
        int c = fdo.c();
        if (c == 104 || c == 103) {
            return true;
        }
        return a;
    }

    protected boolean a(fdo fdo) {
        return fdo.c() == 104 ? true : a;
    }

    public long b() {
        return gwb.a(gwb.H(), "babel_pending_message_failure_duration", 1200000);
    }

    public boolean a(ead ead) {
        return a;
    }

    public String K_() {
        return "default_queue";
    }

    public boolean a(String str) {
        return a;
    }

    public boolean d() {
        return true;
    }

    public void m() {
        this.i = (gmp) jyn.a(gwb.H(), gmp.class);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName()).append("-").append(hashCode()).append(": ").append(g());
        if (((biw) jyn.a(gwb.H(), biw.class)).a("babel_server_request_verbose_logging", (boolean) a)) {
            stringBuilder.append("\nProtoBuf:\n").append(this.j == null ? "not built yet" : this.j).append("\nCreation stack:\n").append(this.b).append("\nOrigin stack:\n").append(this.c);
        }
        return stringBuilder.toString();
    }

    public ead a() {
        return this;
    }

    public void f() {
    }

    public List<bhc> e() {
        return null;
    }
}
