package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: dia */
final class dia implements Creator<dhz> {
    dia() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new dhz[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dhz(parcel);
    }
}
