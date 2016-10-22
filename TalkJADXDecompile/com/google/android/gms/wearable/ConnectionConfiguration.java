package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import ibz;

public class ConnectionConfiguration extends AbstractSafeParcelable {
    public static final Creator<ConnectionConfiguration> CREATOR;
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final boolean f;
    private boolean g;
    private String h;
    private boolean i;
    private String j;

    static {
        CREATOR = new ibz();
    }

    public ConnectionConfiguration(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = str3;
        this.i = z3;
        this.j = str4;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return gwb.e(Integer.valueOf(this.a), Integer.valueOf(connectionConfiguration.a)) && gwb.e(this.b, connectionConfiguration.b) && gwb.e(this.c, connectionConfiguration.c) && gwb.e(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && gwb.e(Integer.valueOf(this.e), Integer.valueOf(connectionConfiguration.e)) && gwb.e(Boolean.valueOf(this.f), Boolean.valueOf(connectionConfiguration.f)) && gwb.e(Boolean.valueOf(this.i), Boolean.valueOf(connectionConfiguration.i));
    }

    public String f() {
        return this.h;
    }

    public boolean g() {
        return this.i;
    }

    public String h() {
        return this.j;
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.i));
    }

    public boolean i() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionConfiguration[ ");
        String str = "mName=";
        String valueOf = String.valueOf(this.b);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        str = ", mAddress=";
        valueOf = String.valueOf(this.c);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mType=" + this.d);
        stringBuilder.append(", mRole=" + this.e);
        stringBuilder.append(", mEnabled=" + this.f);
        stringBuilder.append(", mIsConnected=" + this.g);
        str = ", mPeerNodeId=";
        valueOf = String.valueOf(this.h);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mBtlePriority=" + this.i);
        str = ", mNodeId=";
        valueOf = String.valueOf(this.j);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, b(), false);
        gwb.d(parcel, 4, c());
        gwb.d(parcel, 5, d());
        gwb.a(parcel, 6, i());
        gwb.a(parcel, 7, e());
        gwb.a(parcel, 8, f(), false);
        gwb.a(parcel, 9, g());
        gwb.a(parcel, 10, h(), false);
        gwb.v(parcel, c);
    }
}
