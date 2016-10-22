package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: jgn */
final class jgn implements Creator<jgm> {
    jgn() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jgm[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jgm(parcel);
    }
}
