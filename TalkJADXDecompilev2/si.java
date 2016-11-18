package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class si extends lr {
    public static final Creator<si> CREATOR = gwb.a(new sj());
    public int a = 0;
    public int b;
    public int c;
    public int f;
    public int g;

    public si(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    public si(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
