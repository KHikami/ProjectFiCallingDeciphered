package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bbs implements Creator<bbr> {
    bbs() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new bbr[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bbr();
    }
}