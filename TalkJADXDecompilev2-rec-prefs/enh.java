package p000;

import android.content.Context;
import android.widget.Toast;
import java.io.File;

public final class enh implements cpp {
    public boolean mo1917a(String str) {
        return "dumpdb".equals(str);
    }

    public void mo1916a(Context context) {
        Toast.makeText(context, "Dumping database, please wait", 0).show();
        File l = gwb.m2286l(context, ((jca) jyn.m25426a(context, jca.class)).mo2317a());
        if (l == null) {
            Toast.makeText(context, "Could not dump database", 0).show();
            return;
        }
        Toast.makeText(context, "Database dumped", 0).show();
        gwb.m1753a(context, l);
    }
}
