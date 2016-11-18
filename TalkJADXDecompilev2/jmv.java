package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jmv implements Creator<jmu> {
    jmv() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jmu[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jmu(parcel);
    }
}
