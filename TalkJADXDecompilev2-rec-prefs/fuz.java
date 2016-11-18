package p000;

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

public class fuz {
    private final Context f14064a;
    private final jcf f14065b;

    fuz(Context context) {
        this.f14064a = context;
        this.f14065b = (jcf) jyn.m25426a(context, jcf.class);
    }

    public static fvd m16282a(int i, boolean z) {
        switch (i) {
            case 2:
                return fvd.GV_SMS;
            case 3:
                return fvd.LOCAL_SMS;
            default:
                return fvd.MESSAGE;
        }
    }

    public Uri m16285a(int i, fvd fvd) {
        return gld.m17945c(m16292b(i, fvd));
    }

    public String m16292b(int i, fvd fvd) {
        String str;
        switch (fvc.f14078a[fvd.ordinal()]) {
            case 1:
                str = "sms_notification_sound_key";
                break;
            case 2:
                str = "gv_sms_sound_key";
                break;
            case 3:
                str = "gv_voicemail_sound_key";
                break;
            default:
                str = "chat_notification_sound_key";
                break;
        }
        return m16286a(str, i);
    }

    public String m16286a(String str, int i) {
        String b;
        if ("sms_notification_sound_key".equals(str)) {
            i = this.f14065b.mo3461b("SMS");
        }
        try {
            b = this.f14065b.mo3456a(i).mo3440b(str);
        } catch (Throwable e) {
            glk.m17980d("Babel", new StringBuilder(String.valueOf(str).length() + 43).append("Account ").append(i).append(" not found for ringtone ").append(str).toString(), e);
            b = null;
        }
        if (b != null) {
            return b;
        }
        if ("hangout_sound_key".equals(str)) {
            return gld.m17942b(gwb.iw);
        }
        return gld.m17942b(gwb.ix);
    }

    public boolean m16291a(int i) {
        return glj.m17956a() <= ((fuz) jyn.m25426a(this.f14064a, fuz.class)).m16296d(i) / 1000;
    }

    public boolean m16294b(int i) {
        return this.f14065b.mo3456a(i).mo3439a("hangouts_notification_enabled_key", true);
    }

    public boolean m16295c(int i) {
        return this.f14065b.mo3456a(i).mo3439a("hangout_vibrate_boolean_key", true);
    }

    public long m16296d(int i) {
        if (i == -1) {
            return 0;
        }
        return this.f14065b.mo3456a(i).mo3434a("dnd_expiration", 0);
    }

    public void m16288a(int i, long j) {
        this.f14065b.mo3464b(i).m23878b("dnd_expiration", j).m23891d();
    }

    private static List<Integer> m16284b() {
        int[] iArr = new int[]{0, 1, 2, 4, 8, 24, 72};
        List<Integer> arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            arrayList.add(Integer.valueOf((int) TimeUnit.HOURS.toMillis((long) iArr[i])));
        }
        if (gld.m17936a()) {
            arrayList.add(1, Integer.valueOf((int) TimeUnit.MINUTES.toMillis(1)));
            arrayList.add(2, Integer.valueOf((int) TimeUnit.MINUTES.toMillis(5)));
            arrayList.add(3, Integer.valueOf((int) TimeUnit.MINUTES.toMillis(10)));
        }
        return arrayList;
    }

    public List<String> m16287a() {
        Resources resources = this.f14064a.getResources();
        List<Integer> b = fuz.m16284b();
        List<String> arrayList = new ArrayList();
        for (Integer a : b) {
            int a2 = gwb.m1507a(a);
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

    public void m16289a(int i, String str) {
        int indexOf = m16287a().indexOf(str);
        if (indexOf == -1) {
            glk.m17982e("Babel", "Unrecognized DND choice", new Object[0]);
        } else {
            fuz.m16283a(i, indexOf);
        }
    }

    static void m16283a(int i, int i2) {
        long a = (long) gwb.m1507a((Integer) fuz.m16284b().get(i2));
        if (a == 0) {
            RealTimeChatService.m8994a(i, -1);
            return;
        }
        RealTimeChatService.m8994a(i, TimeUnit.MILLISECONDS.toMicros(a + glj.m17956a()));
    }

    public void m16290a(Activity activity, int i, Runnable runnable) {
        Builder builder = new Builder(activity);
        ListAdapter arrayAdapter = new ArrayAdapter(activity, gwb.gp);
        for (String add : m16287a()) {
            arrayAdapter.add(add);
        }
        builder.setTitle(bc.bs);
        OnClickListener fva = new fva(this, i, runnable);
        builder.setOnCancelListener(new fvb(this, runnable));
        builder.setAdapter(arrayAdapter, fva);
        builder.show();
    }

    public boolean m16297e(int i) {
        return ((jcf) jyn.m25426a(this.f14064a, jcf.class)).mo3456a(i).mo3439a("chat_notification_enabled_key", true);
    }

    public int m16298f(int i) {
        jcf jcf = (jcf) jyn.m25426a(this.f14064a, jcf.class);
        jch a = jcf.mo3456a(i);
        int a2 = a.mo3433a("chat_notification_v2_key", 0);
        if (a2 == 0 || !fdq.f12773O.m14370b(i)) {
            if (a.mo3439a("chat_notification_enabled_key", true)) {
                a2 = 30;
            } else {
                a2 = 10;
            }
            jcf.mo3464b(i).m23877b("chat_notification_v2_key", a2).m23891d();
        }
        return a2;
    }

    public void m16293b(int i, int i2) {
        ((jcf) jyn.m25426a(this.f14064a, jcf.class)).mo3464b(i).m23877b("chat_notification_v2_key", i2).m23891d();
        ((jcf) jyn.m25426a(this.f14064a, jcf.class)).mo3464b(i).m23881b("chat_notification_enabled_key", i2 != 10).m23891d();
    }
}
