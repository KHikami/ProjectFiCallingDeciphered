package p000;

public final class mod extends IllegalArgumentException {
    private final int f27972a;
    private final mpz f27973b;
    private final Object f27974c;

    public mod(int i, mpz mpz, Object obj) {
        this.f27972a = i;
        this.f27973b = mpz;
        this.f27974c = obj;
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
