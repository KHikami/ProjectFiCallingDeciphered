import android.os.Handler.Callback;
import android.os.Message;

final class axv implements Callback {
    final /* synthetic */ axs a;

    axv(axs axs) {
        this.a = axs;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.a((axt) message.obj);
            return true;
        }
        if (message.what == 2) {
            this.a.a.a((axt) message.obj);
        }
        return false;
    }
}
