package defpackage;

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
    private static final ByteArrayBuffer a = otd.a(otg.a, ": ");
    private static final ByteArrayBuffer b = otd.a(otg.a, "\r\n");
    private static final ByteArrayBuffer c = otd.a(otg.a, "--");
    private final String d;
    private final Charset e;
    private final String f;
    private final List<otb> g;
    private final int h;

    private static ByteArrayBuffer a(Charset charset, String str) {
        ByteBuffer encode = charset.encode(CharBuffer.wrap(str));
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(encode.remaining());
        byteArrayBuffer.append(encode.array(), encode.position(), encode.remaining());
        return byteArrayBuffer;
    }

    private static void a(ByteArrayBuffer byteArrayBuffer, OutputStream outputStream) {
        outputStream.write(byteArrayBuffer.buffer(), 0, byteArrayBuffer.length());
    }

    private static void a(String str, Charset charset, OutputStream outputStream) {
        otd.a(otd.a(charset, str), outputStream);
    }

    private static void a(String str, OutputStream outputStream) {
        otd.a(otd.a(otg.a, str), outputStream);
    }

    private static void a(oth oth, Charset charset, OutputStream outputStream) {
        otd.a(oth.a(), charset, outputStream);
        otd.a(a, outputStream);
        otd.a(oth.b(), charset, outputStream);
        otd.a(b, outputStream);
    }

    public otd(String str, Charset charset, String str2, int i) {
        if (str2 == null) {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        }
        this.d = str;
        if (charset == null) {
            charset = otg.a;
        }
        this.e = charset;
        this.f = str2;
        this.g = new ArrayList();
        this.h = i;
    }

    public List<otb> a() {
        return this.g;
    }

    public void a(otb otb) {
        if (otb != null) {
            this.g.add(otb);
        }
    }

    private String c() {
        return this.f;
    }

    private void a(int i, OutputStream outputStream, boolean z) {
        ByteArrayBuffer a = otd.a(this.e, c());
        for (otb otb : this.g) {
            otd.a(c, outputStream);
            otd.a(a, outputStream);
            otd.a(b, outputStream);
            otc b = otb.b();
            switch (ote.a[i - 1]) {
                case 1:
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        oth oth = (oth) it.next();
                        otd.a(oth.a(), outputStream);
                        otd.a(a, outputStream);
                        otd.a(oth.b(), outputStream);
                        otd.a(b, outputStream);
                    }
                    break;
                case 2:
                    otd.a(otb.b().a("Content-Disposition"), this.e, outputStream);
                    if (otb.a().e() != null) {
                        otd.a(otb.b().a("Content-Type"), this.e, outputStream);
                        break;
                    }
                    break;
            }
            otd.a(b, outputStream);
            if (z) {
                otb.a().a(outputStream);
            }
            otd.a(b, outputStream);
        }
        otd.a(c, outputStream);
        otd.a(a, outputStream);
        otd.a(c, outputStream);
        otd.a(b, outputStream);
    }

    public void a(OutputStream outputStream) {
        a(this.h, outputStream, true);
    }

    public long b() {
        long j = 0;
        for (otb a : this.g) {
            long d = a.a().d();
            if (d < 0) {
                return -1;
            }
            j = d + j;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(this.h, byteArrayOutputStream, false);
            return ((long) byteArrayOutputStream.toByteArray().length) + j;
        } catch (IOException e) {
            return -1;
        }
    }
}
