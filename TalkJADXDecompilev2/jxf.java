package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jxf implements Creator<jxe> {
    jxf() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jxe[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jxe(parcel);
    }
}
