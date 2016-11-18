package p000;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public final class edk implements Parcelable, Serializable {
    public static final Creator<edk> CREATOR = new edl();
    private static final long serialVersionUID = 1;
    public List<String> f11203A;
    public List<String> f11204B;
    public String f11205C;
    public float f11206D;
    public String f11207E;
    public int f11208F = edm.f11238a;
    String f11209G;
    byte[] f11210H = new byte[0];
    public Set f11211I;
    public edq f11212a;
    public edo f11213b;
    public String f11214c;
    public String f11215d;
    public String f11216e;
    public String f11217f;
    public String f11218g;
    public String f11219h;
    public Boolean f11220i;
    public String f11221j;
    public String f11222k;
    public String f11223l;
    public boolean f11224m;
    public boolean f11225n;
    public boolean f11226o;
    public boolean f11227p;
    public String f11228q;
    public String f11229r;
    public String f11230s;
    public boolean f11231t;
    public boolean f11232u;
    public boolean f11233v = true;
    public int f11234w = 0;
    public String f11235x;
    public boolean f11236y;
    public boolean f11237z;

    public boolean m13589a() {
        return !TextUtils.isEmpty(m13590b());
    }

    public String m13590b() {
        return this.f11213b != null ? this.f11213b.f11244a : null;
    }

    public String m13592c() {
        return this.f11213b != null ? this.f11213b.f11245b : null;
    }

    public void m13588a(String str, byte[] bArr) {
        this.f11209G = str;
        this.f11210H = bArr;
    }

    public byte[] m13594d() {
        return this.f11210H;
    }

    public String m13595e() {
        boolean z = this.f11209G == null || !this.f11209G.isEmpty();
        ba.m4610b(z, (Object) "Illegal states for CallerIdPhoneNumber, only null or non-zero-length values are permitted");
        return this.f11209G;
    }

    public String m13596f() {
        return this.f11214c;
    }

    @Deprecated
    public boolean m13597g() {
        return this.f11214c != null;
    }

    public boolean m13598h() {
        return this.f11212a == edq.PHONE;
    }

    public boolean m13599i() {
        return !TextUtils.isEmpty(this.f11214c) && Patterns.EMAIL_ADDRESS.matcher(this.f11214c).matches();
    }

    public static String m13586a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return null;
        }
        int indexOf = trim.indexOf(32);
        return indexOf >= 0 ? trim.substring(0, indexOf) : trim;
    }

    public void m13591b(String str) {
        this.f11228q = str;
    }

    public String m13600j() {
        return this.f11228q;
    }

    public static String m13585a(Context context) {
        return context.getResources().getString(bm.f3808J);
    }

    public void m13593c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f11218g = edk.m13585a(gwb.m1400H());
        } else {
            this.f11218g = str;
        }
    }

    public void m13587a(String str, String str2) {
        if (str != null) {
            this.f11216e = str;
        }
        if (str2 != null) {
            this.f11219h = str2;
        }
    }

    public String m13601k() {
        String b = m13590b();
        if (b == null || !b.startsWith("g:")) {
            return b;
        }
        return b.substring(2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11212a.ordinal());
        parcel.writeParcelable(this.f11213b, i);
        parcel.writeString(this.f11214c);
        parcel.writeString(this.f11215d);
        parcel.writeString(this.f11216e);
        parcel.writeString(this.f11217f);
        parcel.writeString(this.f11218g);
        parcel.writeString(this.f11219h);
        parcel.writeString(this.f11229r);
        parcel.writeString(this.f11230s);
        parcel.writeInt(this.f11231t ? 1 : 0);
        parcel.writeInt(this.f11234w);
        parcel.writeString(this.f11209G);
        parcel.writeInt(this.f11210H.length);
        parcel.writeByteArray(this.f11210H);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof edk)) {
            return false;
        }
        edk edk = (edk) obj;
        if (this.f11213b == null || edk.f11213b == null) {
            return false;
        }
        return this.f11213b.m13608a(edk.f11213b);
    }

    public int hashCode() {
        if (this.f11213b == null) {
            return 0;
        }
        return this.f11213b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f11213b);
        String valueOf2 = String.valueOf(this.f11212a);
        String str = this.f11214c;
        String str2 = this.f11216e;
        String str3 = this.f11217f;
        String str4 = this.f11218g;
        String str5 = this.f11219h;
        String valueOf3 = String.valueOf(this.f11220i);
        return new StringBuilder((((((((String.valueOf(valueOf).length() + 98) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(valueOf3).length()).append("ParticipantEntity {id:").append(valueOf).append(", type:").append(valueOf2).append(" phoneNumber:").append(str).append(" displayName:").append(str2).append(" firstName:").append(str3).append(" fallbackName:").append(str4).append(" avatar:").append(str5).append(" blocked:").append(valueOf3).append("}").toString();
    }
}
