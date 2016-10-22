package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import iap;
import java.util.List;

public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Creator<StorageInfoResponse> CREATOR;
    public final int a;
    public final int b;
    public final long c;
    public final List<PackageStorageInfo> d;

    static {
        CREATOR = new iap();
    }

    public StorageInfoResponse(int i, int i2, long j, List<PackageStorageInfo> list) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c);
        gwb.c(parcel, 4, this.d, false);
        gwb.v(parcel, c);
    }
}
