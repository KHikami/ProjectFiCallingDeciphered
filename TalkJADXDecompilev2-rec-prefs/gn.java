package p000;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class gn implements fo, fp {
    private Builder f15686a;
    private Bundle f15687b;
    private RemoteViews f15688c;
    private RemoteViews f15689d;

    public gn(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
        this.f15686a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
        this.f15687b = new Bundle();
        if (bundle != null) {
            this.f15687b.putAll(bundle);
        }
        if (!(arrayList == null || arrayList.isEmpty())) {
            this.f15687b.putStringArray("android.people", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        this.f15688c = remoteViews2;
        this.f15689d = remoteViews3;
    }

    public void mo2304a(gq gqVar) {
        gwb.m1742a(this.f15686a, gqVar);
    }

    public Builder mo2303a() {
        return this.f15686a;
    }

    public Notification mo2305b() {
        this.f15686a.setExtras(this.f15687b);
        Notification build = this.f15686a.build();
        if (this.f15688c != null) {
            build.contentView = this.f15688c;
        }
        if (this.f15689d != null) {
            build.bigContentView = this.f15689d;
        }
        return build;
    }
}
