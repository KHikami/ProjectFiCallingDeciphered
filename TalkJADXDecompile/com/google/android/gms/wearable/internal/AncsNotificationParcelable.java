package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import ayo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import ibl;

public final class AncsNotificationParcelable extends AbstractSafeParcelable implements ayo {
    public static final Creator<AncsNotificationParcelable> CREATOR;
    final int a;
    private int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final byte i;
    private final byte j;
    private final byte k;
    private final byte l;
    private final String m;

    static {
        CREATOR = new ibl();
    }

    public AncsNotificationParcelable(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.b = i2;
        this.a = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = b;
        this.j = b2;
        this.k = b3;
        this.l = b4;
        this.m = str7;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        return this.a != ancsNotificationParcelable.a ? false : this.b != ancsNotificationParcelable.b ? false : this.i != ancsNotificationParcelable.i ? false : this.j != ancsNotificationParcelable.j ? false : this.k != ancsNotificationParcelable.k ? false : this.l != ancsNotificationParcelable.l ? false : !this.c.equals(ancsNotificationParcelable.c) ? false : (this.d == null ? ancsNotificationParcelable.d != null : !this.d.equals(ancsNotificationParcelable.d)) ? false : !this.e.equals(ancsNotificationParcelable.e) ? false : !this.f.equals(ancsNotificationParcelable.f) ? false : !this.g.equals(ancsNotificationParcelable.g) ? false : (this.h == null ? ancsNotificationParcelable.h != null : !this.h.equals(ancsNotificationParcelable.h)) ? false : this.m != null ? this.m.equals(ancsNotificationParcelable.m) : ancsNotificationParcelable.m == null;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.h != null ? this.h.hashCode() : 0) + (((((((((this.d != null ? this.d.hashCode() : 0) + (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31)) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31;
        if (this.m != null) {
            i = this.m.hashCode();
        }
        return hashCode + i;
    }

    public String i() {
        return this.g;
    }

    public String j() {
        return this.h == null ? this.c : this.h;
    }

    public byte l() {
        return this.i;
    }

    public byte m() {
        return this.j;
    }

    public byte n() {
        return this.k;
    }

    public byte o() {
        return this.l;
    }

    public String p() {
        return this.m;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        byte b = this.i;
        byte b2 = this.j;
        byte b3 = this.k;
        byte b4 = this.l;
        String str7 = this.m;
        return new StringBuilder(((((((String.valueOf(str).length() + 234) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("AncsNotificationParcelable{versionCode=").append(i).append(", id=").append(i2).append(", appId='").append(str).append("', dateTime='").append(str2).append("', notificationText='").append(str3).append("', title='").append(str4).append("', subtitle='").append(str5).append("', displayName='").append(str6).append("', eventId=").append(b).append(", eventFlags=").append(b2).append(", categoryId=").append(b3).append(", categoryCount=").append(b4).append(", packageName='").append(str7).append("'}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, a());
        gwb.a(parcel, 3, b(), false);
        gwb.a(parcel, 4, c(), false);
        gwb.a(parcel, 5, g(), false);
        gwb.a(parcel, 6, h(), false);
        gwb.a(parcel, 7, i(), false);
        gwb.a(parcel, 8, j(), false);
        gwb.a(parcel, 9, l());
        gwb.a(parcel, 10, m());
        gwb.a(parcel, 11, n());
        gwb.a(parcel, 12, o());
        gwb.a(parcel, 13, p(), false);
        gwb.v(parcel, c);
    }
}
