package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class gko implements Creator<gkn> {
    gko() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new gkn[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new gkn(parcel);
    }
}
