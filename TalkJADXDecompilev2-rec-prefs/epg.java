package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.hangouts.phone.SmsAccountPickerActivity;

public final class epg implements jmb {
    public static final Creator<SmsAccountPickerActivity> CREATOR = new eph();

    public boolean mo459a(int i, jch jch) {
        return jch.mo3448c("logged_in") || jch.mo3448c("sms_only");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
