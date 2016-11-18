package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class fyk implements Creator<fyj> {
    fyk() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new fyj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        fyj fyj = new fyj();
        fyj.f14386a = parcel.readString();
        fyj.f14387b = parcel.readString();
        fyj.f14388c = parcel.readInt();
        fyj.f14389d = parcel.readInt();
        return fyj;
    }
}
