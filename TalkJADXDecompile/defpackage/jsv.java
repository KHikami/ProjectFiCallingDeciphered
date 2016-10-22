package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: jsv */
final class jsv implements Creator<jsu> {
    jsv() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jsu[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jsu(parcel);
    }
}
