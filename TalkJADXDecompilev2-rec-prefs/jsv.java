package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jsv implements Creator<jsu> {
    jsv() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jsu[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jsu(parcel);
    }
}
