package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;

public final class edo implements Parcelable, Serializable {
    public static final Creator<edo> CREATOR = new edp();
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;

    public edo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static edo a(String str) {
        return new edo(str, null);
    }

    public static edo b(String str) {
        return new edo(null, str);
    }

    public boolean a() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b);
    }

    public static boolean a(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
            return str != null && str.equals(str3);
        } else {
            return str2.equals(str4);
        }
    }

    public boolean a(edo edo) {
        if (edo == null) {
            return false;
        }
        return edo.a(this.b, this.a, edo.b, edo.a);
    }

    public boolean a(String str, String str2) {
        return edo.a(this.b, this.a, str, str2);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof edo)) {
            return false;
        }
        edo edo = (edo) obj;
        boolean equals = this.b == null ? edo.b == null : this.b.equals(edo.b);
        boolean equals2 = this.a == null ? edo.a == null : this.a.equals(edo.a);
        if (equals && r3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.a == null ? 0 : this.a.hashCode()) + 1340874) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.b;
        String str2 = this.a;
        return new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("ParticipantId {chatId: ").append(str).append("  gaiaId: ").append(str2).append("}").toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        int i4 = this.a != null ? 1 : 0;
        if (i4 != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (i4 != 0) {
            parcel.writeString(this.a);
        }
        if (this.b != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        if (i2 != 0) {
            parcel.writeString(this.b);
        }
    }
}
