package defpackage;

import android.view.View;

/* renamed from: cym */
public final class cym extends ccv<cyn> {
    private int e;

    public cym(View view, cyn cyn, gai gai) {
        super(view, cyn, gai);
    }

    protected boolean a() {
        return ((cyn) this.c).u() && !gwb.a(eow.AUTOSWITCH_TRANSPORT);
    }

    protected gag b() {
        if (gwb.i(((cyn) this.c).d())) {
            this.e = bc.B;
        } else {
            this.e = bc.A;
        }
        gwb.b(eow.AUTOSWITCH_TRANSPORT);
        return e().a(this.b.getResources().getString(this.e)).a();
    }
}
