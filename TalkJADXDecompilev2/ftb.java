package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

public final class ftb extends fsz<fta> {
    public ftb(Context context) {
        super(context, new fta());
    }

    protected List<IntentFilter> c() {
        int i = VERSION.SDK_INT >= 19 ? 1 : 0;
        List arrayList = new ArrayList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        if (i != 0) {
            intentFilter.addDataSchemeSpecificPart("com.google.android.wearable.app", 0);
        }
        arrayList.add(intentFilter);
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        if (i != 0) {
            intentFilter.addDataSchemeSpecificPart("com.google.android.wearable.app", 0);
        }
        arrayList.add(intentFilter);
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        if (i != 0) {
            intentFilter.addDataSchemeSpecificPart("com.google.android.projection.gearhead", 0);
        }
        arrayList.add(intentFilter);
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        if (i != 0) {
            intentFilter.addDataSchemeSpecificPart("com.google.android.projection.gearhead", 0);
        }
        arrayList.add(intentFilter);
        return arrayList;
    }
}
