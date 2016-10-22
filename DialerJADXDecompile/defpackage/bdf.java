package defpackage;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: bdf */
public final class bdf {
    public static final boolean a;
    public static final boolean b;

    static {
        a = Log.isLoggable("InCall", 3);
        b = Log.isLoggable("InCall", 2);
    }

    public static void a(String str, String str2) {
        if (a) {
            String valueOf = String.valueOf(bdf.a(str));
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
        }
    }

    public static void a(Object obj, String str) {
        if (a) {
            String valueOf = String.valueOf(bdf.b(obj));
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
        }
    }

    public static void a(Object obj, String str, Object obj2) {
        if (a) {
            String valueOf = String.valueOf(bdf.b(obj));
            String valueOf2 = String.valueOf(obj2);
            new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2);
        }
    }

    public static void b(Object obj, String str) {
        if (b) {
            String valueOf = String.valueOf(bdf.b(obj));
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
        }
    }

    public static void b(Object obj, String str, Object obj2) {
        if (b) {
            String valueOf = String.valueOf(bdf.b(obj));
            String valueOf2 = String.valueOf(obj2);
            new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2);
        }
    }

    public static void a(String str, String str2, Exception exception) {
        String str3 = "InCall";
        String valueOf = String.valueOf(bdf.a(str));
        String valueOf2 = String.valueOf(str2);
        Log.e(str3, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), exception);
    }

    public static void b(String str, String str2) {
        String str3 = "InCall";
        String valueOf = String.valueOf(bdf.a(str));
        String valueOf2 = String.valueOf(str2);
        Log.e(str3, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static void a(Object obj, String str, Exception exception) {
        String str2 = "InCall";
        String valueOf = String.valueOf(bdf.b(obj));
        String valueOf2 = String.valueOf(str);
        Log.e(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), exception);
    }

    public static void c(Object obj, String str) {
        String str2 = "InCall";
        String valueOf = String.valueOf(bdf.b(obj));
        String valueOf2 = String.valueOf(str);
        Log.e(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static void c(String str, String str2) {
        String valueOf = String.valueOf(bdf.a(str));
        String valueOf2 = String.valueOf(str2);
        if (valueOf2.length() != 0) {
            valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
    }

    public static void d(Object obj, String str) {
        String valueOf = String.valueOf(bdf.b(obj));
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
    }

    public static void e(Object obj, String str) {
        String str2 = "InCall";
        String valueOf = String.valueOf(bdf.b(obj));
        String valueOf2 = String.valueOf(str);
        Log.w(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static void f(Object obj, String str) {
        String str2 = "InCall";
        String valueOf = String.valueOf(bdf.b(obj));
        String valueOf2 = String.valueOf(str);
        Log.wtf(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static String a(Object obj) {
        if (obj == null || b) {
            return String.valueOf(obj);
        }
        String valueOf = String.valueOf(bdf.a(String.valueOf(obj).getBytes()));
        return new StringBuilder(String.valueOf(valueOf).length() + 2).append("[").append(valueOf).append("]").toString();
    }

    private static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer(digest.length << 1);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toString(i, 16));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String b(Object obj) {
        if (obj == null) {
            return "";
        }
        String valueOf = String.valueOf(obj.getClass().getSimpleName());
        String valueOf2 = String.valueOf(" - ");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String a(String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(" - ");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
