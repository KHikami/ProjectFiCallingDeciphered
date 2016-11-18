package p000;

import android.content.Context;

final class bdf implements bcv {
    final dth f3087a;
    Long f3088b;
    Long f3089c;
    Long f3090d;
    Long f3091e;
    Integer f3092f;
    private final bcs f3093g;
    private boolean f3094h;

    public bdf(Context context) {
        jyn b = jyn.m25435b(context);
        this.f3087a = ((dti) b.m25443a(dti.class)).mo1673a(17);
        this.f3093g = (bcs) b.m25443a(bcs.class);
    }

    public void mo476a(long j, long j2) {
        gwb.aJ();
        boolean z = this.f3088b == null && this.f3089c == null;
        ba.m4610b(z, (Object) "Should not be called more than once per app create");
        this.f3088b = Long.valueOf(j);
        this.f3089c = Long.valueOf(j2);
        this.f3093g.mo469a(new bdg(this));
        if (this.f3094h) {
            this.f3093g.mo469a(new bdh(this));
        }
    }

    public void mo477a(long j, long j2, int i) {
        gwb.aJ();
        if (this.f3090d == null && this.f3091e == null && this.f3092f == null) {
            this.f3090d = Long.valueOf(j);
            this.f3091e = Long.valueOf(j2);
            this.f3092f = Integer.valueOf(i);
            this.f3093g.mo469a(new bdi(this));
            if (this.f3094h) {
                this.f3093g.mo469a(new bdj(this));
            }
        }
    }

    public void mo475a() {
        gwb.aJ();
        if (!this.f3094h) {
            this.f3094h = true;
            if (!(this.f3088b == null || this.f3089c == null)) {
                this.f3093g.mo469a(new bdk(this));
            }
            if (this.f3090d != null && this.f3091e != null && this.f3092f != null) {
                this.f3093g.mo469a(new bdl(this));
            }
        }
    }
}
