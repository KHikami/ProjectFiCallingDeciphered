package com.google.android.gms.people.internal.autocomplete;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hux;

public class ParcelableLoadAutocompleteResultsOptions extends AbstractSafeParcelable {
    public static final Creator<ParcelableLoadAutocompleteResultsOptions> CREATOR;
    final int a;
    final int b;
    final long c;
    final String d;

    static {
        CREATOR = new hux();
    }

    public ParcelableLoadAutocompleteResultsOptions(int i, int i2, long j, String str) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.a(parcel, 3, this.c);
        gwb.a(parcel, 4, this.d, false);
        gwb.v(parcel, c);
    }
}
