import android.content.Context;

final class iws implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ iwr b;

    iws(iwr iwr, Context context) {
        this.b = iwr;
        this.a = context;
    }

    public void run() {
        if (this.b.a.g.compareAndSet(true, false)) {
            this.a.unregisterReceiver(this.b);
            this.b.a.f.set(gwb.az());
            this.b.a.c.a(gwb.ab(this.a));
        }
    }
}
