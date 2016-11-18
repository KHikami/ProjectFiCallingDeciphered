package p000;

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

    public boolean mo459a(int i, jch jch) {
        return bbq.m4775a(jch) || jch.mo3448c("is_sms_account");
    }
}
