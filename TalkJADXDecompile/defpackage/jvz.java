package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: jvz */
final class jvz extends jwj {
    public static final Creator<jvz> CREATOR;
    boolean a;
    Bundle b;

    public jvz(Parcel parcel) {
        boolean z = true;
        super(parcel);
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.a = z;
        this.b = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeBundle(this.b);
    }

    public jvz(Parcelable parcelable) {
        super(parcelable);
    }

    static {
        CREATOR = new jwa();
    }
}
