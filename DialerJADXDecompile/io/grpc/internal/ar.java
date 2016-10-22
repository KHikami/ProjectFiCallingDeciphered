package io.grpc.internal;

import cob;
import cxn;
import cyi;
import cyv;
import cyw;
import dgr;
import dha;
import dhn;
import java.net.URI;

/* compiled from: PG */
public final class ar {
    public static final dha a;
    public static final dha b;
    public static final dha c;
    public static final dha d;
    public static final dha e;
    public static final cyi f;
    public static final cd g;
    public static final cd h;
    private static final String i;

    static {
        a = dha.a("grpc-timeout", new av());
        b = dha.a("grpc-encoding", dgr.a);
        c = dha.a("grpc-accept-encoding", dgr.a);
        d = dha.a("content-type", dgr.a);
        e = dha.a("user-agent", dgr.a);
        Object a = cxn.a(',');
        cob.i(a);
        cyv cyv = new cyv(new cyw(a));
        a = cxn.b();
        cob.i(a);
        cyv cyv2 = new cyv(cyv.b, cyv.a, a, cyv.c);
        f = cyi.a(',');
        String implementationVersion = ar.class.getPackage().getImplementationVersion();
        if (implementationVersion != null) {
            String str = "/";
            implementationVersion = String.valueOf(implementationVersion);
            if (implementationVersion.length() != 0) {
                implementationVersion = str.concat(implementationVersion);
            } else {
                implementationVersion = new String(str);
            }
        } else {
            implementationVersion = "";
        }
        i = implementationVersion;
        g = new as();
        h = new at();
    }

    public static dhn a(int i) {
        switch (i) {
            case 401:
                return dhn.g;
            case 403:
                return dhn.f;
            default:
                if (i < 100) {
                    return dhn.d;
                }
                if (i < 200) {
                    return dhn.i;
                }
                if (i < 300) {
                    return dhn.b;
                }
                return dhn.d;
        }
    }

    public static boolean a(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String toLowerCase = str.toLowerCase();
        if (!toLowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (toLowerCase.length() == 16) {
            return true;
        }
        char charAt = toLowerCase.charAt(16);
        if (charAt == '+' || charAt == ';') {
            return true;
        }
        return false;
    }

    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str2 != null) {
            stringBuilder.append(str2);
            stringBuilder.append(' ');
        }
        stringBuilder.append("grpc-java-");
        stringBuilder.append(str);
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public static URI b(String str) {
        cob.b((Object) str, (Object) "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Invalid authority: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    public static String a(String str, int i) {
        try {
            return new URI(null, null, str, i, null, null, null).getAuthority();
        } catch (Throwable e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 34).append("Invalid host or port: ").append(str).append(" ").append(i).toString(), e);
        }
    }

    public static String a(cn cnVar) {
        String valueOf = String.valueOf(cnVar.getClass().getSimpleName());
        String valueOf2 = String.valueOf(Integer.toHexString(cnVar.hashCode()));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("@").append(valueOf2).toString();
    }

    private ar() {
    }
}
