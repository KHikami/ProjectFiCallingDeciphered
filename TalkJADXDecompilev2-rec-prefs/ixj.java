package p000;

import android.content.pm.PackageStats;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;

final class ixj implements Runnable {
    final /* synthetic */ ixi f19338a;

    ixj(ixi ixi) {
        this.f19338a = ixi;
    }

    public void run() {
        PackageStats packageStats = PackageStatsCapture.getPackageStats(this.f19338a.f19335a);
        if (packageStats != null) {
            ook ook = new ook();
            ooc ooc = new ooc();
            ooc.a = Long.valueOf(packageStats.cacheSize);
            ooc.b = Long.valueOf(packageStats.codeSize);
            ooc.c = Long.valueOf(packageStats.dataSize);
            ooc.d = Long.valueOf(packageStats.externalCacheSize);
            ooc.e = Long.valueOf(packageStats.externalCodeSize);
            ooc.f = Long.valueOf(packageStats.externalDataSize);
            ooc.g = Long.valueOf(packageStats.externalMediaSize);
            ooc.h = Long.valueOf(packageStats.externalObbSize);
            ook.i = ooc;
            String str = "pkgMetric: ";
            String valueOf = String.valueOf(ook.i.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            this.f19338a.f19336b.m23423a(null, ook, null);
            this.f19338a.f19335a.getSharedPreferences("PackageMetricService", 0).edit().putLong("lastSendTime", gwb.az()).commit();
        }
    }
}
