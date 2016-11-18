package defpackage;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

public final class gu implements fo, fp {
    private Builder a;
    private final Bundle b;
    private List<Bundle> c = new ArrayList();
    private RemoteViews d;
    private RemoteViews e;

    public gu(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
        this.a = new Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
        this.b = new Bundle();
        if (bundle != null) {
            this.b.putAll(bundle);
        }
        if (z3) {
            this.b.putBoolean("android.support.localOnly", true);
        }
        if (str != null) {
            this.b.putString("android.support.groupKey", str);
            if (z4) {
                this.b.putBoolean("android.support.isGroupSummary", true);
            } else {
                this.b.putBoolean("android.support.useSideChannel", true);
            }
        }
        if (str2 != null) {
            this.b.putString("android.support.sortKey", str2);
        }
        this.d = remoteViews2;
        this.e = remoteViews3;
    }

    public void a(gq gqVar) {
        this.c.add(gt.a(this.a, gqVar));
    }

    public Builder a() {
        return this.a;
    }

    public Notification b() {
        Notification build = this.a.build();
        Bundle a = gt.a(build);
        Bundle bundle = new Bundle(this.b);
        for (String str : this.b.keySet()) {
            if (a.containsKey(str)) {
                bundle.remove(str);
            }
        }
        a.putAll(bundle);
        SparseArray a2 = gt.a(this.c);
        if (a2 != null) {
            gt.a(build).putSparseParcelableArray("android.support.actionExtras", a2);
        }
        if (this.d != null) {
            build.contentView = this.d;
        }
        if (this.e != null) {
            build.bigContentView = this.e;
        }
        return build;
    }
}
