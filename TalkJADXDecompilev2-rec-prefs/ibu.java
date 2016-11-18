package p000;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class ibu extends heb {
    final /* synthetic */ Uri f17536a;
    final /* synthetic */ int f17537b;
    final /* synthetic */ hxq f17538c;

    public ibu(hxq hxq, gui gui, Uri uri, int i) {
        this.f17538c = hxq;
        this.f17536a = uri;
        this.f17537b = i;
        super(gui, (short) 0);
    }

    private void m21542a(iaw iaw) {
        iaw.m21497a(this, this.f17536a, this.f17537b);
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return new hxy(DataHolder.m9672b(status.m9664e()));
    }
}
