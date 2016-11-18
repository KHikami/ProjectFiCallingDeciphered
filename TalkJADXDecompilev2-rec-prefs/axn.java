package p000;

import java.nio.ByteBuffer;
import java.util.Queue;

final class axn {
    private final Queue<anm> f2487a = baq.m4684a(0);

    axn() {
    }

    public synchronized anm m4277a(ByteBuffer byteBuffer) {
        anm anm;
        anm = (anm) this.f2487a.poll();
        if (anm == null) {
            anm = new anm();
        }
        return anm.m3497a(byteBuffer);
    }

    public synchronized void m4278a(anm anm) {
        anm.m3498a();
        this.f2487a.offer(anm);
    }
}
