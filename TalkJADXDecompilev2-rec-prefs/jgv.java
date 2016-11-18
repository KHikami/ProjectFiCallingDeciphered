package p000;

import android.util.Log;

final class jgv implements Runnable {
    final /* synthetic */ jgc f20040a;
    final /* synthetic */ jgz f20041b;
    final /* synthetic */ jgu f20042c;

    jgv(jgu jgu, jgc jgc, jgz jgz) {
        this.f20042c = jgu;
        this.f20040a = jgc;
        this.f20041b = jgz;
    }

    public void run() {
        jgu jgu = this.f20042c;
        jgc jgc = this.f20040a;
        jgz jgz = this.f20041b;
        jgu.f20033b.remove(jgc);
        jgc.mo1649b();
        int k = jgc.m6412k();
        String j = jgc.m6411j();
        String valueOf;
        if (k != 0) {
            jgg jgg = (jgg) jgu.f20032a.get(k);
            if (jgg != null) {
                String valueOf2;
                if (jgc.m6407f()) {
                    if (Log.isLoggable("BackgroundTask", 3)) {
                        valueOf2 = String.valueOf(jgz);
                        new StringBuilder((String.valueOf(j).length() + 50) + String.valueOf(valueOf2).length()).append("Task is canceled, dropping result from manager: ").append(j).append(", ").append(valueOf2);
                    }
                    jgg.m24141c(j);
                    return;
                }
                if (Log.isLoggable("BackgroundTask", 3)) {
                    valueOf2 = String.valueOf(jgz);
                    new StringBuilder((String.valueOf(j).length() + 34) + String.valueOf(valueOf2).length()).append("Deliver background task result: ").append(j).append(", ").append(valueOf2);
                }
                jgg.m24133a(j, jgz);
            } else if (jgc.m6407f()) {
                if (Log.isLoggable("BackgroundTask", 3)) {
                    valueOf = String.valueOf(jgz);
                    new StringBuilder((String.valueOf(j).length() + 42) + String.valueOf(valueOf).length()).append("Task is canceled, dropping task result: ").append(j).append(", ").append(valueOf);
                }
            } else if (jgz.m24198j() != jha.f20056a) {
                if (Log.isLoggable("BackgroundTask", 3)) {
                    valueOf = String.valueOf(jgz);
                    new StringBuilder((String.valueOf(j).length() + 32) + String.valueOf(valueOf).length()).append("Store background task result: ").append(j).append(", ").append(valueOf);
                }
                jgz.m24197i();
                jgu.f20034c.m24165a(k, j, jgz);
            } else if (Log.isLoggable("BackgroundTask", 3)) {
                valueOf = String.valueOf(jgz);
                new StringBuilder((String.valueOf(j).length() + 24) + String.valueOf(valueOf).length()).append("Dropping task result: ").append(j).append(", ").append(valueOf);
            }
        } else if (Log.isLoggable("BackgroundTask", 2)) {
            valueOf = String.valueOf(jgz);
            new StringBuilder((String.valueOf(j).length() + 36) + String.valueOf(valueOf).length()).append("No manager, dropping task result: ").append(j).append(", ").append(valueOf);
        }
    }
}
