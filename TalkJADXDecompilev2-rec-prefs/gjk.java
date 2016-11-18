package p000;

import android.content.Context;
import android.os.PowerManager;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

public final class gjk {
    static final Object f15364a = new Object();
    public static volatile boolean f15365b = false;
    static BufferedOutputStream f15366c;
    static PowerManager f15367d;
    static volatile String f15368e;

    static {
        gwb.m1835a(new gjl());
    }

    public static void m17810a(String str) {
        f15368e = str;
    }

    public static void m17809a() {
        f15368e = null;
    }

    static void m17811b() {
        Context H = gwb.m1400H();
        boolean a = gwb.m1906a(gwb.m1400H(), "babel_data_logging", false);
        synchronized (f15364a) {
            if (a != f15365b) {
                boolean z;
                if (a) {
                    OutputStream openFileOutput;
                    f15367d = (PowerManager) H.getSystemService("power");
                    boolean exists = H.getFileStreamPath("datalogs.csv").exists();
                    try {
                        openFileOutput = H.openFileOutput("datalogs.csv", 32768);
                    } catch (Throwable e) {
                        glk.m17980d("Babel", "error opening datalog output stream", e);
                        openFileOutput = null;
                        a = false;
                    }
                    if (openFileOutput != null) {
                        f15366c = new BufferedOutputStream(openFileOutput);
                        if (!exists) {
                            try {
                                f15366c.write(gjn.f15371b.getBytes());
                                f15366c.flush();
                                z = a;
                            } catch (Throwable e2) {
                                glk.m17980d("Babel", "error writing header to datalog output stream", e2);
                            }
                        }
                    }
                    z = a;
                } else {
                    f15367d = null;
                    if (f15366c != null) {
                        try {
                            f15366c.close();
                        } catch (Throwable e22) {
                            glk.m17980d("Babel", "error closing datalog output stream", e22);
                        }
                        f15366c = null;
                    }
                    z = a;
                }
                f15365b = z;
            }
        }
    }

    public static void m17812c() {
        synchronized (f15364a) {
            if (f15365b) {
                try {
                    f15366c.flush();
                } catch (Throwable e) {
                    glk.m17980d("Babel", "error flushing datalog output stream", e);
                }
                return;
            }
        }
    }
}
