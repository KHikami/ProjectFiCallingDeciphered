package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class ojv implements ojx {
    public String a() {
        return "gzip";
    }

    public OutputStream a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    public InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
