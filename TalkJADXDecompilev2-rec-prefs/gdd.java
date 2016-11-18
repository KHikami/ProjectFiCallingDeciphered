package p000;

final class gdd implements Runnable {
    final /* synthetic */ gdc f14744a;

    gdd(gdc gdc) {
        this.f14744a = gdc;
    }

    public void run() {
        glk.m17982e("Babel_telephony", "TeleHandoffController, handoff timed out", new Object[0]);
        this.f14744a.f14730a = true;
        this.f14744a.m17034g();
    }
}
