package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class jjp extends FilterOutputStream {
    private final ByteBuffer a = ByteBuffer.allocate(4);

    public jjp(OutputStream outputStream) {
        super(outputStream);
    }

    public jjp a(ByteOrder byteOrder) {
        this.a.order(byteOrder);
        return this;
    }

    public jjp a(short s) {
        this.a.rewind();
        this.a.putShort(s);
        this.out.write(this.a.array(), 0, 2);
        return this;
    }

    public jjp a(int i) {
        this.a.rewind();
        this.a.putInt(i);
        this.out.write(this.a.array());
        return this;
    }

    public jjp a(jjq jjq) {
        a((int) jjq.a());
        a((int) jjq.b());
        return this;
    }
}
