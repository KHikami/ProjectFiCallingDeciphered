package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ibu */
public final class ibu extends heb {
    final /* synthetic */ Uri a;
    final /* synthetic */ int b;
    final /* synthetic */ hxq c;

    public ibu(hxq hxq, gui gui, Uri uri, int i) {
        this.c = hxq;
        this.a = uri;
        this.b = i;
        super(gui, (short) 0);
    }

    private void a(iaw iaw) {
        iaw.a(this, this.a, this.b);
    }

    protected /* synthetic */ gup b(Status status) {
        return new hxy(DataHolder.b(status.e()));
    }
}
