package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: byh */
final class byh implements Creator<byg> {
    byh() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new byg[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new byg(parcel);
    }
}
