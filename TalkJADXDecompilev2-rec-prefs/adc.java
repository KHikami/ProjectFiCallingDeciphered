package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class adc implements Creator<adb> {
    adc() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new adb[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new adb(parcel);
    }
}