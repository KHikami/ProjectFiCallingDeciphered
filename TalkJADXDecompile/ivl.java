final class ivl implements Runnable {
    final /* synthetic */ ivi a;

    ivl(ivi ivi) {
        this.a = ivi;
    }

    public void run() {
        this.a.d();
        this.a.d = 0.0f;
        this.a.c = (this.a.c + 216.0f) % 360.0f;
        this.a.e = this.a.b();
        this.a.f = this.a.g[this.a.e];
        this.a.b.setIntValues(new int[]{this.a.g[this.a.e], this.a.g[this.a.b()]});
    }
}
