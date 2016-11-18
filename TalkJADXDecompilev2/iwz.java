package defpackage;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Build.VERSION;
import android.os.Process;
import java.util.List;

final class iwz implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ onw d;
    final /* synthetic */ iwy e;

    iwz(iwy iwy, String str, int i, String str2, onw onw) {
        this.e = iwy;
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = onw;
    }

    public void run() {
        ivw ivw;
        String str;
        int i;
        String str2;
        onw onw;
        if (this.e.d) {
            ivw = this.e;
            str = this.a;
            i = this.b;
            str2 = this.c;
            onw = this.d;
            List<RunningAppProcessInfo> runningAppProcesses = izr.a(ivw.b).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                CharSequence packageName = ivw.b.getPackageName();
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (VERSION.SDK_INT > 22 || runningAppProcessInfo.processName.contains(packageName)) {
                        ook ook = new ook();
                        ook.a = izn.a(i, runningAppProcessInfo.pid, runningAppProcessInfo.processName, ivw.b, str2, iyn.a.d());
                        ivw.a(str, ook, onw);
                    }
                }
                return;
            }
            return;
        }
        ivw = this.e;
        str = this.a;
        i = this.b;
        str2 = this.c;
        onw = this.d;
        ook ook2 = new ook();
        ook2.a = izn.a(i, Process.myPid(), null, ivw.b, str2, iyn.a.d());
        ivw.a(str, ook2, onw);
    }
}
