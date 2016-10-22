package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bxz */
final class bxz implements Creator<bxy> {
    bxz() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new bxy[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bxy(parcel);
    }
}
