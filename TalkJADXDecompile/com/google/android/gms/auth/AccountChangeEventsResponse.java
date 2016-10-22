package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gtf;
import gwb;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsResponse> CREATOR;
    final int a;
    final List<AccountChangeEvent> b;

    static {
        CREATOR = new gtf();
    }

    public AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.a = i;
        this.b = (List) gwb.L((Object) list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.c(parcel, 2, this.b, false);
        gwb.v(parcel, c);
    }
}
