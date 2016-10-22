package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bqd;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final List b;

    static {
        CREATOR = new bqd();
    }

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        this.b = (List) buf.A((Object) list);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.c(parcel, 2, this.b, false);
        buf.v(parcel, c);
    }
}
