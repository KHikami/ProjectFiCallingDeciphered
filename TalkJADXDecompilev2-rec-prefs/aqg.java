package p000;

import android.os.Handler.Callback;
import android.os.Message;

final class aqg implements Callback {
    aqg() {
    }

    public boolean handleMessage(Message message) {
        aqe aqe = (aqe) message.obj;
        switch (message.what) {
            case 1:
                aqe.f2109b.mo439b();
                if (!aqe.f2117j) {
                    if (!aqe.f2108a.isEmpty()) {
                        if (!aqe.f2115h) {
                            aqe.f2116i = new aqk(aqe.f2113f, aqe.f2112e);
                            aqe.f2115h = true;
                            aqe.f2116i.m3740f();
                            aqe.f2110c.mo337a(aqe.f2111d, aqe.f2116i);
                            for (azm azm : aqe.f2108a) {
                                if (!aqe.m3728c(azm)) {
                                    aqe.f2116i.m3740f();
                                    azm.mo420a(aqe.f2116i, aqe.f2114g);
                                }
                            }
                            aqe.f2116i.m3741g();
                            aqe.m3725a(false);
                            break;
                        }
                        throw new IllegalStateException("Already have resource");
                    }
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                aqe.f2113f.mo348e();
                aqe.m3725a(false);
                break;
            case 2:
                aqe.m3720a();
                break;
            case 3:
                aqe.f2109b.mo439b();
                if (aqe.f2117j) {
                    aqe.f2110c.mo338a(aqe, aqe.f2111d);
                    aqe.m3725a(false);
                    break;
                }
                throw new IllegalStateException("Not cancelled");
            default:
                throw new IllegalStateException("Unrecognized message: " + message.what);
        }
        return true;
    }
}
