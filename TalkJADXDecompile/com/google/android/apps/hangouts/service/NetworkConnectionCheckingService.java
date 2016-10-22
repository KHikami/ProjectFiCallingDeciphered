package com.google.android.apps.hangouts.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import eai;
import eaj;
import glk;
import jyn;
import kae;

public class NetworkConnectionCheckingService extends IntentService {
    private static final boolean a;

    static {
        kae kae = glk.q;
        a = false;
    }

    public NetworkConnectionCheckingService() {
        super(NetworkConnectionCheckingService.class.getName());
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            CharSequence string = extras.getString("update_type", null);
            eaj eaj = (eaj) jyn.a(getApplicationContext(), eaj.class);
            eai a = eaj.a();
            if (!TextUtils.isEmpty(string)) {
                eai eai;
                if ("initialize_connection_state".equals(string)) {
                    if (a != eai.UNKNOWN) {
                        if (a) {
                            String valueOf = String.valueOf(a);
                            new StringBuilder(String.valueOf(valueOf).length() + 38).append("connection state already initialized: ").append(valueOf);
                            return;
                        }
                        return;
                    }
                } else if ("verify_connection_state".equals(string) && a.a() == extras.getBoolean("expected_connectivity")) {
                    return;
                }
                Context applicationContext = getApplicationContext();
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    eai = eai.DISCONNECTED;
                } else if (!activeNetworkInfo.isConnected()) {
                    eai = eai.DISCONNECTED;
                } else if (a(applicationContext)) {
                    eai = eai.CAPTIVE_PORTAL;
                } else {
                    eai = eai.CONNECTED;
                }
                eaj.a(eai);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.Context r8) {
        /*
        r3 = 0;
        r1 = 1;
        r2 = 0;
        r0 = biw.class;
        r0 = jyn.a(r8, r0);	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r0 = (biw) r0;	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r4 = "babel_captive_portal_detection_host_name";
        r5 = "https://clients3.google.com/generate_204";
        r4 = r0.a(r4, r5);	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r5 = "babel_captive_portal_detection_time_out";
        r6 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r5 = r0.a(r5, r6);	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r0 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r0.<init>(r4);	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r0 = r0.openConnection();	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0087, all -> 0x00a4 }
        r0.setConnectTimeout(r5);	 Catch:{ MalformedURLException -> 0x00cb, IOException -> 0x00c6, all -> 0x00ba }
        r0.setReadTimeout(r5);	 Catch:{ MalformedURLException -> 0x00cb, IOException -> 0x00c6, all -> 0x00ba }
        r4 = 0;
        r0.setUseCaches(r4);	 Catch:{ MalformedURLException -> 0x00cb, IOException -> 0x00c6, all -> 0x00ba }
        r4 = 1;
        r0.setInstanceFollowRedirects(r4);	 Catch:{ MalformedURLException -> 0x00cb, IOException -> 0x00c6, all -> 0x00ba }
        r3 = r0.getInputStream();	 Catch:{ MalformedURLException -> 0x00cb, IOException -> 0x00c6, all -> 0x00ba }
        r4 = r0.getResponseCode();	 Catch:{ MalformedURLException -> 0x00d1, IOException -> 0x00c6, all -> 0x00ba }
        r5 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        if (r4 == r5) goto L_0x0055;
    L_0x0040:
        if (r0 == 0) goto L_0x0045;
    L_0x0042:
        r0.disconnect();
    L_0x0045:
        if (r3 == 0) goto L_0x004a;
    L_0x0047:
        r3.close();	 Catch:{ IOException -> 0x004c }
    L_0x004a:
        r0 = r1;
    L_0x004b:
        return r0;
    L_0x004c:
        r0 = move-exception;
        r2 = "Babel_NetConnCheckSvc";
        r3 = "IO exception after check for captive portal ";
        glk.c(r2, r3, r0);
        goto L_0x004a;
    L_0x0055:
        if (r0 == 0) goto L_0x005a;
    L_0x0057:
        r0.disconnect();
    L_0x005a:
        if (r3 == 0) goto L_0x005f;
    L_0x005c:
        r3.close();	 Catch:{ IOException -> 0x0061 }
    L_0x005f:
        r0 = r2;
        goto L_0x004b;
    L_0x0061:
        r0 = move-exception;
        r1 = "Babel_NetConnCheckSvc";
        r3 = "IO exception after check for captive portal ";
        glk.c(r1, r3, r0);
        goto L_0x005f;
    L_0x006a:
        r0 = move-exception;
        r1 = r3;
    L_0x006c:
        r4 = "Babel_NetConnCheckSvc";
        r5 = "unexpected exception ";
        glk.c(r4, r5, r0);	 Catch:{ all -> 0x00bf }
        if (r3 == 0) goto L_0x0078;
    L_0x0075:
        r3.disconnect();
    L_0x0078:
        if (r1 == 0) goto L_0x005f;
    L_0x007a:
        r1.close();	 Catch:{ IOException -> 0x007e }
        goto L_0x005f;
    L_0x007e:
        r0 = move-exception;
        r1 = "Babel_NetConnCheckSvc";
        r3 = "IO exception after check for captive portal ";
        glk.c(r1, r3, r0);
        goto L_0x005f;
    L_0x0087:
        r0 = move-exception;
        r1 = r3;
    L_0x0089:
        r4 = "Babel_NetConnCheckSvc";
        r5 = "IO exception, probably not a captive portal ";
        glk.c(r4, r5, r0);	 Catch:{ all -> 0x00c4 }
        if (r1 == 0) goto L_0x0095;
    L_0x0092:
        r1.disconnect();
    L_0x0095:
        if (r3 == 0) goto L_0x005f;
    L_0x0097:
        r3.close();	 Catch:{ IOException -> 0x009b }
        goto L_0x005f;
    L_0x009b:
        r0 = move-exception;
        r1 = "Babel_NetConnCheckSvc";
        r3 = "IO exception after check for captive portal ";
        glk.c(r1, r3, r0);
        goto L_0x005f;
    L_0x00a4:
        r0 = move-exception;
        r1 = r3;
    L_0x00a6:
        if (r1 == 0) goto L_0x00ab;
    L_0x00a8:
        r1.disconnect();
    L_0x00ab:
        if (r3 == 0) goto L_0x00b0;
    L_0x00ad:
        r3.close();	 Catch:{ IOException -> 0x00b1 }
    L_0x00b0:
        throw r0;
    L_0x00b1:
        r1 = move-exception;
        r2 = "Babel_NetConnCheckSvc";
        r3 = "IO exception after check for captive portal ";
        glk.c(r2, r3, r1);
        goto L_0x00b0;
    L_0x00ba:
        r1 = move-exception;
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x00a6;
    L_0x00bf:
        r0 = move-exception;
        r7 = r1;
        r1 = r3;
        r3 = r7;
        goto L_0x00a6;
    L_0x00c4:
        r0 = move-exception;
        goto L_0x00a6;
    L_0x00c6:
        r1 = move-exception;
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0089;
    L_0x00cb:
        r1 = move-exception;
        r7 = r1;
        r1 = r3;
        r3 = r0;
        r0 = r7;
        goto L_0x006c;
    L_0x00d1:
        r1 = move-exception;
        r7 = r1;
        r1 = r3;
        r3 = r0;
        r0 = r7;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.hangouts.service.NetworkConnectionCheckingService.a(android.content.Context):boolean");
    }
}
