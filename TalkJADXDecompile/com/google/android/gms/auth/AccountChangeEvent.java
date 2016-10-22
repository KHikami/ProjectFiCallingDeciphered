package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gtd;
import gwb;
import wi;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEvent> CREATOR;
    final int a;
    final long b;
    final String c;
    final int d;
    final int e;
    final String f;

    static {
        CREATOR = new gtd();
    }

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        this.c = (String) gwb.L((Object) str);
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.a == accountChangeEvent.a && this.b == accountChangeEvent.b && gwb.e(this.c, accountChangeEvent.c) && this.d == accountChangeEvent.d && this.e == accountChangeEvent.e && gwb.e(this.f, accountChangeEvent.f);
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.d) {
            case wi.j /*1*/:
                str = "ADDED";
                break;
            case wi.l /*2*/:
                str = "REMOVED";
                break;
            case wi.z /*3*/:
                str = "RENAMED_FROM";
                break;
            case wi.h /*4*/:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.c;
        String str3 = this.f;
        return new StringBuilder(((String.valueOf(str2).length() + 91) + String.valueOf(str).length()) + String.valueOf(str3).length()).append("AccountChangeEvent {accountName = ").append(str2).append(", changeType = ").append(str).append(", changeData = ").append(str3).append(", eventIndex = ").append(this.e).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, false);
        gwb.d(parcel, 4, this.d);
        gwb.d(parcel, 5, this.e);
        gwb.a(parcel, 6, this.f, false);
        gwb.v(parcel, c);
    }
}
