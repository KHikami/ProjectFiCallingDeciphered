package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: jgk */
final class jgk implements Creator<jgj> {
    jgk() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jgj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jgj(parcel);
    }
}
