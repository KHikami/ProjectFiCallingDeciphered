import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.hangouts.phone.AccountSelectionActivity;

public final class eir implements jmb {
    public static final Creator<AccountSelectionActivity> CREATOR;

    public boolean a(int i, jch jch) {
        boolean i2 = fde.i();
        boolean z;
        if (i2 && jch.c("sms_only")) {
            z = true;
        } else {
            z = false;
        }
        if (i2 && jch.c("is_sms_account")) {
            i2 = true;
        } else {
            i2 = false;
        }
        if (jch.c("is_gv_sms_integration_enabled") || r3 || r0) {
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    static {
        CREATOR = new eis();
    }
}
