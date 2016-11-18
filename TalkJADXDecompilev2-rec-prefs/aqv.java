package p000;

import android.os.Handler.Callback;
import android.os.Message;

final class aqv implements Callback {
    aqv() {
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((aqr) message.obj).mo348e();
        return true;
    }
}
