package defpackage;

import java.util.Queue;

abstract class arc<T extends aro> {
    private final Queue<T> a = baq.a(20);

    protected abstract T a();

    arc() {
    }

    protected T b() {
        aro aro = (aro) this.a.poll();
        if (aro == null) {
            return a();
        }
        return aro;
    }

    public void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
