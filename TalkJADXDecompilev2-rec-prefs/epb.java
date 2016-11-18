package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class epb implements jmb {
    public static final Creator<epb> CREATOR = new epc();

    public boolean mo459a(int i, jch jch) {
        return !jch.mo3448c("sms_only") && fdq.m15090a(gwb.m1400H(), i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
