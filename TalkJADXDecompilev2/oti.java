package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public final class oti implements HttpEntity {
    private static final char[] a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final otd b;
    private final Header c;
    private long d;
    private volatile boolean e;

    private oti(int i, String str, Charset charset) {
        Charset charset2 = null;
        String a = oti.a();
        if (i == 0) {
            i = otf.a;
        }
        this.b = new otd("form-data", charset2, a, i);
        String str2 = "Content-Type";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("multipart/form-data; boundary=");
        stringBuilder.append(a);
        if (charset2 != null) {
            stringBuilder.append("; charset=");
            stringBuilder.append(charset2.name());
        }
        this.c = new BasicHeader(str2, stringBuilder.toString());
        this.e = true;
    }

    public oti() {
        this(otf.a, null, null);
    }

    private static String a() {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            stringBuilder.append(a[random.nextInt(a.length)]);
        }
        return stringBuilder.toString();
    }

    private void a(otb otb) {
        this.b.a(otb);
        this.e = true;
    }

    public void a(String str, otj otj) {
        a(new otb(str, otj));
    }

    public boolean isRepeatable() {
        for (otb a : this.b.a()) {
            if (a.a().d() < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isChunked() {
        return !isRepeatable();
    }

    public boolean isStreaming() {
        return !isRepeatable();
    }

    public long getContentLength() {
        if (this.e) {
            this.d = this.b.b();
            this.e = false;
        }
        return this.d;
    }

    public Header getContentType() {
        return this.c;
    }

    public Header getContentEncoding() {
        return null;
    }

    public void consumeContent() {
        if (isStreaming()) {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        }
    }

    public InputStream getContent() {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public void writeTo(OutputStream outputStream) {
        this.b.a(outputStream);
    }
}
