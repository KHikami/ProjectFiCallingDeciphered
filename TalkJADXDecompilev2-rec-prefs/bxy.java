package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bxy extends bxn implements Parcelable {
    public static final Creator<bxy> CREATOR = new bxz();
    public int f4757f;
    public int f4758g;
    public int f4759h;
    public int f4760i;
    public long f4761j;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.m6897a(parcel);
        parcel.writeInt(this.f4757f);
        parcel.writeInt(this.f4758g);
        parcel.writeInt(this.f4759h);
        parcel.writeInt(this.f4760i);
        parcel.writeLong(this.f4761j);
    }

    bxy(Parcel parcel) {
        super(parcel);
        this.f4757f = parcel.readInt();
        this.f4758g = parcel.readInt();
        this.f4759h = parcel.readInt();
        this.f4760i = parcel.readInt();
        this.f4761j = parcel.readLong();
    }
}
