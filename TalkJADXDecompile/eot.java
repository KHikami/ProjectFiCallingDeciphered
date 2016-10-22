import com.google.android.apps.hangouts.service.broadcastreceiver.GcmStateReceiver;

final class eot extends eov {
    final /* synthetic */ eon a;

    eot(eon eon) {
        this.a = eon;
        super(eon);
    }

    boolean a() {
        if (!gwb.a(this.a.e, "babel_gcm_change_notification", false) || GcmStateReceiver.a) {
            return false;
        }
        return true;
    }

    gag b() {
        return new gah(this.a.e).a(this.a.e.getString(bc.cP)).a();
    }
}
