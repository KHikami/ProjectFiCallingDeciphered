package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bqb;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import rl;
import rq;

public class AccountChangeEvent implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final long b;
    final String c;
    final int d;
    final int e;
    final String f;

    static {
        CREATOR = new bqb();
    }

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        this.c = (String) buf.A((Object) str);
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.a == accountChangeEvent.a && this.b == accountChangeEvent.b && buf.c(this.c, accountChangeEvent.c) && this.d == accountChangeEvent.d && this.e == accountChangeEvent.e && buf.c(this.f, accountChangeEvent.f);
    }

    public int hashCode() {
        return buf.a(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.d) {
            case rq.b /*1*/:
                str = "ADDED";
                break;
            case rq.c /*2*/:
                str = "REMOVED";
                break;
            case rl.e /*3*/:
                str = "RENAMED_FROM";
                break;
            case rl.f /*4*/:
                str = "RENAMED_TO";
                break;
        }
        return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b);
        buf.a(parcel, 3, this.c, false);
        buf.d(parcel, 4, this.d);
        buf.d(parcel, 5, this.e);
        buf.a(parcel, 6, this.f, false);
        buf.v(parcel, c);
    }
}
