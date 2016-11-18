package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;

public final class juf extends HandlerThread implements Callback {
    private Handler f21059a;

    public juf() {
        super("ImageLoader");
    }

    public synchronized void start() {
        super.start();
        this.f21059a = new Handler(getLooper(), this);
    }

    public void run() {
        Process.setThreadPriority(10);
        super.run();
    }

    public void m25212a(jtv jtv) {
        this.f21059a.sendMessage(this.f21059a.obtainMessage(0, jtv));
    }

    public boolean handleMessage(Message message) {
        jtv jtv = (jtv) message.obj;
        if (jtv.m24247m() == 2 || jtv.m24247m() == 4 || jtv.m24247m() == 6) {
            jtv.mo3517c();
        }
        return true;
    }
}
