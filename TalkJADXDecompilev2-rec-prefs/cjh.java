package p000;

import android.content.Intent;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

final class cjh implements jej {
    final /* synthetic */ cjf f5424a;

    cjh(cjf cjf) {
        this.f5424a = cjf;
    }

    public void mo747a(int i, Intent intent) {
        int i2 = 1;
        if (i != -1 || intent == null) {
            ((cnh) this.f5424a.binder.m25443a(cnh.class)).m7967a(2340);
            return;
        }
        int i3;
        bxy bxy = (bxy) intent.getParcelableExtra("result_media_attachment");
        cdg cdg = (cdg) jyn.m25426a(this.f5424a.context, cdg.class);
        List arrayList = new ArrayList(1);
        arrayList.add(bxy);
        cdg.mo840a(arrayList);
        String stringExtra = intent.getStringExtra("photo_url");
        if (gwb.m1906a(this.f5424a.context, "babel_save_camera_images_to_hangouts", true)) {
            new cji(this, stringExtra, bxy).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        int i4 = bxy.c == bxo.VIDEO ? 1 : 0;
        cnh cnh = (cnh) this.f5424a.binder.m25443a(cnh.class);
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
