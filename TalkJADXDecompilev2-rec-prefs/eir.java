package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.hangouts.phone.AccountSelectionActivity;

public final class eir implements jmb {
    public static final Creator<AccountSelectionActivity> CREATOR = new eis();

    public boolean mo459a(int i, jch jch) {
        boolean i2 = fde.m15028i();
        boolean z;
        if (i2 && jch.mo3448c("sms_only")) {
            z = true;
        } else {
            z = false;
        }
        if (i2 && jch.mo3448c("is_sms_account")) {
            i2 = true;
        } else {
            i2 = false;
        }
        if (jch.mo3448c("is_gv_sms_integration_enabled") || r3 || r0) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
