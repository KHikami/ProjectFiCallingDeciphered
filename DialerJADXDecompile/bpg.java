import android.os.Looper;

final class bpg implements Runnable {
    private /* synthetic */ bpf a;

    bpg(bpf bpf) {
        this.a = bpf;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a.b().a((Runnable) this);
            return;
        }
        boolean b = this.a.b();
        this.a.c = 0;
        if (b) {
            bpf bpf = this.a;
            this.a.a();
        }
    }
}
