package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: cno */
public final class cno extends brq {
    private /* synthetic */ String f;
    private /* synthetic */ int g;
    private /* synthetic */ String[] h;
    private /* synthetic */ byte[] i;

    public cno(crg crg, brc brc, String str, int i, String[] strArr, byte[] bArr) {
        this.f = str;
        this.g = i;
        this.h = strArr;
        this.i = bArr;
        super(brc, (byte) 0);
    }

    protected final /* synthetic */ void b(bra bra) {
        cnx cnx = (cnx) bra;
        ((cnl) cnx.l()).a(new cnp(this), this.f, this.g, this.h, this.i);
    }

    public final /* synthetic */ brl c(Status status) {
        return status;
    }
}
