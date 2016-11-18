package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class C0261v extends lr {
    public static final Creator<C0261v> CREATOR = gwb.a(new gqd());
    int f35358a;
    float f35359b;
    boolean f35360c;

    public C0261v(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f35358a = parcel.readInt();
        this.f35359b = parcel.readFloat();
        this.f35360c = parcel.readByte() != (byte) 0;
    }

    public C0261v(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f35358a);
        parcel.writeFloat(this.f35359b);
        parcel.writeByte((byte) (this.f35360c ? 1 : 0));
    }
}
