package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;

final class cnn implements jej {
    final /* synthetic */ cnm f5712a;

    cnn(cnm cnm) {
        this.f5712a = cnm;
    }

    public void mo747a(int i, Intent intent) {
        if (i == -1) {
            Uri fromFile = Uri.fromFile(this.f5712a.f5709b);
            if (gwb.m1906a(this.f5712a.context, "babel_save_camera_images_to_hangouts", true)) {
                new cno(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            this.f5712a.f5708a.m24035a(gwb.ly, chs.m7667a(this.f5712a.context, fromFile, ba.m4539a(fromFile.toString(), "video/*"), true));
            return;
        }
        ((cnh) this.f5712a.binder.m25443a(cnh.class)).m7967a(2340);
    }
}
