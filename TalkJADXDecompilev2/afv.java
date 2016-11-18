package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class afv extends lr {
    public static final Creator<afv> CREATOR = gwb.a(new afw());
    public int a;
    public boolean b;

    public afv(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }

    public afv(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
