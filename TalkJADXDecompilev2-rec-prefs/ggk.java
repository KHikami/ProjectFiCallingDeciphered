package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ggk implements ServiceConnection {
    static final Intent f15238a = new Intent("com.google.android.dialer.incallui.IInCallUiControllerService").setPackage("com.google.android.dialer");
    final List<ggm> f15239b = new ArrayList();
    final Handler f15240c = new Handler();
    private final Context f15241d;
    private gso f15242e;
    private boolean f15243f;
    private final Set<Object> f15244g = new HashSet();

    public ggk(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        this.f15241d = context;
    }

    public boolean m17651a(Object obj) {
        this.f15244g.add(obj);
        if (m17646b() || m17645a()) {
            glk.m17979c("Babel_telephony", "TeleInCallUiController.connect, bind already in progress; skipping.", new Object[0]);
            return true;
        }
        this.f15243f = this.f15241d.bindService(f15238a, this, 1);
        if (this.f15243f) {
            glk.m17979c("Babel_telephony", "TeleInCallUiController.connect, bound to service", new Object[0]);
        } else {
            glk.m17979c("Babel_telephony", "TeleInCallUiController.connect, unable to bind to service", new Object[0]);
        }
        return this.f15243f;
    }

    private boolean m17645a() {
        return this.f15243f;
    }

    private boolean m17646b() {
        return this.f15242e != null;
    }

    public void m17652b(Object obj) {
        this.f15244g.remove(obj);
        if (!this.f15244g.isEmpty()) {
            glk.m17979c("Babel_telephony", "TeleInCallUiController.disconnect, ignoring disconnect (" + this.f15244g.size() + " remaining uses)", new Object[0]);
        } else if (m17646b() || m17645a()) {
            glk.m17979c("Babel_telephony", "TeleInCallUiController.disconnect, disconnecting", new Object[0]);
            this.f15241d.unbindService(this);
            m17647c();
        } else {
            glk.m17979c("Babel_telephony", "TeleInCallUiController.disconnect, service not bound, ignoring", new Object[0]);
        }
    }

    public ggn m17648a(Intent intent, ggl ggl) {
        String valueOf = String.valueOf(intent);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleInCallUiController.showDialog, ").append(valueOf).toString(), new Object[0]);
        PendingIntent activity = PendingIntent.getActivity(this.f15241d, 0, intent, 1207959552);
        Object ggm = new ggm(this, activity, ggl);
        if (m17646b()) {
            m17649a(activity, ggl);
        } else {
            glk.m17979c("Babel_telephony", "TeleInCallUiController.showDialog, not connected; queueing showDialog", new Object[0]);
            this.f15239b.add(ggm);
            long a = gwb.m1519a(this.f15241d, "babel_in_call_ui_visible_timeout_ms", 5000);
            glk.m17979c("Babel_telephony", "TeleInCallUiController.showDialog, scheduling timeout: " + a, new Object[0]);
            this.f15240c.postDelayed(ggm, a);
        }
        return ggm;
    }

    void m17649a(PendingIntent pendingIntent, ggl ggl) {
        try {
            this.f15242e.mo2331a(pendingIntent);
        } catch (Throwable e) {
            glk.m17980d("Babel_telephony", "TeleInCallUiController.performShowDialog", e);
            ggl.m17653a();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gso gso;
        String valueOf = String.valueOf(componentName);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 56).append("TeleInCallUiController.onServiceConnected, connected to ").append(valueOf).toString(), new Object[0]);
        this.f15243f = false;
        if (iBinder == null) {
            gso = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.dialer.incallui.IInCallUiControllerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof gso)) {
                gso = new gsq(iBinder);
            } else {
                gso = (gso) queryLocalInterface;
            }
        }
        this.f15242e = gso;
        ArrayList arrayList = new ArrayList(this.f15239b);
        this.f15239b.clear();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ggm) obj).m17657a();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        String valueOf = String.valueOf(componentName);
        glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 64).append("TeleInCallUiController.onServiceDisconnected, disconnected from ").append(valueOf).toString(), new Object[0]);
        m17647c();
    }

    private void m17647c() {
        this.f15243f = false;
        this.f15242e = null;
        ArrayList arrayList = new ArrayList(this.f15239b);
        this.f15239b.clear();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ggm) obj).m17658b();
        }
    }

    public void m17650a(PrintWriter printWriter) {
        printWriter.append("TeleInCallUiController\n");
        printWriter.append("  connections: {\n");
        for (Object valueOf : this.f15244g) {
            printWriter.append("    ").append(String.valueOf(valueOf)).append("\n");
        }
        printWriter.append("  }\n");
        printWriter.append("  queuedActions: {\n");
        for (ggm valueOf2 : this.f15239b) {
            printWriter.append("    ").append(String.valueOf(valueOf2));
        }
        printWriter.append("  }\n");
    }
}
