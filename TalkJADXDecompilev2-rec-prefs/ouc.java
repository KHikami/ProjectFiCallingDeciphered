package p000;

import android.util.Printer;
import org.chromium.base.TraceEvent;

public class ouc implements Printer {
    ouc() {
    }

    public void println(String str) {
        if (str.startsWith(">")) {
            mo4226a(str);
        } else {
            mo4227b(str);
        }
    }

    void mo4226a(String str) {
        if (TraceEvent.a) {
            TraceEvent.a();
        }
    }

    void mo4227b(String str) {
        if (TraceEvent.a) {
            TraceEvent.b();
        }
    }
}
