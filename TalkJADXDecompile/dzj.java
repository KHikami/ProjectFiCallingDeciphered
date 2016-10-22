import java.util.concurrent.Callable;

final class dzj implements Callable<Void> {
    final /* synthetic */ dzi a;

    dzj(dzi dzi) {
        this.a = dzi;
    }

    public /* synthetic */ Object call() {
        return a();
    }

    private Void a() {
        synchronized (this.a) {
            if (this.a.c == null) {
            } else {
                this.a.c();
                if (this.a.b()) {
                    this.a.a();
                    this.a.d = 0;
                }
            }
        }
        return null;
    }
}
