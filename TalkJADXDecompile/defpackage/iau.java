package defpackage;

import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.List;
import java.util.concurrent.FutureTask;

/* renamed from: iau */
final class iau extends iaq<hxr> {
    private final List<FutureTask<Boolean>> a;

    iau(hec<hxr> hec_hxr, List<FutureTask<Boolean>> list) {
        super(hec_hxr);
        this.a = list;
    }

    public void a(PutDataResponse putDataResponse) {
        a(new hxr(gwb.B(putDataResponse.b), putDataResponse.c));
        if (putDataResponse.b != 0) {
            for (FutureTask cancel : this.a) {
                cancel.cancel(true);
            }
        }
    }
}
