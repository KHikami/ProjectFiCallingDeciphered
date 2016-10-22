package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import iak;

public class PackageStorageInfo extends AbstractSafeParcelable {
    public static final Creator<PackageStorageInfo> CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final long d;

    static {
        CREATOR = new iak();
    }

    public PackageStorageInfo(int i, String str, String str2, long j) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 4, this.d);
        gwb.v(parcel, c);
    }
}
