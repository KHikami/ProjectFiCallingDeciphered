package p000;

import android.os.Handler.Callback;
import android.os.Message;

final class axv implements Callback {
    final /* synthetic */ axs f2522a;

    axv(axs axs) {
        this.f2522a = axs;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f2522a.m4301a((axt) message.obj);
            return true;
        }
        if (message.what == 2) {
            this.f2522a.f2502a.m2974a((axt) message.obj);
        }
        return false;
    }
}
