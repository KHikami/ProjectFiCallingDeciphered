package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.io.File;

/* renamed from: enf */
public final class enf implements cpp {
    public boolean a(String str) {
        return "dumpaccounts".equals(str);
    }

    public void a(Context context) {
        Toast.makeText(context, "Dumping accounts.xml, please wait", 0).show();
        File v = gwb.v(context);
        Toast.makeText(context, "accounts.xml dumped", 0).show();
        gwb.a(context, v);
    }
}
