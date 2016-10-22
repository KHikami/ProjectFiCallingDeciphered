package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hak;

public class TogglingData extends AbstractSafeParcelable {
    public static final Creator<TogglingData> CREATOR;
    final int a;
    String b;
    String c;
    String d;

    static {
        CREATOR = new hak();
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

    public TogglingData a(String str) {
        this.d = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 4, this.d, false);
        gwb.v(parcel, c);
    }
}
