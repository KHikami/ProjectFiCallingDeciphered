import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
final class dja {
    final Queue a;
    final int b;
    int c;
    int d;
    int e;
    dio f;
    final /* synthetic */ diz g;

    dja(diz diz, int i) {
        this.g = diz;
        this.d = this.g.c;
        this.b = i;
        this.a = new ArrayDeque(2);
    }

    final int a(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.d) {
            this.d += i;
            return this.d;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.b);
    }

    final int b() {
        return Math.min(this.d, this.g.d.d);
    }

    final boolean c() {
        return !this.a.isEmpty();
    }

    final int a(int i, djc djc) {
        int i2 = 0;
        int min = Math.min(i, b());
        while (c()) {
            djb djb = (djb) this.a.peek();
            if (min < djb.a()) {
                if (min <= 0) {
                    break;
                }
                djb = djb.a(min);
                djc.a();
                min = djb.a() + i2;
                djb.b();
            } else {
                djc.a();
                min = djb.a() + i2;
                djb.b();
            }
            i2 = min;
            min = Math.min(i - min, b());
        }
        return i2;
    }

    dja(diz diz, dio dio) {
        this(diz, dio.s.intValue());
        this.f = dio;
    }

    final int a() {
        return Math.max(0, Math.min(this.d, this.c)) - this.e;
    }
}
