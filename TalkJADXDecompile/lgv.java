import java.util.concurrent.ExecutorService;

final class lgv extends lgx {
    final /* synthetic */ mtm a;

    lgv(mtm mtm) {
        this.a = mtm;
    }

    public /* synthetic */ mtl a() {
        return d();
    }

    public /* synthetic */ ExecutorService b() {
        return d();
    }

    public /* synthetic */ Object c() {
        return d();
    }

    public void execute(Runnable runnable) {
        this.a.execute(new lgw(this, runnable));
    }

    public mtm d() {
        return this.a;
    }
}
