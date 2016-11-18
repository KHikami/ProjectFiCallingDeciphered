package p000;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

final class gcn extends PhoneStateListener {
    private final Context f14665a;
    private gcl f14666b;
    private ServiceState f14667c;
    private SignalStrength f14668d;

    gcn(Context context, gcl gcl) {
        this.f14665a = context;
        this.f14666b = gcl;
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        String valueOf = String.valueOf(serviceState);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 41).append("CellStateListener.onServiceStateChanged: ").append(valueOf).toString(), new Object[0]);
        this.f14667c = serviceState;
        m16931a();
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        String valueOf = String.valueOf(signalStrength);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 44).append("CellStateListener.onSignalStrengthsChanged: ").append(valueOf).toString(), new Object[0]);
        this.f14668d = signalStrength;
        m16931a();
    }

    private void m16931a() {
        if (this.f14667c != null && this.f14668d != null && this.f14666b != null) {
            this.f14666b.mo2190a(gck.m16926a(this.f14665a, this.f14667c.getState(), gck.m16924a(this.f14668d)));
            this.f14666b = null;
        }
    }
}
