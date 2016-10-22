package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dmg */
final class dmg implements OnClickListener {
    final /* synthetic */ dhw a;
    final /* synthetic */ dme b;

    dmg(dme dme, dhw dhw) {
        this.b = dme;
        this.a = dhw;
    }

    public void onClick(View view) {
        boolean z;
        boolean z2 = true;
        gwb.f(275);
        dgg dgg = this.b.b;
        if (this.b.b.i()) {
            z = false;
        } else {
            z = true;
        }
        dgg.a(z);
        dme dme = this.b;
        dhw dhw = this.a;
        z = dme.b.i();
        if (dhw.a() == z) {
            if (z) {
                z2 = false;
            }
            dhw.a(z2);
            gwb.f(z ? 181 : 183);
        }
    }
}
