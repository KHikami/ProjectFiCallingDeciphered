package p000;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class gp implements fo, fp {
    private Builder f15844a;

    public gp(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
        this.f15844a = new Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr);
        if (remoteViews2 != null) {
            this.f15844a.setCustomContentView(remoteViews2);
        }
        if (remoteViews3 != null) {
            this.f15844a.setCustomBigContentView(remoteViews3);
        }
        if (remoteViews4 != null) {
            this.f15844a.setCustomHeadsUpContentView(remoteViews4);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            this.f15844a.addPerson((String) obj);
        }
    }

    public void mo2304a(gq gqVar) {
        Bundle bundle;
        Action.Builder builder = new Action.Builder(gqVar.mo2066a(), gqVar.mo2067b(), gqVar.mo2068c());
        if (gqVar.mo2071f() != null) {
            for (RemoteInput addRemoteInput : gwb.m1953a(gqVar.mo2071f())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        if (gqVar.mo2069d() != null) {
            bundle = new Bundle(gqVar.mo2069d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", gqVar.mo2070e());
        builder.addExtras(bundle);
        builder.setAllowGeneratedReplies(gqVar.mo2070e());
        this.f15844a.addAction(builder.build());
    }

    public Builder mo2303a() {
        return this.f15844a;
    }

    public Notification mo2305b() {
        return this.f15844a.build();
    }
}
