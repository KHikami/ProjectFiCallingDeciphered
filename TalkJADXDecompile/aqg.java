import android.os.Handler.Callback;
import android.os.Message;

final class aqg implements Callback {
    aqg() {
    }

    public boolean handleMessage(Message message) {
        aqe aqe = (aqe) message.obj;
        switch (message.what) {
            case wi.j /*1*/:
                aqe.b.b();
                if (!aqe.j) {
                    if (!aqe.a.isEmpty()) {
                        if (!aqe.h) {
                            aqe.i = new aqk(aqe.f, aqe.e);
                            aqe.h = true;
                            aqe.i.f();
                            aqe.c.a(aqe.d, aqe.i);
                            for (azm azm : aqe.a) {
                                if (!aqe.c(azm)) {
                                    aqe.i.f();
                                    azm.a(aqe.i, aqe.g);
                                }
                            }
                            aqe.i.g();
                            aqe.a(false);
                            break;
                        }
                        throw new IllegalStateException("Already have resource");
                    }
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                aqe.f.e();
                aqe.a(false);
                break;
            case wi.l /*2*/:
                aqe.a();
                break;
            case wi.z /*3*/:
                aqe.b.b();
                if (aqe.j) {
                    aqe.c.a(aqe, aqe.d);
                    aqe.a(false);
                    break;
                }
                throw new IllegalStateException("Not cancelled");
            default:
                throw new IllegalStateException("Unrecognized message: " + message.what);
        }
        return true;
    }
}
