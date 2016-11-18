package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

final class jur {
    final List<ByteBuffer> f21078a = new ArrayList();

    jur() {
    }

    void m25248a(ByteBuffer byteBuffer) {
        if (this.f21078a.isEmpty() || this.f21078a.get(this.f21078a.size() - 1) != byteBuffer) {
            this.f21078a.add(byteBuffer);
        }
    }

    ByteBuffer m25247a() {
        int i = 0;
        if (this.f21078a.isEmpty()) {
            return ByteBuffer.allocateDirect(0);
        }
        if (this.f21078a.size() == 1) {
            ByteBuffer byteBuffer;
            byteBuffer = (ByteBuffer) this.f21078a.get(0);
            if (byteBuffer.hasRemaining()) {
                byteBuffer.flip();
            }
            byteBuffer.position(0);
            return byteBuffer;
        }
        for (ByteBuffer byteBuffer2 : this.f21078a) {
            byteBuffer2.flip();
            i = byteBuffer2.remaining() + i;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        for (ByteBuffer byteBuffer22 : this.f21078a) {
            allocateDirect.put(byteBuffer22);
        }
        allocateDirect.flip();
        return allocateDirect;
    }
}
