import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import android.util.Log;
import com.android.dialer.app.DialtactsActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: PG */
public class bix extends aqt implements cc {
    private static String t;
    brc s;
    private int u;
    private LocationSettingsResult v;

    static {
        t = bix.class.getSimpleName();
    }

    public void onStart() {
        super.onStart();
        this.u = 1;
        this.s = new brd(getContext()).a(coo.b).b();
        this.s.b();
        h();
    }

    public void onStop() {
        this.s.c();
        super.onStop();
    }

    protected final void f() {
        super.f();
        if (this.o != null && getActivity() != null && i() && this.n == null) {
            if (!buf.c(getActivity(), "android.permission.ACCESS_FINE_LOCATION") || this.u == 3) {
                this.o.b(buf.lg);
                this.o.c(buf.lO);
                this.o.a(buf.lN);
                this.o.d = this;
                this.n = "android.permission.ACCESS_FINE_LOCATION";
            }
        }
    }

    final void a(LocationSettingsResult locationSettingsResult) {
        this.v = locationSettingsResult;
        if (locationSettingsResult == null || locationSettingsResult.b == null) {
            this.u = 2;
        } else if (locationSettingsResult.b.g == 6) {
            this.u = 3;
        } else if (locationSettingsResult.b.g == 0) {
            this.u = 4;
        } else {
            this.u = 2;
        }
        f();
    }

    public final void e_() {
        if (getActivity() != null) {
            if (this.n != null && !"android.permission.ACCESS_FINE_LOCATION".equals(this.n)) {
                super.e_();
            } else if (!j()) {
                super.e_();
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && strArr.length == 1 && iArr.length == 1 && "android.permission.ACCESS_FINE_LOCATION".equals(strArr[0]) && iArr[0] == 0) {
            buf.d(getActivity(), "android.permission.ACCESS_FINE_LOCATION");
            if (!j()) {
                f();
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    private final boolean i() {
        if (getActivity() == null || !(getActivity() instanceof DialtactsActivity)) {
            return false;
        }
        return ((DialtactsActivity) getActivity()).l();
    }

    public final void h() {
        new biy(this).execute(new Void[0]);
    }

    private final boolean j() {
        int i = 0;
        if (!i()) {
            return false;
        }
        if (!buf.c(getActivity(), "android.permission.ACCESS_FINE_LOCATION")) {
            bv.a(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
            return true;
        } else if (this.u != 3) {
            return false;
        } else {
            try {
                Status status = this.v.b;
                Activity activity = getActivity();
                if (status.i != null) {
                    i = 1;
                }
                if (i != 0) {
                    activity.startIntentSenderForResult(status.i.getIntentSender(), 1000, null, 0, 0, 0);
                }
            } catch (SendIntentException e) {
                Log.w(t, "Could not show location settings dialog.");
                a(null);
            }
            return true;
        }
    }
}
