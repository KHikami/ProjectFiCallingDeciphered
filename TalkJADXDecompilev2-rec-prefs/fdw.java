package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class fdw implements Creator<fdv> {
    fdw() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new fdv[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fdv(parcel);
    }
}
