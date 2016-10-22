import android.content.pm.PackageStats;
import android.util.Log;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;

/* compiled from: PG */
final class cvl implements Runnable {
    private /* synthetic */ cvk a;

    cvl(cvk cvk) {
        this.a = cvk;
    }

    public final void run() {
        PackageStats packageStats = PackageStatsCapture.getPackageStats(this.a.a);
        if (packageStats != null) {
            dln dln = new dln();
            dli dli = new dli();
            dli.a = Long.valueOf(packageStats.cacheSize);
            dli.b = Long.valueOf(packageStats.codeSize);
            dli.c = Long.valueOf(packageStats.dataSize);
            dli.d = Long.valueOf(packageStats.externalCacheSize);
            dli.e = Long.valueOf(packageStats.externalCodeSize);
            dli.f = Long.valueOf(packageStats.externalDataSize);
            dli.g = Long.valueOf(packageStats.externalMediaSize);
            dli.h = Long.valueOf(packageStats.externalObbSize);
            dln.h = dli;
            String str = "pkgMetric: ";
            String valueOf = String.valueOf(dln.h.toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            this.a.b.a(dln);
            return;
        }
        Log.w("PackageMetricService", "PackageStats capture failed.");
    }
}
