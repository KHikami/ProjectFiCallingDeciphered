package defpackage;

import android.widget.Toast;

/* renamed from: emn */
final class emn extends emv {
    final /* synthetic */ elk a;

    emn(elk elk, String str) {
        this.a = elk;
        super(str);
    }

    public void a() {
        int i;
        elk elk = this.a;
        ehz ehz = (ehz) jyn.a(elk.a, ehz.class);
        if (ehz.a("android.permission.WRITE_EXTERNAL_STORAGE") && ehz.a("android.permission.READ_EXTERNAL_STORAGE")) {
            i = 1;
        } else {
            Toast.makeText(elk.a, "You don't have storage permission, please enable it in settings and try again.", 0).show();
            i = 0;
        }
        if (i != 0) {
            gwb.l(this.a.a, this.a.c);
        }
    }
}
