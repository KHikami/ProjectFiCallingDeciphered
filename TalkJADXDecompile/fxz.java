import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class fxz {
    public static final boolean a;
    public static final fyc b;
    private static final Class[] c;
    private static final Integer d;

    static {
        c = new Class[]{Integer.TYPE, String.class};
        kae kae = glk.r;
        a = false;
        b = new fyc();
        d = Integer.valueOf(2);
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        try {
            Method method = Class.forName(connectivityManager.getClass().getName()).getMethod("getMobileDataEnabled", new Class[0]);
            method.setAccessible(true);
            return gwb.b((Boolean) method.invoke(connectivityManager, new Object[0]));
        } catch (Exception e) {
            return false;
        }
    }

    public static aid a(Context context, fzo fzo, aid aid, String str) {
        byte[] a = new aih(context, aid).a();
        if (a != null && a.length > 0) {
            return a(context, fzo, str, 1, a);
        }
        throw new IllegalArgumentException("Empty or zero length PDU data");
    }

    public static aid a(Context context, fzo fzo, String str) {
        if (str != null) {
            return a(context, fzo, str, 2, null);
        }
        throw new IllegalArgumentException("Empty URL to retrieve");
    }

    private static aid a(Context context, fzo fzo, String str, int i, byte[] bArr) {
        if (a) {
            new StringBuilder(String.valueOf(str).length() + 102).append("MmsSendReceiveManager.executeMmsRequest: requestUrl=").append(str).append(",requestMethod=").append(i).append(",requestData=").append(bArr != null ? bArr.length : -1);
        }
        if (fzo == null) {
            fzo = fzo.a(context, null);
        }
        if (fzo.b()) {
            Throwable th = null;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            for (fzp fzp : fzo.a()) {
                String str2;
                String valueOf;
                String valueOf2 = String.valueOf(fzp);
                glk.c("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 31).append("MmsSendReceiveManager: try APN ").append(valueOf2).toString(), new Object[0]);
                if (str == null) {
                    str2 = fzp.b;
                } else {
                    str2 = str;
                }
                if (a) {
                    valueOf = String.valueOf(fzp);
                    new StringBuilder((String.valueOf(str2).length() + 34) + String.valueOf(valueOf).length()).append("resolveDestination url: ").append(str2).append(" with apn ").append(valueOf);
                }
                if (fzp.b()) {
                    valueOf = fzp.d;
                } else {
                    valueOf = Uri.parse(str2).getHost();
                }
                int b = b(connectivityManager);
                glk.c("Babel_SMS", "ensureRouteToHost: addressTypes=" + b, new Object[0]);
                Throwable th2 = th;
                for (InetAddress inetAddress : a(r3, b)) {
                    String valueOf3 = String.valueOf(inetAddress);
                    glk.c("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 37).append("MmsSendReceiveManager: try inet addr ").append(valueOf3).toString(), new Object[0]);
                    try {
                        if (a(connectivityManager, inetAddress)) {
                            byte[] a = ajd.a(context, -1, str2, bArr, i, fzp.b(), fzp.d, fzp.f, inetAddress instanceof Inet6Address);
                            fzo.a(context, fzp);
                            if (a == null || a.length <= 0) {
                                return null;
                            }
                            aid a2;
                            try {
                                a2 = new ain(a).a();
                            } catch (Throwable th22) {
                                glk.d("Babel_SMS", "MmsSendReceiveManager: Parsing retrieved PDU failure", th22);
                                a2 = null;
                            }
                            if (i == 2) {
                                if (fyi.h() && a2 != null) {
                                    fyi.a(a, a2, context);
                                }
                            }
                            return a2;
                        }
                        valueOf3 = String.valueOf(inetAddress);
                        throw new IOException(new StringBuilder(String.valueOf(valueOf3).length() + 26).append("Cannot establish route to ").append(valueOf3).toString());
                    } catch (IOException e) {
                        th22 = e;
                        valueOf2 = String.valueOf(inetAddress);
                        String valueOf4 = String.valueOf(fzp);
                        glk.d("Babel_SMS", new StringBuilder((String.valueOf(valueOf2).length() + 76) + String.valueOf(valueOf4).length()).append("MmsSendReceiveManager: MMS HTTP request failed with exception for addr=").append(valueOf2).append(" apn=").append(valueOf4).toString(), th22);
                    }
                }
                th = th22;
            }
            if (th != null) {
                glk.d("Babel_SMS", "MMS temporary exception", th);
            }
            throw new fyf("MMS HTTP request failed");
        }
        throw new fxy(135, "No available APN to use");
    }

    public static void a(Context context) {
        glk.c("Babel_SMS", "MmsSendReceiveManager.extendMmsNetworkConnectivity", new Object[0]);
        if (d(context) == 0) {
            b.b();
        } else {
            b.b = false;
        }
    }

    public static fzo b(Context context) {
        fzo fzo;
        glk.c("Babel_SMS", "MmsSendReceiveManager.acquireMmsNetwork", new Object[0]);
        synchronized (b) {
            b.e = null;
            fyc fyc = b;
            fyc.a++;
            a(context);
            if (b.b) {
                fzo = b.d;
            } else {
                long b = glj.b();
                long a = gwb.a(gwb.H(), "babel_mms_network_acquire_timeout_in_millis", 180000);
                long a2 = gwb.a(gwb.H(), "babel_mms_network_acquire_wait_interval", 15000);
                long j = a;
                while (j > 0) {
                    try {
                        b.wait(Math.min(j, a2));
                    } catch (InterruptedException e) {
                        glk.d("Babel_SMS", "MmsSendReceiveManager: acquire network wait interrupted", new Object[0]);
                    }
                    if (b.b || b.e == null) {
                        a(context);
                        if (b.b) {
                            fzo = b.d;
                        } else {
                            j = a - (glj.b() - b);
                        }
                    } else if (b.e instanceof fyf) {
                        throw ((fyf) b.e);
                    } else if (b.e instanceof fxy) {
                        throw ((fxy) b.e);
                    } else {
                        glk.d("Babel_SMS", "MmsSendReceiveManager: unknown exception", b.e);
                        throw new fyf(b.e);
                    }
                }
                throw new fyf("Acquiring MMS network timed out");
            }
        }
        return fzo;
    }

    public static void c(Context context) {
        synchronized (b) {
            glk.c("Babel_SMS", "MmsSendReceiveManager.releaseMmsNetwork senders=" + b.a, new Object[0]);
            fyc fyc = b;
            fyc.a--;
            if (b.a <= 0) {
                b.a();
                glk.c("Babel_SMS", "MmsSendReceiveManager.endMmsConnectivity", new Object[0]);
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                try {
                    Method method = connectivityManager.getClass().getMethod("stopUsingNetworkFeature", c);
                    method.setAccessible(true);
                    method.invoke(connectivityManager, new Object[]{Integer.valueOf(0), "enableMMS"});
                    b.b = false;
                    b.d = null;
                } catch (IllegalAccessException e) {
                    Throwable e2 = e;
                    throw new RuntimeException("Cannot stop using network feature", e2);
                } catch (InvocationTargetException e3) {
                    e2 = e3;
                    throw new RuntimeException("Cannot stop using network feature", e2);
                } catch (NoSuchMethodException e4) {
                    e2 = e4;
                    throw new RuntimeException("Cannot stop using network feature", e2);
                }
            }
        }
    }

    private static int d(Context context) {
        Throwable e;
        glk.c("Babel_SMS", "MmsSendReceiveManager.beginMmsConnectivity", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            Method method = connectivityManager.getClass().getMethod("startUsingNetworkFeature", c);
            method.setAccessible(true);
            int a = gwb.a((Integer) method.invoke(connectivityManager, new Object[]{Integer.valueOf(0), "enableMMS"}), -1);
            switch (a) {
                case wi.w /*0*/:
                case wi.j /*1*/:
                    return a;
                default:
                    String str = "Cannot establish MMS connectivity: ";
                    if (a >= fzq.a.length) {
                        a = fzq.a.length - 1;
                    }
                    String valueOf = String.valueOf(fzq.a[a]);
                    if (valueOf.length() != 0) {
                        valueOf = str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                    throw new fyf(valueOf);
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException("Cannot start using network feature", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException("Cannot start using network feature", e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new RuntimeException("Cannot start using network feature", e);
        }
    }

    private static boolean a(ConnectivityManager connectivityManager, InetAddress inetAddress) {
        Method method;
        Throwable e;
        if (glk.a("Babel_SMS", 3)) {
            String valueOf = String.valueOf(inetAddress);
            glk.a("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 26).append("requestRouteToHostAddress ").append(valueOf).toString(), new Object[0]);
        }
        try {
            method = connectivityManager.getClass().getMethod("requestRouteToHostAddress", new Class[]{Integer.TYPE, InetAddress.class});
            if (method != null) {
                boolean b = gwb.b((Boolean) method.invoke(connectivityManager, new Object[]{d, inetAddress}));
                return b;
            }
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2);
            glk.e("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 50).append("Call hidden requestRouteToHostAddress failed with ").append(valueOf2).toString(), new Object[0]);
        }
        try {
            method = Class.forName(connectivityManager.getClass().getName()).getMethod("requestRouteToHost", new Class[]{Integer.TYPE, Integer.TYPE});
            method.setAccessible(true);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(2);
            byte[] address = inetAddress.getAddress();
            objArr[1] = Integer.valueOf((address[0] & 255) | ((((address[3] & 255) << 24) | ((address[2] & 255) << 16)) | ((address[1] & 255) << 8)));
            b = gwb.a((Boolean) method.invoke(connectivityManager, objArr), false);
            return b;
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new RuntimeException("Cannot request route to host", e);
        } catch (IllegalAccessException e4) {
            e = e4;
            throw new RuntimeException("Cannot request route to host", e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new RuntimeException("Cannot request route to host", e);
        } catch (NoSuchMethodException e6) {
            e = e6;
            throw new RuntimeException("Cannot request route to host", e);
        }
    }

    private static int b(ConnectivityManager connectivityManager) {
        int i = 0;
        try {
            Object invoke = connectivityManager.getClass().getMethod("getLinkProperties", new Class[]{Integer.TYPE}).invoke(connectivityManager, new Object[]{d});
            String valueOf = String.valueOf(invoke);
            glk.c("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 10).append("MMS link: ").append(valueOf).toString(), new Object[0]);
            for (InetAddress inetAddress : (Collection) invoke.getClass().getMethod("getAddresses", new Class[0]).invoke(invoke, new Object[0])) {
                if (inetAddress instanceof Inet4Address) {
                    i |= 1;
                } else {
                    int i2;
                    if (inetAddress instanceof Inet6Address) {
                        i2 = i | 2;
                    } else {
                        i2 = i;
                    }
                    i = i2;
                }
            }
            return i;
        } catch (Exception e) {
            return 3;
        }
    }

    private static List<InetAddress> a(String str, int i) {
        List<InetAddress> arrayList = new ArrayList();
        if (i != 0) {
            try {
                for (Object obj : InetAddress.getAllByName(str)) {
                    if (a) {
                        String valueOf = String.valueOf(obj);
                        new StringBuilder(String.valueOf(valueOf).length() + 26).append("MMS host resolved address ").append(valueOf);
                    }
                    if ((i & 2) != 0 && (obj instanceof Inet6Address)) {
                        arrayList.add(obj);
                    } else if ((i & 1) != 0 && (obj instanceof Inet4Address)) {
                        arrayList.add(obj);
                    }
                }
            } catch (Throwable e) {
                Throwable th = e;
                String str2 = "Babel_SMS";
                String str3 = "Error resolving host: ";
                String valueOf2 = String.valueOf(str);
                glk.d(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), th);
                throw new fyf("Failed to resolve host", th);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        glk.e("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 74).append("Failed to resolve host ").append(str).append(" for allowed addressTypes, addressTypes=").append(i).toString(), new Object[0]);
        throw new fyf("Failed to resolve host for allowed address types");
    }
}
