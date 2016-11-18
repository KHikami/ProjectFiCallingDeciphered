package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class iyz {
    private final ByteBuffer f19441a;
    private final int f19442b;
    private final int[] f19443c;
    private final izb f19444d;
    private final ByteBuffer f19445e;

    public iyz(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        this.f19441a = byteBuffer;
        this.f19445e = byteBuffer.duplicate();
        do {
        } while (byteBuffer.get() != (byte) 0);
        this.f19442b = byteBuffer.getInt();
        ba.m4609b(this.f19442b > 0);
        byteBuffer.getLong();
        this.f19443c = new int[12];
        this.f19443c[2] = this.f19442b;
        this.f19443c[4] = 1;
        this.f19443c[5] = 2;
        this.f19443c[6] = 4;
        this.f19443c[7] = 8;
        this.f19443c[8] = 1;
        this.f19443c[9] = 2;
        this.f19443c[10] = 4;
        this.f19443c[11] = 8;
        this.f19444d = new izb();
        this.f19444d.m23557a(137, this.f19442b);
        this.f19444d.m23557a(255, this.f19442b);
        this.f19444d.m23557a(139, this.f19442b);
        this.f19444d.m23557a(144, this.f19442b);
        this.f19444d.m23557a(138, this.f19442b);
        this.f19444d.m23557a(5, this.f19442b);
        this.f19444d.m23557a(7, this.f19442b);
        this.f19444d.m23557a(140, this.f19442b);
        this.f19444d.m23557a(141, this.f19442b);
        this.f19444d.m23557a(1, this.f19442b + this.f19442b);
        this.f19444d.m23557a(3, this.f19442b + 8);
        this.f19444d.m23557a(2, this.f19442b + 8);
        this.f19444d.m23557a(8, this.f19442b + 8);
        this.f19444d.m23557a(142, this.f19442b + 8);
        this.f19444d.m23557a(4, this.f19442b + 4);
        this.f19444d.m23557a(6, this.f19442b + 4);
    }

    public ByteBuffer m23538a() {
        return this.f19441a;
    }

    public int m23539b() {
        return this.f19442b;
    }

    public String m23537a(int i) {
        ba.m4577a(i >= 0);
        byte[] bArr = new byte[(this.f19445e.getInt(i) - this.f19442b)];
        this.f19445e.position((i + 4) + this.f19442b);
        this.f19445e.get(bArr);
        return new String(bArr, Charset.defaultCharset());
    }

    public int m23540b(int i) {
        return this.f19441a.getInt(i) - this.f19442b;
    }

    public int m23542c(int i) {
        return (i + 4) + this.f19442b;
    }

    public int m23543d(int i) {
        int i2 = this.f19443c[i];
        ba.m4609b(i2 > 0);
        return i2;
    }

    public boolean m23544e(int i) {
        return this.f19444d.m23561c(i);
    }

    public int m23545f(int i) {
        return this.f19444d.m23559b(i);
    }

    public void m23546g(int i) {
        ba.m4577a(i >= 0);
        int position = this.f19441a.position() + i;
        if (position > this.f19441a.limit()) {
            throw new BufferUnderflowException();
        }
        this.f19441a.position(position);
    }

    public int m23541c() {
        switch (this.f19442b) {
            case 1:
                return this.f19441a.get();
            case 2:
                return this.f19441a.getShort();
            case 4:
                return this.f19441a.getInt();
            default:
                throw new IllegalStateException();
        }
    }

    public int m23547h(int i) {
        switch (this.f19442b) {
            case 1:
                return this.f19441a.get(i);
            case 2:
                return this.f19441a.getShort(i);
            case 4:
                return this.f19441a.getInt(i);
            default:
                throw new IllegalStateException();
        }
    }

    public static boolean m23536i(int i) {
        return i == 2;
    }
}
