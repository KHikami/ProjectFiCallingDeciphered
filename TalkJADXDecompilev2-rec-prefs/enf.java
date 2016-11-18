package p000;

import android.content.Context;
import android.widget.Toast;
import java.io.File;

public final class enf implements cpp {
    public boolean mo1917a(String str) {
        return "dumpaccounts".equals(str);
    }

    public void mo1916a(Context context) {
        Toast.makeText(context, "Dumping accounts.xml, please wait", 0).show();
        File v = gwb.m2371v(context);
        Toast.makeText(context, "accounts.xml dumped", 0).show();
        gwb.m1753a(context, v);
    }
}
