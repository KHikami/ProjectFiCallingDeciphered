package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bxy extends bxn implements Parcelable {
    public static final Creator<bxy> CREATOR = new bxz();
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.a(parcel);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeLong(this.j);
    }

    bxy(Parcel parcel) {
        super(parcel);
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readLong();
    }
}
