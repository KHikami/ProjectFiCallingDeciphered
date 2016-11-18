package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.io.File;

public final class enh implements cpp {
    public boolean a(String str) {
        return "dumpdb".equals(str);
    }

    public void a(Context context) {
        Toast.makeText(context, "Dumping database, please wait", 0).show();
        File l = gwb.l(context, ((jca) jyn.a(context, jca.class)).a());
        if (l == null) {
            Toast.makeText(context, "Could not dump database", 0).show();
            return;
        }
        Toast.makeText(context, "Database dumped", 0).show();
        gwb.a(context, l);
    }
}
