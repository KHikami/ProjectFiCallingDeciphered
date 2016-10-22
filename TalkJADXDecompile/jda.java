import android.content.Context;

final class jda implements jcn {
    final /* synthetic */ jcx a;

    jda(jcx jcx) {
        this.a = jcx;
    }

    public String a() {
        return "upgrade:active_to_logged_in";
    }

    public void a(Context context, jck jck) {
        if (jck.c("active")) {
            jck.i("active");
            jck.c("logged_in", true);
        }
    }
}
