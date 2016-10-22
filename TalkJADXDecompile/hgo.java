import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;

final class hgo extends Handler {
    final /* synthetic */ hgm a;

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.w /*0*/:
                gum gum = (gum) message.obj;
                synchronized (this.a.c) {
                    if (gum != null) {
                        if (gum instanceof hgj) {
                            this.a.b.a(((hgj) gum).c());
                        } else {
                            this.a.b.a(gum);
                        }
                        break;
                    }
                    this.a.b.a(new Status(13, "Transform returned null"));
                    break;
                }
            case wi.j /*1*/:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String str = "TransformedResultImpl";
                String str2 = "Runtime exception on the transformation worker thread: ";
                String valueOf = String.valueOf(runtimeException.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw runtimeException;
            default:
                Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
        }
    }
}
