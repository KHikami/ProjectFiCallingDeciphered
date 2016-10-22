package defpackage;

import android.os.SystemClock;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* renamed from: blp */
final class blp extends FilterInputStream {
    private HttpURLConnection a;
    private long b;

    public blp(HttpURLConnection httpURLConnection, InputStream inputStream) {
        super(inputStream);
        this.b = SystemClock.uptimeMillis();
        this.a = httpURLConnection;
    }

    public final void close() {
        super.close();
        this.a.disconnect();
        if (bdf.a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            bdf.a(blo.a, "fetch took " + (uptimeMillis - this.b) + " ms");
        }
    }
}
