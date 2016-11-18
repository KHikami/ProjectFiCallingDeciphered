package defpackage;

import java.nio.ByteBuffer;
import java.util.Queue;

final class axn {
    private final Queue<anm> a = baq.a(0);

    axn() {
    }

    public synchronized anm a(ByteBuffer byteBuffer) {
        anm anm;
        anm = (anm) this.a.poll();
        if (anm == null) {
            anm = new anm();
        }
        return anm.a(byteBuffer);
    }

    public synchronized void a(anm anm) {
        anm.a();
        this.a.offer(anm);
    }
}
