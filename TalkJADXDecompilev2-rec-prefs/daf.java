package p000;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

final class daf extends PhoneStateListener {
    final /* synthetic */ dag f9415a;
    final /* synthetic */ dae f9416b;

    daf(dae dae, dag dag) {
        this.f9416b = dae;
        this.f9415a = dag;
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        boolean z;
        dae dae = this.f9416b;
        if (serviceState.getState() == 0) {
            z = true;
        } else {
            z = false;
        }
        dae.f9410a = z;
        this.f9415a.m11371a();
    }
}
