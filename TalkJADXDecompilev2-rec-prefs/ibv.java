package p000;

import android.net.Uri;
import com.google.android.gms.common.api.Status;

public final class ibv extends heb {
    final /* synthetic */ Uri f17539a;
    final /* synthetic */ int f17540b;
    final /* synthetic */ hxq f17541c;

    public ibv(hxq hxq, gui gui, Uri uri, int i) {
        this.f17541c = hxq;
        this.f17539a = uri;
        this.f17540b = i;
        super(gui, (short) 0);
    }

    private void m21545a(iaw iaw) {
        iaw.m21500b(this, this.f17539a, this.f17540b);
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return new hxt(status, 0);
    }
}
