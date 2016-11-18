package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class ojv implements ojx {
    public String mo4156a() {
        return "gzip";
    }

    public OutputStream mo4158a(OutputStream outputStream) {
        return new GZIPOutputStream(outputStream);
    }

    public InputStream mo4157a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
