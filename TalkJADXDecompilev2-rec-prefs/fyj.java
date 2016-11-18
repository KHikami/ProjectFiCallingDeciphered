package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class fyj implements Parcelable {
    public static final Creator<fyj> CREATOR = new fyk();
    public String f14386a;
    public String f14387b;
    public int f14388c;
    public int f14389d;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14386a);
        parcel.writeString(this.f14387b);
        parcel.writeInt(this.f14388c);
        parcel.writeInt(this.f14389d);
    }
}
