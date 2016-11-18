package p000;

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
    public static final boolean f14345a = false;
    public static final fyc f14346b = new fyc();
    private static final Class[] f14347c = new Class[]{Integer.TYPE, String.class};
    private static final Integer f14348d = Integer.valueOf(2);

    static {
        kae kae = glk.f15571r;
    }

    public static boolean m16556a(ConnectivityManager connectivityManager) {
        try {
            Method method = Class.forName(connectivityManager.getClass().getName()).getMethod("getMobileDataEnabled", new Class[0]);
            method.setAccessible(true);
            return gwb.m2061b((Boolean) method.invoke(connectivityManager, new Object[0]));
        } catch (Exception e) {
            return false;
        }
    }

    public static aid m16551a(Context context, fzo fzo, aid aid, String str) {
        byte[] a = new aih(context, aid).m2481a();
        if (a != null && a.length > 0) {
            return fxz.m16553a(context, fzo, str, 1, a);
        }
        throw new IllegalArgumentException("Empty or zero length PDU data");
    }

    public static aid m16552a(Context context, fzo fzo, String str) {
        if (str != null) {
            return fxz.m16553a(context, fzo, str, 2, null);
        }
        throw new IllegalArgumentException("Empty URL to retrieve");
    }

    private static aid m16553a(Context context, fzo fzo, String str, int i, byte[] bArr) {
        if (f14345a) {
            new StringBuilder(String.valueOf(str).length() + 102).append("MmsSendReceiveManager.executeMmsRequest: requestUrl=").append(str).append(",requestMethod=").append(i).append(",requestData=").append(bArr != null ? bArr.length : -1);
        }
        if (fzo == null) {
            fzo = fzo.m16703a(context, null);
        }
        if (fzo.m16714b()) {
            Throwable th = null;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            for (fzp fzp : fzo.m16712a()) {
                String str2;
                String valueOf;
                String valueOf2 = String.valueOf(fzp);
                glk.m17979c("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 31).append("MmsSendReceiveManager: try APN ").append(valueOf2).toString(), new Object[0]);
                if (str == null) {
                    str2 = fzp.f14490b;
                } else {
                    str2 = str;
                }
                if (f14345a) {
                    valueOf = String.valueOf(fzp);
                    new StringBuilder((String.valueOf(str2).length() + 34) + String.valueOf(valueOf).length()).append("resolveDestination url: ").append(str2).append(" with apn ").append(valueOf);
                }
                if (fzp.m16718b()) {
                    valueOf = fzp.f14492d;
                } else {
                    valueOf = Uri.parse(str2).getHost();
                }
                int b = fxz.m16558b(connectivityManager);
                glk.m17979c("Babel_SMS", "ensureRouteToHost: addressTypes=" + b, new Object[0]);
                Throwable th2 = th;
                for (InetAddress inetAddress : fxz.m16554a(r3, b)) {
                    String valueOf3 = String.valueOf(inetAddress);
                    glk.m17979c("Babel_SMS", new StringBuilder(String.valueOf(valueOf3).length() + 37).append("MmsSendReceiveManager: try inet addr ").append(valueOf3).toString(), new Object[0]);
                    try {
                        if (fxz.m16557a(connectivityManager, inetAddress)) {
                            byte[] a = ajd.m2607a(context, -1, str2, bArr, i, fzp.m16718b(), fzp.f14492d, fzp.f14494f, inetAddress instanceof Inet6Address);
                            fzo.m16713a(context, fzp);
                            if (a == null || a.length <= 0) {
                                return null;
                            }
                            aid a2;
                            try {
                                a2 = new ain(a).m2518a();
                            } catch (Throwable th22) {
                                glk.m17980d("Babel_SMS", "MmsSendReceiveManager: Parsing retrieved PDU failure", th22);
                                a2 = null;
                            }
                            if (i == 2) {
                                if (fyi.m16636h() && a2 != null) {
                                    fyi.m16611a(a, a2, context);
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
                        glk.m17980d("Babel_SMS", new StringBuilder((String.valueOf(valueOf2).length() + 76) + String.valueOf(valueOf4).length()).append("MmsSendReceiveManager: MMS HTTP request failed with exception for addr=").append(valueOf2).append(" apn=").append(valueOf4).toString(), th22);
                    }
                }
                th = th22;
            }
            if (th != null) {
                glk.m17980d("Babel_SMS", "MMS temporary exception", th);
            }
            throw new fyf("MMS HTTP request failed");
        }
        throw new fxy(135, "No available APN to use");
    }

    public static void m16555a(Context context) {
        glk.m17979c("Babel_SMS", "MmsSendReceiveManager.extendMmsNetworkConnectivity", new Object[0]);
        if (fxz.m16561d(context) == 0) {
            f14346b.m16566b();
        } else {
            f14346b.f14350b = false;
        }
    }

    public static fzo m16559b(Context context) {
        fzo fzo;
        glk.m17979c("Babel_SMS", "MmsSendReceiveManager.acquireMmsNetwork", new Object[0]);
        synchronized (f14346b) {
            f14346b.f14353e = null;
            fyc fyc = f14346b;
            fyc.f14349a++;
            fxz.m16555a(context);
            if (f14346b.f14350b) {
                fzo = f14346b.f14352d;
            } else {
                long b = glj.m17963b();
                long a = gwb.m1519a(gwb.m1400H(), "babel_mms_network_acquire_timeout_in_millis", 180000);
                long a2 = gwb.m1519a(gwb.m1400H(), "babel_mms_network_acquire_wait_interval", 15000);
                long j = a;
                while (j > 0) {
                    try {
                        f14346b.wait(Math.min(j, a2));
                    } catch (InterruptedException e) {
                        glk.m17981d("Babel_SMS", "MmsSendReceiveManager: acquire network wait interrupted", new Object[0]);
                    }
                    if (f14346b.f14350b || f14346b.f14353e == null) {
                        fxz.m16555a(context);
                        if (f14346b.f14350b) {
                            fzo = f14346b.f14352d;
                        } else {
                            j = a - (glj.m17963b() - b);
                        }
                    } else if (f14346b.f14353e instanceof fyf) {
                        throw ((fyf) f14346b.f14353e);
                    } else if (f14346b.f14353e instanceof fxy) {
                        throw ((fxy) f14346b.f14353e);
                    } else {
                        glk.m17980d("Babel_SMS", "MmsSendReceiveManager: unknown exception", f14346b.f14353e);
                        throw new fyf(f14346b.f14353e);
                    }
                }
                throw new fyf("Acquiring MMS network timed out");
            }
        }
        return fzo;
    }

    public static void m16560c(Context context) {
        synchronized (f14346b) {
            glk.m17979c("Babel_SMS", "MmsSendReceiveManager.releaseMmsNetwork senders=" + f14346b.f14349a, new Object[0]);
            fyc fyc = f14346b;
            fyc.f14349a--;
            if (f14346b.f14349a <= 0) {
                f14346b.m16565a();
                glk.m17979c("Babel_SMS", "MmsSendReceiveManager.endMmsConnectivity", new Object[0]);
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                try {
                    Method method = connectivityManager.getClass().getMethod("stopUsingNetworkFeature", f14347c);
                    method.setAccessible(true);
                    method.invoke(connectivityManager, new Object[]{Integer.valueOf(0), "enableMMS"});
                    f14346b.f14350b = false;
                    f14346b.f14352d = null;
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

    private static int m16561d(Context context) {
        Throwable e;
        glk.m17979c("Babel_SMS", "MmsSendReceiveManager.beginMmsConnectivity", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            Method method = connectivityManager.getClass().getMethod("startUsingNetworkFeature", f14347c);
            method.setAccessible(true);
            int a = gwb.m1508a((Integer) method.invoke(connectivityManager, new Object[]{Integer.valueOf(0), "enableMMS"}), -1);
            switch (a) {
                case 0:
                case 1:
                    return a;
                default:
                    String str = "Cannot establish MMS connectivity: ";
                    if (a >= fzq.f14502a.length) {
                        a = fzq.f14502a.length - 1;
                    }
                    String valueOf = String.valueOf(fzq.f14502a[a]);
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

    private static boolean m16557a(ConnectivityManager connectivityManager, InetAddress inetAddress) {
        Method method;
        Throwable e;
        if (glk.m17973a("Babel_SMS", 3)) {
            String valueOf = String.valueOf(inetAddress);
            glk.m17970a("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 26).append("requestRouteToHostAddress ").append(valueOf).toString(), new Object[0]);
        }
        try {
            method = connectivityManager.getClass().getMethod("requestRouteToHostAddress", new Class[]{Integer.TYPE, InetAddress.class});
            if (method != null) {
                boolean b = gwb.m2061b((Boolean) method.invoke(connectivityManager, new Object[]{f14348d, inetAddress}));
                return b;
            }
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2);
            glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(valueOf2).length() + 50).append("Call hidden requestRouteToHostAddress failed with ").append(valueOf2).toString(), new Object[0]);
        }
        try {
            method = Class.forName(connectivityManager.getClass().getName()).getMethod("requestRouteToHost", new Class[]{Integer.TYPE, Integer.TYPE});
            method.setAccessible(true);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(2);
            byte[] address = inetAddress.getAddress();
            objArr[1] = Integer.valueOf((address[0] & 255) | ((((address[3] & 255) << 24) | ((address[2] & 255) << 16)) | ((address[1] & 255) << 8)));
            b = gwb.m1929a((Boolean) method.invoke(connectivityManager, objArr), false);
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

    private static int m16558b(ConnectivityManager connectivityManager) {
        int i = 0;
        try {
            Object invoke = connectivityManager.getClass().getMethod("getLinkProperties", new Class[]{Integer.TYPE}).invoke(connectivityManager, new Object[]{f14348d});
            String valueOf = String.valueOf(invoke);
            glk.m17979c("Babel_SMS", new StringBuilder(String.valueOf(valueOf).length() + 10).append("MMS link: ").append(valueOf).toString(), new Object[0]);
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

    private static List<InetAddress> m16554a(String str, int i) {
        List<InetAddress> arrayList = new ArrayList();
        if (i != 0) {
            try {
                for (Object obj : InetAddress.getAllByName(str)) {
                    if (f14345a) {
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
                glk.m17980d(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), th);
                throw new fyf("Failed to resolve host", th);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        glk.m17982e("Babel_SMS", new StringBuilder(String.valueOf(str).length() + 74).append("Failed to resolve host ").append(str).append(" for allowed addressTypes, addressTypes=").append(i).toString(), new Object[0]);
        throw new fyf("Failed to resolve host for allowed address types");
    }
}
