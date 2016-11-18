package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class dmg implements OnClickListener {
    final /* synthetic */ dhw f10117a;
    final /* synthetic */ dme f10118b;

    dmg(dme dme, dhw dhw) {
        this.f10118b = dme;
        this.f10117a = dhw;
    }

    public void onClick(View view) {
        boolean z;
        boolean z2 = true;
        gwb.m2198f(275);
        dgg dgg = this.f10118b.f10113b;
        if (this.f10118b.f10113b.m11717i()) {
            z = false;
        } else {
            z = true;
        }
        dgg.m11703a(z);
        dme dme = this.f10118b;
        dhw dhw = this.f10117a;
        z = dme.f10113b.m11717i();
        if (dhw.m11873a() == z) {
            if (z) {
                z2 = false;
            }
            dhw.mo1595a(z2);
            gwb.m2198f(z ? 181 : 183);
        }
    }
}
