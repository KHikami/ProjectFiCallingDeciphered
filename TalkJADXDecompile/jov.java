import android.content.Intent;

final class jov implements jej {
    final /* synthetic */ jou a;

    jov(jou jou) {
        this.a = jou;
    }

    public void a(int i, Intent intent) {
        int intExtra;
        if (intent != null) {
            intExtra = intent.getIntExtra("account_id", -1);
        } else {
            intExtra = -1;
        }
        if (intExtra != -1 && this.a.a != null) {
            this.a.a.k();
        }
    }
}
