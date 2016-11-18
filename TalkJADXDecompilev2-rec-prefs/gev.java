package p000;

final class gev implements Runnable {
    final /* synthetic */ geu f15117a;

    gev(geu geu) {
        this.f15117a = geu;
    }

    public void run() {
        glk.m17981d("Babel_telephony", "TeleSetupController, setup account timed out", new Object[0]);
        this.f15117a.f15093c.removeCallbacks(this.f15117a.f15094d);
        this.f15117a.m17466k();
    }
}
