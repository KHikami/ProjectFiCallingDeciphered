package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class en implements Creator<em> {
    en() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new em[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new em(parcel);
    }
}
