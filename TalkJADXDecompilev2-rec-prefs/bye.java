package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bye extends bxn implements Parcelable {
    public static final Creator<bye> CREATOR = new byf();
    public String f4764f;
    public String f4765g;
    public String f4766h;

    bye(Parcel parcel) {
        super(parcel);
        this.f4764f = parcel.readString();
        this.f4765g = parcel.readString();
        this.f4766h = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.m6897a(parcel);
        parcel.writeString(this.f4764f);
        parcel.writeString(this.f4765g);
        parcel.writeString(this.f4766h);
    }
}
