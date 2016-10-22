import android.content.Intent;
import android.os.Looper;
import android.telecom.Call;
import android.telecom.InCallService;
import java.util.List;

/* compiled from: PG */
public final class bdp {
    private static bdp b;
    public InCallService a;

    private bdp() {
    }

    public static bdp a() {
        if (Looper.getMainLooper().isCurrentThread()) {
            if (b == null) {
                b = new bdp();
            }
            return b;
        }
        throw new IllegalStateException();
    }

    public final void a(String str, int i) {
        Call a = a(str);
        if (a != null) {
            a.answer(i);
            return;
        }
        String str2 = "error answerCall, call not in call list: ";
        String valueOf = String.valueOf(str);
        bdf.c((Object) this, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    final void a(String str, boolean z, String str2) {
        Call a = a(str);
        if (a != null) {
            a.reject(z, str2);
            return;
        }
        String str3 = "error rejectCall, call not in call list: ";
        String valueOf = String.valueOf(str);
        bdf.c((Object) this, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
    }

    public final void b(String str) {
        Call a = a(str);
        if (a != null) {
            a.disconnect();
            return;
        }
        String str2 = "error disconnectCall, call not in call list ";
        String valueOf = String.valueOf(str);
        bdf.c((Object) this, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public final void c(String str) {
        Call a = a(str);
        if (a != null) {
            a.unhold();
            return;
        }
        String str2 = "error unholdCall, call not in call list ";
        String valueOf = String.valueOf(str);
        bdf.c((Object) this, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public final void a(boolean z) {
        if (this.a != null) {
            this.a.setMuted(z);
        } else {
            bdf.c((Object) this, "error mute, mInCallService is null");
        }
    }

    public final void d(String str) {
        Call a = a(str);
        if (a != null) {
            List conferenceableCalls = a.getConferenceableCalls();
            if (!conferenceableCalls.isEmpty()) {
                a.conference((Call) conferenceableCalls.get(0));
                return;
            } else if (a.getDetails().can(4)) {
                a.mergeConference();
                return;
            } else {
                return;
            }
        }
        String str2 = "error merge, call not in call list ";
        String valueOf = String.valueOf(str);
        bdf.c((Object) this, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public final void e(String str) {
        Call a = a(str);
        if (a == null) {
            String str2 = "error swap, call not in call list ";
            String valueOf = String.valueOf(str);
            bdf.c((Object) this, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (a.getDetails().can(8)) {
            a.swapConference();
        }
    }

    public final void b() {
        if (this.a != null) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.addFlags(268435456);
            intent.putExtra("add_call_mode", true);
            try {
                bdf.a((Object) this, "Sending the add Call intent");
                this.a.startActivity(intent);
            } catch (Exception e) {
                bdf.a((Object) this, "Activity for adding calls isn't found.", e);
            }
        }
    }

    final void a(String str, boolean z) {
        Call a = a(str);
        if (a != null) {
            a.postDialContinue(z);
            return;
        }
        String str2 = "error postDialContinue, call not in call list ";
        String valueOf = String.valueOf(str);
        bdf.c((Object) this, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public static Call a(String str) {
        ayo a = azs.a.a(str);
        return a == null ? null : a.b;
    }
}
