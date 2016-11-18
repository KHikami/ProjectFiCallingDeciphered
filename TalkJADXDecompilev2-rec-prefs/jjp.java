package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class jjp extends FilterOutputStream {
    private final ByteBuffer f20302a = ByteBuffer.allocate(4);

    public jjp(OutputStream outputStream) {
        super(outputStream);
    }

    public jjp m24498a(ByteOrder byteOrder) {
        this.f20302a.order(byteOrder);
        return this;
    }

    public jjp m24500a(short s) {
        this.f20302a.rewind();
        this.f20302a.putShort(s);
        this.out.write(this.f20302a.array(), 0, 2);
        return this;
    }

    public jjp m24497a(int i) {
        this.f20302a.rewind();
        this.f20302a.putInt(i);
        this.out.write(this.f20302a.array());
        return this;
    }

    public jjp m24499a(jjq jjq) {
        m24497a((int) jjq.m24501a());
        m24497a((int) jjq.m24502b());
        return this;
    }
}
