import java.util.Objects;

/* compiled from: PG */
final class bdy {
    int a;
    int b;
    ayo c;

    public bdy(bdx bdx, ayo ayo) {
        this.a = 0;
        Objects.requireNonNull(ayo);
        a(ayo);
    }

    public final void a(ayo ayo) {
        this.c = (ayo) Objects.requireNonNull(ayo);
        this.a = ayo.c();
        this.b = ayo.k();
    }

    public final String toString() {
        return String.format("CallContext {CallId=%s, State=%s, VideoState=%d}", new Object[]{this.c.d, Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
