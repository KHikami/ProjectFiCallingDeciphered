package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import ckm;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class OverflowMenuItem implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final int b;
    final String c;
    final Intent d;

    static {
        CREATOR = new ckm();
    }

    public OverflowMenuItem(int i, int i2, String str, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.d(parcel, 2, this.b);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, i, false);
        buf.v(parcel, c);
    }
}
