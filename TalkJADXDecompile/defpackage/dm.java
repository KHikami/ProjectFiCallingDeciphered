package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: dm */
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
