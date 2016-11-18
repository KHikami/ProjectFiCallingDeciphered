package p000;

final class ali implements Runnable {
    final /* synthetic */ alo f1195a;
    final /* synthetic */ alh f1196b;

    ali(alh alh, alo alo) {
        this.f1196b = alh;
        this.f1195a = alo;
    }

    public void run() {
        try {
            this.f1196b.f1190a.put(this.f1195a);
        } catch (InterruptedException e) {
        }
    }
}
