import com.google.api.client.http.HttpStatusCodes;

final class gej implements Runnable {
    final /* synthetic */ gei a;

    gej(gei gei) {
        this.a = gei;
    }

    public void run() {
        this.a.a.a(HttpStatusCodes.STATUS_CODE_NO_CONTENT);
        glk.c("Babel_telephony", "TeleProxyNumberHelper, request timed out.", new Object[0]);
        this.a.a(true);
    }
}
