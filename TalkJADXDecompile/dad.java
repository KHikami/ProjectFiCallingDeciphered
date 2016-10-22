import android.view.View;

public final class dad extends ccv<ddp> {
    public dad(View view, ddp ddp, gai gai) {
        super(view, null, gai);
    }

    protected boolean a() {
        if (!gwb.a(gwb.H(), "babel_network_change_notification", false)) {
            return false;
        }
        eaj eaj = (eaj) jyn.a(this.b, eaj.class);
        if (eaj == null || eaj.a() != eai.CAPTIVE_PORTAL) {
            return false;
        }
        return true;
    }

    protected gag b() {
        return e().a(this.b.getResources().getString(bc.Q)).a();
    }
}
