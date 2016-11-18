package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class jgm implements Parcelable {
    public static final Creator<jgm> CREATOR = new jgn();
    public final int f20015a;
    public final String f20016b;
    public final jgz f20017c;

    public jgm(int i, String str, jgz jgz) {
        this.f20015a = i;
        this.f20016b = str;
        this.f20017c = jgz;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20015a);
        parcel.writeString(this.f20016b);
        parcel.writeInt(this.f20017c.m24188a());
        parcel.writeSerializable(this.f20017c.m24190b());
        parcel.writeString(this.f20017c.m24191c());
        parcel.writeLong(this.f20017c.m24195g());
        parcel.writeByteArray(this.f20017c.m24193e());
    }

    jgm(Parcel parcel) {
        this.f20015a = parcel.readInt();
        this.f20016b = parcel.readString();
        this.f20017c = new jgz(parcel.readInt(), (Exception) parcel.readSerializable(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
    }
}
