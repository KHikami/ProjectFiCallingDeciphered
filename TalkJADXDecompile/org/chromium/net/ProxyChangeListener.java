package org.chromium.net;

import android.content.Context;
import android.content.IntentFilter;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import owi;
import owj;

@JNINamespace
public class ProxyChangeListener {
    private static boolean a;
    private long b;
    private Context c;
    private owj d;

    @NativeClassQualifiedName
    private native void nativeProxySettingsChanged(long j);

    @NativeClassQualifiedName
    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    static {
        a = true;
    }

    private ProxyChangeListener(Context context) {
        this.c = context;
    }

    @CalledByNative
    public static ProxyChangeListener create(Context context) {
        return new ProxyChangeListener(context);
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    @CalledByNative
    public void start(long j) {
        this.b = j;
        if (this.d == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            this.d = new owj(this);
            this.c.getApplicationContext().registerReceiver(this.d, intentFilter);
        }
    }

    @CalledByNative
    public void stop() {
        this.b = 0;
        if (this.d != null) {
            this.c.unregisterReceiver(this.d);
            this.d = null;
        }
    }

    public void a(owi owi) {
        if (!a || this.b == 0) {
            return;
        }
        if (owi != null) {
            nativeProxySettingsChangedTo(this.b, owi.a, owi.b, owi.c, owi.d);
        } else {
            nativeProxySettingsChanged(this.b);
        }
    }
}
