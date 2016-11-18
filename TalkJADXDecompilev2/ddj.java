package defpackage;

import android.view.View;

public final class ddj extends ccv<ddk> {
    public ddj(View view, ddk ddk, gai gai) {
        super(view, ddk, gai);
    }

    protected boolean a() {
        return ((ddk) this.c).c() && ((ddk) this.c).a() && ((ddk) this.c).b();
    }

    protected gag b() {
        int i;
        if (((ddk) this.c).d()) {
            i = bc.fC;
        } else {
            i = bc.fD;
        }
        return e().a(this.b.getResources().getString(i, new Object[]{((ddk) this.c).e()})).a(true).a();
    }
}
