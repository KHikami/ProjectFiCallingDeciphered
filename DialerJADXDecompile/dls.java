import java.io.IOException;

/* compiled from: PG */
final class dls implements dmh {
    private /* synthetic */ dmh a;
    private /* synthetic */ dlq b;

    dls(dlq dlq, dmh dmh) {
        this.b = dlq;
        this.a = dmh;
    }

    public final long a(dlu dlu, long j) {
        this.b.a();
        try {
            long a = this.a.a(dlu, j);
            this.b.a(true);
            return a;
        } catch (IOException e) {
            throw this.b.a(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final void close() {
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
        return "AsyncTimeout.source(" + this.a + ")";
    }
}
