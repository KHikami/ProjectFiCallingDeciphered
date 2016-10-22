import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
final class axt extends Handler {
    private /* synthetic */ axs a;

    axt(axs axs) {
        this.a = axs;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1234:
                synchronized (this) {
                    Object obj;
                    this.a.a = this.a.b;
                    String str = "orientation: ";
                    if (this.a.a != 2) {
                        if (this.a.a == 1) {
                            obj = "vertical";
                        } else {
                            obj = "unknown";
                        }
                        break;
                    }
                    obj = "horizontal";
                    String valueOf = String.valueOf(obj);
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                    if (this.a.c != null) {
                        this.a.c.a(this.a.a);
                    }
                    break;
                }
            default:
        }
    }
}
