package p000;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Build.VERSION;
import android.os.Process;
import java.util.List;

final class iwz implements Runnable {
    final /* synthetic */ String f19309a;
    final /* synthetic */ int f19310b;
    final /* synthetic */ String f19311c;
    final /* synthetic */ onw f19312d;
    final /* synthetic */ iwy f19313e;

    iwz(iwy iwy, String str, int i, String str2, onw onw) {
        this.f19313e = iwy;
        this.f19309a = str;
        this.f19310b = i;
        this.f19311c = str2;
        this.f19312d = onw;
    }

    public void run() {
        ivw ivw;
        String str;
        int i;
        String str2;
        onw onw;
        if (this.f19313e.f19307d) {
            ivw = this.f19313e;
            str = this.f19309a;
            i = this.f19310b;
            str2 = this.f19311c;
            onw = this.f19312d;
            List<RunningAppProcessInfo> runningAppProcesses = izr.m23604a(ivw.f19250b).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                CharSequence packageName = ivw.f19250b.getPackageName();
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (VERSION.SDK_INT > 22 || runningAppProcessInfo.processName.contains(packageName)) {
                        ook ook = new ook();
                        ook.a = izn.m23600a(i, runningAppProcessInfo.pid, runningAppProcessInfo.processName, ivw.f19250b, str2, iyn.f19402a.m23499d());
                        ivw.m23378a(str, ook, onw);
                    }
                }
                return;
            }
            return;
        }
        ivw = this.f19313e;
        str = this.f19309a;
        i = this.f19310b;
        str2 = this.f19311c;
        onw = this.f19312d;
        ook ook2 = new ook();
        ook2.a = izn.m23600a(i, Process.myPid(), null, ivw.f19250b, str2, iyn.f19402a.m23499d());
        ivw.m23378a(str, ook2, onw);
    }
}
