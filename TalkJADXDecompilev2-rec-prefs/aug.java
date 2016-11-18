package p000;

import java.util.Queue;

final class aug<A> {
    private static final Queue<aug<?>> f2352a = baq.m4684a(0);
    private int f2353b;
    private int f2354c;
    private A f2355d;

    static <A> aug<A> m4040a(A a, int i, int i2) {
        aug<A> aug_A;
        synchronized (f2352a) {
            aug_A = (aug) f2352a.poll();
        }
        if (aug_A == null) {
            aug_A = new aug();
        }
        aug_A.f2355d = a;
        aug_A.f2354c = i;
        aug_A.f2353b = i2;
        return aug_A;
    }

    private aug() {
    }

    public void m4041a() {
        synchronized (f2352a) {
            f2352a.offer(this);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aug)) {
            return false;
        }
        aug aug = (aug) obj;
        if (this.f2354c == aug.f2354c && this.f2353b == aug.f2353b && this.f2355d.equals(aug.f2355d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2353b * 31) + this.f2354c) * 31) + this.f2355d.hashCode();
    }
}
