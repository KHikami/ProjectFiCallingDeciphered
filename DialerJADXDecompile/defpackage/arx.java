package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: arx */
public class arx {
    final /* synthetic */ Uri a;
    final /* synthetic */ boolean b;
    final /* synthetic */ asp c;

    public void a(Uri uri) {
        if (uri == null) {
            this.c.b(this.a, false);
        } else if (this.b) {
            asp asp = this.c;
            Uri uri2 = this.a;
            art art = asp.d;
            arz arz = new arz(asp, uri2);
            Objects.requireNonNull(arz);
            Objects.requireNonNull(uri);
            avm avm = art.b;
            asa asa = asa.SET_VOICEMAIL_ARCHIVE_STATUS;
            avm.a(new arv(art, true, uri, arz), new Void[0]);
        } else {
            this.c.b(uri);
        }
    }

    arx(asp asp, Uri uri, boolean z) {
        this.c = asp;
        this.a = uri;
        this.b = z;
    }
}
