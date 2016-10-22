import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

@Deprecated
public final class jpm implements Parcelable {
    public static final Creator<jpm> CREATOR;
    private final long a;
    private final String b;

    static {
        CREATOR = new jpn();
    }

    public jpm(String str, long j) {
        this.b = str;
        this.a = j;
    }

    jpm(Parcel parcel) {
        this.b = parcel.readString();
        this.a = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.a);
    }

    public int describeContents() {
        return 0;
    }

    public long a() {
        return this.a;
    }

    public boolean b() {
        return this.a != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jpm)) {
            return false;
        }
        jpm jpm = (jpm) obj;
        if (this.a == jpm.a && TextUtils.equals(this.b, jpm.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (int) (this.a ^ (this.a >>> 32));
        if (this.b != null) {
            return i ^ this.b.hashCode();
        }
        return i;
    }

    public String toString() {
        String str = this.b;
        return new StringBuilder(String.valueOf(str).length() + 26).append("g-").append(str).append(", p-").append(this.a).toString();
    }
}
