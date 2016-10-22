import android.content.Loader;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;

/* compiled from: PG */
public class arb extends aqv implements ath, cc {
    static {
        arb.class.getSimpleName();
    }

    protected final adh a() {
        adh ara = new ara(getActivity());
        ara.z = this.l;
        ara.h = true;
        ara.a(this.f);
        ara.A = this;
        return ara;
    }

    public Loader onCreateLoader(int i, Bundle bundle) {
        if (i == -1) {
            return super.onCreateLoader(i, bundle);
        }
        ara ara = (ara) this.h;
        Loader aoz = new aoz(super.getContext());
        if (ara.n == null) {
            aoz.a("");
            ara.C.c = "";
        } else {
            aoz.a(ara.n);
            ara.C.c = PhoneNumberUtils.normalizeNumber(ara.n);
        }
        return aoz;
    }

    protected final void f() {
        if (this.o != null && getActivity() != null) {
            if (buf.c(getActivity(), "android.permission.CALL_PHONE")) {
                this.o.b(0);
                this.o.c(0);
                this.o.a(0);
                return;
            }
            this.o.b(cob.al);
            this.o.c(cob.cE);
            this.o.a(cob.cD);
            this.o.d = this;
        }
    }

    public final void e_() {
        if (getActivity() != null) {
            bv.a(this, new String[]{"android.permission.CALL_PHONE"}, 1);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            f();
        }
    }

    protected final int g(boolean z) {
        return 5;
    }

    protected final Uri c(int i) {
        return ((ara) this.h).l(i);
    }
}
