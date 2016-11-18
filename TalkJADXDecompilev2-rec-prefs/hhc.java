package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class hhc extends gyo<hgx> {
    private static hhc f16960a;

    protected hhc() {
        super("com.google.android.gms.common.net.SocketFactoryCreatorImpl");
    }

    public static hhc m19787a() {
        if (f16960a == null) {
            f16960a = new hhc();
        }
        return f16960a;
    }

    public SSLSocketFactory m19789a(Context context, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, String str) {
        Throwable e;
        try {
            return (SSLSocketFactory) gym.m18962a(((hgx) m18964a(context)).mo2539a(gym.m18961a((Object) context), gym.m18961a(null), gym.m18961a(null), str));
        } catch (RemoteException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (gyp e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public SSLSocketFactory m19790a(Context context, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, boolean z) {
        Throwable e;
        try {
            return (SSLSocketFactory) gym.m18962a(((hgx) m18964a(context)).mo2540a(gym.m18961a((Object) context), gym.m18961a(null), gym.m18961a((Object) trustManagerArr), z));
        } catch (RemoteException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (gyp e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    protected /* synthetic */ Object mo2541a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hgx)) ? new hgz(iBinder) : (hgx) queryLocalInterface;
    }
}
