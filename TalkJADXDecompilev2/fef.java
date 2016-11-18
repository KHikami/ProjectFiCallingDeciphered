package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class fef implements Creator<fee> {
    fef() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new fee[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fee(parcel);
    }
}
