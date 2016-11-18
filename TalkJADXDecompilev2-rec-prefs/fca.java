package p000;

import android.content.Context;

final class fca implements fne {
    private final jcf f12676a;

    public fca(Context context) {
        this.f12676a = (jcf) jyn.m25426a(context, jcf.class);
    }

    public void mo500a(int i, fnd fnd, fnf fnf) {
        boolean z;
        if (fnf == fnf.REGISTERED) {
            z = fnd.f13489f;
        } else {
            z = false;
        }
        Object b = this.f12676a.mo3464b(i);
        String valueOf = String.valueOf(glk.m17974b(b.mo3440b("account_name")));
        glk.m17970a("Babel", new StringBuilder(String.valueOf(valueOf).length() + 87).append("PstnUtilImpl.setAccountIsRegisteredForIncomingPstnCalls, account: ").append(valueOf).append(", isRegistered: ").append(z).toString(), new Object[0]);
        b.mo3447c("registered_for_incoming_pstn_calls", z);
        b.m23891d();
    }
}
