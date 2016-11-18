package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class jvz extends jwj {
    public static final Creator<jvz> CREATOR = new jwa();
    boolean f21152a;
    Bundle f21153b;

    public jvz(Parcel parcel) {
        boolean z = true;
        super(parcel);
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f21152a = z;
        this.f21153b = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21152a ? 1 : 0);
        parcel.writeBundle(this.f21153b);
    }

    public jvz(Parcelable parcelable) {
        super(parcelable);
    }
}
