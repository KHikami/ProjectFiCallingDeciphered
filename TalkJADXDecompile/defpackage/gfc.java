package defpackage;

import android.os.AsyncTask;
import java.net.DatagramSocket;
import java.util.concurrent.Executor;

/* renamed from: gfc */
class gfc {
    gfc() {
    }

    DatagramSocket a() {
        return new DatagramSocket();
    }

    Executor b() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }
}
