package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: fuz */
public class fuz {
    private final Context a;
    private final jcf b;

    fuz(Context context) {
        this.a = context;
        this.b = (jcf) jyn.a(context, jcf.class);
    }

    public static fvd a(int i, boolean z) {
        switch (i) {
            case wi.l /*2*/:
                return fvd.GV_SMS;
            case wi.z /*3*/:
                return fvd.LOCAL_SMS;
            default:
                return fvd.MESSAGE;
        }
    }

    public Uri a(int i, fvd fvd) {
        return gld.c(b(i, fvd));
    }

    public String b(int i, fvd fvd) {
        String str;
        switch (fvc.a[fvd.ordinal()]) {
            case wi.j /*1*/:
                str = "sms_notification_sound_key";
                break;
            case wi.l /*2*/:
                str = "gv_sms_sound_key";
                break;
            case wi.z /*3*/:
                str = "gv_voicemail_sound_key";
                break;
            default:
                str = "chat_notification_sound_key";
                break;
        }
        return a(str, i);
    }

    public String a(String str, int i) {
        String b;
        if ("sms_notification_sound_key".equals(str)) {
            i = this.b.b("SMS");
        }
        try {
            b = this.b.a(i).b(str);
        } catch (Throwable e) {
            glk.d("Babel", new StringBuilder(String.valueOf(str).length() + 43).append("Account ").append(i).append(" not found for ringtone ").append(str).toString(), e);
            b = null;
        }
        if (b != null) {
            return b;
        }
        if ("hangout_sound_key".equals(str)) {
            return gld.b(gwb.iw);
        }
        return gld.b(gwb.ix);
    }

    public boolean a(int i) {
        return glj.a() <= ((fuz) jyn.a(this.a, fuz.class)).d(i) / 1000;
    }

    public boolean b(int i) {
        return this.b.a(i).a("hangouts_notification_enabled_key", true);
    }

    public boolean c(int i) {
        return this.b.a(i).a("hangout_vibrate_boolean_key", true);
    }

    public long d(int i) {
        if (i == -1) {
            return 0;
        }
        return this.b.a(i).a("dnd_expiration", 0);
    }

    public void a(int i, long j) {
        this.b.b(i).b("dnd_expiration", j).d();
    }

    private static List<Integer> b() {
        int[] iArr = new int[]{0, 1, 2, 4, 8, 24, 72};
        List<Integer> arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            arrayList.add(Integer.valueOf((int) TimeUnit.HOURS.toMillis((long) iArr[i])));
        }
        if (gld.a()) {
            arrayList.add(1, Integer.valueOf((int) TimeUnit.MINUTES.toMillis(1)));
            arrayList.add(2, Integer.valueOf((int) TimeUnit.MINUTES.toMillis(5)));
            arrayList.add(3, Integer.valueOf((int) TimeUnit.MINUTES.toMillis(10)));
        }
        return arrayList;
    }

    public List<String> a() {
        Resources resources = this.a.getResources();
        List<Integer> b = fuz.b();
        List<String> arrayList = new ArrayList();
        for (Integer a : b) {
            int a2 = gwb.a(a);
            if (a2 == 0) {
                arrayList.add(resources.getString(bc.bv));
            } else if (((long) a2) < TimeUnit.HOURS.toMillis(1)) {
                a2 = (int) TimeUnit.MILLISECONDS.toMinutes((long) a2);
                arrayList.add(resources.getQuantityString(gwb.hU, a2, new Object[]{Integer.valueOf(a2)}));
            } else {
                a2 = (int) TimeUnit.MILLISECONDS.toHours((long) a2);
                arrayList.add(resources.getQuantityString(gwb.hT, a2, new Object[]{Integer.valueOf(a2)}));
            }
        }
        return arrayList;
    }

    public void a(int i, String str) {
        int indexOf = a().indexOf(str);
        if (indexOf == -1) {
            glk.e("Babel", "Unrecognized DND choice", new Object[0]);
        } else {
            fuz.a(i, indexOf);
        }
    }

    static void a(int i, int i2) {
        long a = (long) gwb.a((Integer) fuz.b().get(i2));
        if (a == 0) {
            RealTimeChatService.a(i, -1);
            return;
        }
        RealTimeChatService.a(i, TimeUnit.MILLISECONDS.toMicros(a + glj.a()));
    }

    public void a(Activity activity, int i, Runnable runnable) {
        Builder builder = new Builder(activity);
        ListAdapter arrayAdapter = new ArrayAdapter(activity, gwb.gp);
        for (String add : a()) {
            arrayAdapter.add(add);
        }
        builder.setTitle(bc.bs);
        OnClickListener fva = new fva(this, i, runnable);
        builder.setOnCancelListener(new fvb(this, runnable));
        builder.setAdapter(arrayAdapter, fva);
        builder.show();
    }

    public boolean e(int i) {
        return ((jcf) jyn.a(this.a, jcf.class)).a(i).a("chat_notification_enabled_key", true);
    }

    public int f(int i) {
        jcf jcf = (jcf) jyn.a(this.a, jcf.class);
        jch a = jcf.a(i);
        int a2 = a.a("chat_notification_v2_key", 0);
        if (a2 == 0 || !fdq.O.b(i)) {
            if (a.a("chat_notification_enabled_key", true)) {
                a2 = 30;
            } else {
                a2 = 10;
            }
            jcf.b(i).b("chat_notification_v2_key", a2).d();
        }
        return a2;
    }

    public void b(int i, int i2) {
        ((jcf) jyn.a(this.a, jcf.class)).b(i).b("chat_notification_v2_key", i2).d();
        ((jcf) jyn.a(this.a, jcf.class)).b(i).b("chat_notification_enabled_key", i2 != 10).d();
    }
}
