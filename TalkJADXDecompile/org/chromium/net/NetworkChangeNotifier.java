package org.chromium.net;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeClassQualifiedName;
import org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy;
import otu;
import ovx;
import owg;

@JNINamespace
public class NetworkChangeNotifier {
    public static NetworkChangeNotifier a;
    private final Context b;
    private final ArrayList<Long> c;
    private final otu<ConnectionTypeObserver> d;
    private NetworkChangeNotifierAutoDetect e;
    private int f;
    private double g;
    private int h;

    private static native double nativeGetMaxBandwidthForConnectionSubtype(int i);

    @NativeClassQualifiedName
    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    @NativeClassQualifiedName
    private native void nativeNotifyMaxBandwidthChanged(long j, double d);

    @NativeClassQualifiedName
    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    @NativeClassQualifiedName
    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    @NativeClassQualifiedName
    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    @NativeClassQualifiedName
    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    private NetworkChangeNotifier(Context context) {
        this.f = 0;
        this.g = Double.POSITIVE_INFINITY;
        this.h = this.f;
        this.b = context.getApplicationContext();
        this.c = new ArrayList();
        this.d = new otu();
    }

    @CalledByNative
    public static NetworkChangeNotifier init(Context context) {
        if (a == null) {
            a = new NetworkChangeNotifier(context);
        }
        return a;
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.f;
    }

    @CalledByNative
    public int getCurrentConnectionSubtype() {
        return this.e == null ? 0 : this.e.b(this.e.d());
    }

    @CalledByNative
    public double getCurrentMaxBandwidthInMbps() {
        return this.g;
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        return this.e == null ? -1 : this.e.f();
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        return this.e == null ? new long[0] : this.e.e();
    }

    public static double a(int i) {
        return nativeGetMaxBandwidthForConnectionSubtype(i);
    }

    @CalledByNative
    public void addNativeObserver(long j) {
        this.c.add(Long.valueOf(j));
    }

    @CalledByNative
    public void removeNativeObserver(long j) {
        this.c.remove(Long.valueOf(j));
    }

    public void a(boolean z, RegistrationPolicy registrationPolicy) {
        if (z) {
            if (this.e == null) {
                this.e = new NetworkChangeNotifierAutoDetect(new ovx(this), this.b, registrationPolicy);
                owg d = this.e.d();
                b(this.e.a(d));
                a(this.e.c(d));
            }
        } else if (this.e != null) {
            this.e.a();
            this.e = null;
        }
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z) {
        int i = 0;
        a(false);
        NetworkChangeNotifier networkChangeNotifier = a;
        if ((networkChangeNotifier.f != 6) != z) {
            double d;
            if (!z) {
                i = 6;
            }
            networkChangeNotifier.b(i);
            if (z) {
                d = Double.POSITIVE_INFINITY;
            } else {
                d = 0.0d;
            }
            networkChangeNotifier.a(d);
        }
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        a(false);
        a.a(j, i);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        a(false);
        a.a(j);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        a(false);
        a.b(j);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        a(false);
        a.a(jArr);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        a(false);
        a.a(i, j);
    }

    @CalledByNative
    public static void fakeMaxBandwidthChanged(double d) {
        a(false);
        a.b(d);
    }

    public void b(int i) {
        this.f = i;
        c(i);
    }

    public void a(double d) {
        if (d != this.g || this.f != this.h) {
            this.g = d;
            this.h = this.f;
            b(d);
        }
    }

    void c(int i) {
        a(i, getCurrentDefaultNetId());
    }

    private void a(int i, long j) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            nativeNotifyConnectionTypeChanged(((Long) arrayList.get(i2)).longValue(), i, j);
            i2 = i3;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    void b(double d) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyMaxBandwidthChanged(((Long) obj).longValue(), d);
        }
    }

    public void a(long j, int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            nativeNotifyOfNetworkConnect(((Long) arrayList.get(i2)).longValue(), j, i);
            i2 = i3;
        }
    }

    public void a(long j) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkSoonToDisconnect(((Long) obj).longValue(), j);
        }
    }

    public void b(long j) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkDisconnect(((Long) obj).longValue(), j);
        }
    }

    public void a(long[] jArr) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyPurgeActiveNetworkList(((Long) obj).longValue(), jArr);
        }
    }

    private static void a(boolean z) {
        a.a(false, new RegistrationPolicyApplicationStatus());
    }
}
