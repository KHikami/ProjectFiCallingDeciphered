package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class sy implements Creator<sx> {
    sy() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new sx[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sx(parcel);
    }
}
