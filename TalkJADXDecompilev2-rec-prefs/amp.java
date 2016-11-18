package p000;

import java.util.Queue;

final class amp {
    private final Queue<amo> f1325a;

    public amp(int i) {
        this.f1325a = baq.m4684a(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f1325a.offer(new amo());
        }
    }

    public amo m2940a(int i, int i2) {
        amo amo = (amo) this.f1325a.poll();
        this.f1325a.offer(amo);
        amo.f1324b = i;
        amo.f1323a = i2;
        return amo;
    }
}
