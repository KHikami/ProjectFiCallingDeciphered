import com.android.incallui.spam.SpamNotificationActivity;

/* compiled from: PG */
public final class bfc implements auo {
    final /* synthetic */ String a;
    final /* synthetic */ SpamNotificationActivity b;

    public bfc(SpamNotificationActivity spamNotificationActivity, String str) {
        this.b = spamNotificationActivity;
        this.a = str;
    }

    public final void a() {
        auc.a(SpamNotificationActivity.b(this.a), buf.J(this.b).d(), new bfd(this), this.b.g).show(this.b.getFragmentManager(), "BlockReportSpamDialog");
    }
}
