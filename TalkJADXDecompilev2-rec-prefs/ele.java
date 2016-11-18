package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class ele implements ServiceConnection {
    final /* synthetic */ DebugActivity f11798a;

    public ele(DebugActivity debugActivity) {
        this.f11798a = debugActivity;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        elh elh = (elh) iBinder;
        this.f11798a.f6668e = elh.m14099a();
        this.f11798a.f6667d.setOnItemClickListener(new ekv(this.f11798a));
        this.f11798a.f6667d.setOnItemLongClickListener(new ekw(this.f11798a));
        this.f11798a.f6669f = this.f11798a.m8920b();
        this.f11798a.f6668e.m8909a(this.f11798a.f6669f, null);
        this.f11798a.f6667d.setAdapter(this.f11798a.f6669f);
        this.f11798a.f6667d.setSelection(this.f11798a.f6669f.getCount() - 1);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f11798a.f6668e.m8909a(null, null);
        this.f11798a.f6668e = null;
    }
}
