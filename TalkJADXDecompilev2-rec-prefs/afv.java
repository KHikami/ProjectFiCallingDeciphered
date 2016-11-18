package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class afv extends lr {
    public static final Creator<afv> CREATOR = gwb.m1577a(new afw());
    public int f557a;
    public boolean f558b;

    public afv(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f557a = parcel.readInt();
        this.f558b = parcel.readInt() != 0;
    }

    public afv(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f557a);
        parcel.writeInt(this.f558b ? 1 : 0);
    }
}
