package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class byh implements Creator<byg> {
    byh() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new byg[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new byg(parcel);
    }
}
