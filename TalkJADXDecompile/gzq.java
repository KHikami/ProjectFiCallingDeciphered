public final class gzq extends gzs {
    private long a;
    private long b;

    public gzq() {
        this.a = -1;
        this.b = -1;
        this.g = true;
    }

    protected void a() {
        super.a();
        if (this.a == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (this.a <= 0) {
            throw new IllegalArgumentException("Period set cannot be less than or equal to 0: " + this.a);
        } else if (this.b == -1) {
            this.b = (long) (((float) this.a) * 0.1f);
        } else if (this.b > this.a) {
            this.b = this.a;
        }
    }
}
