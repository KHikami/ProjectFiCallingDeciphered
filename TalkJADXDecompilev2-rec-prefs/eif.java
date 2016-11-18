package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

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
