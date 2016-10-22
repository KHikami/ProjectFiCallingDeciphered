package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: dzl */
final class dzl extends FilterOutputStream {
    final /* synthetic */ dzk a;

    dzl(dzk dzk, OutputStream outputStream) {
        this.a = dzk;
        super(outputStream);
    }

    public void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException e) {
            this.a.b = true;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException e) {
            this.a.b = true;
        }
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException e) {
            this.a.b = true;
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e) {
            this.a.b = true;
        }
    }
}
