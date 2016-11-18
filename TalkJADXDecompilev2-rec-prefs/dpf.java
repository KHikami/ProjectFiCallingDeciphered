package p000;

final class dpf implements Runnable {
    final /* synthetic */ dpe f10282a;

    dpf(dpe dpe) {
        this.f10282a = dpe;
    }

    public void run() {
        if (this.f10282a.f10277b > 0) {
            this.f10282a.m12411a();
            this.f10282a.f10278c.postDelayed(this.f10282a.f10279d, 2000);
            return;
        }
        this.f10282a.f10276a = false;
    }
}
