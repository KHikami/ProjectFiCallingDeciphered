package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;

public class gtw {
    private static gtw a;
    private final Context b;

    private gtw(Context context) {
        this.b = context.getApplicationContext();
    }

    public static gtw a(Context context) {
        gwb.L((Object) context);
        synchronized (gtw.class) {
            if (a == null) {
                gwb.Z(context);
                a = new gtw(context);
            }
        }
        return a;
    }

    private static boolean b(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            return false;
        }
        gxx gxy = new gxy(packageInfo.signatures[0].toByteArray());
        for (gwv equals : z ? gwb.aj() : gwb.ak()) {
            if (gxy.equals(equals)) {
                return true;
            }
        }
        String valueOf = String.valueOf(packageInfo.packageName);
        String valueOf2 = String.valueOf(Base64.encodeToString(gxy.c(), 0));
        new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(valueOf2).length()).append(valueOf).append(" signature not valid.  Found: \n").append(valueOf2);
        return false;
    }

    gxx a(PackageInfo packageInfo, gxx... gxxArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            return null;
        }
        gxx gxy = new gxy(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < gxxArr.length; i++) {
            if (gxxArr[i].equals(gxy)) {
                return gxxArr[i];
            }
        }
        String valueOf = String.valueOf(packageInfo.packageName);
        String valueOf2 = String.valueOf(Base64.encodeToString(gxy.c(), 0));
        new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(valueOf2).length()).append(valueOf).append(" signature not valid.  Found: \n").append(valueOf2);
        return null;
    }

    public void a(PackageManager packageManager, int i) {
        if (packageManager == null) {
            throw new SecurityException("Unknown error: invalid Package Manager");
        } else if (!b(packageManager, i)) {
            throw new SecurityException("Uid is not Google Signed");
        }
    }

    public boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (gtv.e(this.b)) {
            return gtw.b(packageInfo, true);
        }
        boolean b = gtw.b(packageInfo, false);
        if (b) {
            return b;
        }
        gtw.b(packageInfo, true);
        return b;
    }

    public boolean a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            gxx a;
            if (z) {
                a = a(packageInfo, gya.a);
            } else {
                a = a(packageInfo, gya.a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(PackageManager packageManager, String str) {
        try {
            return a(packageManager.getPackageInfo(str, 64));
        } catch (NameNotFoundException e) {
            new StringBuilder(String.valueOf(str).length() + 56).append("Package manager can't find package ").append(str).append(", defaulting to false");
            return false;
        }
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (gtv.e(this.b)) {
            return a(packageInfo, true);
        }
        boolean a = a(packageInfo, false);
        if (a) {
            return a;
        }
        a(packageInfo, true);
        return a;
    }

    public boolean b(PackageManager packageManager, int i) {
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return false;
        }
        for (String a : packagesForUid) {
            if (a(packageManager, a)) {
                return true;
            }
        }
        return false;
    }
}
