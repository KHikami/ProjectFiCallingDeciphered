package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class otl extends otj {
    private final byte[] f34258d;
    private final Charset f34259e;

    private otl(String str, String str2, Charset charset) {
        super(str2);
        if (str == null) {
            throw new IllegalArgumentException("Text may not be null");
        }
        Charset forName = Charset.forName("US-ASCII");
        this.f34258d = str.getBytes(forName.name());
        this.f34259e = forName;
    }

    public otl(String str) {
        this(str, "text/plain", null);
    }

    public void mo4220a(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(this.f34258d);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    public String mo4222c() {
        return "8bit";
    }

    public String mo4221b() {
        return this.f34259e.name();
    }

    public long mo4223d() {
        return (long) this.f34258d.length;
    }

    public String mo4224e() {
        return null;
    }
}
