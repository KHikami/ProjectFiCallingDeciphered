package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

@Deprecated
public final class jpm implements Parcelable {
    public static final Creator<jpm> CREATOR = new jpn();
    private final long f20703a;
    private final String f20704b;

    public jpm(String str, long j) {
        this.f20704b = str;
        this.f20703a = j;
    }

    jpm(Parcel parcel) {
        this.f20704b = parcel.readString();
        this.f20703a = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20704b);
        parcel.writeLong(this.f20703a);
    }

    public int describeContents() {
        return 0;
    }

    public long m24931a() {
        return this.f20703a;
    }

    public boolean m24932b() {
        return this.f20703a != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jpm)) {
            return false;
        }
        jpm jpm = (jpm) obj;
        if (this.f20703a == jpm.f20703a && TextUtils.equals(this.f20704b, jpm.f20704b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (int) (this.f20703a ^ (this.f20703a >>> 32));
        if (this.f20704b != null) {
            return i ^ this.f20704b.hashCode();
        }
        return i;
    }

    public String toString() {
        String str = this.f20704b;
        return new StringBuilder(String.valueOf(str).length() + 26).append("g-").append(str).append(", p-").append(this.f20703a).toString();
    }
}
