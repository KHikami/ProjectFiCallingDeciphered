import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
public final class dfn implements dfp {
    public final String a() {
        return "gzip";
    }

    public final OutputStream a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    public final InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
