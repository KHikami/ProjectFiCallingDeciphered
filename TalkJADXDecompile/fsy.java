import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.hangouts.service.broadcastreceiver.AccountRefreshReceiver;
import java.util.ArrayList;
import java.util.List;

public final class fsy extends fsz<AccountRefreshReceiver> {
    public fsy(Context context) {
        super(context, new AccountRefreshReceiver());
    }

    protected List<IntentFilter> c() {
        List<IntentFilter> arrayList = new ArrayList();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.enterprise.dmagent.AUTO_REGISTRATION_FINISHED");
        arrayList.add(intentFilter);
        return arrayList;
    }
}
