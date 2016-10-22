import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

final class daf extends PhoneStateListener {
    final /* synthetic */ dag a;
    final /* synthetic */ dae b;

    daf(dae dae, dag dag) {
        this.b = dae;
        this.a = dag;
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        boolean z;
        dae dae = this.b;
        if (serviceState.getState() == 0) {
            z = true;
        } else {
            z = false;
        }
        dae.a = z;
        this.a.a();
    }
}
