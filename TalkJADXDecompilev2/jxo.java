package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jxo implements Creator<jxn> {
    jxo() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jxn[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jxn(parcel);
    }
}
