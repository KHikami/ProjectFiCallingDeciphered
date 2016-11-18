package p000;

final class owa implements Runnable {
    final /* synthetic */ long f34418a;
    final /* synthetic */ int f34419b;
    final /* synthetic */ boolean f34420c;
    final /* synthetic */ ovz f34421d;

    owa(ovz ovz, long j, int i, boolean z) {
        this.f34421d = ovz;
        this.f34418a = j;
        this.f34419b = i;
        this.f34420c = z;
    }

    public void run() {
        this.f34421d.f34415a.f33937a.mo4241a(this.f34418a, this.f34419b);
        if (this.f34420c) {
            this.f34421d.f34415a.f33937a.mo4239a(this.f34419b);
            this.f34421d.f34415a.f33937a.mo4242a(new long[]{this.f34418a});
        }
    }
}
