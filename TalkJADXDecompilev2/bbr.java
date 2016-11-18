package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bbr implements jmb {
    public static final Creator<bbr> CREATOR = new bbs();

    bbr() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public boolean a(int i, jch jch) {
        return bbq.a(jch) || jch.c("is_sms_account");
    }
}
