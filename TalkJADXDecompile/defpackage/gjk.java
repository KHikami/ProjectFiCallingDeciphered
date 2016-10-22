package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: gjk */
public final class gjk {
    static final Object a;
    public static volatile boolean b;
    static BufferedOutputStream c;
    static PowerManager d;
    static volatile String e;

    static {
        a = new Object();
        b = false;
        gwb.a(new gjl());
    }

    public static void a(String str) {
        e = str;
    }

    public static void a() {
        e = null;
    }

    static void b() {
        Context H = gwb.H();
        boolean a = gwb.a(gwb.H(), "babel_data_logging", false);
        synchronized (a) {
            if (a != b) {
                boolean z;
                if (a) {
                    OutputStream openFileOutput;
                    d = (PowerManager) H.getSystemService("power");
                    boolean exists = H.getFileStreamPath("datalogs.csv").exists();
                    try {
                        openFileOutput = H.openFileOutput("datalogs.csv", 32768);
                    } catch (Throwable e) {
                        glk.d("Babel", "error opening datalog output stream", e);
                        openFileOutput = null;
                        a = false;
                    }
                    if (openFileOutput != null) {
                        c = new BufferedOutputStream(openFileOutput);
                        if (!exists) {
                            try {
                                c.write(gjn.b.getBytes());
                                c.flush();
                                z = a;
                            } catch (Throwable e2) {
                                glk.d("Babel", "error writing header to datalog output stream", e2);
                            }
                        }
                    }
                    z = a;
                } else {
                    d = null;
                    if (c != null) {
                        try {
                            c.close();
                        } catch (Throwable e22) {
                            glk.d("Babel", "error closing datalog output stream", e22);
                        }
                        c = null;
                    }
                    z = a;
                }
                b = z;
            }
        }
    }

    public static void c() {
        synchronized (a) {
            if (b) {
                try {
                    c.flush();
                } catch (Throwable e) {
                    glk.d("Babel", "error flushing datalog output stream", e);
                }
                return;
            }
        }
    }
}
