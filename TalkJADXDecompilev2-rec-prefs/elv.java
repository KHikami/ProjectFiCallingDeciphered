package p000;

import android.widget.Toast;

final class elv extends emv {
    final /* synthetic */ elk f11828a;

    elv(elk elk, String str) {
        this.f11828a = elk;
        super(str);
    }

    public void mo811a() {
        int i;
        elk elk = this.f11828a;
        ehz ehz = (ehz) jyn.m25426a(elk.f11810a, ehz.class);
        if (ehz.mo1882a("android.permission.WRITE_EXTERNAL_STORAGE") && ehz.mo1882a("android.permission.READ_EXTERNAL_STORAGE")) {
            i = 1;
        } else {
            Toast.makeText(elk.f11810a, "You don't have storage permission, please enable it in settings and try again.", 0).show();
            i = 0;
        }
        if (i != 0) {
            new emx(this.f11828a, "email").execute(new Void[0]);
        }
    }
}
