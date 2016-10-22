final class dpf implements Runnable {
    final /* synthetic */ dpe a;

    dpf(dpe dpe) {
        this.a = dpe;
    }

    public void run() {
        if (this.a.b > 0) {
            this.a.a();
            this.a.c.postDelayed(this.a.d, 2000);
            return;
        }
        this.a.a = false;
    }
}
