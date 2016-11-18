package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public final class oti implements HttpEntity {
    private static final char[] f34247a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final otd f34248b;
    private final Header f34249c;
    private long f34250d;
    private volatile boolean f34251e;

    private oti(int i, String str, Charset charset) {
        Charset charset2 = null;
        String a = oti.m39684a();
        if (i == 0) {
            i = otf.f34241a;
        }
        this.f34248b = new otd("form-data", charset2, a, i);
        String str2 = "Content-Type";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("multipart/form-data; boundary=");
        stringBuilder.append(a);
        if (charset2 != null) {
            stringBuilder.append("; charset=");
            stringBuilder.append(charset2.name());
        }
        this.f34249c = new BasicHeader(str2, stringBuilder.toString());
        this.f34251e = true;
    }

    public oti() {
        this(otf.f34241a, null, null);
    }

    private static String m39684a() {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        int nextInt = random.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            stringBuilder.append(f34247a[random.nextInt(f34247a.length)]);
        }
        return stringBuilder.toString();
    }

    private void m39685a(otb otb) {
        this.f34248b.m39679a(otb);
        this.f34251e = true;
    }

    public void m39686a(String str, otj otj) {
        m39685a(new otb(str, otj));
    }

    public boolean isRepeatable() {
        for (otb a : this.f34248b.m39677a()) {
            if (a.m39666a().mo4223d() < 0) {
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
        if (this.f34251e) {
            this.f34250d = this.f34248b.m39680b();
            this.f34251e = false;
        }
        return this.f34250d;
    }

    public Header getContentType() {
        return this.f34249c;
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
        this.f34248b.m39678a(outputStream);
    }
}
