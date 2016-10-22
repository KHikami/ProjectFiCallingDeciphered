package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: daw */
final class daw implements OnClickListener {
    final /* synthetic */ bko a;
    final /* synthetic */ dau b;

    daw(dau dau, bko bko) {
        this.b = dau;
        this.a = bko;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.b.al != null) {
            int i2;
            if (this.b.aj.isChecked()) {
                i2 = 1552;
            } else if (this.b.ak.isChecked()) {
                i2 = 1553;
            } else {
                i2 = 1554;
            }
            gwb.a(this.a, i2);
            this.b.al.a(this.b.aj.isChecked(), this.b.ak.isChecked());
        }
    }
}
