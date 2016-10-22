import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.hangouts.phone.SmsAccountPickerActivity;

public final class epg implements jmb {
    public static final Creator<SmsAccountPickerActivity> CREATOR;

    public boolean a(int i, jch jch) {
        return jch.c("logged_in") || jch.c("sms_only");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    static {
        CREATOR = new eph();
    }
}
