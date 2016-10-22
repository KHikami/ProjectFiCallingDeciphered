package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: fyk */
final class fyk implements Creator<fyj> {
    fyk() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new fyj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        fyj fyj = new fyj();
        fyj.a = parcel.readString();
        fyj.b = parcel.readString();
        fyj.c = parcel.readInt();
        fyj.d = parcel.readInt();
        return fyj;
    }
}
