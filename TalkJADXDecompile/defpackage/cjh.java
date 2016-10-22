package defpackage;

import android.content.Intent;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cjh */
final class cjh implements jej {
    final /* synthetic */ cjf a;

    cjh(cjf cjf) {
        this.a = cjf;
    }

    public void a(int i, Intent intent) {
        int i2 = 1;
        if (i != -1 || intent == null) {
            ((cnh) this.a.binder.a(cnh.class)).a(2340);
            return;
        }
        int i3;
        bxy bxy = (bxy) intent.getParcelableExtra("result_media_attachment");
        cdg cdg = (cdg) jyn.a(this.a.context, cdg.class);
        List arrayList = new ArrayList(1);
        arrayList.add(bxy);
        cdg.a(arrayList);
        String stringExtra = intent.getStringExtra("photo_url");
        if (gwb.a(this.a.context, "babel_save_camera_images_to_hangouts", true)) {
            new cji(this, stringExtra, bxy).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
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
