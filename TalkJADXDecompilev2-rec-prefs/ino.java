package p000;

final class ino implements Runnable {
    final /* synthetic */ int f18159a;
    final /* synthetic */ inj f18160b;

    ino(inj inj, int i) {
        this.f18160b = inj;
        this.f18159a = i;
    }

    public void run() {
        this.f18160b.f18142f = this.f18159a;
        this.f18160b.m22387l();
        if (this.f18160b.f18138b != null) {
            this.f18160b.f18138b.m10380d(this.f18160b.f18142f);
        }
    }
}
