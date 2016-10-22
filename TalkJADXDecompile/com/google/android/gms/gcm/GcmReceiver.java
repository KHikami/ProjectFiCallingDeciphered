package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import iw;

public class GcmReceiver extends iw {
    private static String a;

    static {
        a = "gcm.googleapis.com/refresh";
    }

    private void c(Context context, Intent intent) {
        if (isOrderedBroadcast()) {
            setResultCode(HttpStatusCodes.STATUS_CODE_SERVER_ERROR);
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null) {
            Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        } else {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            String valueOf;
            String valueOf2;
            if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                valueOf = String.valueOf(serviceInfo.packageName);
                valueOf2 = String.valueOf(serviceInfo.name);
                Log.e("GcmReceiver", new StringBuilder((String.valueOf(valueOf).length() + 94) + String.valueOf(valueOf2).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(valueOf).append("/").append(valueOf2).toString());
            } else {
                String valueOf3;
                valueOf2 = serviceInfo.name;
                if (valueOf2.startsWith(".")) {
                    valueOf3 = String.valueOf(context.getPackageName());
                    valueOf2 = String.valueOf(valueOf2);
                    valueOf2 = valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3);
                }
                if (Log.isLoggable("GcmReceiver", 3)) {
                    valueOf3 = "Restricting intent to a specific service: ";
                    valueOf = String.valueOf(valueOf2);
                    if (valueOf.length() != 0) {
                        valueOf3.concat(valueOf);
                    } else {
                        valueOf = new String(valueOf3);
                    }
                }
                intent.setClassName(context.getPackageName(), valueOf2);
            }
        }
        try {
            if ((context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 ? iw.a(context, intent) : context.startService(intent)) == null) {
                Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
                if (isOrderedBroadcast()) {
                    setResultCode(HttpStatusCodes.STATUS_CODE_NOT_FOUND);
                }
            } else if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (Throwable e) {
            Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e);
            if (isOrderedBroadcast()) {
                setResultCode(HttpStatusCodes.STATUS_CODE_UNAUTHORIZED);
            }
        }
    }

    public void b(Context context, Intent intent) {
        c(context, intent);
    }

    public void onReceive(Context context, Intent intent) {
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("from");
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction()) || "google.com/iid".equals(stringExtra) || a.equals(stringExtra)) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            b(context, intent);
        } else {
            c(context, intent);
        }
        if (isOrderedBroadcast() && getResultCode() == 0) {
            setResultCode(-1);
        }
    }
}
