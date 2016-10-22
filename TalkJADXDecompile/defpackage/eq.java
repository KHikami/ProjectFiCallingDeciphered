package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: eq */
final class eq implements Creator<ep> {
    eq() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new ep[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ep(parcel);
    }
}
