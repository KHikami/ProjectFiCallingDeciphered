package com.android.dialer.app.calllog;

import ade;
import amz;
import anc;
import android.app.IntentService;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog.Calls;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import anj;
import anu;
import anv;
import aoa;
import aoj;
import arq;
import avl;
import aws;
import awt;
import awy;
import axk;
import buf;
import cob;
import java.util.List;
import rl;
import rq;

/* compiled from: PG */
public class CallLogNotificationsService extends IntentService {
    private aoa a;

    public CallLogNotificationsService() {
        super("CallLogNotificationsService");
    }

    public static void a(Context context, Uri uri) {
        if (axk.f(context)) {
            Intent intent = new Intent(context, CallLogNotificationsService.class);
            intent.setAction("com.android.dialer.calllog.UPDATE_VOICEMAIL_NOTIFICATIONS");
            if (uri != null) {
                intent.putExtra("NEW_VOICEMAIL_URI", uri);
            }
            context.startService(intent);
        }
    }

    protected void onHandleIntent(Intent intent) {
        if (intent != null && buf.c((Context) this, "android.permission.READ_CALL_LOG")) {
            String action = intent.getAction();
            Object obj = -1;
            switch (action.hashCode()) {
                case -1256247693:
                    if (action.equals("com.android.dialer.calllog.ACTION_MARK_NEW_MISSED_CALLS_AS_OLD")) {
                        obj = 3;
                        break;
                    }
                    break;
                case -788737331:
                    if (action.equals("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION")) {
                        obj = 5;
                        break;
                    }
                    break;
                case -232689031:
                    if (action.equals("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION")) {
                        obj = 4;
                        break;
                    }
                    break;
                case 896999778:
                    if (action.equals("com.android.dialer.calllog.UPDATE_MISSED_CALL_NOTIFICATIONS")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 1549706025:
                    if (action.equals("com.android.dialer.calllog.UPDATE_VOICEMAIL_NOTIFICATIONS")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 1577487994:
                    if (action.equals("com.android.dialer.calllog.ACTION_MARK_NEW_VOICEMAILS_AS_OLD")) {
                        obj = null;
                        break;
                    }
                    break;
            }
            String str;
            anu a;
            switch (obj) {
                case rl.c /*0*/:
                    if (this.a == null) {
                        this.a = new aoa(this, getContentResolver());
                    }
                    aoa aoa = this.a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("new");
                    stringBuilder.append(" = 1 AND ");
                    stringBuilder.append("type");
                    stringBuilder.append(" = ?");
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("new", "0");
                    aoa.startUpdate(50, null, Calls.CONTENT_URI_WITH_VOICEMAIL, contentValues, stringBuilder.toString(), new String[]{Integer.toString(4)});
                case rq.b /*1*/:
                    Uri uri = (Uri) intent.getParcelableExtra("NEW_VOICEMAIL_URI");
                    if (anj.a == null) {
                        getContentResolver();
                        anj.a = new anj(this);
                    }
                    anj.a.a(uri);
                case rq.c /*2*/:
                    int i;
                    int intExtra = intent.getIntExtra("MISSED_CALL_COUNT", -1);
                    action = intent.getStringExtra("MISSED_CALL_NUMBER");
                    anu a2 = anu.a(this);
                    List a3 = amz.a(a2.a).a.a(3);
                    if (intExtra != -1) {
                        i = intExtra;
                    } else if (a3 != null) {
                        i = a3.size();
                    } else {
                        return;
                    }
                    if (i == 0) {
                        AsyncTask.execute(new anv(a2));
                        return;
                    }
                    int i2;
                    CharSequence a4;
                    Object obj2 = (a3 == null || a3.size() != i) ? null : 1;
                    anc anc = obj2 != null ? (anc) a3.get(0) : null;
                    long currentTimeMillis = obj2 != null ? anc.h : System.currentTimeMillis();
                    if (obj2 != null) {
                        str = anc.b;
                    } else {
                        str = action;
                    }
                    Builder builder = new Builder(a2.a);
                    if (i == 1) {
                        int i3;
                        amz a5 = amz.a(a2.a);
                        if (obj2 != null) {
                            i3 = anc.c;
                        } else {
                            i3 = 1;
                        }
                        aws a6 = a5.a(str, i3, obj2 != null ? anc.g : null);
                        if (a6.o == 1) {
                            i2 = cob.cv;
                        } else {
                            i2 = cob.cq;
                        }
                        if (TextUtils.equals(a6.d, a6.i) || TextUtils.equals(a6.d, a6.h)) {
                            a4 = buf.a(BidiFormatter.getInstance().unicodeWrap(a6.d, TextDirectionHeuristics.LTR));
                        } else {
                            a4 = a6.d;
                        }
                        aoj aoj = new aoj(a2.a, a6);
                        avl.b();
                        int dimensionPixelSize = aoj.a.getResources().getDimensionPixelSize(buf.hl);
                        Drawable a7 = aoj.a();
                        if (a7 == null) {
                            a7 = new ade(aoj.a.getResources());
                            a7.d = true;
                            if (new awt(aoj.a, buf.g(aoj.a)).a(aoj.b.p)) {
                                a7.a = 2;
                            }
                            a7.a(aoj.b.d, aoj.b.c);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        a7.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        a7.draw(canvas);
                        if (createBitmap != null) {
                            builder.setLargeIcon(createBitmap);
                        }
                    } else {
                        i2 = cob.cu;
                        a4 = a2.a.getString(cob.ct, new Object[]{Integer.valueOf(i)});
                    }
                    Builder builder2 = new Builder(a2.a);
                    builder2.setSmallIcon(17301631).setColor(a2.a.getResources().getColor(cob.ad)).setContentTitle(a2.a.getText(cob.dr)).setContentText(a2.a.getText(i2)).setContentIntent(a2.a()).setAutoCancel(true).setWhen(currentTimeMillis).setDeleteIntent(a2.b());
                    builder.setSmallIcon(17301631).setColor(a2.a.getResources().getColor(cob.ad)).setContentTitle(a2.a.getText(i2)).setContentText(a4).setContentIntent(a2.a()).setAutoCancel(true).setWhen(currentTimeMillis).setDeleteIntent(a2.b()).setPublicVersion(builder2.build());
                    if (buf.a(a2.a) && i == 1 && !TextUtils.isEmpty(str) && !TextUtils.equals(str, a2.a.getString(cob.cf))) {
                        i2 = cob.aD;
                        a4 = a2.a.getString(cob.cr);
                        Intent intent2 = new Intent(a2.a, CallLogNotificationsService.class);
                        intent2.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION");
                        intent2.putExtra("MISSED_CALL_NUMBER", str);
                        builder.addAction(i2, a4, PendingIntent.getService(a2.a, 0, intent2, 134217728));
                        if (!awy.a(str)) {
                            i2 = cob.ax;
                            a4 = a2.a.getString(cob.cs);
                            intent2 = new Intent(a2.a, CallLogNotificationsService.class);
                            intent2.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION");
                            intent2.putExtra("MISSED_CALL_NUMBER", str);
                            builder.addAction(i2, a4, PendingIntent.getService(a2.a, 0, intent2, 134217728));
                        }
                    }
                    Notification build = builder.build();
                    build.flags |= 1;
                    build.defaults |= 4;
                    a2.c().notify("MissedCallNotifier", 1, build);
                case rl.e /*3*/:
                    amz.b(this);
                case rl.f /*4*/:
                    a = anu.a(this);
                    action = intent.getStringExtra("MISSED_CALL_NUMBER");
                    anu.b(a.a);
                    amz.b(a.a);
                    buf.d(a.a, new arq(action).a().setFlags(268435456));
                case rl.g /*5*/:
                    a = anu.a(this);
                    CharSequence stringExtra = intent.getStringExtra("MISSED_CALL_NUMBER");
                    anu.b(a.a);
                    amz.b(a.a);
                    buf.d(a.a, buf.d(stringExtra).setFlags(268435456));
                default:
                    str = String.valueOf(intent);
                    new StringBuilder(String.valueOf(str).length() + 34).append("onHandleIntent: could not handle: ").append(str);
            }
        }
    }
}
