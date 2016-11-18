package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

public final class ibs extends heb {
    final /* synthetic */ PutDataRequest f17533a;
    final /* synthetic */ hxq f17534b;

    public ibs(hxq hxq, gui gui, PutDataRequest putDataRequest) {
        this.f17534b = hxq;
        this.f17533a = putDataRequest;
        super(gui, (short) 0);
    }

    private void m21536a(iaw iaw) {
        iaw.m21498a(this, this.f17533a);
    }

    public /* synthetic */ gup mo2424b(Status status) {
        return new hxr(status, null);
    }
}
