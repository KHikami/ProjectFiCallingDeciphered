package defpackage;

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
    public List<String> A;
    public List<String> B;
    public String C;
    public float D;
    public String E;
    public int F = edm.a;
    String G;
    byte[] H = new byte[0];
    public Set I;
    public edq a;
    public edo b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public Boolean i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v = true;
    public int w = 0;
    public String x;
    public boolean y;
    public boolean z;

    public boolean a() {
        return !TextUtils.isEmpty(b());
    }

    public String b() {
        return this.b != null ? this.b.a : null;
    }

    public String c() {
        return this.b != null ? this.b.b : null;
    }

    public void a(String str, byte[] bArr) {
        this.G = str;
        this.H = bArr;
    }

    public byte[] d() {
        return this.H;
    }

    public String e() {
        boolean z = this.G == null || !this.G.isEmpty();
        ba.b(z, (Object) "Illegal states for CallerIdPhoneNumber, only null or non-zero-length values are permitted");
        return this.G;
    }

    public String f() {
        return this.c;
    }

    @Deprecated
    public boolean g() {
        return this.c != null;
    }

    public boolean h() {
        return this.a == edq.PHONE;
    }

    public boolean i() {
        return !TextUtils.isEmpty(this.c) && Patterns.EMAIL_ADDRESS.matcher(this.c).matches();
    }

    public static String a(String str) {
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

    public void b(String str) {
        this.q = str;
    }

    public String j() {
        return this.q;
    }

    public static String a(Context context) {
        return context.getResources().getString(bm.J);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.g = edk.a(gwb.H());
        } else {
            this.g = str;
        }
    }

    public void a(String str, String str2) {
        if (str != null) {
            this.e = str;
        }
        if (str2 != null) {
            this.h = str2;
        }
    }

    public String k() {
        String b = b();
        if (b == null || !b.startsWith("g:")) {
            return b;
        }
        return b.substring(2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.ordinal());
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.w);
        parcel.writeString(this.G);
        parcel.writeInt(this.H.length);
        parcel.writeByteArray(this.H);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof edk)) {
            return false;
        }
        edk edk = (edk) obj;
        if (this.b == null || edk.b == null) {
            return false;
        }
        return this.b.a(edk.b);
    }

    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        String str = this.c;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        String valueOf3 = String.valueOf(this.i);
        return new StringBuilder((((((((String.valueOf(valueOf).length() + 98) + String.valueOf(valueOf2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(valueOf3).length()).append("ParticipantEntity {id:").append(valueOf).append(", type:").append(valueOf2).append(" phoneNumber:").append(str).append(" displayName:").append(str2).append(" firstName:").append(str3).append(" fallbackName:").append(str4).append(" avatar:").append(str5).append(" blocked:").append(valueOf3).append("}").toString();
    }
}
