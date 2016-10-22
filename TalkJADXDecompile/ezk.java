import android.net.Uri;
import android.text.TextUtils;

public final class ezk extends evz {
    private static final long serialVersionUID = 1;
    private final String g;
    private final long h;
    private final long i;
    private final long j;

    public ezk(Uri uri, long j, long j2, long j3) {
        this.g = uri != null ? uri.toString() : null;
        this.h = j;
        this.i = j2;
        this.j = j3;
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        fjr fjr = (fjr) this.b;
        blf.a(blo, fjr.e(), fjr.d(), this.g != null ? Uri.parse(this.g) : null, this.h, this.i, ((fjr) this.b).n() != null, ((fjr) this.b).o(), this.j);
        bkq.a(gwb.H(), blo.g().g(), "sent_mms_count_since_last_upload");
        String[] f = fjr.f();
        if (f.length == 1 && !TextUtils.isEmpty(f[0])) {
            ((bhl) jyn.a(gwb.H(), bhl.class)).a(dww.a(blo.g().g(), f[0]));
        }
    }
}
