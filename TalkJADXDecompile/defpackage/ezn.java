package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: ezn */
public final class ezn extends evz {
    private static final long serialVersionUID = 1;
    private final String g;
    private final long h;

    public ezn(Uri uri, long j) {
        this.g = uri != null ? uri.toString() : null;
        this.h = j;
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        fjw fjw = (fjw) this.b;
        blf.a(blo, fjw.e(), fjw.d(), this.g != null ? Uri.parse(this.g) : null, 0, this.h, false, -1, fjw.h());
        bkq.a(gwb.H(), blo.g().g(), "sent_sms_count_since_last_upload");
        String f = fjw.f();
        if (!TextUtils.isEmpty(f)) {
            ((bhl) jyn.a(gwb.H(), bhl.class)).a(dww.a(blo.g().g(), f));
        }
    }
}
