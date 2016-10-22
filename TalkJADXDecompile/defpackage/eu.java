package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: eu */
final class eu implements Creator<et> {
    eu() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new et[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new et(parcel);
    }
}
