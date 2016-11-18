package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

final class jur {
    final List<ByteBuffer> a = new ArrayList();

    jur() {
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
        ByteBuffer byteBuffer;
        if (this.a.size() == 1) {
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
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        for (ByteBuffer byteBuffer22 : this.a) {
            allocateDirect.put(byteBuffer22);
        }
        allocateDirect.flip();
        return allocateDirect;
    }
}
