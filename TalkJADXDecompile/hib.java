import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public interface hib extends IInterface {
    void a(Status status, PredictedNetworkQuality predictedNetworkQuality);
}
