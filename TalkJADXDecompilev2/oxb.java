package defpackage;

import android.util.Log;
import org.chromium.net.impl.CronetUploadDataStream;

public final class oxb implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public oxb(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    public void run() {
        try {
            this.a.a.close();
        } catch (Throwable e) {
            Log.e("CronetUploadDataStream", "Exception thrown when closing", e);
        }
    }
}
