package p000;

import java.util.ArrayDeque;
import java.util.Queue;

final class arz {
    private final Queue<ary> f2250a = new ArrayDeque();

    arz() {
    }

    ary m3890a() {
        synchronized (this.f2250a) {
            ary ary = (ary) this.f2250a.poll();
        }
        if (ary == null) {
            return new ary();
        }
        return ary;
    }

    void m3891a(ary ary) {
        synchronized (this.f2250a) {
            if (this.f2250a.size() < 10) {
                this.f2250a.offer(ary);
            }
        }
    }
}
