import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;

public final class bqv {
    static final bqv a;

    static {
        a = new bqv();
    }

    private bqv() {
    }

    static bwi a(PackageInfo packageInfo, bwi... bwiArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        bwi bzi = new bzi(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < bwiArr.length; i++) {
            if (bwiArr[i].equals(bzi)) {
                return bwiArr[i];
            }
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(bzi.a(), 0));
        }
        return null;
    }

    private static boolean b(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        bwi bzi = new bzi(packageInfo.signatures[0].toByteArray());
        if ((z ? buf.C() : buf.D()).contains(bzi)) {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(bzi.a(), 0));
        }
        return false;
    }

    public final boolean a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            bwi a;
            if (z) {
                a = a(packageInfo, cdt.a);
            } else {
                a = a(packageInfo, cdt.a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo == null) {
                return false;
            }
            if (bqu.a(packageManager)) {
                return b(packageInfo, true);
            }
            boolean b = b(packageInfo, false);
            if (b || !b(packageInfo, true)) {
                return b;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return b;
        } catch (NameNotFoundException e) {
            if (!Log.isLoggable("GoogleSignatureVerifier", 3)) {
                return false;
            }
            new StringBuilder("Package manager can't find package ").append(str).append(", defaulting to false");
            return false;
        }
    }
}
