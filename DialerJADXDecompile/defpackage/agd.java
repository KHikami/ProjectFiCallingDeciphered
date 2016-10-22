package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: agd */
public final class agd implements Parcelable {
    public static final Creator CREATOR;
    private static final Pattern e;
    public final String a;
    public final String b;
    public final String c;
    public final agc d;

    static {
        CREATOR = new age();
        e = Pattern.compile(Pattern.quote("\u0001"));
        Pattern.compile(Pattern.quote("\u0002"));
        new String[1][0] = "_id";
        RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("limit", "1").build();
    }

    public agd(String str, String str2, String str3) {
        this.a = agd.b(str);
        this.b = agd.b(str2);
        this.c = agd.b(str3);
        this.d = agc.a(str2, str3);
    }

    public agd(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = agc.a(this.b, this.c);
    }

    private static String b(String str) {
        return TextUtils.isEmpty(str) ? null : str;
    }

    public static agd a(String str) {
        String[] split = e.split(str, 3);
        if (split.length < 3) {
            String str2 = "Invalid string ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        return new agd(split[0], split[1], TextUtils.isEmpty(split[2]) ? null : split[2]);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agd)) {
            return false;
        }
        agd agd = (agd) obj;
        if (Objects.equals(this.a, agd.a) && Objects.equals(this.b, agd.b) && Objects.equals(this.c, agd.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        } else {
            hashCode = 0;
        }
        int i2 = (hashCode + 527) * 31;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + i2) * 31;
        if (this.c != null) {
            i = this.c.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return new StringBuilder(((String.valueOf(str).length() + 43) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("AccountWithDataSet {name=").append(str).append(", type=").append(str2).append(", dataSet=").append(str3).append("}").toString();
    }
}
