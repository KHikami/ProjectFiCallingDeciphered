package p000;

import com.google.api.client.http.HttpStatusCodes;

final class gej implements Runnable {
    final /* synthetic */ gei f14862a;

    gej(gei gei) {
        this.f14862a = gei;
    }

    public void run() {
        this.f14862a.f14853a.mo1403a(HttpStatusCodes.STATUS_CODE_NO_CONTENT);
        glk.m17979c("Babel_telephony", "TeleProxyNumberHelper, request timed out.", new Object[0]);
        this.f14862a.m17164a(true);
    }
}
