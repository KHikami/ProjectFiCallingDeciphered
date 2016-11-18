package p000;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

final class gzt {
    static gzt f16456a;
    private final Context f16457b;

    private gzt(Context context) {
        this.f16457b = context.getApplicationContext();
    }

    static synchronized gzt m19050a(Context context) {
        gzt gzt;
        synchronized (gzt.class) {
            if (f16456a == null) {
                f16456a = new gzt(context);
            }
            gzt = f16456a;
        }
        return gzt;
    }

    static String m19051a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private static String m19052a(String str) {
        return str.substring(6);
    }

    private PendingIntent m19053b(Bundle bundle) {
        Intent intent;
        Object a = gzt.m19051a(bundle, "gcm.n.click_action");
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(a)) {
            launchIntentForPackage = this.f16457b.getPackageManager().getLaunchIntentForPackage(this.f16457b.getPackageName());
            if (launchIntentForPackage == null) {
                return null;
            }
            intent = launchIntentForPackage;
        } else {
            launchIntentForPackage = new Intent(a);
            launchIntentForPackage.setPackage(this.f16457b.getPackageName());
            launchIntentForPackage.setFlags(268435456);
            intent = launchIntentForPackage;
        }
        Bundle bundle2 = new Bundle(bundle);
        gzc.m8977b(bundle2);
        intent.putExtras(bundle2);
        for (String str : bundle2.keySet()) {
            if (str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                intent.removeExtra(str);
            }
        }
        return PendingIntent.getActivity(this.f16457b, (int) SystemClock.uptimeMillis(), intent, 1073741824);
    }

    private String m19054b(Bundle bundle, String str) {
        Object a = gzt.m19051a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        valueOf = gzt.m19051a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        Resources resources = this.f16457b.getResources();
        int identifier = resources.getIdentifier(valueOf, "string", this.f16457b.getPackageName());
        if (identifier == 0) {
            String valueOf3 = String.valueOf(str);
            valueOf2 = String.valueOf("_loc_key");
            valueOf2 = String.valueOf(gzt.m19052a(valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3)));
            new StringBuilder((String.valueOf(valueOf2).length() + 49) + String.valueOf(valueOf).length()).append(valueOf2).append(" resource not found: ").append(valueOf).append(" Default value will be used.");
            return null;
        }
        String valueOf4 = String.valueOf(str);
        valueOf2 = String.valueOf("_loc_args");
        valueOf4 = gzt.m19051a(bundle, valueOf2.length() != 0 ? valueOf4.concat(valueOf2) : new String(valueOf4));
        if (TextUtils.isEmpty(valueOf4)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(valueOf4);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return resources.getString(identifier, strArr);
        } catch (JSONException e) {
            valueOf = String.valueOf(str);
            valueOf2 = String.valueOf("_loc_args");
            valueOf2 = String.valueOf(gzt.m19052a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
            new StringBuilder((String.valueOf(valueOf2).length() + 41) + String.valueOf(valueOf4).length()).append("Malformed ").append(valueOf2).append(": ").append(valueOf4).append("  Default value will be used.");
            return null;
        } catch (MissingFormatArgumentException e2) {
            new StringBuilder((String.valueOf(valueOf).length() + 58) + String.valueOf(valueOf4).length()).append("Missing format argument for ").append(valueOf).append(": ").append(valueOf4).append(" Default value will be used.");
            return null;
        }
    }

    boolean m19055a(Bundle bundle) {
        String a;
        String a2;
        try {
            int identifier;
            int i;
            Object a3;
            Uri uri;
            PendingIntent b;
            fx a4;
            Notification b2;
            NotificationManager notificationManager;
            CharSequence b3 = m19054b(bundle, "gcm.n.title");
            CharSequence b4 = m19054b(bundle, "gcm.n.body");
            a = gzt.m19051a(bundle, "gcm.n.icon");
            if (!TextUtils.isEmpty(a)) {
                Resources resources = this.f16457b.getResources();
                identifier = resources.getIdentifier(a, "drawable", this.f16457b.getPackageName());
                if (identifier != 0) {
                    i = identifier;
                } else {
                    identifier = resources.getIdentifier(a, "mipmap", this.f16457b.getPackageName());
                    if (identifier != 0) {
                        i = identifier;
                    } else {
                        new StringBuilder(String.valueOf(a).length() + 57).append("Icon resource ").append(a).append(" not found. Notification will use app icon.");
                    }
                }
                a3 = gzt.m19051a(bundle, "gcm.n.color");
                a2 = gzt.m19051a(bundle, "gcm.n.sound2");
                if (TextUtils.isEmpty(a2)) {
                    uri = null;
                } else if (!"default".equals(a2) || this.f16457b.getResources().getIdentifier(a2, "raw", this.f16457b.getPackageName()) == 0) {
                    uri = RingtoneManager.getDefaultUri(2);
                } else {
                    String valueOf = String.valueOf("android.resource://");
                    String valueOf2 = String.valueOf(this.f16457b.getPackageName());
                    uri = Uri.parse(new StringBuilder(((String.valueOf(valueOf).length() + 5) + String.valueOf(valueOf2).length()) + String.valueOf(a2).length()).append(valueOf).append(valueOf2).append("/raw/").append(a2).toString());
                }
                b = m19053b(bundle);
                a4 = new fx(this.f16457b).m16448e(true).m16417a(i);
                if (TextUtils.isEmpty(b3)) {
                    a4.m16429a(b3);
                } else {
                    a4.m16429a(this.f16457b.getApplicationInfo().loadLabel(this.f16457b.getPackageManager()));
                }
                if (!TextUtils.isEmpty(b4)) {
                    a4.m16436b(b4);
                }
                if (!TextUtils.isEmpty(a3)) {
                    a4.m16447e(Color.parseColor(a3));
                }
                if (uri != null) {
                    a4.m16424a(uri);
                }
                if (b != null) {
                    a4.m16421a(b);
                }
                b2 = a4.m16433b();
                a = gzt.m19051a(bundle, "gcm.n.tag");
                notificationManager = (NotificationManager) this.f16457b.getSystemService("notification");
                if (TextUtils.isEmpty(a)) {
                    a = "GCM-Notification:" + SystemClock.uptimeMillis();
                }
                notificationManager.notify(a, 0, b2);
                return true;
            }
            identifier = this.f16457b.getApplicationInfo().icon;
            if (identifier == 0) {
                identifier = 17301651;
            }
            i = identifier;
            a3 = gzt.m19051a(bundle, "gcm.n.color");
            a2 = gzt.m19051a(bundle, "gcm.n.sound2");
            if (TextUtils.isEmpty(a2)) {
                uri = null;
            } else {
                if ("default".equals(a2)) {
                }
                uri = RingtoneManager.getDefaultUri(2);
            }
            b = m19053b(bundle);
            a4 = new fx(this.f16457b).m16448e(true).m16417a(i);
            if (TextUtils.isEmpty(b3)) {
                a4.m16429a(this.f16457b.getApplicationInfo().loadLabel(this.f16457b.getPackageManager()));
            } else {
                a4.m16429a(b3);
            }
            if (TextUtils.isEmpty(b4)) {
                a4.m16436b(b4);
            }
            if (TextUtils.isEmpty(a3)) {
                a4.m16447e(Color.parseColor(a3));
            }
            if (uri != null) {
                a4.m16424a(uri);
            }
            if (b != null) {
                a4.m16421a(b);
            }
            b2 = a4.m16433b();
            a = gzt.m19051a(bundle, "gcm.n.tag");
            notificationManager = (NotificationManager) this.f16457b.getSystemService("notification");
            if (TextUtils.isEmpty(a)) {
                a = "GCM-Notification:" + SystemClock.uptimeMillis();
            }
            notificationManager.notify(a, 0, b2);
            return true;
        } catch (gzu e) {
            String str = "GcmNotification";
            a = "Failed to show notification: ";
            a2 = String.valueOf(e.getMessage());
            Log.e(str, a2.length() != 0 ? a.concat(a2) : new String(a));
            return false;
        }
    }
}
