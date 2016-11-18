package p000;

final class agu implements Runnable {
    final /* synthetic */ agp f689a;

    agu(agp agp) {
        this.f689a = agp;
    }

    public void run() {
        agp agp = this.f689a;
        agp.f661c.finish();
        agp.f661c.overridePendingTransition(0, 0);
    }
}
