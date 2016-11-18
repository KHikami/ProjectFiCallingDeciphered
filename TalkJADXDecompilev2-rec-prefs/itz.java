package p000;

import android.os.Process;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class itz {
    private final iin<iua> f19019a = new iin(500);
    private final Object f19020b = new Object();

    public itz(int i) {
    }

    public void m23292a(int i, String str, String str2) {
        synchronized (this.f19020b) {
            Object iua;
            iua iua2 = (iua) this.f19019a.m21891b();
            if (iua2 == null) {
                iua = new iua();
            } else {
                iua iua3 = iua2;
            }
            iua.m23295a(Process.myTid(), i, System.currentTimeMillis(), str, str2);
            this.f19019a.m21890a(iua);
        }
    }

    public void m23293a(PrintWriter printWriter) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        int myPid = Process.myPid();
        synchronized (this.f19020b) {
            for (int i = 0; i < this.f19019a.m21888a(); i++) {
                iua iua = (iua) this.f19019a.m21889a(i);
                printWriter.println(String.format("%s %5d %5d %s %s: %s", new Object[]{simpleDateFormat.format(Long.valueOf(iua.f19027c)), Integer.valueOf(myPid), Integer.valueOf(iua.f19025a), iua.f19026b, iua.f19028d, iua.f19029e}));
            }
        }
    }
}
