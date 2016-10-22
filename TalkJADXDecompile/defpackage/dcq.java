package defpackage;

import android.view.View;

/* renamed from: dcq */
public final class dcq extends ccv<dcr> {
    public dcq(View view, dcr dcr, gai gai) {
        super(view, dcr, gai);
    }

    protected boolean a() {
        if (gwb.a(gwb.H(), "babel_gcm_change_notification", false)) {
            return ((dcr) this.c).z();
        }
        return false;
    }

    protected gag b() {
        return e().a(this.b.getResources().getString(bc.cP)).a();
    }
}
