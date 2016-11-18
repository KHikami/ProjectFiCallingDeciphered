package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class dm implements Creator<dl> {
    dm() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new dl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dl(parcel);
    }
}
