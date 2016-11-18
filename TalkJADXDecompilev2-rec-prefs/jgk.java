package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jgk implements Creator<jgj> {
    jgk() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jgj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jgj(parcel);
    }
}
