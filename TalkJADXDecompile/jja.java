import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

final class jja extends FilterInputStream {
    private int a;
    private final byte[] b;
    private final ByteBuffer c;

    protected jja(InputStream inputStream) {
        super(inputStream);
        this.a = 0;
        this.b = new byte[8];
        this.c = ByteBuffer.wrap(this.b);
    }

    public int a() {
        return this.a;
    }

    public int read(byte[] bArr) {
        int read = this.in.read(bArr);
        this.a += Math.max(read, 0);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        this.a += Math.max(read, 0);
        return read;
    }

    public int read() {
        int read = this.in.read();
        this.a = (read >= 0 ? 1 : 0) + this.a;
        return read;
    }

    public long skip(long j) {
        long skip = this.in.skip(j);
        this.a = (int) (((long) this.a) + skip);
        return skip;
    }

    private void b(long j) {
        if (j < 0) {
            throw new IOException();
        } else if (skip(j) != j) {
            throw new EOFException();
        }
    }

    public void a(long j) {
        b(j - ((long) this.a));
    }

    private void a(byte[] bArr, int i, int i2) {
        if (read(bArr, 0, i2) != i2) {
            throw new EOFException();
        }
    }

    private void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public void a(ByteOrder byteOrder) {
        this.c.order(byteOrder);
    }

    public ByteOrder b() {
        return this.c.order();
    }

    public short c() {
        a(this.b, 0, 2);
        this.c.rewind();
        return this.c.getShort();
    }

    public int d() {
        return c() & 65535;
    }

    public int e() {
        a(this.b, 0, 4);
        this.c.rewind();
        return this.c.getInt();
    }

    public long f() {
        return ((long) e()) & 4294967295L;
    }

    public String a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        a(bArr);
        return new String(bArr, charset);
    }
}
