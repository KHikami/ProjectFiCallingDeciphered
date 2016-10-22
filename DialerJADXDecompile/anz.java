import android.app.Activity;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Bundle;
import android.provider.VoicemailContract.Status;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public final class anz extends amo {
    private final ContentObserver e;
    private asp f;

    public anz() {
        super(4);
        this.e = new amq(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activity activity = getActivity();
        if (asp.b == null) {
            asp.b = new asp(activity);
        }
        asp.b.a(activity, bundle);
        this.f = asp.b;
        getActivity().getContentResolver().registerContentObserver(Status.CONTENT_URI, true, this.e);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(buf.hC, viewGroup, false);
        a(inflate, this.f);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        ata ata = this.f.o.b;
        ata.e.registerReceiver(ata.b, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public final void onPause() {
        this.f.b();
        super.onPause();
    }

    public final void onDestroy() {
        this.f.c();
        getActivity().getContentResolver().unregisterContentObserver(this.e);
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f.a(bundle);
    }

    public final void a() {
        super.a();
        ((aqg) getParentFragment()).a();
    }
}
