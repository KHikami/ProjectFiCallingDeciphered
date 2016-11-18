package p000;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

public final class ftj extends fsz<fti> {
    public ftj(Context context) {
        super(context, new fti());
    }

    protected List<IntentFilter> mo2087c() {
        List<IntentFilter> arrayList = new ArrayList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add(intentFilter);
        return arrayList;
    }
}
