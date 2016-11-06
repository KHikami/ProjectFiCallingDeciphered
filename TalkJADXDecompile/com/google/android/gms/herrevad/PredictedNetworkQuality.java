package com.google.android.gms.herrevad;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hax;

public class PredictedNetworkQuality extends AbstractSafeParcelable {
    public static final Creator<PredictedNetworkQuality> CREATOR;
    final int a;
    public int b; //network type
    public int c;//predicted Latency (micro seconds0
    public long d; //predicted down throughput (bps)
    public long e;// predicted up throughput (bps)

    static {
        CREATOR = new hax();
    }

    public PredictedNetworkQuality() {
        this.a = 1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }

    public PredictedNetworkQuality(int i, int i2, int i3, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName()).append("[\n");
        stringBuilder.append("networkType: ").append(this.b).append("\n");
        stringBuilder.append("predictedLatencyMicros: ").append(this.c).append("\n");
        stringBuilder.append("predictedDownThroughputBps: ").append(this.d).append("\n");
        stringBuilder.append("predictedUpThroughputBps: ").append(this.e).append("\n");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.d(parcel, 3, this.c);
        gwb.a(parcel, 4, this.d);
        gwb.a(parcel, 5, this.e);
        gwb.v(parcel, c);
    }
}
