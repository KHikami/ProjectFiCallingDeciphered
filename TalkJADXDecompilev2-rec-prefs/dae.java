package p000;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public final class dae {
    boolean f9410a;
    private final Context f9411b;
    private boolean f9412c;
    private PhoneStateListener f9413d;
    private TelephonyManager f9414e;

    public dae(Context context) {
        this.f9411b = context;
    }

    public void m11370a(dag dag) {
        iil.m21879b("Expected condition to be false", this.f9412c);
        this.f9412c = true;
        this.f9414e = (TelephonyManager) this.f9411b.getSystemService("phone");
        if (this.f9414e == null) {
            glk.m17979c("Babel", "couldn't retrieve TelephonyManager!", new Object[0]);
            dag.m11371a();
            return;
        }
        this.f9413d = new daf(this, dag);
        this.f9414e.listen(this.f9413d, 1);
    }

    public void m11369a() {
        this.f9412c = false;
        if (this.f9413d != null) {
            this.f9414e.listen(this.f9413d, 0);
            this.f9413d = null;
        }
    }
}
