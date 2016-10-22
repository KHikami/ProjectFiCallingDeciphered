package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bkn */
final class bkn implements Creator<bkm> {
    bkn() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new bkm[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bkm(parcel);
    }
}
