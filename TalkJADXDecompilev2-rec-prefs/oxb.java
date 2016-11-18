package p000;

import android.util.Log;
import org.chromium.net.impl.CronetUploadDataStream;

public final class oxb implements Runnable {
    final /* synthetic */ CronetUploadDataStream f34478a;

    public oxb(CronetUploadDataStream cronetUploadDataStream) {
        this.f34478a = cronetUploadDataStream;
    }

    public void run() {
        try {
            this.f34478a.a.close();
        } catch (Throwable e) {
            Log.e("CronetUploadDataStream", "Exception thrown when closing", e);
        }
    }
}
