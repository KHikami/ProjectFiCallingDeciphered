/* compiled from: PG */
final class nt {
    int a;
    int b;
    float c;
    float d;
    long e;
    long f;
    int g;
    int h;
    long i;
    float j;
    int k;

    public nt() {
        this.e = Long.MIN_VALUE;
        this.i = -1;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    final float a(long j) {
        if (j < this.e) {
            return 0.0f;
        }
        if (this.i < 0 || j < this.i) {
            return ns.a(((float) (j - this.e)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
        }
        long j2 = j - this.i;
        return (ns.a(((float) j2) / ((float) this.k), 0.0f, 1.0f) * this.j) + (1.0f - this.j);
    }
}
