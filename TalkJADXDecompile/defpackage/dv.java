package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: dv */
final class dv implements Creator<du> {
    dv() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new du[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new du(parcel, null);
    }
}
