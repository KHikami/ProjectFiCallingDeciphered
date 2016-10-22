package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.gcm.PendingCallback;
import java.util.HashSet;
import java.util.Set;

/* renamed from: igo */
final class igo implements iga {
    final ify a;
    private final Set<String> b;
    private int c;

    public igo(ify ify) {
        this.b = new HashSet();
        this.a = ify;
    }

    public int a(Intent intent, int i) {
        if (intent == null) {
            a(i);
        } else {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                    if (parcelableExtra instanceof PendingCallback) {
                        synchronized (this.b) {
                            if (this.b.add(stringExtra)) {
                                new igp(this, stringExtra, ((PendingCallback) parcelableExtra).a(), bundle).start();
                            } else {
                                action = String.valueOf(this.a.getPackageName());
                                new StringBuilder((String.valueOf(action).length() + 44) + String.valueOf(stringExtra).length()).append(action).append(" ").append(stringExtra).append(": Task already running, won't start another");
                                a(i);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(this.a.getPackageName());
                        Log.e("GcoreGcmTaskServiceHlpr", new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(stringExtra).length()).append(valueOf).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    Log.e("GcoreGcmTaskServiceHlpr", new StringBuilder(String.valueOf(action).length() + 37).append("Unknown action received ").append(action).append(", terminating").toString());
                }
                a(i);
            } finally {
                a(i);
            }
        }
        return 2;
    }

    private void a(int i) {
        synchronized (this.b) {
            this.c = i;
            if (this.b.size() == 0) {
                this.a.stopSelf(this.c);
            }
        }
    }

    void a(String str) {
        synchronized (this.b) {
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.a.stopSelf(this.c);
            }
        }
    }
}
