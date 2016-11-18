package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class jpf implements Parcelable {
    public static final Creator<jpf> CREATOR = new jpg();
    private final String f20647a;
    private final jpm f20648b;
    private final String f20649c;
    private final Uri f20650d;
    private final jpl f20651e;
    private final int f20652f;
    private final String f20653g;

    private jpf(String str, String str2, int i, long j, String str3, Uri uri, jpl jpl, String str4) {
        this.f20648b = new jpm(str2, j);
        this.f20652f = i;
        this.f20647a = str;
        this.f20649c = str3;
        this.f20650d = uri;
        this.f20651e = jpl;
        this.f20653g = str4;
        if (!m24895g() && !m24896h()) {
            throw new IllegalArgumentException("MediaRef has neither url nor local uri!");
        }
    }

    jpf(Parcel parcel) {
        this.f20647a = parcel.readString();
        this.f20649c = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            this.f20650d = Uri.parse(readString);
        } else {
            this.f20650d = null;
        }
        this.f20651e = jpl.m24930a(parcel.readInt());
        this.f20653g = parcel.readString();
        this.f20648b = (jpm) jpm.CREATOR.createFromParcel(parcel);
        this.f20652f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20647a);
        parcel.writeString(this.f20649c);
        if (this.f20650d != null) {
            parcel.writeString(this.f20650d.toString());
        } else {
            parcel.writeString(null);
        }
        parcel.writeInt(this.f20651e.f20702e);
        parcel.writeString(this.f20653g);
        this.f20648b.writeToParcel(parcel, i);
        parcel.writeInt(this.f20652f);
    }

    public int describeContents() {
        return 0;
    }

    public long m24889a() {
        return this.f20648b.m24931a();
    }

    public String m24890b() {
        return this.f20649c;
    }

    public Uri m24891c() {
        return this.f20650d;
    }

    public String m24892d() {
        return this.f20653g;
    }

    public jpl m24893e() {
        return this.f20651e;
    }

    public int m24894f() {
        return this.f20652f;
    }

    public boolean m24895g() {
        return this.f20649c != null;
    }

    public boolean m24896h() {
        return this.f20650d != null;
    }

    public boolean m24897i() {
        return this.f20648b.m24932b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpf)) {
            return false;
        }
        jpf jpf = (jpf) obj;
        if (this.f20648b.m24931a() != jpf.m24889a()) {
            return false;
        }
        if (!TextUtils.equals(this.f20649c, jpf.f20649c)) {
            return false;
        }
        if (!TextUtils.equals(this.f20653g, jpf.f20653g)) {
            return false;
        }
        boolean equals;
        Uri uri = this.f20650d;
        Uri uri2 = jpf.f20650d;
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
        if (this.f20651e != jpf.f20651e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f20650d == null ? 0 : this.f20650d.hashCode()) + (((this.f20653g == null ? 0 : this.f20653g.hashCode()) + (((this.f20649c == null ? 0 : this.f20649c.hashCode()) + ((((int) (this.f20648b.m24931a() ^ (this.f20648b.m24931a() >>> 32))) + 31) * 31)) * 31)) * 31)) * 31;
        if (this.f20651e != null) {
            i = this.f20651e.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String valueOf2 = String.valueOf(Integer.toHexString(System.identityHashCode(this)));
        String valueOf3 = String.valueOf(this.f20648b);
        String str = this.f20647a;
        String str2 = this.f20649c;
        String valueOf4 = String.valueOf(this.f20650d != null ? String.valueOf(this.f20650d) : null);
        String valueOf5 = String.valueOf(this.f20651e);
        String str3 = this.f20653g;
        return new StringBuilder((((((((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(str3).length()).append(valueOf).append("@").append(valueOf2).append("[").append(valueOf3).append(", ti-").append(str).append(", u-").append(str2).append(", l-").append(valueOf4).append(", ty-").append(valueOf5).append(", s-").append(str3).append("]").toString();
    }

    public static jpf m24888a(Context context, String str, jpl jpl) {
        int i = -1;
        jca jca = (jca) jyn.m25433b(context, jca.class);
        if (jca != null) {
            i = jca.mo2317a();
        }
        return new jpf(null, null, i, 0, str, null, jpl, null);
    }
}
