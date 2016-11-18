package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

public final class ibs extends heb {
    final /* synthetic */ PutDataRequest a;
    final /* synthetic */ hxq b;

    public ibs(hxq hxq, gui gui, PutDataRequest putDataRequest) {
        this.b = hxq;
        this.a = putDataRequest;
        super(gui, (short) 0);
    }

    private void a(iaw iaw) {
        iaw.a(this, this.a);
    }

    public /* synthetic */ gup b(Status status) {
        return new hxr(status, null);
    }
}
