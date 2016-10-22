import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ele implements ServiceConnection {
    final /* synthetic */ DebugActivity a;

    public ele(DebugActivity debugActivity) {
        this.a = debugActivity;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        elh elh = (elh) iBinder;
        this.a.e = elh.a();
        this.a.d.setOnItemClickListener(new ekv(this.a));
        this.a.d.setOnItemLongClickListener(new ekw(this.a));
        this.a.f = this.a.b();
        this.a.e.a(this.a.f, null);
        this.a.d.setAdapter(this.a.f);
        this.a.d.setSelection(this.a.f.getCount() - 1);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.a.e.a(null, null);
        this.a.e = null;
    }
}
