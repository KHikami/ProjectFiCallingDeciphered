package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import com.google.android.gms.herrevad.PredictionApi.ActiveNetworkQualityResult;

class hik<T> implements gup, ActiveNetworkQualityResult {
    public final T f16990a;
    private final Status f16991b;

    public hik(Status status, T t) {
        this.f16991b = status;
        this.f16990a = t;
    }

    public Status mo1279k() {
        return this.f16991b;
    }

    public hik(Status status, PredictedNetworkQuality predictedNetworkQuality) {
        this(status, (Object) predictedNetworkQuality);
    }

    public PredictedNetworkQuality m19846a() {
        return (PredictedNetworkQuality) this.f16990a;
    }
}
