package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class oil {
    private InputStream f32983a;
    private ByteArrayOutputStream f32984b;

    public oil(InputStream inputStream) {
        this.f32983a = inputStream;
        try {
            m38486b();
        } catch (IOException e) {
            System.out.println("IOException in CopyInputStream");
            System.out.println(e.toString());
        }
    }

    private int m38486b() {
        this.f32984b = new ByteArrayOutputStream();
        byte[] bArr = new byte[256];
        int i = 0;
        while (true) {
            int read = this.f32983a.read(bArr);
            if (-1 != read) {
                i += 256;
                this.f32984b.write(bArr, 0, read);
            } else {
                this.f32984b.flush();
                return i;
            }
        }
    }

    public ByteArrayInputStream m38487a() {
        return new ByteArrayInputStream(this.f32984b.toByteArray());
    }
}
