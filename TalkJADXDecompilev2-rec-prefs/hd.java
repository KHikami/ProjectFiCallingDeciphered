package p000;

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
    private final Context f16668a;
    private final HandlerThread f16669b;
    private final Handler f16670c;
    private final Map<ComponentName, he> f16671d = new HashMap();
    private Set<String> f16672e = new HashSet();

    public hd(Context context) {
        this.f16668a = context;
        this.f16669b = new HandlerThread("NotificationManagerCompat");
        this.f16669b.start();
        this.f16670c = new Handler(this.f16669b.getLooper(), this);
    }

    public void m19392a(hf hfVar) {
        this.f16670c.obtainMessage(0, hfVar).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        ComponentName componentName;
        he heVar;
        switch (message.what) {
            case 0:
                Iterator it;
                hf hfVar = (hf) message.obj;
                Set b = gw.m18750b(this.f16668a);
                if (!b.equals(this.f16672e)) {
                    this.f16672e = b;
                    List<ResolveInfo> queryIntentServices = this.f16668a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4);
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
                        if (!this.f16671d.containsKey(componentName3)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                new StringBuilder("Adding listener record for ").append(componentName3);
                            }
                            this.f16671d.put(componentName3, new he(componentName3));
                        }
                    }
                    it = this.f16671d.entrySet().iterator();
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                new StringBuilder("Removing listener record for ").append(entry.getKey());
                            }
                            m19389a((he) entry.getValue());
                            it.remove();
                        }
                    }
                }
                for (he heVar2 : this.f16671d.values()) {
                    heVar2.f16726d.add(hfVar);
                    m19391c(heVar2);
                }
                return true;
            case 1:
                hc hcVar = (hc) message.obj;
                componentName3 = hcVar.f16563a;
                IBinder iBinder = hcVar.f16564b;
                heVar = (he) this.f16671d.get(componentName3);
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
                    heVar.f16725c = fdVar;
                    heVar.f16727e = 0;
                    m19391c(heVar);
                }
                return true;
            case 2:
                heVar = (he) this.f16671d.get((ComponentName) message.obj);
                if (heVar != null) {
                    m19389a(heVar);
                }
                return true;
            case 3:
                heVar = (he) this.f16671d.get((ComponentName) message.obj);
                if (heVar != null) {
                    m19391c(heVar);
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
        this.f16670c.obtainMessage(1, new hc(componentName, iBinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            new StringBuilder("Disconnected from service ").append(componentName);
        }
        this.f16670c.obtainMessage(2, componentName).sendToTarget();
    }

    private void m19389a(he heVar) {
        if (heVar.f16724b) {
            this.f16668a.unbindService(this);
            heVar.f16724b = false;
        }
        heVar.f16725c = null;
    }

    private void m19390b(he heVar) {
        if (!this.f16670c.hasMessages(3, heVar.f16723a)) {
            heVar.f16727e++;
            if (heVar.f16727e > 6) {
                new StringBuilder("Giving up on delivering ").append(heVar.f16726d.size()).append(" tasks to ").append(heVar.f16723a).append(" after ").append(heVar.f16727e).append(" retries");
                heVar.f16726d.clear();
                return;
            }
            int i = (1 << (heVar.f16727e - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                new StringBuilder("Scheduling retry for ").append(i).append(" ms");
            }
            this.f16670c.sendMessageDelayed(this.f16670c.obtainMessage(3, heVar.f16723a), (long) i);
        }
    }

    private void m19391c(he heVar) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            new StringBuilder("Processing component ").append(heVar.f16723a).append(", ").append(heVar.f16726d.size()).append(" queued tasks");
        }
        if (!heVar.f16726d.isEmpty()) {
            boolean z;
            if (heVar.f16724b) {
                z = true;
            } else {
                heVar.f16724b = this.f16668a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(heVar.f16723a), this, gw.f16259a);
                if (heVar.f16724b) {
                    heVar.f16727e = 0;
                } else {
                    new StringBuilder("Unable to bind to listener ").append(heVar.f16723a);
                    this.f16668a.unbindService(this);
                }
                z = heVar.f16724b;
            }
            if (!z || heVar.f16725c == null) {
                m19390b(heVar);
                return;
            }
            while (true) {
                hf hfVar = (hf) heVar.f16726d.peek();
                if (hfVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        new StringBuilder("Sending task ").append(hfVar);
                    }
                    hfVar.mo2363a(heVar.f16725c);
                    heVar.f16726d.remove();
                } catch (DeadObjectException e) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        new StringBuilder("Remote service has died: ").append(heVar.f16723a);
                    }
                } catch (RemoteException e2) {
                    new StringBuilder("RemoteException communicating with ").append(heVar.f16723a);
                }
            }
            if (!heVar.f16726d.isEmpty()) {
                m19390b(heVar);
            }
        }
    }
}
