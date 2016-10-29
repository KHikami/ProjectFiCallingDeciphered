import java.util.Locale;

public final class gfo {
    public int a; //cell signal
    public int b; //wifi signal
    public int c; //wifi signal handoff
    public int d; //wifi link speed
    public int e; //wifi link speed handoff
    public long f; //predicted wifi latency threshold
    public long g; //predicted wifi downlink threshold

    public String toString() {
        return String.format(Locale.US, "cell signal: %d%%, wifi signal: %d%%, wifi signal handoff: %d%%, wifi link speed: %dMbps, wifi link speed handoff: %dMbps", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }
}
