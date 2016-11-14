import com.google.android.gms.herrevad.PredictedNetworkQuality;

final class geb {
    final gcm a; //Cell state
    final gfv b; //Wifi Cell
    final gec c; //Network Cell
    final PredictedNetworkQuality d;
    final boolean e;//last ping was successful
    final long f; //last recorded ping latency
    final boolean g; //didTimeout

    //created by gdz
    geb(gcm gcm, gfv gfv, gec gec, PredictedNetworkQuality predictedNetworkQuality, boolean z, long j, boolean z2) {
        this.a = gcm;
        this.b = gfv;
        this.c = gec;
        this.d = predictedNetworkQuality;
        this.e = z;
        this.f = j;
        this.g = z2;
    }
}
