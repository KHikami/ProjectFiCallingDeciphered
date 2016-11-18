package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

public final class otd {
    private static final ByteArrayBuffer f34232a = otd.m39670a(otg.f34244a, ": ");
    private static final ByteArrayBuffer f34233b = otd.m39670a(otg.f34244a, "\r\n");
    private static final ByteArrayBuffer f34234c = otd.m39670a(otg.f34244a, "--");
    private final String f34235d;
    private final Charset f34236e;
    private final String f34237f;
    private final List<otb> f34238g;
    private final int f34239h;

    private static ByteArrayBuffer m39670a(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    private static void m39674a(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    private static void m39673a(String str, Charset charset, OutputStream outputStream) {
        otd.m39674a(otd.m39670a(charset, str), outputStream);
    }

    private static void m39672a(String str, OutputStream outputStream) {
        otd.m39674a(otd.m39670a(otg.f34244a, str), outputStream);
    }

    private static void m39675a(oth oth, Charset charset, OutputStream outputStream) {
        otd.m39673a(oth.m39682a(), charset, outputStream);
        otd.m39674a(f34232a, outputStream);
        otd.m39673a(oth.m39683b(), charset, outputStream);
        otd.m39674a(f34233b, outputStream);
    }

    public otd(String str, Charset charset, String str2, int i) {
        if (str2 == null) {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        }
        this.f34235d = str;
        if (charset == null) {
            charset = otg.f34244a;
        }
        this.f34236e = charset;
        this.f34237f = str2;
        this.f34238g = new ArrayList();
        this.f34239h = i;
    }

    public List<otb> m39677a() {
        return this.f34238g;
    }

    public void m39679a(otb otb) {
        if (otb != null) {
            this.f34238g.add(otb);
        }
    }

    private String m39676c() {
        return this.f34237f;
    }

    private void m39671a(int i, OutputStream outputStream, boolean z) {
        ByteArrayBuffer a = otd.m39670a(this.f34236e, m39676c());
        for (otb otb : this.f34238g) {
            otd.m39674a(f34234c, outputStream);
            otd.m39674a(a, outputStream);
            otd.m39674a(f34233b, outputStream);
            otc b = otb.m39667b();
            switch (ote.f34240a[i - 1]) {
                case 1:
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        oth oth = (oth) it.next();
                        otd.m39672a(oth.m39682a(), outputStream);
                        otd.m39674a(f34232a, outputStream);
                        otd.m39672a(oth.m39683b(), outputStream);
                        otd.m39674a(f34233b, outputStream);
                    }
                    break;
                case 2:
                    otd.m39675a(otb.m39667b().m39668a("Content-Disposition"), this.f34236e, outputStream);
                    if (otb.m39666a().mo4224e() != null) {
                        otd.m39675a(otb.m39667b().m39668a("Content-Type"), this.f34236e, outputStream);
                        break;
                    }
                    break;
            }
            otd.m39674a(f34233b, outputStream);
            if (z) {
                otb.m39666a().mo4220a(outputStream);
            }
            otd.m39674a(f34233b, outputStream);
        }
        otd.m39674a(f34234c, outputStream);
        otd.m39674a(a, outputStream);
        otd.m39674a(f34234c, outputStream);
        otd.m39674a(f34233b, outputStream);
    }

    public void m39678a(OutputStream outputStream) {
        m39671a(this.f34239h, outputStream, true);
    }

    public long m39680b() {
        long j = 0;
        for (otb a : this.f34238g) {
            long d = a.m39666a().mo4223d();
            if (d < 0) {
                return -1;
            }
            j = d + j;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m39671a(this.f34239h, byteArrayOutputStream, false);
            return ((long) byteArrayOutputStream.toByteArray().length) + j;
        } catch (IOException e) {
            return -1;
        }
    }
}
