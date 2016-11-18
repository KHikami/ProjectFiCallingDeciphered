package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import java.util.List;

public interface hie extends IInterface {
    void a(Status status, List<PredictedNetworkQuality> list);
}
