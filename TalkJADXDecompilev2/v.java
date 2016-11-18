package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class v extends lr {
    public static final Creator<v> CREATOR = gwb.a(new gqd());
    int a;
    float b;
    boolean c;

    public v(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readByte() != (byte) 0;
    }

    public v(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeByte((byte) (this.c ? 1 : 0));
    }
}
