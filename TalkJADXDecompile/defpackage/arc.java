package defpackage;

import java.util.Queue;

/* renamed from: arc */
abstract class arc<T extends aro> {
    private final Queue<T> a;

    protected abstract T a();

    arc() {
        this.a = baq.a(20);
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
