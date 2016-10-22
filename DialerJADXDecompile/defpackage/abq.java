package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: abq */
public abstract class abq extends Activity implements ck {
    public Intent a;

    public abstract String[] a();

    public abstract String[] b();

    public static boolean a(Activity activity, String[] strArr, Class cls) {
        if (abq.a(activity, strArr)) {
            afb.a((Context) activity);
            return false;
        }
        Intent intent = new Intent(activity, cls);
        activity.getIntent().putExtra("started_permissions_activity", true);
        intent.putExtra("previous_intent", activity.getIntent());
        activity.startActivity(intent);
        activity.finish();
        return true;
    }

    private static boolean a(Context context, String[] strArr) {
        Trace.beginSection("hasPermission");
        try {
            for (String a : strArr) {
                if (gd.a(context, a) != 0) {
                    return false;
                }
            }
            Trace.endSection();
            return true;
        } finally {
            Trace.endSection();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (Intent) getIntent().getExtras().get("previous_intent");
        if (bundle == null) {
            Trace.beginSection("requestPermissions");
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : b()) {
                    if (checkSelfPermission(str) != 0) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() == 0) {
                    throw new RuntimeException("Request permission activity was called even though all permissions are satisfied.");
                }
                ci.a(this, (String[]) arrayList.toArray(new String[arrayList.size()]), 1);
            } finally {
                Trace.endSection();
            }
        }
    }

    public int checkSelfPermission(String str) {
        return gd.a((Context) this, str);
    }
}
