package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

final class cnp implements jej {
    final /* synthetic */ cnm a;

    cnp(cnm cnm) {
        this.a = cnm;
    }

    public void a(int i, Intent intent) {
        int i2 = 1;
        if (i != -1 || intent == null) {
            if (this.a.b != null && this.a.b.exists()) {
                this.a.b.delete();
                this.a.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(this.a.b)));
            }
            ((cnh) this.a.binder.a(cnh.class)).a(2340);
            return;
        }
        int i3;
        bxy bxy = (bxy) intent.getParcelableExtra("result_media_attachment");
        cdg cdg = (cdg) jyn.a(this.a.context, cdg.class);
        List arrayList = new ArrayList(1);
        arrayList.add(bxy);
        cdg.a(arrayList);
        int i4 = bxy.c == bxo.VIDEO ? 1 : 0;
        cnh cnh = (cnh) this.a.binder.a(cnh.class);
        if (i4 != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i4 == 0) {
            i2 = 0;
        }
        cnh.a(2339, i3, i2, Integer.valueOf(bxy.i));
    }
}
