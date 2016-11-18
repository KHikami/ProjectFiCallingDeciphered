package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class jxn extends jwj {
    public static final Creator<jxn> CREATOR = new jxo();
    boolean f21255a;

    public jxn(Parcel parcel) {
        boolean z = true;
        super(parcel);
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f21255a = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21255a ? 1 : 0);
    }

    public jxn(Parcelable parcelable) {
        super(parcelable);
    }
}
