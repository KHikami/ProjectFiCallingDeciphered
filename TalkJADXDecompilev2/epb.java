package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class epb implements jmb {
    public static final Creator<epb> CREATOR = new epc();

    public boolean a(int i, jch jch) {
        return !jch.c("sms_only") && fdq.a(gwb.H(), i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
