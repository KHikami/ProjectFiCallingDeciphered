package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;

public final class juf extends HandlerThread implements Callback {
    private Handler a;

    public juf() {
        super("ImageLoader");
    }

    public synchronized void start() {
        super.start();
        this.a = new Handler(getLooper(), this);
    }

    public void run() {
        Process.setThreadPriority(10);
        super.run();
    }

    public void a(jtv jtv) {
        this.a.sendMessage(this.a.obtainMessage(0, jtv));
    }

    public boolean handleMessage(Message message) {
        jtv jtv = (jtv) message.obj;
        if (jtv.m() == 2 || jtv.m() == 4 || jtv.m() == 6) {
            jtv.c();
        }
        return true;
    }
}
