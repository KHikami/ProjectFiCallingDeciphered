import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

final class gcn extends PhoneStateListener { //CellStateListener
    private final Context a;
    private gcl b; //cell state evaluator? (implemented by gdz)
    private ServiceState c;
    private SignalStrength d;

    gcn(Context context, gcl gcl) {
        this.a = context;
        this.b = gcl;
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        String valueOf = String.valueOf(serviceState);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 41).append("CellStateListener.onServiceStateChanged: ").append(valueOf).toString(), new Object[0]);
        this.c = serviceState;
        a();
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        String valueOf = String.valueOf(signalStrength);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 44).append("CellStateListener.onSignalStrengthsChanged: ").append(valueOf).toString(), new Object[0]);
        this.d = signalStrength;
        a();
    }

    private void a() {
        if (this.c != null && this.d != null && this.b != null) { //if given cell state eval, service state, and signal strength
            this.b.a(gck.a(this.a, this.c.getState(), gck.a(this.d))); //gcl.a(gck.a(Context, ServiceState.getState(), gck.a(Signal Strength))
            //=> gcl.a(gck.a(Context, int, int)
            //note ServiceState's getStates values are:
            //IN_SERVICE (0), OUT_OF_SERVICE (1), EMERGENCY_ONLY (2), POWER_OFF (3)
            this.b = null; //reset cell state eval?
        }
    }
}
