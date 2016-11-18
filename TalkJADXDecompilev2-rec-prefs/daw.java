package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class daw implements OnClickListener {
    final /* synthetic */ bko f9440a;
    final /* synthetic */ dau f9441b;

    daw(dau dau, bko bko) {
        this.f9441b = dau;
        this.f9440a = bko;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f9441b.al != null) {
            int i2;
            if (this.f9441b.aj.isChecked()) {
                i2 = 1552;
            } else if (this.f9441b.ak.isChecked()) {
                i2 = 1553;
            } else {
                i2 = 1554;
            }
            gwb.m1823a(this.f9440a, i2);
            this.f9441b.al.mo1492a(this.f9441b.aj.isChecked(), this.f9441b.ak.isChecked());
        }
    }
}
