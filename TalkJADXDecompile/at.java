import android.os.Handler.Callback;
import android.os.Message;

final class at implements Callback {
    final /* synthetic */ as a;

    at(as asVar) {
        this.a = asVar;
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case wi.w /*0*/:
                as asVar = this.a;
                oto oto = (oto) message.obj;
                synchronized (asVar.a) {
                    if (asVar.b == oto || asVar.c == oto) {
                        asVar.a(oto, 2);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
