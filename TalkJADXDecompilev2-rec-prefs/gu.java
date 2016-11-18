package p000;

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
    private Builder f16154a;
    private final Bundle f16155b;
    private List<Bundle> f16156c = new ArrayList();
    private RemoteViews f16157d;
    private RemoteViews f16158e;

    public gu(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
        this.f16154a = new Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
        this.f16155b = new Bundle();
        if (bundle != null) {
            this.f16155b.putAll(bundle);
        }
        if (z3) {
            this.f16155b.putBoolean("android.support.localOnly", true);
        }
        if (str != null) {
            this.f16155b.putString("android.support.groupKey", str);
            if (z4) {
                this.f16155b.putBoolean("android.support.isGroupSummary", true);
            } else {
                this.f16155b.putBoolean("android.support.useSideChannel", true);
            }
        }
        if (str2 != null) {
            this.f16155b.putString("android.support.sortKey", str2);
        }
        this.f16157d = remoteViews2;
        this.f16158e = remoteViews3;
    }

    public void mo2304a(gq gqVar) {
        this.f16156c.add(gt.m18499a(this.f16154a, gqVar));
    }

    public Builder mo2303a() {
        return this.f16154a;
    }

    public Notification mo2305b() {
        Notification build = this.f16154a.build();
        Bundle a = gt.m18500a(build);
        Bundle bundle = new Bundle(this.f16155b);
        for (String str : this.f16155b.keySet()) {
            if (a.containsKey(str)) {
                bundle.remove(str);
            }
        }
        a.putAll(bundle);
        SparseArray a2 = gt.m18501a(this.f16156c);
        if (a2 != null) {
            gt.m18500a(build).putSparseParcelableArray("android.support.actionExtras", a2);
        }
        if (this.f16157d != null) {
            build.contentView = this.f16157d;
        }
        if (this.f16158e != null) {
            build.bigContentView = this.f16158e;
        }
        return build;
    }
}