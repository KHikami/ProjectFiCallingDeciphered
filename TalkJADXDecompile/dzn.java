import java.io.Closeable;
import java.io.InputStream;

public final class dzn implements Closeable {
    final /* synthetic */ dzi a;
    private final String b;
    private final long c;
    private final InputStream[] d;

    dzn(dzi dzi, String str, long j, InputStream[] inputStreamArr) {
        this.a = dzi;
        this.b = str;
        this.c = j;
        this.d = inputStreamArr;
    }

    public InputStream a(int i) {
        return this.d[0];
    }

    public void close() {
        for (Closeable a : this.d) {
            dzi.a(a);
        }
    }
}
