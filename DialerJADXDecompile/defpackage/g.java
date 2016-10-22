package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: g */
public final class g extends il {
    public static final Creator CREATOR;
    int a;
    float b;
    boolean c;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readByte() != null;
    }

    public g(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeByte((byte) (this.c ? 1 : 0));
    }

    static {
        CREATOR = buf.a(new bfq());
    }
}
