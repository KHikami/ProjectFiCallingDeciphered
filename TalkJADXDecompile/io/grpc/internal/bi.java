package io.grpc.internal;

import com.google.api.client.http.HttpStatusCodes;
import gwb;
import iyr;
import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import mfq;
import mtu;
import okw;
import olf;
import olv;

public final class bi {
    public static final boolean a;
    public static final olf<Long> b;
    public static final olf<String> c;
    public static final olf<String> d;
    public static final olf<String> e;
    public static final olf<String> f;
    public static final mfq g;
    public static final long h;
    public static final long i;
    public static final cy<ExecutorService> j;
    public static final cy<ScheduledExecutorService> k;
    static final iyr l;
    private static final String m;

    static {
        boolean z = "Production".equals(System.getProperty("com.google.appengine.runtime.environment")) && "1.7".equals(System.getProperty("java.specification.version"));
        a = z;
        b = olf.a("grpc-timeout", new bm());
        c = olf.a("grpc-encoding", okw.b);
        d = olf.a("grpc-accept-encoding", okw.b);
        e = olf.a("content-type", okw.b);
        f = olf.a("user-agent", okw.b);
        g = mfq.a(',').a();
        String implementationVersion = bi.class.getPackage().getImplementationVersion();
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
        m = implementationVersion;
        h = TimeUnit.MINUTES.toNanos(1);
        i = TimeUnit.MINUTES.toNanos(2);
        j = new bj();
        k = new bk();
        l = new bl();
    }

    public static olv a(int i) {
        switch (i) {
            case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                return olv.j;
            case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                return olv.i;
            default:
                if (i < 100) {
                    return olv.d;
                }
                if (i < HttpStatusCodes.STATUS_CODE_OK) {
                    return olv.p;
                }
                if (i < HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES) {
                    return olv.b;
                }
                return olv.d;
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
        stringBuilder.append(m);
        return stringBuilder.toString();
    }

    public static String a(String str, int i) {
        try {
            return new URI(null, null, str, i, null, null, null).getAuthority();
        } catch (Throwable e) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 34).append("Invalid host or port: ").append(str).append(" ").append(i).toString(), e);
        }
    }

    public static ThreadFactory a(String str, boolean z) {
        ThreadFactory aU = gwb.aU();
        if (a) {
            return aU;
        }
        return new mtu().a(aU).a(true).a(str).a();
    }

    public static String a(dl dlVar) {
        String valueOf = String.valueOf(dlVar.getClass().getSimpleName());
        String valueOf2 = String.valueOf(Integer.toHexString(dlVar.hashCode()));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("@").append(valueOf2).toString();
    }

    private bi() {
    }
}
