package p000;

import java.util.Queue;

abstract class arc<T extends aro> {
    private final Queue<T> f2209a = baq.m4684a(20);

    protected abstract T mo357a();

    arc() {
    }

    protected T m3822b() {
        aro aro = (aro) this.f2209a.poll();
        if (aro == null) {
            return mo357a();
        }
        return aro;
    }

    public void m3821a(T t) {
        if (this.f2209a.size() < 20) {
            this.f2209a.offer(t);
        }
    }
}
