package com.google.android.gms.people.internal.autocomplete;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import huy;

public class ParcelableLoadContactGroupFieldsOptions extends AbstractSafeParcelable {
    public static final Creator<ParcelableLoadContactGroupFieldsOptions> CREATOR;
    final int a;
    final String b;

    static {
        CREATOR = new huy();
    }

    public ParcelableLoadContactGroupFieldsOptions(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.v(parcel, c);
    }
}
