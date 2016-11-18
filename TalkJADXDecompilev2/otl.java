package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class otl extends otj {
    private final byte[] d;
    private final Charset e;

    private otl(String str, String str2, Charset charset) {
        super(str2);
        if (str == null) {
            throw new IllegalArgumentException("Text may not be null");
        }
        Charset forName = Charset.forName("US-ASCII");
        this.d = str.getBytes(forName.name());
        this.e = forName;
    }

    public otl(String str) {
        this(str, "text/plain", null);
    }

    public void a(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(this.d);
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

    public String c() {
        return "8bit";
    }

    public String b() {
        return this.e.name();
    }

    public long d() {
        return (long) this.d.length;
    }

    public String e() {
        return null;
    }
}
