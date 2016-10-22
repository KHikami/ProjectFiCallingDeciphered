package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: iyz */
public final class iyz {
    private final ByteBuffer a;
    private final int b;
    private final int[] c;
    private final izb d;
    private final ByteBuffer e;

    public iyz(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        this.a = byteBuffer;
        this.e = byteBuffer.duplicate();
        do {
        } while (byteBuffer.get() != null);
        this.b = byteBuffer.getInt();
        ba.b(this.b > 0);
        byteBuffer.getLong();
        this.c = new int[12];
        this.c[2] = this.b;
        this.c[4] = 1;
        this.c[5] = 2;
        this.c[6] = 4;
        this.c[7] = 8;
        this.c[8] = 1;
        this.c[9] = 2;
        this.c[10] = 4;
        this.c[11] = 8;
        this.d = new izb();
        this.d.a(137, this.b);
        this.d.a(255, this.b);
        this.d.a(139, this.b);
        this.d.a(144, this.b);
        this.d.a(138, this.b);
        this.d.a(5, this.b);
        this.d.a(7, this.b);
        this.d.a(140, this.b);
        this.d.a(141, this.b);
        this.d.a(1, this.b + this.b);
        this.d.a(3, this.b + 8);
        this.d.a(2, this.b + 8);
        this.d.a(8, this.b + 8);
        this.d.a(142, this.b + 8);
        this.d.a(4, this.b + 4);
        this.d.a(6, this.b + 4);
    }

    public ByteBuffer a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String a(int i) {
        ba.a(i >= 0);
        byte[] bArr = new byte[(this.e.getInt(i) - this.b)];
        this.e.position((i + 4) + this.b);
        this.e.get(bArr);
        return new String(bArr, Charset.defaultCharset());
    }

    public int b(int i) {
        return this.a.getInt(i) - this.b;
    }

    public int c(int i) {
        return (i + 4) + this.b;
    }

    public int d(int i) {
        int i2 = this.c[i];
        ba.b(i2 > 0);
        return i2;
    }

    public boolean e(int i) {
        return this.d.c(i);
    }

    public int f(int i) {
        return this.d.b(i);
    }

    public void g(int i) {
        ba.a(i >= 0);
        int position = this.a.position() + i;
        if (position > this.a.limit()) {
            throw new BufferUnderflowException();
        }
        this.a.position(position);
    }

    public int c() {
        switch (this.b) {
            case wi.j /*1*/:
                return this.a.get();
            case wi.l /*2*/:
                return this.a.getShort();
            case wi.h /*4*/:
                return this.a.getInt();
            default:
                throw new IllegalStateException();
        }
    }

    public int h(int i) {
        switch (this.b) {
            case wi.j /*1*/:
                return this.a.get(i);
            case wi.l /*2*/:
                return this.a.getShort(i);
            case wi.h /*4*/:
                return this.a.getInt(i);
            default:
                throw new IllegalStateException();
        }
    }

    public static boolean i(int i) {
        return i == 2;
    }
}
