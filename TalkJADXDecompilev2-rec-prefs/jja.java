package p000;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

final class jja extends FilterInputStream {
    private int f20175a = 0;
    private final byte[] f20176b = new byte[8];
    private final ByteBuffer f20177c = ByteBuffer.wrap(this.f20176b);

    protected jja(InputStream inputStream) {
        super(inputStream);
    }

    public int m24347a() {
        return this.f20175a;
    }

    public int read(byte[] bArr) {
        int read = this.in.read(bArr);
        this.f20175a += Math.max(read, 0);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        this.f20175a += Math.max(read, 0);
        return read;
    }

    public int read() {
        int read = this.in.read();
        this.f20175a = (read >= 0 ? 1 : 0) + this.f20175a;
        return read;
    }

    public long skip(long j) {
        long skip = this.in.skip(j);
        this.f20175a = (int) (((long) this.f20175a) + skip);
        return skip;
    }

    private void m24346b(long j) {
        if (j < 0) {
            throw new IOException();
        } else if (skip(j) != j) {
            throw new EOFException();
        }
    }

    public void m24349a(long j) {
        m24346b(j - ((long) this.f20175a));
    }

    private void m24345a(byte[] bArr, int i, int i2) {
        if (read(bArr, 0, i2) != i2) {
            throw new EOFException();
        }
    }

    private void m24344a(byte[] bArr) {
        m24345a(bArr, 0, bArr.length);
    }

    public void m24350a(ByteOrder byteOrder) {
        this.f20177c.order(byteOrder);
    }

    public ByteOrder m24351b() {
        return this.f20177c.order();
    }

    public short m24352c() {
        m24345a(this.f20176b, 0, 2);
        this.f20177c.rewind();
        return this.f20177c.getShort();
    }

    public int m24353d() {
        return m24352c() & 65535;
    }

    public int m24354e() {
        m24345a(this.f20176b, 0, 4);
        this.f20177c.rewind();
        return this.f20177c.getInt();
    }

    public long m24355f() {
        return ((long) m24354e()) & 4294967295L;
    }

    public String m24348a(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m24344a(bArr);
        return new String(bArr, charset);
    }
}
