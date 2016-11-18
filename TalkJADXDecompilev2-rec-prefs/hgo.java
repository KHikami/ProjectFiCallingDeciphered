package p000;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;

final class hgo extends Handler {
    final /* synthetic */ hgm f16924a;

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                gum gum = (gum) message.obj;
                synchronized (this.f16924a.f16915c) {
                    if (gum == null) {
                        this.f16924a.f16914b.m19750a(new Status(13, "Transform returned null"));
                    } else if (gum instanceof hgj) {
                        this.f16924a.f16914b.m19750a(((hgj) gum).m19738c());
                    } else {
                        this.f16924a.f16914b.m19751a(gum);
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String str = "TransformedResultImpl";
                String str2 = "Runtime exception on the transformation worker thread: ";
                String valueOf = String.valueOf(runtimeException.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw runtimeException;
            default:
                Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
                return;
        }
    }
}
