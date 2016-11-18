package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;

final class hac extends gzz {
    final /* synthetic */ hab f16467a;

    hac(hab hab) {
        this.f16467a = hab;
    }

    public void mo2431a(GoogleHelp googleHelp) {
        if (googleHelp.m9757c() != null) {
            googleHelp.m9757c().m9758a(gwb.m2217g(this.f16467a.f16465c));
        }
        this.f16467a.f16463a.putExtra("EXTRA_GOOGLE_HELP", googleHelp).putExtra("EXTRA_START_TICK", System.nanoTime());
        this.f16467a.f16465c.startActivityForResult(this.f16467a.f16463a, 123);
        this.f16467a.m18974a(Status.f7264a);
    }
}
