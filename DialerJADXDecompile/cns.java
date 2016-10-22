import com.google.android.gms.common.api.Status;

public final class cns extends brq {
    private /* synthetic */ String f;
    private /* synthetic */ String g;

    public cns(crg crg, brc brc, String str, String str2) {
        this.f = str;
        this.g = str2;
        super(brc, (byte) 0);
    }

    protected final /* synthetic */ void b(bra bra) {
        cnx cnx = (cnx) bra;
        ((cnl) cnx.l()).a(new cnt(this), this.f, this.g);
    }

    public final /* synthetic */ brl c(Status status) {
        return new crh(status, null);
    }
}
