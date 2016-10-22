import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class jgm implements Parcelable {
    public static final Creator<jgm> CREATOR;
    public final int a;
    public final String b;
    public final jgz c;

    public jgm(int i, String str, jgz jgz) {
        this.a = i;
        this.b = str;
        this.c = jgz;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c.a());
        parcel.writeSerializable(this.c.b());
        parcel.writeString(this.c.c());
        parcel.writeLong(this.c.g());
        parcel.writeByteArray(this.c.e());
    }

    jgm(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = new jgz(parcel.readInt(), (Exception) parcel.readSerializable(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
    }

    static {
        CREATOR = new jgn();
    }
}
