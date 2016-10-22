package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import gxm;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable {
    public static final gxm CREATOR;
    final int a;
    public final String b;
    public final int c;

    static {
        CREATOR = new gxm();
    }

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.d(parcel, 3, this.c);
        gwb.v(parcel, c);
    }
}
