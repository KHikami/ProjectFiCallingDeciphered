package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;

final class hac extends gzz {
    final /* synthetic */ hab a;

    hac(hab hab) {
        this.a = hab;
    }

    public void a(GoogleHelp googleHelp) {
        if (googleHelp.c() != null) {
            googleHelp.c().a(gwb.g(this.a.c));
        }
        this.a.a.putExtra("EXTRA_GOOGLE_HELP", googleHelp).putExtra("EXTRA_START_TICK", System.nanoTime());
        this.a.c.startActivityForResult(this.a.a, 123);
        this.a.a(Status.a);
    }
}
