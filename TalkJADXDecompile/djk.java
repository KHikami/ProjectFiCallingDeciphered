final class djk implements Runnable {
    final /* synthetic */ djd a;

    djk(djd djd) {
        this.a = djd;
    }

    public void run() {
        if (this.a.e.a()) {
            this.a.e.b();
            this.a.a(this.a.e);
        }
        if (this.a.f.a()) {
            this.a.f.b();
            this.a.a(this.a.f);
        }
    }
}
