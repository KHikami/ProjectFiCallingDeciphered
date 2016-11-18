package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

final class cnn implements jej {
    final /* synthetic */ cnm a;

    cnn(cnm cnm) {
        this.a = cnm;
    }

    public void a(int i, Intent intent) {
        if (i == -1) {
            Uri fromFile = Uri.fromFile(this.a.b);
            if (gwb.a(this.a.context, "babel_save_camera_images_to_hangouts", true)) {
                new cno(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            this.a.a.a(gwb.ly, chs.a(this.a.context, fromFile, ba.a(fromFile.toString(), "video/*"), true));
            return;
        }
        ((cnh) this.a.binder.a(cnh.class)).a(2340);
    }
}
