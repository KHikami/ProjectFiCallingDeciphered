package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: arz */
final class arz {
    private final Queue<ary> a;

    arz() {
        this.a = new ArrayDeque();
    }

    ary a() {
        synchronized (this.a) {
            ary ary = (ary) this.a.poll();
        }
        if (ary == null) {
            return new ary();
        }
        return ary;
    }

    void a(ary ary) {
        synchronized (this.a) {
            if (this.a.size() < 10) {
                this.a.offer(ary);
            }
        }
    }
}
