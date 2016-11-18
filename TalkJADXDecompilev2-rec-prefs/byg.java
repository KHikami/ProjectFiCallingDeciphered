package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class byg extends bxn implements Parcelable {
    public static final Creator<byg> CREATOR = new byh();
    public String f4767f;
    public String f4768g;

    byg(Parcel parcel) {
        super(parcel);
        this.f4767f = parcel.readString();
        this.f4768g = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.m6897a(parcel);
        parcel.writeString(this.f4767f);
        parcel.writeString(this.f4768g);
    }
}
