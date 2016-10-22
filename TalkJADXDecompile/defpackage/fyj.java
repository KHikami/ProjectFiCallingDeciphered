package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: fyj */
public final class fyj implements Parcelable {
    public static final Creator<fyj> CREATOR;
    public String a;
    public String b;
    public int c;
    public int d;

    static {
        CREATOR = new fyk();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
