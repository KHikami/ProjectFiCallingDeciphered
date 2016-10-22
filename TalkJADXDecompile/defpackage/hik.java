package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import com.google.android.gms.herrevad.PredictionApi.ActiveNetworkQualityResult;

/* renamed from: hik */
class hik<T> implements gup, ActiveNetworkQualityResult {
    public final T a;
    private final Status b;

    public hik(Status status, T t) {
        this.b = status;
        this.a = t;
    }

    public Status k() {
        return this.b;
    }

    public hik(Status status, PredictedNetworkQuality predictedNetworkQuality) {
        this(status, (Object) predictedNetworkQuality);
    }

    public PredictedNetworkQuality a() {
        return (PredictedNetworkQuality) this.a;
    }
}
