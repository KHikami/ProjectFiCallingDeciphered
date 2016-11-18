package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;

public class gtw {
    private static gtw f16147a;
    private final Context f16148b;

    private gtw(Context context) {
        this.f16148b = context.getApplicationContext();
    }

    public static gtw m18593a(Context context) {
        gwb.m1419L((Object) context);
        synchronized (gtw.class) {
            if (f16147a == null) {
                gwb.m1470Z(context);
                f16147a = new gtw(context);
            }
        }
        return f16147a;
    }

    private static boolean m18594b(PackageInfo packageInfo, boolean z) {
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
        String valueOf2 = String.valueOf(Base64.encodeToString(gxy.mo2414c(), 0));
        new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(valueOf2).length()).append(valueOf).append(" signature not valid.  Found: \n").append(valueOf2);
        return false;
    }

    gxx m18595a(PackageInfo packageInfo, gxx... gxxArr) {
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
        String valueOf2 = String.valueOf(Base64.encodeToString(gxy.mo2414c(), 0));
        new StringBuilder((String.valueOf(valueOf).length() + 31) + String.valueOf(valueOf2).length()).append(valueOf).append(" signature not valid.  Found: \n").append(valueOf2);
        return null;
    }

    public void m18596a(PackageManager packageManager, int i) {
        if (packageManager == null) {
            throw new SecurityException("Unknown error: invalid Package Manager");
        } else if (!m18601b(packageManager, i)) {
            throw new SecurityException("Uid is not Google Signed");
        }
    }

    public boolean m18597a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (gtv.m18575e(this.f16148b)) {
            return gtw.m18594b(packageInfo, true);
        }
        boolean b = gtw.m18594b(packageInfo, false);
        if (b) {
            return b;
        }
        gtw.m18594b(packageInfo, true);
        return b;
    }

    public boolean m18598a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            gxx a;
            if (z) {
                a = m18595a(packageInfo, gya.f16367a);
            } else {
                a = m18595a(packageInfo, gya.f16367a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    public boolean m18599a(PackageManager packageManager, String str) {
        try {
            return m18597a(packageManager.getPackageInfo(str, 64));
        } catch (NameNotFoundException e) {
            new StringBuilder(String.valueOf(str).length() + 56).append("Package manager can't find package ").append(str).append(", defaulting to false");
            return false;
        }
    }

    public boolean m18600b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (gtv.m18575e(this.f16148b)) {
            return m18598a(packageInfo, true);
        }
        boolean a = m18598a(packageInfo, false);
        if (a) {
            return a;
        }
        m18598a(packageInfo, true);
        return a;
    }

    public boolean m18601b(PackageManager packageManager, int i) {
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return false;
        }
        for (String a : packagesForUid) {
            if (m18599a(packageManager, a)) {
                return true;
            }
        }
        return false;
    }
}
