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

public final class ggk implements ServiceConnection { //TeleInCallUiController (connects to dialer?)
    static final Intent a;
    final List<ggm> b;//list of actions to be sent to dialer (Pending Intents)
    final Handler c;
    private final Context d;
    private gso e;
    private boolean f;
    private final Set<Object> g;

    static {
        a = new Intent("com.google.android.dialer.incallui.IInCallUiControllerService").setPackage("com.google.android.dialer");
    }

    public ggk(Context context) {
        this.b = new ArrayList();
        this.g = new HashSet();
        this.c = new Handler();
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        this.d = context;
    }

    public boolean a(Object obj) {
        this.g.add(obj);
        if (b() || a()) {
            glk.c("Babel_telephony", "TeleInCallUiController.connect, bind already in progress; skipping.", new Object[0]);
            return true;
        }
        this.f = this.d.bindService(a, this, 1);
        if (this.f) {
            glk.c("Babel_telephony", "TeleInCallUiController.connect, bound to service", new Object[0]);
        } else {
            glk.c("Babel_telephony", "TeleInCallUiController.connect, unable to bind to service", new Object[0]);
        }
        return this.f;
    }

    private boolean a() {
        return this.f;
    }

    private boolean b() {
        return this.e != null;
    }

    public void b(Object obj) {
        this.g.remove(obj);
        if (!this.g.isEmpty()) {
            glk.c("Babel_telephony", "TeleInCallUiController.disconnect, ignoring disconnect (" + this.g.size() + " remaining uses)", new Object[0]);
        } else if (b() || a()) {
            glk.c("Babel_telephony", "TeleInCallUiController.disconnect, disconnecting", new Object[0]);
            this.d.unbindService(this);
            c();
        } else {
            glk.c("Babel_telephony", "TeleInCallUiController.disconnect, service not bound, ignoring", new Object[0]);
        }
    }

    public ggn a(Intent intent, ggl ggl) {
        String valueOf = String.valueOf(intent);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 35).append("TeleInCallUiController.showDialog, ").append(valueOf).toString(), new Object[0]);
        PendingIntent activity = PendingIntent.getActivity(this.d, 0, intent, 1207959552);
        Object ggm = new ggm(this, activity, ggl);
        if (b()) {
            a(activity, ggl);
        } else {
            glk.c("Babel_telephony", "TeleInCallUiController.showDialog, not connected; queueing showDialog", new Object[0]);
            this.b.add(ggm);
            long a = gwb.a(this.d, "babel_in_call_ui_visible_timeout_ms", 5000);
            glk.c("Babel_telephony", "TeleInCallUiController.showDialog, scheduling timeout: " + a, new Object[0]);
            this.c.postDelayed(ggm, a);
        }
        return ggm;
    }

    void a(PendingIntent pendingIntent, ggl ggl) {
        try {
            this.e.a(pendingIntent);
        } catch (Throwable e) {
            glk.d("Babel_telephony", "TeleInCallUiController.performShowDialog", e);
            ggl.a();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gso gso;
        String valueOf = String.valueOf(componentName);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 56).append("TeleInCallUiController.onServiceConnected, connected to ").append(valueOf).toString(), new Object[0]);
        this.f = false;
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
        this.e = gso;
        ArrayList arrayList = new ArrayList(this.b);
        this.b.clear();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ggm) obj).a();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        String valueOf = String.valueOf(componentName);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 64).append("TeleInCallUiController.onServiceDisconnected, disconnected from ").append(valueOf).toString(), new Object[0]);
        c();
    }

    private void c() {
        this.f = false;
        this.e = null;
        ArrayList arrayList = new ArrayList(this.b);
        this.b.clear();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ggm) obj).b();
        }
    }

    public void a(PrintWriter printWriter) {
        printWriter.append("TeleInCallUiController\n");
        printWriter.append("  connections: {\n");
        for (Object valueOf : this.g) {
            printWriter.append("    ").append(String.valueOf(valueOf)).append("\n");
        }
        printWriter.append("  }\n");
        printWriter.append("  queuedActions: {\n");
        for (ggm valueOf2 : this.b) {
            printWriter.append("    ").append(String.valueOf(valueOf2));
        }
        printWriter.append("  }\n");
    }
}
