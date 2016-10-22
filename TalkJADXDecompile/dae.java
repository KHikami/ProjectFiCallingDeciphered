import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public final class dae {
    boolean a;
    private final Context b;
    private boolean c;
    private PhoneStateListener d;
    private TelephonyManager e;

    public dae(Context context) {
        this.b = context;
    }

    public void a(dag dag) {
        iil.b("Expected condition to be false", this.c);
        this.c = true;
        this.e = (TelephonyManager) this.b.getSystemService("phone");
        if (this.e == null) {
            glk.c("Babel", "couldn't retrieve TelephonyManager!", new Object[0]);
            dag.a();
            return;
        }
        this.d = new daf(this, dag);
        this.e.listen(this.d, 1);
    }

    public void a() {
        this.c = false;
        if (this.d != null) {
            this.e.listen(this.d, 0);
            this.d = null;
        }
    }
}
