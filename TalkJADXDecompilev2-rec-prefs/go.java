package p000;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class go implements fo, fp {
    private Builder f15764a;
    private Bundle f15765b;
    private RemoteViews f15766c;
    private RemoteViews f15767d;
    private RemoteViews f15768e;

    public go(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
        this.f15764a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
        this.f15765b = new Bundle();
        if (bundle != null) {
            this.f15765b.putAll(bundle);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            this.f15764a.addPerson((String) obj);
        }
        this.f15766c = remoteViews2;
        this.f15767d = remoteViews3;
        this.f15768e = remoteViews4;
    }

    public void mo2304a(gq gqVar) {
        gwb.m1742a(this.f15764a, gqVar);
    }

    public Builder mo2303a() {
        return this.f15764a;
    }

    public Notification mo2305b() {
        this.f15764a.setExtras(this.f15765b);
        Notification build = this.f15764a.build();
        if (this.f15766c != null) {
            build.contentView = this.f15766c;
        }
        if (this.f15767d != null) {
            build.bigContentView = this.f15767d;
        }
        if (this.f15768e != null) {
            build.headsUpContentView = this.f15768e;
        }
        return build;
    }
}
