import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.hangouts.service.broadcastreceiver.GcmStateReceiver;
import java.util.ArrayList;
import java.util.List;

public final class ftd extends fsz<GcmStateReceiver> {
    public ftd(Context context) {
        super(context, new GcmStateReceiver());
    }

    protected List<IntentFilter> c() {
        List<IntentFilter> arrayList = new ArrayList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gcm.CONNECTED");
        intentFilter.addAction("com.google.android.gcm.DISCONNECTED");
        arrayList.add(intentFilter);
        return arrayList;
    }
}
