package defpackage;

/* renamed from: agu */
final class agu implements Runnable {
    final /* synthetic */ agp a;

    agu(agp agp) {
        this.a = agp;
    }

    public void run() {
        agp agp = this.a;
        agp.c.finish();
        agp.c.overridePendingTransition(0, 0);
    }
}
