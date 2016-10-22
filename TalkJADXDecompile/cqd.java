import android.content.Context;

final class cqd implements cqc {
    private final int a;

    public cqd(Context context) {
        this.a = gwb.a(context, "babel_debug_in_app_msg_receive_latency_ms", 5000);
    }

    public boolean a(cpw cpw) {
        return cpw.f() >= this.a;
    }

    public String b(cpw cpw) {
        if (!a(cpw)) {
            return null;
        }
        return "In app message latency exceeds " + this.a + "ms";
    }
}
