package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class hhc extends gyo<hgx> {
    private static hhc a;

    protected hhc() {
        super("com.google.android.gms.common.net.SocketFactoryCreatorImpl");
    }

    public static hhc a() {
        if (a == null) {
            a = new hhc();
        }
        return a;
    }

    public SSLSocketFactory a(Context context, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, String str) {
        Throwable e;
        try {
            return (SSLSocketFactory) gym.a(((hgx) a(context)).a(gym.a((Object) context), gym.a(null), gym.a(null), str));
        } catch (RemoteException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (gyp e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public SSLSocketFactory a(Context context, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, boolean z) {
        Throwable e;
        try {
            return (SSLSocketFactory) gym.a(((hgx) a(context)).a(gym.a((Object) context), gym.a(null), gym.a((Object) trustManagerArr), z));
        } catch (RemoteException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (gyp e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    protected /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof hgx)) ? new hgz(iBinder) : (hgx) queryLocalInterface;
    }
}
