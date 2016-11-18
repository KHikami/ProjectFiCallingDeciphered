package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class iaf<T> {
    private final Map<T, iay<T>> a = new HashMap();

    iaf() {
    }

    public void a(IBinder iBinder) {
        synchronized (this.a) {
            iac a = iad.a(iBinder);
            hzw iat = new iat();
            for (Entry entry : this.a.entrySet()) {
                iay iay = (iay) entry.getValue();
                try {
                    a.a(iat, new AddListenerRequest(iay));
                    if (Log.isLoggable("WearableClient", 2)) {
                        String valueOf = String.valueOf(entry.getKey());
                        String valueOf2 = String.valueOf(iay);
                        new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("onPostInitHandler: added: ").append(valueOf).append("/").append(valueOf2);
                    }
                } catch (RemoteException e) {
                    String valueOf3 = String.valueOf(entry.getKey());
                    String valueOf4 = String.valueOf(iay);
                    new StringBuilder((String.valueOf(valueOf3).length() + 32) + String.valueOf(valueOf4).length()).append("onPostInitHandler: Didn't add: ").append(valueOf3).append("/").append(valueOf4);
                }
            }
        }
    }
}
