import java.io.OutputStream;

public final class kfg extends OutputStream {
    public long a;

    public void write(byte[] bArr, int i, int i2) {
        this.a += (long) i2;
    }

    public void write(int i) {
        this.a++;
    }
}
