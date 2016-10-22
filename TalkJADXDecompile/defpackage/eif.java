package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: eif */
final class eif implements Creator<eie> {
    eif() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new eie[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new eie(parcel.readInt(), parcel.readInt(), parcel.readBundle());
    }
}
