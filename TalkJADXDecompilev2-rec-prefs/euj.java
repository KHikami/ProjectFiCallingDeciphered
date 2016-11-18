package p000;

import android.accounts.AuthenticatorException;
import android.os.Bundle;
import java.io.EOFException;
import java.nio.ByteBuffer;

public abstract class euj<RQ extends nzf, RS extends nzf> extends jvo<RQ, RS> {
    private static final boolean f5786a = false;
    public static final String f5787c;
    private evz f5788b;
    public final juv f5789d = this.f5761h.m25297f();
    public final fok f5790e;
    private eub f5791u = ((eub) jyn.m25433b(this.g, eub.class));

    public abstract evz mo1045a(RS rs);

    static {
        kae kae = glk.f15565l;
        String str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation  https://www.googleapis.com/auth/chat.native";
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        } catch (ClassNotFoundException e) {
            str = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation ";
        }
        f5787c = str;
    }

    public euj(jvc jvc, fok fok, String str, fom fom, RQ rq, RS rs) {
        super(gwb.m1400H(), jvc, str, rq, rs, fom.toString(), f5787c);
        this.f5790e = fok;
    }

    public evz mo1043d() {
        return this.f5788b;
    }

    public final lup m8100a(esp esp) {
        lup a = euk.m14558a(esp.m14374a(), esp.m14375b(), esp.m14376c(), esp.m14377d(), (gmp) jyn.m25426a(this.g, gmp.class));
        if (esp.m14379f()) {
            return euk.m14559a(a, esp.m14378e());
        }
        return a;
    }

    public static void m8097a(String str, boolean z) {
        String str2;
        String valueOf;
        if (str == null) {
            str2 = "cannot use null conversation id:";
            valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (str != null && blo.m5871a(str)) {
            str2 = "cannot use client generated conversation id:";
            valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public void mo1041b(RQ rq) {
        if (f5786a) {
            String valueOf = String.valueOf(rq);
            new StringBuilder(String.valueOf(valueOf).length() + 17).append("Sending request: ").append(valueOf);
        }
    }

    public void mo1040a() {
        boolean z = !"SMS".equals(this.f5761h.m25293b());
        String str = "Cannot send request for SMS only account: ";
        String valueOf = String.valueOf(mo1037k());
        ba.m4610b(z, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void mo1042c(RS rs) {
        evz b;
        evz a = mo1045a((nzf) rs);
        if (this.f5791u != null) {
            b = this.f5791u.m14533b();
        }
        b = a;
        m8096a(b);
    }

    private void m8096a(evz evz) {
        if (evz == null || evz.m8122a() == null) {
            throw new fdo(106, "Response error: NULL_RESPONSE/RESPONSE_INVALID");
        }
        int i = evz.m8122a().f12529b;
        if (i != 1) {
            String valueOf = String.valueOf(this.f5790e);
            String str = evz.m8122a().f12528a;
            String str2 = evz.m8122a().f12530c;
            glk.m17982e("Babel_ServerOperation", new StringBuilder(((String.valueOf(valueOf).length() + 61) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("Request sent ").append(valueOf).append(" got responseStatus ").append(i).append(" desc ").append(str).append(" debug_url ").append(str2).toString(), new Object[0]);
        } else if (f5786a) {
            String valueOf2 = String.valueOf(this.f5790e);
            new StringBuilder(String.valueOf(valueOf2).length() + 20).append("client request sent ").append(valueOf2);
        }
        switch (i) {
            case 1:
            case 6:
            case 9:
                evz.mo1960a(this.f5790e);
                if (this.f5789d != null) {
                    evz.m8123a(this.f5789d.m25265h() * 1000);
                    evz.m8128b(this.f5789d.m25267j() * 1000);
                }
                this.f5788b = evz;
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
                valueOf2 = evz.f5801c != null ? evz.f5801c.f12530c : "(null)";
                glk.m17982e(valueOf, new StringBuilder(String.valueOf(valueOf2).length() + 71).append("got unknown ResponseStatus in response header ").append(i).append("; debugUrl is ").append(valueOf2).toString(), new Object[0]);
                throw new fdo(108, "Resonse error: ERROR_UNEXPECTED");
        }
    }

    public final void mo1034a(ByteBuffer byteBuffer, String str) {
        super.mo1034a(byteBuffer, str);
        throw fdo.m15081a(this.f5764k, this.f5766m, this.f5765l);
    }

    public Bundle mo1044e() {
        Bundle bundle = new Bundle();
        bundle.putString("alt", "proto");
        return bundle;
    }

    public void m8108f() {
        if (!m8098v()) {
            m8069g();
            if (m8076n()) {
                m8102a(this.f5766m);
            }
        }
    }

    private boolean m8098v() {
        if (this.f5791u != null) {
            try {
                evz a = this.f5791u.m14532a();
                if (a != null) {
                    m8096a(a);
                    return true;
                }
            } catch (Exception e) {
                m8102a(e);
            }
        }
        return false;
    }

    void m8102a(Exception exception) {
        if (exception instanceof fdo) {
            throw ((fdo) exception);
        } else if (exception instanceof EOFException) {
            throw new fdo(103, exception);
        } else if (m8067c(exception)) {
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
            } else if (m8071i()) {
                throw new fdo(121);
            } else {
                throw new fdo(102, exception);
            }
        }
    }
}
