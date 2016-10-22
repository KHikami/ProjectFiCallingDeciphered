import java.util.Queue;

final class aug<A> {
    private static final Queue<aug<?>> a;
    private int b;
    private int c;
    private A d;

    static {
        a = baq.a(0);
    }

    static <A> aug<A> a(A a, int i, int i2) {
        aug<A> aug_A;
        synchronized (a) {
            aug_A = (aug) a.poll();
        }
        if (aug_A == null) {
            aug_A = new aug();
        }
        aug_A.d = a;
        aug_A.c = i;
        aug_A.b = i2;
        return aug_A;
    }

    private aug() {
    }

    public void a() {
        synchronized (a) {
            a.offer(this);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aug)) {
            return false;
        }
        aug aug = (aug) obj;
        if (this.c == aug.c && this.b == aug.b && this.d.equals(aug.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
