package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bcd */
final class bcd implements Creator<bcc> {
    bcd() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new bcc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bcc(parcel);
    }
}
