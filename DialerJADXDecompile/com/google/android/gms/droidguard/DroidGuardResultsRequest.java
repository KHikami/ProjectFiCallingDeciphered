package com.google.android.gms.droidguard;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import cjz;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DroidGuardResultsRequest implements SafeParcelable {
    public static final Creator CREATOR;
    public final int a;
    public Bundle b;

    static {
        CREATOR = new cjz();
    }

    public DroidGuardResultsRequest(int i, Bundle bundle) {
        this.b = new Bundle();
        this.a = i;
        this.b = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.v(parcel, c);
    }
}
