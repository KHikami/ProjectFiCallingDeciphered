final class fsn implements Runnable {
    final /* synthetic */ fsr a;
    final /* synthetic */ fsq b;
    final /* synthetic */ fsi c;

    fsn(fsi fsi, fsr fsr, fsq fsq) {
        this.c = fsi;
        this.a = fsr;
        this.b = fsq;
    }

    public void run() {
        this.a.a(this.b, false);
        this.b.b();
    }
}
