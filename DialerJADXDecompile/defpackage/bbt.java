package defpackage;

import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.util.ArrayMap;
import com.android.incallui.NotificationBroadcastReceiver;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bbt */
public final class bbt implements bbs {
    final Context a;
    Map b;
    aic c;
    private final bbc d;
    private int e;

    public bbt(Context context, bbc bbc) {
        this.b = new ArrayMap();
        this.a = context;
        this.c = buf.M(this.a);
        this.d = bbc;
    }

    public final void a(Call call) {
        String valueOf = String.valueOf(call);
        bdf.d(this, new StringBuilder(String.valueOf(valueOf).length() + 20).append("onExternalCallAdded ").append(valueOf).toString());
        if (this.b.containsKey(call)) {
            throw new IllegalArgumentException();
        }
        int i = this.e;
        this.e = i + 1;
        bbv bbv = new bbv(call, i);
        this.b.put(call, bbv);
        this.d.a(new ayo(bbv.a, false), false, new bbu(this, bbv));
    }

    public final void b(Call call) {
        String valueOf = String.valueOf(call);
        bdf.d(this, new StringBuilder(String.valueOf(valueOf).length() + 22).append("onExternalCallRemoved ").append(valueOf).toString());
        if (this.b.containsKey(call)) {
            ((NotificationManager) this.a.getSystemService("notification")).cancel("EXTERNAL_CALL", ((bbv) this.b.get(call)).b);
            this.b.remove(call);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void c(Call call) {
        if (this.b.containsKey(call)) {
            a((bbv) this.b.get(call));
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void d(Call call) {
    }

    public final void a(int i) {
        for (bbv bbv : this.b.values()) {
            if (bbv.b == i) {
                buf.a(bbv.a);
                return;
            }
        }
    }

    final void a(bbv bbv) {
        String str = "postNotification : ";
        String valueOf = String.valueOf(bbv.c);
        bdf.d(this, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        Builder builder = new Builder(this.a);
        builder.setOngoing(true);
        builder.setPriority(1);
        builder.setContentText(this.a.getString(aq.cJ));
        builder.setSmallIcon(buf.ko);
        builder.setContentTitle(bbv.c);
        builder.setLargeIcon(bbv.d);
        builder.setColor(this.a.getResources().getColor(buf.jT));
        builder.addPerson(bbv.e);
        if ((bbv.a.getDetails().getCallCapabilities() & 8388608) == 8388608) {
            Intent intent = new Intent("com.android.incallui.ACTION_PULL_EXTERNAL_CALL", null, this.a, NotificationBroadcastReceiver.class);
            intent.putExtra("com.android.incallui.extra.EXTRA_NOTIFICATION_ID", bbv.b);
            builder.addAction(new Action.Builder(buf.ko, this.a.getText(aq.cW), PendingIntent.getBroadcast(this.a, 0, intent, 0)).build());
        }
        Builder builder2 = new Builder(this.a);
        builder2.setSmallIcon(buf.ko);
        builder2.setColor(this.a.getResources().getColor(buf.jT));
        builder.setPublicVersion(builder2.build());
        ((NotificationManager) this.a.getSystemService("notification")).notify("EXTERNAL_CALL", bbv.b, builder.build());
    }
}
