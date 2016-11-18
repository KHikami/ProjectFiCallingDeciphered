package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jpg implements Creator<jpf> {
    jpg() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jpf[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jpf(parcel);
    }
}
