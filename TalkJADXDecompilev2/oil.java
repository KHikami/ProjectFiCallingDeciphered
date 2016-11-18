package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class oil {
    private InputStream a;
    private ByteArrayOutputStream b;

    public oil(InputStream inputStream) {
        this.a = inputStream;
        try {
            b();
        } catch (IOException e) {
            System.out.println("IOException in CopyInputStream");
            System.out.println(e.toString());
        }
    }

    private int b() {
        this.b = new ByteArrayOutputStream();
        byte[] bArr = new byte[256];
        int i = 0;
        while (true) {
            int read = this.a.read(bArr);
            if (-1 != read) {
                i += 256;
                this.b.write(bArr, 0, read);
            } else {
                this.b.flush();
                return i;
            }
        }
    }

    public ByteArrayInputStream a() {
        return new ByteArrayInputStream(this.b.toByteArray());
    }
}
