package com.android.contacts.common.vcard;

import ajc;
import ajd;
import ajf;
import ajg;
import ajh;
import ajq;
import ajt;
import aju;
import ajv;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
public class VCardService extends Service {
    private final ExecutorService a;
    private final SparseArray b;
    private final List c;
    private final Set d;
    private int e;
    private ajv f;
    private String g;

    public VCardService() {
        this.a = Executors.newSingleThreadExecutor();
        this.b = new SparseArray();
        this.c = new ArrayList();
        this.d = new HashSet();
    }

    public void onCreate() {
        super.onCreate();
        this.f = new ajv(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || intent.getExtras() == null) {
            this.g = null;
        } else {
            this.g = intent.getExtras().getString("CALLING_ACTIVITY");
        }
        return 1;
    }

    public IBinder onBind(Intent intent) {
        return this.f;
    }

    public void onDestroy() {
        b();
        for (String str : fileList()) {
            if (str.startsWith("import_tmp_")) {
                String str2 = "Remove a temporary file: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                deleteFile(str);
            }
        }
        super.onDestroy();
    }

    public final synchronized void a(List list, ajt ajt) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            ajh ajh = (ajh) list.get(i);
            if (a(new ajg(this, ajt, ajh, this.e))) {
                if (ajt != null) {
                    ajt.a(ajh, this.e, i);
                }
                this.e++;
                i++;
            } else if (ajt != null) {
                ajt.b();
            }
        }
    }

    public final synchronized void a(ajf ajf, ajt ajt) {
        if (a(new ajd(this, ajf, this.e, this.g))) {
            if (this.d.add(ajf.b.getEncodedPath())) {
                ajt.a(ajf, this.e);
                this.e++;
            } else {
                Log.w("VCardService", String.format("The path %s is already reserved. Reject export request", new Object[]{ajf.b.getEncodedPath()}));
                ajt.c();
            }
        } else {
            ajt.c();
        }
    }

    private final synchronized boolean a(ajq ajq) {
        boolean z;
        try {
            this.a.execute(ajq);
            this.b.put(this.e, ajq);
            z = true;
        } catch (Throwable e) {
            Log.w("VCardService", "Failed to excetute a job.", e);
            z = false;
        }
        return z;
    }

    public final synchronized void a(ajc ajc, ajt ajt) {
        int i = ajc.a;
        ajq ajq = (ajq) this.b.get(i);
        this.b.remove(i);
        if (ajq != null) {
            ajq.cancel(true);
            if (ajq.a() == 2) {
                String.format("Cancel reservation for the path %s if appropriate", new Object[]{((ajd) ajq).b.b.getEncodedPath()});
                if (!this.d.remove(((ajd) ajq).b.b.getEncodedPath())) {
                    Log.w("VCardService", "Not reserved.");
                }
            }
        } else {
            Log.w("VCardService", String.format("Tried to remove unknown job (id: %d)", new Object[]{Integer.valueOf(i)}));
        }
        a();
    }

    private final synchronized void a() {
        if (this.b.size() > 0) {
            int size = this.b.size();
            int[] iArr = new int[size];
            int i = 0;
            while (i < size) {
                int keyAt = this.b.keyAt(i);
                if (((ajq) this.b.valueAt(i)).isDone()) {
                    iArr[i] = keyAt;
                    i++;
                } else {
                    String.format("Found unfinished job (id: %d)", new Object[]{Integer.valueOf(keyAt)});
                    for (int i2 = 0; i2 < i; i2++) {
                        this.b.remove(iArr[i2]);
                    }
                }
            }
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            this.a.shutdown();
            stopSelf();
        }
    }

    public final synchronized void a(String str) {
        if (this.a.isShutdown()) {
            Log.w("VCardService", "MediaScanner update is requested after executor's being shut down. Ignoring the update request");
        } else {
            aju aju = new aju(this, str);
            this.c.add(aju);
            aju.a.connect();
        }
    }

    public final synchronized void a(aju aju) {
        this.c.remove(aju);
        a();
    }

    public final synchronized void a(int i) {
        this.b.remove(i);
        a();
    }

    public final synchronized void b(int i) {
        ajq ajq = (ajq) this.b.get(i);
        this.b.remove(i);
        if (ajq == null) {
            Log.w("VCardService", String.format("Tried to remove unknown job (id: %d)", new Object[]{Integer.valueOf(i)}));
        } else if (ajq instanceof ajd) {
            this.d.remove(((ajd) ajq).b.b.getEncodedPath());
        } else {
            Log.w("VCardService", String.format("Removed job (id: %s) isn't ExportProcessor", new Object[]{Integer.valueOf(i)}));
        }
        a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void b() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = 0;
        r1 = r0;
    L_0x0003:
        r0 = r3.b;	 Catch:{ all -> 0x0027 }
        r0 = r0.size();	 Catch:{ all -> 0x0027 }
        if (r1 >= r0) goto L_0x001b;
    L_0x000b:
        r0 = r3.b;	 Catch:{ all -> 0x0027 }
        r0 = r0.valueAt(r1);	 Catch:{ all -> 0x0027 }
        r0 = (ajq) r0;	 Catch:{ all -> 0x0027 }
        r2 = 1;
        r0.cancel(r2);	 Catch:{ all -> 0x0027 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0003;
    L_0x001b:
        r0 = r3.b;	 Catch:{ all -> 0x0027 }
        r0.clear();	 Catch:{ all -> 0x0027 }
        r0 = r3.a;	 Catch:{ all -> 0x0027 }
        r0.shutdown();	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);
        return;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.contacts.common.vcard.VCardService.b():void");
    }
}
