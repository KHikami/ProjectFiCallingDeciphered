package p000;

final class ipi implements Runnable {
    final /* synthetic */ ipg f18657a;

    ipi(ipg ipg) {
        this.f18657a = ipg;
    }

    public void run() {
        if (this.f18657a.f18652i != null) {
            this.f18657a.f18652i.cancel(true);
            this.f18657a.f18652i = null;
        }
        this.f18657a.f18646c.mo3346a();
    }
}
