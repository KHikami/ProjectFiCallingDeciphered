import java.io.IOException;

/* compiled from: PG */
abstract class dih implements Runnable {
    private /* synthetic */ dhv a;

    public abstract void a();

    private dih(dhv dhv) {
        this.a = dhv;
    }

    public final void run() {
        try {
            if (this.a.b == null) {
                throw new IOException("Unable to perform write due to unavailable frameWriter.");
            }
            a();
        } catch (Throwable e) {
            this.a.d.a(e);
        } catch (Throwable e2) {
            this.a.d.a(e2);
        }
    }
}
