import java.util.HashMap;
import java.util.Map;

final class iaf<T> {
    private final Map<T, iay<T>> a;

    iaf() {
        this.a = new HashMap();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.os.IBinder r12) {
        /*
        r11 = this;
        r2 = r11.a;
        monitor-enter(r2);
        r3 = iad.a(r12);	 Catch:{ all -> 0x00ab }
        r4 = new iat;	 Catch:{ all -> 0x00ab }
        r4.<init>();	 Catch:{ all -> 0x00ab }
        r0 = r11.a;	 Catch:{ all -> 0x00ab }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00ab }
        r5 = r0.iterator();	 Catch:{ all -> 0x00ab }
    L_0x0016:
        r0 = r5.hasNext();	 Catch:{ all -> 0x00ab }
        if (r0 == 0) goto L_0x00ae;
    L_0x001c:
        r0 = r5.next();	 Catch:{ all -> 0x00ab }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00ab }
        r1 = r0.getValue();	 Catch:{ all -> 0x00ab }
        r1 = (iay) r1;	 Catch:{ all -> 0x00ab }
        r6 = new com.google.android.gms.wearable.internal.AddListenerRequest;	 Catch:{ RemoteException -> 0x0071 }
        r6.<init>(r1);	 Catch:{ RemoteException -> 0x0071 }
        r3.a(r4, r6);	 Catch:{ RemoteException -> 0x0071 }
        r6 = "WearableClient";
        r7 = 2;
        r6 = android.util.Log.isLoggable(r6, r7);	 Catch:{ RemoteException -> 0x0071 }
        if (r6 == 0) goto L_0x0016;
    L_0x0039:
        r6 = r0.getKey();	 Catch:{ RemoteException -> 0x0071 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ RemoteException -> 0x0071 }
        r7 = java.lang.String.valueOf(r1);	 Catch:{ RemoteException -> 0x0071 }
        r8 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0071 }
        r9 = java.lang.String.valueOf(r6);	 Catch:{ RemoteException -> 0x0071 }
        r9 = r9.length();	 Catch:{ RemoteException -> 0x0071 }
        r9 = r9 + 27;
        r10 = java.lang.String.valueOf(r7);	 Catch:{ RemoteException -> 0x0071 }
        r10 = r10.length();	 Catch:{ RemoteException -> 0x0071 }
        r9 = r9 + r10;
        r8.<init>(r9);	 Catch:{ RemoteException -> 0x0071 }
        r9 = "onPostInitHandler: added: ";
        r8 = r8.append(r9);	 Catch:{ RemoteException -> 0x0071 }
        r6 = r8.append(r6);	 Catch:{ RemoteException -> 0x0071 }
        r8 = "/";
        r6 = r6.append(r8);	 Catch:{ RemoteException -> 0x0071 }
        r6.append(r7);	 Catch:{ RemoteException -> 0x0071 }
        goto L_0x0016;
    L_0x0071:
        r6 = move-exception;
        r0 = r0.getKey();	 Catch:{ all -> 0x00ab }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00ab }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ab }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r7 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x00ab }
        r7 = r7.length();	 Catch:{ all -> 0x00ab }
        r7 = r7 + 32;
        r8 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ab }
        r8 = r8.length();	 Catch:{ all -> 0x00ab }
        r7 = r7 + r8;
        r6.<init>(r7);	 Catch:{ all -> 0x00ab }
        r7 = "onPostInitHandler: Didn't add: ";
        r6 = r6.append(r7);	 Catch:{ all -> 0x00ab }
        r0 = r6.append(r0);	 Catch:{ all -> 0x00ab }
        r6 = "/";
        r0 = r0.append(r6);	 Catch:{ all -> 0x00ab }
        r0.append(r1);	 Catch:{ all -> 0x00ab }
        goto L_0x0016;
    L_0x00ab:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00ab }
        throw r0;
    L_0x00ae:
        monitor-exit(r2);	 Catch:{ all -> 0x00ab }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: iaf.a(android.os.IBinder):void");
    }
}
