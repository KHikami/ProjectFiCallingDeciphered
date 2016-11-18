package p000;

public final class gzq extends gzs {
    private long f16449a;
    private long f16450b;

    public gzq() {
        this.f16449a = -1;
        this.f16450b = -1;
        this.g = true;
    }

    protected void mo2429a() {
        super.mo2429a();
        if (this.f16449a == -1) {
            throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
        } else if (this.f16449a <= 0) {
            throw new IllegalArgumentException("Period set cannot be less than or equal to 0: " + this.f16449a);
        } else if (this.f16450b == -1) {
            this.f16450b = (long) (((float) this.f16449a) * 0.1f);
        } else if (this.f16450b > this.f16449a) {
            this.f16450b = this.f16449a;
        }
    }
}
