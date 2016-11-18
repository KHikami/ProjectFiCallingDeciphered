package defpackage;

import java.util.Queue;

final class amp {
    private final Queue<amo> a;

    public amp(int i) {
        this.a = baq.a(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(new amo());
        }
    }

    public amo a(int i, int i2) {
        amo amo = (amo) this.a.poll();
        this.a.offer(amo);
        amo.b = i;
        amo.a = i2;
        return amo;
    }
}
