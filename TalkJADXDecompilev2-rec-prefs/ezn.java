package p000;

import android.net.Uri;
import android.text.TextUtils;

public final class ezn extends evz {
    private static final long serialVersionUID = 1;
    private final String f12556g;
    private final long f12557h;

    public ezn(Uri uri, long j) {
        this.f12556g = uri != null ? uri.toString() : null;
        this.f12557h = j;
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        fjw fjw = (fjw) this.b;
        blf.m5784a(blo, fjw.m15509e(), fjw.m15508d(), this.f12556g != null ? Uri.parse(this.f12556g) : null, 0, this.f12557h, false, -1, fjw.m15512h());
        bkq.m5664a(gwb.m1400H(), blo.m6056g().m5638g(), "sent_sms_count_since_last_upload");
        String f = fjw.m15510f();
        if (!TextUtils.isEmpty(f)) {
            ((bhl) jyn.m25426a(gwb.m1400H(), bhl.class)).mo550a(dww.m12949a(blo.m6056g().m5638g(), f));
        }
    }
}
