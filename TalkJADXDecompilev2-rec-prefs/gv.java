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

public final class gv implements fo, fp {
    private Builder f16199a;
    private Bundle f16200b;
    private List<Bundle> f16201c = new ArrayList();
    private RemoteViews f16202d;
    private RemoteViews f16203e;

    public gv(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
        this.f16199a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
        this.f16200b = new Bundle();
        if (bundle != null) {
            this.f16200b.putAll(bundle);
        }
        if (!(arrayList == null || arrayList.isEmpty())) {
            this.f16200b.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        if (z4) {
            this.f16200b.putBoolean("android.support.localOnly", true);
        }
        if (str != null) {
            this.f16200b.putString("android.support.groupKey", str);
            if (z5) {
                this.f16200b.putBoolean("android.support.isGroupSummary", true);
            } else {
                this.f16200b.putBoolean("android.support.useSideChannel", true);
            }
        }
        if (str2 != null) {
            this.f16200b.putString("android.support.sortKey", str2);
        }
        this.f16202d = remoteViews2;
        this.f16203e = remoteViews3;
    }

    public void mo2304a(gq gqVar) {
        this.f16201c.add(gt.m18499a(this.f16199a, gqVar));
    }

    public Builder mo2303a() {
        return this.f16199a;
    }

    public Notification mo2305b() {
        SparseArray a = gt.m18501a(this.f16201c);
        if (a != null) {
            this.f16200b.putSparseParcelableArray("android.support.actionExtras", a);
        }
        this.f16199a.setExtras(this.f16200b);
        Notification build = this.f16199a.build();
        if (this.f16202d != null) {
            build.contentView = this.f16202d;
        }
        if (this.f16203e != null) {
            build.bigContentView = this.f16203e;
        }
        return build;
    }
}
