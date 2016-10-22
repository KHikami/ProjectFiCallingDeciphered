package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.provider.ContactsContract.RawContacts;
import android.widget.Toast;
import com.android.contacts.common.vcard.CancelActivity;
import com.android.contacts.common.vcard.ExportVCardActivity;
import java.text.NumberFormat;

/* compiled from: PG */
/* renamed from: ajp */
public final class ajp implements ajt, Callback {
    private final NotificationManager a;
    private final Activity b;
    private final Handler c;

    public ajp(Activity activity) {
        this.b = activity;
        this.a = (NotificationManager) activity.getSystemService("notification");
        this.c = new Handler(this);
    }

    static Notification a(Context context, int i, String str, String str2, int i2, String str3, int i3, int i4) {
        boolean z;
        int i5;
        Intent intent = new Intent(context, CancelActivity.class);
        intent.setData(new Builder().scheme("invalidscheme").authority("invalidauthority").appendQueryParameter("job_id", String.valueOf(i2)).appendQueryParameter("display_name", str3).appendQueryParameter("type", String.valueOf(i)).build());
        es esVar = new es(context);
        esVar.a(2, true);
        if (i3 == -1) {
            z = true;
        } else {
            z = false;
        }
        esVar.g = i3;
        esVar.h = i4;
        esVar.i = z;
        es a = esVar.c(str2).a((CharSequence) str);
        a.l = context.getResources().getColor(buf.cD);
        if (i == 1) {
            i5 = 17301633;
        } else {
            i5 = 17301640;
        }
        a.a(i5).d = PendingIntent.getActivity(context, 0, intent, 0);
        if (i3 > 0) {
            esVar.b(NumberFormat.getPercentInstance().format(((double) i4) / ((double) i3)));
        }
        return esVar.a();
    }

    static Notification a(Context context, String str) {
        es a = new es(context).a(true).a(17301624);
        a.l = context.getResources().getColor(buf.cD);
        a = a.a((CharSequence) str).b(str);
        a.d = PendingIntent.getActivity(context, 0, new Intent(context.getPackageName(), null), 0);
        return a.a();
    }

    static Notification a(Context context, String str, String str2, Intent intent) {
        return ajp.a(context, str, str2, intent, 0);
    }

    static Notification a(Context context, String str, String str2, Intent intent, int i) {
        es a = new es(context).a(true);
        a.l = context.getResources().getColor(buf.cD);
        a = a.a(17301634).a((CharSequence) str).b(str2);
        if (intent == null) {
            intent = new Intent(context.getPackageName(), null);
        }
        a.d = PendingIntent.getActivity(context, 0, intent, i);
        return a.a();
    }

    public final boolean handleMessage(Message message) {
        Toast.makeText(this.b, (String) message.obj, 1).show();
        return true;
    }

    public final void a(ajh ajh, int i, int i2) {
        String str;
        String string;
        if (ajh.d != null) {
            str = ajh.d;
            string = this.b.getString(buf.gT, new Object[]{str});
        } else {
            str = this.b.getString(buf.gV);
            string = this.b.getString(buf.gU);
        }
        if (i2 == 0) {
            this.c.obtainMessage(0, string).sendToTarget();
        }
        this.a.notify("VCardServiceProgress", i, ajp.a(this.b, 1, string, string, i, str, -1, 0));
    }

    public final void a(ajh ajh, int i, bfs bfs, int i2, int i3) {
        if (!bfs.b()) {
            String valueOf = String.valueOf(i3);
            String string = this.b.getString(buf.gg, new Object[]{String.valueOf(i2), valueOf, bfs.c()});
            this.a.notify("VCardServiceProgress", i, ajp.a(this.b.getApplicationContext(), 1, this.b.getString(buf.ft, new Object[]{bfs.c()}), string, i, ajh.d, i3, i2));
        }
    }

    public final void a(ajh ajh, int i, Uri uri) {
        Intent intent;
        String string = this.b.getString(buf.fu, new Object[]{ajh.d});
        if (uri != null) {
            String str = "android.intent.action.VIEW";
            intent = new Intent(str, RawContacts.getContactLookupUri(this.b.getContentResolver(), ContentUris.withAppendedId(RawContacts.CONTENT_URI, ContentUris.parseId(uri))));
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android.cursor.dir/contact");
        }
        intent.setPackage(this.b.getPackageName());
        this.a.notify("VCardServiceProgress", i, ajp.a(this.b, string, null, intent));
    }

    public final void b() {
        this.c.obtainMessage(0, this.b.getString(buf.gS)).sendToTarget();
    }

    public final void a(ajh ajh, int i) {
        this.a.notify("VCardServiceProgress", i, ajp.a(this.b, this.b.getString(buf.fs, new Object[]{ajh.d})));
    }

    public final void a(ajf ajf, int i) {
        String a = ExportVCardActivity.a(this.b, ajf.b);
        String string = this.b.getString(buf.ex);
        this.c.obtainMessage(0, string).sendToTarget();
        this.a.notify("VCardServiceProgress", i, ajp.a(this.b, 2, string, string, i, a, -1, 0));
    }

    public final void c() {
        this.c.obtainMessage(0, this.b.getString(buf.gQ)).sendToTarget();
    }
}
