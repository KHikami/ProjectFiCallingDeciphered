package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.gcm.PendingCallback;
import java.util.HashSet;
import java.util.Set;

final class igo implements iga {
    final ify f17657a;
    private final Set<String> f17658b = new HashSet();
    private int f17659c;

    public igo(ify ify) {
        this.f17657a = ify;
    }

    public int mo3196a(Intent intent, int i) {
        if (intent == null) {
            m21754a(i);
        } else {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                    if (parcelableExtra instanceof PendingCallback) {
                        synchronized (this.f17658b) {
                            if (this.f17658b.add(stringExtra)) {
                                new igp(this, stringExtra, ((PendingCallback) parcelableExtra).m9745a(), bundle).start();
                            } else {
                                action = String.valueOf(this.f17657a.getPackageName());
                                new StringBuilder((String.valueOf(action).length() + 44) + String.valueOf(stringExtra).length()).append(action).append(" ").append(stringExtra).append(": Task already running, won't start another");
                                m21754a(i);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(this.f17657a.getPackageName());
                        Log.e("GcoreGcmTaskServiceHlpr", new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(stringExtra).length()).append(valueOf).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    Log.e("GcoreGcmTaskServiceHlpr", new StringBuilder(String.valueOf(action).length() + 37).append("Unknown action received ").append(action).append(", terminating").toString());
                }
                m21754a(i);
            } finally {
                m21754a(i);
            }
        }
        return 2;
    }

    private void m21754a(int i) {
        synchronized (this.f17658b) {
            this.f17659c = i;
            if (this.f17658b.size() == 0) {
                this.f17657a.stopSelf(this.f17659c);
            }
        }
    }

    void m21756a(String str) {
        synchronized (this.f17658b) {
            this.f17658b.remove(str);
            if (this.f17658b.isEmpty()) {
                this.f17657a.stopSelf(this.f17659c);
            }
        }
    }
}
