package p000;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

final class cnp implements jej {
    final /* synthetic */ cnm f5714a;

    cnp(cnm cnm) {
        this.f5714a = cnm;
    }

    public void mo747a(int i, Intent intent) {
        int i2 = 1;
        if (i != -1 || intent == null) {
            if (this.f5714a.f5709b != null && this.f5714a.f5709b.exists()) {
                this.f5714a.f5709b.delete();
                this.f5714a.getContext().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(this.f5714a.f5709b)));
            }
            ((cnh) this.f5714a.binder.m25443a(cnh.class)).m7967a(2340);
            return;
        }
        int i3;
        bxy bxy = (bxy) intent.getParcelableExtra("result_media_attachment");
        cdg cdg = (cdg) jyn.m25426a(this.f5714a.context, cdg.class);
        List arrayList = new ArrayList(1);
        arrayList.add(bxy);
        cdg.mo840a(arrayList);
        int i4 = bxy.c == bxo.VIDEO ? 1 : 0;
        cnh cnh = (cnh) this.f5714a.binder.m25443a(cnh.class);
        if (i4 != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (i4 == 0) {
            i2 = 0;
        }
        cnh.m7969a(2339, i3, i2, Integer.valueOf(bxy.f4760i));
    }
}
