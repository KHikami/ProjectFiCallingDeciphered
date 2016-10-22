import android.content.Context;

final class bks implements jcn {
    final /* synthetic */ bkq a;

    bks(bkq bkq) {
        this.a = bkq;
    }

    public String a() {
        return "name_to_account_name";
    }

    public void a(Context context, jck jck) {
        if (jck.a("name")) {
            jck.c("account_name", jck.b("name"));
            jck.i("name");
        }
    }
}
