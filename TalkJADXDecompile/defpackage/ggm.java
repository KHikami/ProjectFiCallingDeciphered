package defpackage;

import android.app.PendingIntent;

/* renamed from: ggm */
class ggm implements ggn, Runnable {
    final PendingIntent a;
    final ggl b;
    final /* synthetic */ ggk c;

    ggm() {
    }

    public final void run() {
        c();
    }

    public void a() {
        glk.c("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onConnected", new Object[0]);
        this.c.a(this.a, this.b);
        e();
    }

    public void b() {
        glk.c("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onError", new Object[0]);
        this.b.a();
        e();
    }

    public void c() {
        glk.c("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onTimeout", new Object[0]);
        this.b.b();
        e();
    }

    ggm(ggk ggk, PendingIntent pendingIntent, ggl ggl) {
        this.c = ggk;
        this();
        this.a = pendingIntent;
        this.b = ggl;
    }

    public void d() {
        this.a.cancel();
        e();
    }

    void e() {
        this.c.c.removeCallbacks(this);
        this.c.b.remove(this);
    }
}
