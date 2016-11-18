package defpackage;

import android.util.Printer;
import org.chromium.base.TraceEvent;

public class ouc implements Printer {
    ouc() {
    }

    public void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }

    void a(String str) {
        if (TraceEvent.a) {
            TraceEvent.a();
        }
    }

    void b(String str) {
        if (TraceEvent.a) {
            TraceEvent.b();
        }
    }
}
