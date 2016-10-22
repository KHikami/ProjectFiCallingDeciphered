package defpackage;

/* renamed from: bpm */
public final class bpm {
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;
    private final String f;
    private final bwa g;

    private bpm(int i, long j, String str, bwa bwa) {
        this.e = new Object();
        this.b = 60;
        this.c = (double) this.b;
        this.a = 2000;
        this.f = str;
        this.g = bwa;
    }

    public bpm(String str, bwa bwa) {
        this(60, 2000, str, bwa);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.e) {
            long a = this.g.a();
            if (this.c < ((double) this.b)) {
                double d = ((double) (a - this.d)) / ((double) this.a);
                if (d > 0.0d) {
                    this.c = Math.min((double) this.b, d + this.c);
                }
            }
            this.d = a;
            if (this.c >= 1.0d) {
                this.c -= 1.0d;
                z = true;
            } else {
                bpn.c("Excessive " + this.f + " detected; call ignored.");
                z = false;
            }
        }
        return z;
    }
}
