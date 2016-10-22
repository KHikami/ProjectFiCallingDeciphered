package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hzp;
import java.util.List;

public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Creator<GetConnectedNodesResponse> CREATOR;
    public final int a;
    public final int b;
    public final List<NodeParcelable> c;

    static {
        CREATOR = new hzp();
    }

    public GetConnectedNodesResponse(int i, int i2, List<NodeParcelable> list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.c(parcel, 3, this.c, false);
        gwb.v(parcel, c);
    }
}
