package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jpn implements Creator<jpm> {
    jpn() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jpm[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jpm(parcel);
    }
}
