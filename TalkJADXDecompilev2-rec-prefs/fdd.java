package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class fdd implements Creator<fdc> {
    fdd() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new fdc[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new fdc(parcel);
    }
}
