package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import haj;

public final class OverflowMenuItem extends AbstractSafeParcelable {
    public static final Creator<OverflowMenuItem> CREATOR;
    final int a;
    final int b;
    final String c;
    final Intent d;

    static {
        CREATOR = new haj();
    }

    public OverflowMenuItem(int i, int i2, String str, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = intent;
    }

    public OverflowMenuItem(int i, String str, Intent intent) {
        this(1, i, str, intent);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 4, this.d, i, false);
        gwb.v(parcel, c);
    }
}
