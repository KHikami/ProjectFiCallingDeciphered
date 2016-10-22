import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class hd implements ServiceConnection, Callback {
    private final Context a;
    private final HandlerThread b;
    private final Handler c;
    private final Map<ComponentName, he> d;
    private Set<String> e;

    public hd(Context context) {
        this.d = new HashMap();
        this.e = new HashSet();
        this.a = context;
        this.b = new HandlerThread("NotificationManagerCompat");
        this.b.start();
        this.c = new Handler(this.b.getLooper(), this);
    }

    public void a(hf hfVar) {
        this.c.obtainMessage(0, hfVar).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        ComponentName componentName;
        he heVar;
        switch (message.what) {
            case wi.w /*0*/:
                Iterator it;
                hf hfVar = (hf) message.obj;
                Set b = gw.b(this.a);
                if (!b.equals(this.e)) {
                    this.e = b;
                    List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
                    Set<ComponentName> hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (b.contains(resolveInfo.serviceInfo.packageName)) {
                            ComponentName componentName2 = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                new StringBuilder("Permission present on component ").append(componentName2).append(", not adding listener record.");
                            } else {
                                hashSet.add(componentName2);
                            }
                        }
                    }
                    for (ComponentName componentName3 : hashSet) {
                        if (!this.d.containsKey(componentName3)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                new StringBuilder("Adding listener record for ").append(componentName3);
                            }
                            this.d.put(componentName3, new he(componentName3));
                        }
                    }
                    it = this.d.entrySet().iterator();
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                new StringBuilder("Removing listener record for ").append(entry.getKey());
                            }
                            a((he) entry.getValue());
                            it.remove();
                        }
                    }
                }
                for (he heVar2 : this.d.values()) {
                    heVar2.d.add(hfVar);
                    c(heVar2);
                }
                return true;
            case wi.j /*1*/:
                hc hcVar = (hc) message.obj;
                componentName3 = hcVar.a;
                IBinder iBinder = hcVar.b;
                heVar = (he) this.d.get(componentName3);
                if (heVar != null) {
                    fd fdVar;
                    if (iBinder == null) {
                        fdVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof fd)) {
                            fdVar = new ff(iBinder);
                        } else {
                            fdVar = (fd) queryLocalInterface;
                        }
                    }
                    heVar.c = fdVar;
                    heVar.e = 0;
                    c(heVar);
                }
                return true;
            case wi.l /*2*/:
                heVar = (he) this.d.get((ComponentName) message.obj);
                if (heVar != null) {
                    a(heVar);
                }
                return true;
            case wi.z /*3*/:
                heVar = (he) this.d.get((ComponentName) message.obj);
                if (heVar != null) {
                    c(heVar);
                }
                return true;
            default:
                return false;
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            new StringBuilder("Connected to service ").append(componentName);
        }
        this.c.obtainMessage(1, new hc(componentName, iBinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            new StringBuilder("Disconnected from service ").append(componentName);
        }
        this.c.obtainMessage(2, componentName).sendToTarget();
    }

    private void a(he heVar) {
        if (heVar.b) {
            this.a.unbindService(this);
            heVar.b = false;
        }
        heVar.c = null;
    }

    private void b(he heVar) {
        if (!this.c.hasMessages(3, heVar.a)) {
            heVar.e++;
            if (heVar.e > 6) {
                new StringBuilder("Giving up on delivering ").append(heVar.d.size()).append(" tasks to ").append(heVar.a).append(" after ").append(heVar.e).append(" retries");
                heVar.d.clear();
                return;
            }
            int i = (1 << (heVar.e - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                new StringBuilder("Scheduling retry for ").append(i).append(" ms");
            }
            this.c.sendMessageDelayed(this.c.obtainMessage(3, heVar.a), (long) i);
        }
    }

    private void c(he heVar) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            new StringBuilder("Processing component ").append(heVar.a).append(", ").append(heVar.d.size()).append(" queued tasks");
        }
        if (!heVar.d.isEmpty()) {
            boolean z;
            if (heVar.b) {
                z = true;
            } else {
                heVar.b = this.a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(heVar.a), this, gw.a);
                if (heVar.b) {
                    heVar.e = 0;
                } else {
                    new StringBuilder("Unable to bind to listener ").append(heVar.a);
                    this.a.unbindService(this);
                }
                z = heVar.b;
            }
            if (!z || heVar.c == null) {
                b(heVar);
                return;
            }
            while (true) {
                hf hfVar = (hf) heVar.d.peek();
                if (hfVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        new StringBuilder("Sending task ").append(hfVar);
                    }
                    hfVar.a(heVar.c);
                    heVar.d.remove();
                } catch (DeadObjectException e) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        new StringBuilder("Remote service has died: ").append(heVar.a);
                    }
                } catch (RemoteException e2) {
                    new StringBuilder("RemoteException communicating with ").append(heVar.a);
                }
            }
            if (!heVar.d.isEmpty()) {
                b(heVar);
            }
        }
    }
}
