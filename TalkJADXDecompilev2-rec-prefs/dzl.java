package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class dzl extends FilterOutputStream {
    final /* synthetic */ dzk f10919a;

    dzl(dzk dzk, OutputStream outputStream) {
        this.f10919a = dzk;
        super(outputStream);
    }

    public void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException e) {
            this.f10919a.f10917b = true;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException e) {
            this.f10919a.f10917b = true;
        }
    }

    public void close() {
        try {
            this.out.close();
        } catch (IOException e) {
            this.f10919a.f10917b = true;
        }
    }

    public void flush() {
        try {
            this.out.flush();
        } catch (IOException e) {
            this.f10919a.f10917b = true;
        }
    }
}
