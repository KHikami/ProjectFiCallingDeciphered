package p000;

import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.List;
import java.util.concurrent.FutureTask;

final class iau extends iaq<hxr> {
    private final List<FutureTask<Boolean>> f17501a;

    iau(hec<hxr> hec_hxr, List<FutureTask<Boolean>> list) {
        super(hec_hxr);
        this.f17501a = list;
    }

    public void mo3077a(PutDataResponse putDataResponse) {
        m21488a(new hxr(gwb.m1370B(putDataResponse.f7986b), putDataResponse.f7987c));
        if (putDataResponse.f7986b != 0) {
            for (FutureTask cancel : this.f17501a) {
                cancel.cancel(true);
            }
        }
    }
}
