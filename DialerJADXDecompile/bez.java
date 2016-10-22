import android.app.Notification.Action;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.AsyncTask;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.android.incallui.spam.SpamNotificationActivity;
import com.android.incallui.spam.SpamNotificationService;
import java.util.Random;

/* compiled from: PG */
public final class bez implements baa {
    private final Context a;
    private final Random b;

    public bez(Context context) {
        this.a = context;
        this.b = new Random();
    }

    public final void c(ayo ayo) {
    }

    public final void a(azs azs) {
    }

    public final void b(ayo ayo) {
        int i;
        if (!buf.J(this.a).b()) {
            i = 0;
        } else if (TextUtils.isEmpty(buf.c(ayo.b))) {
            i = 0;
        } else {
            ayq ayq = ayo.g;
            if (!ayq.b) {
                i = 0;
            } else if (ayq.f <= 0) {
                i = 0;
            } else if (ayq.c == 1 || ayq.c == 0) {
                i = ayo.n;
                if (i == 1) {
                    i = 0;
                } else if (i == 0) {
                    i = 0;
                } else {
                    i = ayo.f().getCode();
                    if (i == 2 || i == 3) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                }
            } else {
                i = 0;
            }
        }
        if (i != 0) {
            String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(buf.c(ayo.b), buf.g(this.a));
            if (!buf.b(this.a, formatNumberToE164, buf.c(ayo.b)) || !buf.A(this.a) || formatNumberToE164 == null) {
                return;
            }
            int e;
            if (ayo.o) {
                i = this.b.nextInt(100);
                e = buf.J(this.a).e();
                if (e == 0) {
                    i = 1;
                } else if (i < e) {
                    new StringBuilder(65).append("shouldThrottleSpamNotification, showing ").append(i).append(" < ").append(e);
                    i = 0;
                } else {
                    new StringBuilder(70).append("shouldThrottleSpamNotification, not showing ").append(i).append(" >= ").append(e);
                    i = 1;
                }
                if (i != 0) {
                    buf.H(this.a).a(1042, ayo.a, ayo.u);
                    return;
                }
                PendingIntent b;
                buf.H(this.a).a(1041, ayo.a, ayo.u);
                Builder style = d(ayo).setLargeIcon(Icon.createWithResource(this.a, buf.kH)).setContentText(this.a.getString(aq.dz)).setStyle(new BigTextStyle().bigText(this.a.getString(aq.dA)));
                int i2 = buf.kq;
                CharSequence string = this.a.getString(aq.dx);
                formatNumberToE164 = "com.android.incallui.spam.ACTION_MARK_NUMBER_AS_NOT_SPAM";
                if (buf.J(this.a).c()) {
                    b = b(ayo, formatNumberToE164);
                } else {
                    b = a(ayo, formatNumberToE164);
                }
                ((NotificationManager) this.a.getSystemService("notification")).notify(buf.c(ayo.b), 1, style.addAction(new Action.Builder(i2, string, b).build()).addAction(new Action.Builder(buf.km, this.a.getString(aq.dr), f(ayo)).build()).setContentTitle(this.a.getString(aq.dB, new Object[]{e(ayo)})).build());
                return;
            }
            formatNumberToE164 = "Showing not spam notification for number=";
            String valueOf = String.valueOf(bdf.a(buf.c(ayo.b)));
            if (valueOf.length() != 0) {
                formatNumberToE164.concat(valueOf);
            } else {
                valueOf = new String(formatNumberToE164);
            }
            i = this.b.nextInt(100);
            e = buf.J(this.a).f();
            if (e == 0) {
                i = 1;
            } else if (i < e) {
                new StringBuilder(56).append("Showing non spam notification: ").append(i).append(" < ").append(e);
                i = 0;
            } else {
                new StringBuilder(60).append("Not showing non spam notification:").append(i).append(" >= ").append(e);
                i = 1;
            }
            if (i != 0) {
                buf.H(this.a).a(1044, ayo.a, ayo.u);
                return;
            }
            buf.H(this.a).a(1043, ayo.a, ayo.u);
            ((NotificationManager) this.a.getSystemService("notification")).notify(buf.c(ayo.b), 1, d(ayo).setLargeIcon(Icon.createWithResource(this.a, buf.kI)).setContentText(this.a.getString(aq.dv)).setStyle(new BigTextStyle().bigText(this.a.getString(aq.dw))).addAction(new Action.Builder(buf.kz, this.a.getString(aq.dq), b(ayo, "com.android.incallui.spam.ACTION_ADD_TO_CONTACTS")).build()).addAction(new Action.Builder(buf.km, this.a.getString(aq.dy), f(ayo)).build()).setContentTitle(this.a.getString(aq.cA, new Object[]{e(ayo)})).build());
        }
    }

    private final Builder d(ayo ayo) {
        return new Builder(this.a).setContentIntent(b(ayo, "com.android.incallui.spam.ACTION_SHOW_DIALOG")).setCategory("status").setPriority(0).setColor(this.a.getColor(buf.jT)).setSmallIcon(buf.kn);
    }

    private final PendingIntent f(ayo ayo) {
        String str = "com.android.incallui.spam.ACTION_MARK_NUMBER_AS_SPAM";
        if (buf.J(this.a).c()) {
            return b(ayo, str);
        }
        return a(ayo, str);
    }

    private final PendingIntent a(ayo ayo, String str) {
        Intent intent = new Intent(this.a, SpamNotificationService.class);
        intent.setAction(str);
        intent.putExtra("service_phone_number", buf.c(ayo.b));
        intent.putExtra("service_call_id", ayo.a);
        intent.putExtra("service_call_start_time_millis", ayo.u);
        intent.putExtra("service_notification_id", 1);
        return PendingIntent.getService(this.a, (int) System.currentTimeMillis(), intent, 1073741824);
    }

    private final PendingIntent b(ayo ayo, String str) {
        Intent intent = new Intent(this.a, SpamNotificationActivity.class);
        intent.setAction(str);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        intent.putExtra("notification_id", 1);
        Bundle bundle = new Bundle();
        bundle.putString("phone_number", buf.c(ayo.b));
        bundle.putBoolean("is_spam", ayo.o);
        bundle.putString("call_id", ayo.a);
        bundle.putLong("call_start_time_millis", ayo.u);
        intent.putExtra("call_info", bundle);
        return PendingIntent.getActivity(this.a, (int) System.currentTimeMillis(), intent, 1073741824);
    }

    public final void a(ayo ayo) {
        Object c = buf.c(ayo.b);
        if (!TextUtils.isEmpty(c)) {
            AsyncTask bex = new bex(this.a, new bey(this, ayo), c, buf.g(this.a));
            if (buf.h(bex.a)) {
                avn.b().a(bex, new Void[0]);
            }
        }
    }

    private final CharSequence e(ayo ayo) {
        return buf.a(PhoneNumberUtils.formatNumber(buf.c(ayo.b), buf.g(this.a)));
    }
}
