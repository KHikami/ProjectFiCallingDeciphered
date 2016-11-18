package p000;

final class ivl implements Runnable {
    final /* synthetic */ ivi f19149a;

    ivl(ivi ivi) {
        this.f19149a = ivi;
    }

    public void run() {
        this.f19149a.m23361d();
        this.f19149a.f19125d = 0.0f;
        this.f19149a.f19124c = (this.f19149a.f19124c + 216.0f) % 360.0f;
        this.f19149a.f19126e = this.f19149a.m23359b();
        this.f19149a.f19127f = this.f19149a.f19128g[this.f19149a.f19126e];
        this.f19149a.f19123b.setIntValues(new int[]{this.f19149a.f19128g[this.f19149a.f19126e], this.f19149a.f19128g[this.f19149a.m23359b()]});
    }
}
