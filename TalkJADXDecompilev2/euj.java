package defpackage;

import android.accounts.AuthenticatorException;
import android.os.Bundle;
import java.io.EOFException;
import java.nio.ByteBuffer;

public abstract class euj<RQ extends nzf, RS extends nzf> extends jvo<RQ, RS> {
    private static final boolean a = false;
    public static final String c;
    private evz b;
    public final juv d = this.h.f();
    public final fok e;
    private eub u = ((eub) jyn.b(this.g, eub.class));

    public abstract evz a(RS rs);

    static {
        kae kae = glk.l;
        String str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation  https://www.googleapis.com/auth/chat.native";
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        } catch (ClassNotFoundException e) {
            str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation ";
        }
        c = str;
    }

    public euj(jvc jvc, fok fok, String str, fom fom, RQ rq, RS rs) {
        super(gwb.H(), jvc, str, rq, rs, fom.toString(), c);
        this.e = fok;
    }

    public evz d() {
        return this.b;
    }

    public final lup a(esp esp) {
        lup a = euk.a(esp.a(), esp.b(), esp.c(), esp.d(), (gmp) jyn.a(this.g, gmp.class));
        if (esp.f()) {
            return euk.a(a, esp.e());
        }
        return a;
    }

    public static void a(String str, boolean z) {
        String str2;
        String valueOf;
        if (str == null) {
            str2 = "cannot use null conversation id:";
            valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (str != null && blo.a(str)) {
            str2 = "cannot use client generated conversation id:";
            valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public void b(RQ rq) {
        if (a) {
            String valueOf = String.valueOf(rq);
            new StringBuilder(String.valueOf(valueOf).length() + 17).append("Sending request: ").append(valueOf);
        }
    }

    public void a() {
        boolean z = !"SMS".equals(this.h.b());
        String str = "Cannot send request for SMS only account: ";
        String valueOf = String.valueOf(k());
        ba.b(z, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void c(RS r3) {
        /*
        r2 = this;
        r1 = r2.a(r3);
        r0 = r2.u;
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = r2.u;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r2.a(r0);
        return;
    L_0x0014:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: euj.c(nzf):void");
    }

    private void a(evz evz) {
        if (evz == null || evz.a() == null) {
            throw new fdo(106, "Response error: NULL_RESPONSE/RESPONSE_INVALID");
        }
        int i = evz.a().b;
        if (i != 1) {
            String valueOf = String.valueOf(this.e);
            String str = evz.a().a;
            String str2 = evz.a().c;
            glk.e("Babel_ServerOperation", new StringBuilder(((String.valueOf(valueOf).length() + 61) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("Request sent ").append(valueOf).append(" got responseStatus ").append(i).append(" desc ").append(str).append(" debug_url ").append(str2).toString(), new Object[0]);
        } else if (a) {
            String valueOf2 = String.valueOf(this.e);
            new StringBuilder(String.valueOf(valueOf2).length() + 20).append("client request sent ").append(valueOf2);
        }
        switch (i) {
            case 1:
            case 6:
            case 9:
                evz.a(this.e);
                if (this.d != null) {
                    evz.a(this.d.h() * 1000);
                    evz.b(this.d.j() * 1000);
                }
                this.b = evz;
                return;
            case 2:
                throw new fdo(107, "Response error: ERROR_BUSY");
            case 3:
                throw new fdo(108, "Response error: ERROR_UNEXPECTED");
            case 4:
                throw new fdo(111, "Response error: ERROR_INVALID_REQUEST");
            case 5:
                throw new fdo(109, "Response error: ERROR_RETRY_LIMIT");
            case 7:
                throw new fdo(112, "Response error: ERROR_QUOTA_EXCEEDED");
            case 8:
                throw new fdo(113, "Response error: ERROR_RESPONSE_NOT_FOUND");
            default:
                valueOf = "Babel_ServerOperation";
                valueOf2 = evz.c != null ? evz.c.c : "(null)";
                glk.e(valueOf, new StringBuilder(String.valueOf(valueOf2).length() + 71).append("got unknown ResponseStatus in response header ").append(i).append("; debugUrl is ").append(valueOf2).toString(), new Object[0]);
                throw new fdo(108, "Resonse error: ERROR_UNEXPECTED");
        }
    }

    public final void a(ByteBuffer byteBuffer, String str) {
        super.a(byteBuffer, str);
        throw fdo.a(this.k, this.m, this.l);
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putString("alt", "proto");
        return bundle;
    }

    public void f() {
        if (!v()) {
            g();
            if (n()) {
                a(this.m);
            }
        }
    }

    private boolean v() {
        if (this.u != null) {
            try {
                evz a = this.u.a();
                if (a != null) {
                    a(a);
                    return true;
                }
            } catch (Exception e) {
                a(e);
            }
        }
        return false;
    }

    void a(Exception exception) {
        if (exception instanceof fdo) {
            throw ((fdo) exception);
        } else if (exception instanceof EOFException) {
            throw new fdo(103, exception);
        } else if (c(exception)) {
            throw new fdo(104, exception);
        } else {
            Object obj;
            for (Throwable th = exception; th != null; th = th.getCause()) {
                if (th instanceof AuthenticatorException) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj != null) {
                throw new fdo(100, exception);
            } else if (i()) {
                throw new fdo(121);
            } else {
                throw new fdo(102, exception);
            }
        }
    }
}
