import java.lang.reflect.Method;
import java.net.Socket;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
public class djj {
    public static final Logger a;
    public static final djj b;

    static {
        a = Logger.getLogger(djj.class.getName());
        b = a();
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
    }

    public void a(SSLSocket sSLSocket) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    private static djj a() {
        Method method;
        dji dji;
        dji dji2;
        Method method2;
        Method method3;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
        }
        try {
            Method method4;
            dji dji3 = new dji(null, "setUseSessionTickets", Boolean.TYPE);
            dji dji4 = new dji(null, "setHostname", String.class);
            Method method5;
            dji dji5;
            try {
                Class cls = Class.forName("android.net.TrafficStats");
                method4 = cls.getMethod("tagSocket", new Class[]{Socket.class});
                try {
                    method5 = cls.getMethod("untagSocket", new Class[]{Socket.class});
                } catch (ClassNotFoundException e2) {
                    method = method4;
                    dji = null;
                    dji2 = null;
                    method4 = null;
                    method2 = method;
                    return new djk(dji3, dji4, method2, method4, dji2, dji);
                } catch (NoSuchMethodException e3) {
                    dji5 = null;
                    method5 = method4;
                    method4 = null;
                    dji = null;
                    method2 = method5;
                    dji2 = dji5;
                    return new djk(dji3, dji4, method2, method4, dji2, dji);
                }
                try {
                    Class.forName("android.net.Network");
                    dji5 = new dji(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                    try {
                        dji = new dji(null, "setAlpnProtocols", byte[].class);
                        method2 = method4;
                        method4 = method5;
                        dji2 = dji5;
                    } catch (ClassNotFoundException e4) {
                        dji = null;
                        method2 = method4;
                        method4 = method5;
                        dji2 = dji5;
                        return new djk(dji3, dji4, method2, method4, dji2, dji);
                    } catch (NoSuchMethodException e5) {
                        method3 = method5;
                        method5 = method4;
                        method4 = method3;
                        dji = null;
                        method2 = method5;
                        dji2 = dji5;
                        return new djk(dji3, dji4, method2, method4, dji2, dji);
                    }
                } catch (ClassNotFoundException e6) {
                    dji5 = null;
                    dji = null;
                    method2 = method4;
                    method4 = method5;
                    dji2 = dji5;
                    return new djk(dji3, dji4, method2, method4, dji2, dji);
                } catch (NoSuchMethodException e7) {
                    dji5 = null;
                    method3 = method5;
                    method5 = method4;
                    method4 = method3;
                    dji = null;
                    method2 = method5;
                    dji2 = dji5;
                    return new djk(dji3, dji4, method2, method4, dji2, dji);
                }
            } catch (ClassNotFoundException e8) {
                method = null;
                dji = null;
                dji2 = null;
                method4 = null;
                method2 = method;
                return new djk(dji3, dji4, method2, method4, dji2, dji);
            } catch (NoSuchMethodException e9) {
                dji5 = null;
                method4 = null;
                method5 = null;
                dji = null;
                method2 = method5;
                dji2 = dji5;
                return new djk(dji3, dji4, method2, method4, dji2, dji);
            }
            return new djk(dji3, dji4, method2, method4, dji2, dji);
        } catch (ClassNotFoundException e10) {
            try {
                String str = "org.eclipse.jetty.alpn.ALPN";
                Class cls2 = Class.forName(str);
                Class cls3 = Class.forName(String.valueOf(str).concat("$Provider"));
                Class cls4 = Class.forName(String.valueOf(str).concat("$ClientProvider"));
                Class cls5 = Class.forName(String.valueOf(str).concat("$ServerProvider"));
                return new djl(cls2.getMethod("put", new Class[]{SSLSocket.class, cls3}), cls2.getMethod("get", new Class[]{SSLSocket.class}), cls2.getMethod("remove", new Class[]{SSLSocket.class}), cls4, cls5);
            } catch (ClassNotFoundException e11) {
                return new djj();
            } catch (NoSuchMethodException e12) {
                return new djj();
            }
        }
    }

    public static byte[] a(List list) {
        dlu dlu = new dlu();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            djn djn = (djn) list.get(i);
            if (djn != djn.HTTP_1_0) {
                dlu.a(djn.toString().length());
                String djn2 = djn.toString();
                int length = djn2.length();
                if (djn2 == null) {
                    throw new IllegalArgumentException("string == null");
                } else if (length < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
                } else if (length > djn2.length()) {
                    throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + djn2.length());
                } else {
                    int i2 = 0;
                    while (i2 < length) {
                        char charAt = djn2.charAt(i2);
                        int i3;
                        if (charAt < '\u0080') {
                            dme d = dlu.d(1);
                            byte[] bArr = d.a;
                            int i4 = d.c - i2;
                            int min = Math.min(length, 2048 - i4);
                            i3 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt;
                            while (i3 < min) {
                                charAt = djn2.charAt(i3);
                                if (charAt >= '\u0080') {
                                    break;
                                }
                                i2 = i3 + 1;
                                bArr[i3 + i4] = (byte) charAt;
                                i3 = i2;
                            }
                            i2 = (i3 + i4) - d.c;
                            d.c += i2;
                            dlu.b += (long) i2;
                            i2 = i3;
                        } else if (charAt < '\u0800') {
                            dlu.a((charAt >> 6) | 192);
                            dlu.a((charAt & 63) | 128);
                            i2++;
                        } else if (charAt < '\ud800' || charAt > '\udfff') {
                            dlu.a((charAt >> 12) | 224);
                            dlu.a(((charAt >> 6) & 63) | 128);
                            dlu.a((charAt & 63) | 128);
                            i2++;
                        } else {
                            if (i2 + 1 < length) {
                                i3 = djn2.charAt(i2 + 1);
                            } else {
                                i3 = 0;
                            }
                            if (charAt > '\udbff' || i3 < 56320 || i3 > 57343) {
                                dlu.a(63);
                                i2++;
                            } else {
                                i3 = ((i3 & -56321) | ((charAt & -55297) << 10)) + 65536;
                                dlu.a((i3 >> 18) | 240);
                                dlu.a(((i3 >> 12) & 63) | 128);
                                dlu.a(((i3 >> 6) & 63) | 128);
                                dlu.a((i3 & 63) | 128);
                                i2 += 2;
                            }
                        }
                    }
                }
            }
        }
        return dlu.f();
    }
}
