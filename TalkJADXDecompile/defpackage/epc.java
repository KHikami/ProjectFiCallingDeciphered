package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: epc */
final class epc implements Creator<epb> {
    epc() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new epb[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new epb();
    }
}
