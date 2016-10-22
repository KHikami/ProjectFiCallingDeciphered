package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import huc;

public final class ParcelableListOptions extends AbstractSafeParcelable {
    public static final Creator<ParcelableListOptions> CREATOR;
    final boolean a;
    final boolean b;
    final String c;
    final boolean d;
    final Bundle e;
    private final int f;

    static {
        CREATOR = new huc();
    }

    public ParcelableListOptions(int i, boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.f = i;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.e = bundle;
    }

    public int a() {
        return this.f;
    }

    public String toString() {
        return gwb.K((Object) this).a("useOfflineDatabase", Boolean.valueOf(this.a)).a("useWebData", Boolean.valueOf(this.b)).a("useCP2", Boolean.valueOf(this.d)).a("endpoint", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 4, this.d);
        gwb.a(parcel, 5, this.e, false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
