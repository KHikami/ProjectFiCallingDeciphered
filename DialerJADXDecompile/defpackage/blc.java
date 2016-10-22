package defpackage;

import android.content.Context;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: blc */
public final class blc {
    static String a;
    static String b;
    static String c;
    static String d;

    static {
        a = "X-Goog-Api-Key";
        b = "X-Android-Cert";
        c = "X-Android-Package";
        d = "AIzaSyDEabslTraNEB9Tn0sKiJuSyoUN5Uebus8";
    }

    static String a(Context context) {
        String str = null;
        try {
            str = dbp.b.a(MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 64).signatures[0].toByteArray()));
        } catch (Throwable e) {
            buf.a("SpamGrpcStubFactory, androidCert NameNotFoundException", e);
        } catch (Throwable e2) {
            buf.a("SpamGrpcStubFactory, androidCert NoSuchAlgorithmException", e2);
        }
        return str;
    }
}
