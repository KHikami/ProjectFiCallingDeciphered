package defpackage;

import android.os.Process;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class itz {
    private final iin<iua> a = new iin(500);
    private final Object b = new Object();

    public itz(int i) {
    }

    public void a(int i, String str, String str2) {
        synchronized (this.b) {
            Object iua;
            iua iua2 = (iua) this.a.b();
            if (iua2 == null) {
                iua = new iua();
            } else {
                iua iua3 = iua2;
            }
            iua.a(Process.myTid(), i, System.currentTimeMillis(), str, str2);
            this.a.a(iua);
        }
    }

    public void a(PrintWriter printWriter) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        int myPid = Process.myPid();
        synchronized (this.b) {
            for (int i = 0; i < this.a.a(); i++) {
                iua iua = (iua) this.a.a(i);
                printWriter.println(String.format("%s %5d %5d %s %s: %s", new Object[]{simpleDateFormat.format(Long.valueOf(iua.c)), Integer.valueOf(myPid), Integer.valueOf(iua.a), iua.b, iua.d, iua.e}));
            }
        }
    }
}
