package p000;

import android.widget.Toast;

final class emn extends emv {
    final /* synthetic */ elk f11852a;

    emn(elk elk, String str) {
        this.f11852a = elk;
        super(str);
    }

    public void mo811a() {
        int i;
        elk elk = this.f11852a;
        ehz ehz = (ehz) jyn.m25426a(elk.f11810a, ehz.class);
        if (ehz.mo1882a("android.permission.WRITE_EXTERNAL_STORAGE") && ehz.mo1882a("android.permission.READ_EXTERNAL_STORAGE")) {
            i = 1;
        } else {
            Toast.makeText(elk.f11810a, "You don't have storage permission, please enable it in settings and try again.", 0).show();
            i = 0;
        }
        if (i != 0) {
            gwb.m2286l(this.f11852a.f11810a, this.f11852a.f11812c);
        }
    }
}
