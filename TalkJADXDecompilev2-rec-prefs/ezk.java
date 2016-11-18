package p000;

import android.net.Uri;
import android.text.TextUtils;

public final class ezk extends evz {
    private static final long serialVersionUID = 1;
    private final String f12552g;
    private final long f12553h;
    private final long f12554i;
    private final long f12555j;

    public ezk(Uri uri, long j, long j2, long j3) {
        this.f12552g = uri != null ? uri.toString() : null;
        this.f12553h = j;
        this.f12554i = j2;
        this.f12555j = j3;
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        fjr fjr = (fjr) this.b;
        blf.m5784a(blo, fjr.m15470e(), fjr.m15469d(), this.f12552g != null ? Uri.parse(this.f12552g) : null, this.f12553h, this.f12554i, ((fjr) this.b).m15479n() != null, ((fjr) this.b).m15480o(), this.f12555j);
        bkq.m5664a(gwb.m1400H(), blo.m6056g().m5638g(), "sent_mms_count_since_last_upload");
        String[] f = fjr.m15471f();
        if (f.length == 1 && !TextUtils.isEmpty(f[0])) {
            ((bhl) jyn.m25426a(gwb.m1400H(), bhl.class)).mo550a(dww.m12949a(blo.m6056g().m5638g(), f[0]));
        }
    }
}
