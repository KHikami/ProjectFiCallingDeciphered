package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jwe implements Creator<jwd> {
    jwe() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jwd[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jwd(parcel);
    }
}
