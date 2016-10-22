import java.util.concurrent.atomic.AtomicInteger;

public final class gic {
    private static final AtomicInteger a;
    private final int b;

    static {
        a = new AtomicInteger(0);
    }

    public gic() {
        this.b = a.incrementAndGet();
    }

    public boolean a(gic gic) {
        return gic.b == this.b;
    }

    public String toString() {
        return "Id: " + this.b;
    }
}
