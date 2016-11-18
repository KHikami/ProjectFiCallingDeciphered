package p000;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

final class fee extends eaf implements Parcelable, Serializable {
    public static final Creator<fee> CREATOR = new fef();

    public fee(String str, int i) {
        super(str, i);
    }

    public void mo1801a(Context context, int i, evz evz) {
        ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new feh(evz, i));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected fee(Parcel parcel) {
        super(parcel);
    }
}
