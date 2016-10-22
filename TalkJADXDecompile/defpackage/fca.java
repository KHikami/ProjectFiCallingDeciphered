package defpackage;

import android.content.Context;

/* renamed from: fca */
final class fca implements fne {
    private final jcf a;

    public fca(Context context) {
        this.a = (jcf) jyn.a(context, jcf.class);
    }

    public void a(int i, fnd fnd, fnf fnf) {
        boolean z;
        if (fnf == fnf.REGISTERED) {
            z = fnd.f;
        } else {
            z = false;
        }
        Object b = this.a.b(i);
        String valueOf = String.valueOf(glk.b(b.b("account_name")));
        glk.a("Babel", new StringBuilder(String.valueOf(valueOf).length() + 87).append("PstnUtilImpl.setAccountIsRegisteredForIncomingPstnCalls, account: ").append(valueOf).append(", isRegistered: ").append(z).toString(), new Object[0]);
        b.c("registered_for_incoming_pstn_calls", z);
        b.d();
    }
}
