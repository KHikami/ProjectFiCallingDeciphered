import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class jpf implements Parcelable {
    public static final Creator<jpf> CREATOR;
    private final String a;
    private final jpm b;
    private final String c;
    private final Uri d;
    private final jpl e;
    private final int f;
    private final String g;

    private jpf(String str, String str2, int i, long j, String str3, Uri uri, jpl jpl, String str4) {
        this.b = new jpm(str2, j);
        this.f = i;
        this.a = str;
        this.c = str3;
        this.d = uri;
        this.e = jpl;
        this.g = str4;
        if (!g() && !h()) {
            throw new IllegalArgumentException("MediaRef has neither url nor local uri!");
        }
    }

    jpf(Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            this.d = Uri.parse(readString);
        } else {
            this.d = null;
        }
        this.e = jpl.a(parcel.readInt());
        this.g = parcel.readString();
        this.b = (jpm) jpm.CREATOR.createFromParcel(parcel);
        this.f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        if (this.d != null) {
            parcel.writeString(this.d.toString());
        } else {
            parcel.writeString(null);
        }
        parcel.writeInt(this.e.e);
        parcel.writeString(this.g);
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.f);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new jpg();
    }

    public long a() {
        return this.b.a();
    }

    public String b() {
        return this.c;
    }

    public Uri c() {
        return this.d;
    }

    public String d() {
        return this.g;
    }

    public jpl e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public boolean g() {
        return this.c != null;
    }

    public boolean h() {
        return this.d != null;
    }

    public boolean i() {
        return this.b.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpf)) {
            return false;
        }
        jpf jpf = (jpf) obj;
        if (this.b.a() != jpf.a()) {
            return false;
        }
        if (!TextUtils.equals(this.c, jpf.c)) {
            return false;
        }
        if (!TextUtils.equals(this.g, jpf.g)) {
            return false;
        }
        boolean equals;
        Uri uri = this.d;
        Uri uri2 = jpf.d;
        if (uri != null && uri2 != null) {
            equals = uri.equals(uri2);
        } else if (uri == null && uri2 == null) {
            equals = true;
        } else {
            equals = false;
        }
        if (!equals) {
            return false;
        }
        if (this.e != jpf.e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.g == null ? 0 : this.g.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + ((((int) (this.b.a() ^ (this.b.a() >>> 32))) + 31) * 31)) * 31)) * 31)) * 31;
        if (this.e != null) {
            i = this.e.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String valueOf2 = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
        String valueOf3 = String.valueOf(this.b);
        String str = this.a;
        String str2 = this.c;
        String valueOf4 = String.valueOf(this.d != null ? String.valueOf(this.d) : null);
        String valueOf5 = String.valueOf(this.e);
        String str3 = this.g;
        return new StringBuilder((((((((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(str3).length()).append(valueOf).append("@").append(valueOf2).append("[").append(valueOf3).append(", ti-").append(str).append(", u-").append(str2).append(", l-").append(valueOf4).append(", ty-").append(valueOf5).append(", s-").append(str3).append("]").toString();
    }

    public static jpf a(Context context, String str, jpl jpl) {
        int i = -1;
        jca jca = (jca) jyn.b(context, jca.class);
        if (jca != null) {
            i = jca.a();
        }
        return new jpf(null, null, i, 0, str, null, jpl, null);
    }
}
