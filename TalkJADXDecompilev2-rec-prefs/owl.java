package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import org.chromium.net.X509Util;

public final class owl extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.security.STORAGE_CHANGED")) {
            try {
                X509Util.c();
            } catch (Throwable e) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e);
            } catch (Throwable e2) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e2);
            } catch (Throwable e22) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e22);
            }
        }
    }
}
