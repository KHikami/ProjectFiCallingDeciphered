package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;

public final class edo implements Parcelable, Serializable {
    public static final Creator<edo> CREATOR = new edp();
    private static final long serialVersionUID = 1;
    public final String f11244a;
    public final String f11245b;

    public edo(String str, String str2) {
        this.f11244a = str;
        this.f11245b = str2;
    }

    public static edo m13604a(String str) {
        return new edo(str, null);
    }

    public static edo m13606b(String str) {
        return new edo(null, str);
    }

    public boolean m13607a() {
        return TextUtils.isEmpty(this.f11244a) && TextUtils.isEmpty(this.f11245b);
    }

    public static boolean m13605a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            return str != null && str.equals(str3);
        } else {
            return str2.equals(str4);
        }
    }

    public boolean m13608a(edo edo) {
        if (edo == null) {
            return false;
        }
        return edo.m13605a(this.f11245b, this.f11244a, edo.f11245b, edo.f11244a);
    }

    public boolean m13609a(String str, String str2) {
        return edo.m13605a(this.f11245b, this.f11244a, str, str2);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof edo)) {
            return false;
        }
        edo edo = (edo) obj;
        boolean equals = this.f11245b == null ? edo.f11245b == null : this.f11245b.equals(edo.f11245b);
        boolean equals2 = this.f11244a == null ? edo.f11244a == null : this.f11244a.equals(edo.f11244a);
        if (equals && r3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f11244a == null ? 0 : this.f11244a.hashCode()) + 1340874) * 31;
        if (this.f11245b != null) {
            i = this.f11245b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f11245b;
        String str2 = this.f11244a;
        return new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("ParticipantId {chatId: ").append(str).append("  gaiaId: ").append(str2).append("}").toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        int i4 = this.f11244a != null ? 1 : 0;
        if (i4 != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i4 != 0) {
            parcel.writeString(this.f11244a);
        }
        if (this.f11245b != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        if (i2 != 0) {
            parcel.writeString(this.f11245b);
        }
    }
}
