package defpackage;

import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.android.dialer.app.DialtactsActivity;
import com.android.dialer.app.calllog.CallLogNotificationsService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: anj */
public final class anj {
    public static anj a;
    private final Context b;

    public anj(Context context) {
        this.b = context;
    }

    public final void a(Uri uri) {
        List a = amz.a(this.b).a.a(4);
        if (a != null) {
            if (a.isEmpty()) {
                a().cancel("DefaultVoicemailNotifier", 1);
                return;
            }
            String str;
            Resources resources = this.b.getResources();
            Map arrayMap = new ArrayMap();
            anc anc = null;
            Iterator it = a.iterator();
            CharSequence charSequence = null;
            while (it.hasNext()) {
                anc anc2 = (anc) it.next();
                if (buf.a(this.b, anc2.b, anc2.g, anc2.h)) {
                    it.remove();
                    this.b.getContentResolver().delete(anc2.a, null, null);
                } else {
                    if (((String) arrayMap.get(anc2.b)) == null) {
                        str = amz.a(this.b).a(anc2.b, anc2.c, anc2.g).d;
                        arrayMap.put(anc2.b, str);
                        if (!TextUtils.isEmpty(charSequence)) {
                            str = resources.getString(cob.cx, new Object[]{charSequence, str});
                        }
                    } else {
                        CharSequence charSequence2 = charSequence;
                    }
                    if (uri == null || anc2.a == null || ContentUris.parseId(uri) != ContentUris.parseId(anc2.a)) {
                        anc2 = anc;
                    }
                    anc = anc2;
                    charSequence = str;
                }
            }
            if (!a.isEmpty()) {
                CharSequence charSequence3;
                ih ihVar;
                if (a.size() == 1) {
                    charSequence3 = ((anc) a.get(0)).f;
                } else {
                    charSequence3 = null;
                }
                if (uri != null && anc == null) {
                    str = String.valueOf(uri);
                    Log.e("VoicemailNotifier", new StringBuilder(String.valueOf(str).length() + 49).append("The new call could not be found in the call log: ").append(str).toString());
                }
                CharSequence quantityString = resources.getQuantityString(buf.hU, a.size(), new Object[]{Integer.valueOf(a.size())});
                if (anc == null) {
                    ihVar = new ih(null, Integer.valueOf(0));
                } else {
                    PhoneAccountHandle a2;
                    if (anc.d == null || anc.e == null) {
                        a2 = axk.a(this.b, "tel");
                        if (a2 == null) {
                            ihVar = new ih(null, Integer.valueOf(-1));
                        }
                    } else {
                        a2 = new PhoneAccountHandle(ComponentName.unflattenFromString(anc.d), anc.e);
                    }
                    if (a2.getComponentName() != null) {
                        str = String.valueOf(a2.getComponentName());
                        new StringBuilder(String.valueOf(str).length() + 33).append("PhoneAccountHandle.ComponentInfo:").append(str);
                    }
                    Uri a3 = buf.a(b(), a2);
                    int i = buf.c() ? buf.b(b(), a2) ? 2 : 0 : -1;
                    ihVar = new ih(a3, Integer.valueOf(i));
                }
                Builder defaults = new Builder(this.b).setSmallIcon(17301630).setContentTitle(quantityString).setContentText(charSequence).setColor(resources.getColor(cob.ad)).setSound((Uri) ihVar.a).setDefaults(((Integer) ihVar.b).intValue());
                Intent intent = new Intent(this.b, CallLogNotificationsService.class);
                intent.setAction("com.android.dialer.calllog.ACTION_MARK_NEW_VOICEMAILS_AS_OLD");
                Builder autoCancel = defaults.setDeleteIntent(PendingIntent.getService(this.b, 0, intent, 0)).setAutoCancel(true);
                if (!TextUtils.isEmpty(charSequence3)) {
                    autoCancel.setStyle(new BigTextStyle().bigText(charSequence3));
                }
                Intent intent2 = new Intent(this.b, DialtactsActivity.class);
                intent2.putExtra("EXTRA_SHOW_TAB", 3);
                autoCancel.setContentIntent(PendingIntent.getActivity(this.b, 0, intent2, 134217728));
                if (anc != null) {
                    autoCancel.setTicker(aim.a(resources, cob.cw, (String) arrayMap.get(anc.b)));
                }
                a().notify("DefaultVoicemailNotifier", 1, autoCancel.build());
            }
        }
    }

    private final NotificationManager a() {
        return (NotificationManager) this.b.getSystemService("notification");
    }

    private final TelephonyManager b() {
        return (TelephonyManager) this.b.getSystemService("phone");
    }
}
