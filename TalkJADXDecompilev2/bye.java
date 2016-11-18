package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bye extends bxn implements Parcelable {
    public static final Creator<bye> CREATOR = new byf();
    public String f;
    public String g;
    public String h;

    bye(Parcel parcel) {
        super(parcel);
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.a(parcel);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
