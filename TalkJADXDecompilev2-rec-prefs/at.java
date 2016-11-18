package p000;

import android.os.Handler.Callback;
import android.os.Message;

final class at implements Callback {
    final /* synthetic */ as f2310a;

    at(as asVar) {
        this.f2310a = asVar;
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                as asVar = this.f2310a;
                oto oto = (oto) message.obj;
                synchronized (asVar.f2252a) {
                    if (asVar.f2253b == oto || asVar.f2254c == oto) {
                        asVar.m3898a(oto, 2);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
