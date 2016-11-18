package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class hhf {
    public final Context f16967a;

    public hhf(Context context) {
        this.f16967a = context;
    }

    public ApplicationInfo m19791a(String str, int i) {
        return this.f16967a.getPackageManager().getApplicationInfo(str, i);
    }

    public boolean m19792a(int i, String str) {
        if (gwb.ae()) {
            try {
                ((AppOpsManager) this.f16967a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = this.f16967a.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public PackageInfo m19793b(String str, int i) {
        return this.f16967a.getPackageManager().getPackageInfo(str, 64);
    }
}
