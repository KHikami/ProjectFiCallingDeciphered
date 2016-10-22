public final class mod extends IllegalArgumentException {
    private final int a;
    private final mpz b;
    private final Object c;

    public mod(int i, mpz mpz, Object obj) {
        this.a = i;
        this.b = mpz;
        this.c = obj;
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
