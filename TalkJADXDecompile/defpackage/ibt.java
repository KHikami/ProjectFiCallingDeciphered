package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ibt */
public final class ibt extends heb {
    final /* synthetic */ hxq a;

    public ibt(hxq hxq, gui gui) {
        this.a = hxq;
        super(gui, (short) 0);
    }

    private void a(iaw iaw) {
        iaw.a((hec) this);
    }

    protected /* synthetic */ gup b(Status status) {
        return new hxy(DataHolder.b(status.e()));
    }
}
