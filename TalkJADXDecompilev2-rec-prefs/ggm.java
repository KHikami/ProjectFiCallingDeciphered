package p000;

import android.app.PendingIntent;

class ggm implements ggn, Runnable {
    final PendingIntent f15248a;
    final ggl f15249b;
    final /* synthetic */ ggk f15250c;

    ggm() {
    }

    public final void run() {
        m17659c();
    }

    public void m17657a() {
        glk.m17979c("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onConnected", new Object[0]);
        this.f15250c.m17649a(this.f15248a, this.f15249b);
        m17661e();
    }

    public void m17658b() {
        glk.m17979c("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onError", new Object[0]);
        this.f15249b.m17653a();
        m17661e();
    }

    public void m17659c() {
        glk.m17979c("Babel_telephony", "TeleInCallUiController.ShowDialogAction.onTimeout", new Object[0]);
        this.f15249b.m17654b();
        m17661e();
    }

    ggm(ggk ggk, PendingIntent pendingIntent, ggl ggl) {
        this.f15250c = ggk;
        this();
        this.f15248a = pendingIntent;
        this.f15249b = ggl;
    }

    public void mo2263d() {
        this.f15248a.cancel();
        m17661e();
    }

    void m17661e() {
        this.f15250c.f15240c.removeCallbacks(this);
        this.f15250c.f15239b.remove(this);
    }
}
