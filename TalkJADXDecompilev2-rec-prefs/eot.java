package p000;

import com.google.android.apps.hangouts.service.broadcastreceiver.GcmStateReceiver;

final class eot extends eov {
    final /* synthetic */ eon f11951a;

    eot(eon eon) {
        this.f11951a = eon;
        super(eon);
    }

    boolean mo1924a() {
        if (!gwb.m1906a(this.f11951a.f11938e, "babel_gcm_change_notification", false) || GcmStateReceiver.f6806a) {
            return false;
        }
        return true;
    }

    gag mo1925b() {
        return new gah(this.f11951a.f11938e).m16814a(this.f11951a.f11938e.getString(bc.cP)).m16811a();
    }
}
