package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jly implements Creator<jlx> {
    jly() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jlx[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jlx(parcel);
    }
}
