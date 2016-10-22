import android.util.Log;

final class jgv implements Runnable {
    final /* synthetic */ jgc a;
    final /* synthetic */ jgz b;
    final /* synthetic */ jgu c;

    jgv(jgu jgu, jgc jgc, jgz jgz) {
        this.c = jgu;
        this.a = jgc;
        this.b = jgz;
    }

    public void run() {
        jgu jgu = this.c;
        jgc jgc = this.a;
        jgz jgz = this.b;
        jgu.b.remove(jgc);
        jgc.b();
        int k = jgc.k();
        String j = jgc.j();
        String valueOf;
        if (k != 0) {
            jgg jgg = (jgg) jgu.a.get(k);
            if (jgg != null) {
                String valueOf2;
                if (jgc.f()) {
                    if (Log.isLoggable("BackgroundTask", 3)) {
                        valueOf2 = String.valueOf(jgz);
                        new StringBuilder((String.valueOf(j).length() + 50) + String.valueOf(valueOf2).length()).append("Task is canceled, dropping result from manager: ").append(j).append(", ").append(valueOf2);
                    }
                    jgg.c(j);
                    return;
                }
                if (Log.isLoggable("BackgroundTask", 3)) {
                    valueOf2 = String.valueOf(jgz);
                    new StringBuilder((String.valueOf(j).length() + 34) + String.valueOf(valueOf2).length()).append("Deliver background task result: ").append(j).append(", ").append(valueOf2);
                }
                jgg.a(j, jgz);
            } else if (jgc.f()) {
                if (Log.isLoggable("BackgroundTask", 3)) {
                    valueOf = String.valueOf(jgz);
                    new StringBuilder((String.valueOf(j).length() + 42) + String.valueOf(valueOf).length()).append("Task is canceled, dropping task result: ").append(j).append(", ").append(valueOf);
                }
            } else if (jgz.j() != jha.a) {
                if (Log.isLoggable("BackgroundTask", 3)) {
                    valueOf = String.valueOf(jgz);
                    new StringBuilder((String.valueOf(j).length() + 32) + String.valueOf(valueOf).length()).append("Store background task result: ").append(j).append(", ").append(valueOf);
                }
                jgz.i();
                jgu.c.a(k, j, jgz);
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
