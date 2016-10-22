package defpackage;

/* renamed from: gdd */
final class gdd implements Runnable {
    final /* synthetic */ gdc a;

    gdd(gdc gdc) {
        this.a = gdc;
    }

    public void run() {
        glk.e("Babel_telephony", "TeleHandoffController, handoff timed out", new Object[0]);
        this.a.a = true;
        this.a.g();
    }
}
