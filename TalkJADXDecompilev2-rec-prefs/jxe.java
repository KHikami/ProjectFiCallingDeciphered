package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jxe extends jwj {
    public static final Creator<jxe> CREATOR = new jxf();
    public boolean f21200a;
    public Bundle f21201b;

    public jxe(Parcel parcel) {
        boolean z = true;
        super(parcel);
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f21200a = z;
        this.f21201b = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21200a ? 1 : 0);
        parcel.writeBundle(this.f21201b);
    }

    public jxe(Parcelable parcelable) {
        super(parcelable);
    }
}
