import java.io.IOException;

/* compiled from: PG */
final class dlr implements dmg {
    private /* synthetic */ dmg a;
    private /* synthetic */ dlq b;

    dlr(dlq dlq, dmg dmg) {
        this.b = dlq;
        this.a = dmg;
    }

    public final void a_(dlu dlu, long j) {
        this.b.a();
        try {
            this.a.a_(dlu, j);
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.a(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final void flush() {
        this.b.a();
        try {
            this.a.flush();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.a(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final void close() {
        this.b.a();
        try {
            this.a.close();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.a(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.a + ")";
    }
}
