import android.view.View;

public final class ddo extends ccv<ddp> {
    public ddo(View view, ddp ddp, gai gai) {
        super(view, ddp, gai);
    }

    protected boolean a() {
        if (!gwb.a(gwb.H(), "babel_network_change_notification", false)) {
            return false;
        }
        if (!((ddp) this.c).A() || ((ddp) this.c).B()) {
            return false;
        }
        return true;
    }

    protected gag b() {
        return e().a(this.b.getResources().getString(bc.hg)).a(true).a();
    }
}
