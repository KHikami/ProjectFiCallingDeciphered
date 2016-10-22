package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import ckn;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TogglingData implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    String b;
    String c;
    String d;

    static {
        CREATOR = new ckn();
    }

    private TogglingData() {
        this.a = 1;
    }

    public TogglingData(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, false);
        buf.v(parcel, c);
    }
}
