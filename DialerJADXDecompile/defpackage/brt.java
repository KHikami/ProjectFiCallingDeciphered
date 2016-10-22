package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: brt */
public final class brt implements brg {
    public final int a;
    public final brc b;
    public final brg c;
    private /* synthetic */ brs d;

    public brt(brs brs, int i, brc brc, brg brg) {
        this.d = brs;
        this.a = i;
        this.b = brc;
        this.c = brg;
        brc.a((brg) this);
    }

    public final void a(ConnectionResult connectionResult) {
        this.d.ab.post(new bru(this.d, this.a, connectionResult));
    }
}
