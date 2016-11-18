package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

final class jra {
    final List<ByteBuffer> f20822a = new ArrayList();

    jra() {
    }

    void m25046a(ByteBuffer byteBuffer) {
        if (this.f20822a.isEmpty() || this.f20822a.get(this.f20822a.size() - 1) != byteBuffer) {
            this.f20822a.add(byteBuffer);
        }
    }

    ByteBuffer m25045a() {
        int i = 0;
        if (this.f20822a.isEmpty()) {
            return ByteBuffer.allocateDirect(0);
        }
        ByteBuffer byteBuffer;
        if (this.f20822a.size() == 1) {
            byteBuffer = (ByteBuffer) this.f20822a.get(0);
            if (byteBuffer.hasRemaining()) {
                byteBuffer.flip();
            }
            byteBuffer.position(0);
            return byteBuffer;
        }
        for (ByteBuffer byteBuffer2 : this.f20822a) {
            byteBuffer2.flip();
            i = byteBuffer2.remaining() + i;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i]);
        for (ByteBuffer byteBuffer22 : this.f20822a) {
            wrap.put(byteBuffer22);
        }
        wrap.flip();
        return wrap;
    }
}
