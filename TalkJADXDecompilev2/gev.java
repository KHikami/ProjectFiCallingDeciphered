package defpackage;

final class gev implements Runnable {
    final /* synthetic */ geu a;

    gev(geu geu) {
        this.a = geu;
    }

    public void run() {
        glk.d("Babel_telephony", "TeleSetupController, setup account timed out", new Object[0]);
        this.a.c.removeCallbacks(this.a.d);
        this.a.k();
    }
}
