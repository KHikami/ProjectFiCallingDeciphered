import java.util.Objects;

/* compiled from: PG */
final class avx {
    private final String a;
    private final long b;

    public avx(avw avw, String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Long.valueOf(this.b)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avx)) {
            return false;
        }
        avx avx = (avx) obj;
        if (Objects.equals(this.a, avx.a) && Objects.equals(Long.valueOf(this.b), Long.valueOf(avx.b))) {
            return true;
        }
        return false;
    }
}
