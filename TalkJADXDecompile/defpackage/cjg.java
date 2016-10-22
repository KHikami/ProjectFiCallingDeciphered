package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: cjg */
final class cjg implements jej {
    final /* synthetic */ cjf a;

    cjg(cjf cjf) {
        this.a = cjf;
    }

    public void a(int i, Intent intent) {
        if (i == -1) {
            this.a.a.a(gwb.lx, chs.a(this.a.context, Uri.fromFile(new File(this.a.getContext().getExternalCacheDir(), ccy.a(1))), true));
            return;
        }
        ((cnh) this.a.binder.a(cnh.class)).a(2340);
    }
}
