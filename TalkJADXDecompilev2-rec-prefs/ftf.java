package p000;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

public final class ftf extends fsz<fte> {
    public ftf(Context context) {
        super(context, new fte());
    }

    protected List<IntentFilter> mo2087c() {
        List arrayList = new ArrayList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        arrayList.add(intentFilter);
        return arrayList;
    }
}
