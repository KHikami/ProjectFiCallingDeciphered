import android.content.Context;

final class bdf implements bcv {
    final dth a;
    Long b;
    Long c;
    Long d;
    Long e;
    Integer f;
    private final bcs g;
    private boolean h;

    public bdf(Context context) {
        jyn b = jyn.b(context);
        this.a = ((dti) b.a(dti.class)).a(17);
        this.g = (bcs) b.a(bcs.class);
    }

    public void a(long j, long j2) {
        gwb.aJ();
        boolean z = this.b == null && this.c == null;
        ba.b(z, (Object) "Should not be called more than once per app create");
        this.b = Long.valueOf(j);
        this.c = Long.valueOf(j2);
        this.g.a(new bdg(this));
        if (this.h) {
            this.g.a(new bdh(this));
        }
    }

    public void a(long j, long j2, int i) {
        gwb.aJ();
        if (this.d == null && this.e == null && this.f == null) {
            this.d = Long.valueOf(j);
            this.e = Long.valueOf(j2);
            this.f = Integer.valueOf(i);
            this.g.a(new bdi(this));
            if (this.h) {
                this.g.a(new bdj(this));
            }
        }
    }

    public void a() {
        gwb.aJ();
        if (!this.h) {
            this.h = true;
            if (!(this.b == null || this.c == null)) {
                this.g.a(new bdk(this));
            }
            if (this.d != null && this.e != null && this.f != null) {
                this.g.a(new bdl(this));
            }
        }
    }
}
