package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: cnq */
public final class cnq extends brq {
    private /* synthetic */ String f;
    private /* synthetic */ String g;
    private /* synthetic */ int h;

    public cnq(crg crg, brc brc, String str, String str2, int i) {
        this.f = str;
        this.g = str2;
        this.h = i;
        super(brc, (byte) 0);
    }

    protected final /* synthetic */ void b(bra bra) {
        cnx cnx = (cnx) bra;
        ((cnl) cnx.l()).a(new cnr(this), this.f, this.g, this.h);
    }

    public final /* synthetic */ brl c(Status status) {
        return new cri(status, null);
    }
}
