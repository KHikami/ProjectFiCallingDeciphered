package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: bsj */
final class bsj extends bta {
    private /* synthetic */ ConnectionResult b;
    private /* synthetic */ bsi c;

    bsj(bsi bsi, bsy bsy, ConnectionResult connectionResult) {
        this.c = bsi;
        this.b = connectionResult;
        super(bsy);
    }

    public final void a() {
        this.c.a.b(this.b);
    }
}
