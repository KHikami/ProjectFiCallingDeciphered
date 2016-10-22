import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: PG */
public final class bbh {
    private static Handler b;
    final Handler a;

    static {
        bbh bbh = new bbh();
    }

    private bbh() {
        this.a = new bbi(this);
        HandlerThread handlerThread = new HandlerThread("ContactsAsyncWorker");
        handlerThread.start();
        b = new bbl(this, handlerThread.getLooper());
    }

    public static final void a(int i, Context context, Uri uri, bbj bbj, Object obj) {
        if (uri == null) {
            bdf.f("startObjectPhotoAsync", "Uri is missing");
            return;
        }
        bbk bbk = new bbk();
        bbk.e = obj;
        bbk.a = context;
        bbk.b = uri;
        bbk.f = bbj;
        Message obtainMessage = b.obtainMessage(0);
        obtainMessage.arg1 = 1;
        obtainMessage.obj = bbk;
        String valueOf = String.valueOf(bbk.b);
        bdf.a("startObjectPhotoAsync", new StringBuilder(String.valueOf(valueOf).length() + 56).append("Begin loading image: ").append(valueOf).append(", displaying default image for now.").toString());
        b.sendMessage(obtainMessage);
    }
}
