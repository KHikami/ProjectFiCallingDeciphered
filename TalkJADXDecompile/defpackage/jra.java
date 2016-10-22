package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jra */
final class jra {
    final List<ByteBuffer> a;

    jra() {
        this.a = new ArrayList();
    }

    void a(ByteBuffer byteBuffer) {
        if (this.a.isEmpty() || this.a.get(this.a.size() - 1) != byteBuffer) {
            this.a.add(byteBuffer);
        }
    }

    ByteBuffer a() {
        int i = 0;
        if (this.a.isEmpty()) {
            return ByteBuffer.allocateDirect(0);
        }
        if (this.a.size() == 1) {
            ByteBuffer byteBuffer;
            byteBuffer = (ByteBuffer) this.a.get(0);
            if (byteBuffer.hasRemaining()) {
                byteBuffer.flip();
            }
            byteBuffer.position(0);
            return byteBuffer;
        }
        for (ByteBuffer byteBuffer2 : this.a) {
            byteBuffer2.flip();
            i = byteBuffer2.remaining() + i;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i]);
        for (ByteBuffer byteBuffer22 : this.a) {
            wrap.put(byteBuffer22);
        }
        wrap.flip();
        return wrap;
    }
}
