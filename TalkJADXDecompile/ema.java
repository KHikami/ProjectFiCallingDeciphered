import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class ema extends emv {
    final /* synthetic */ long a;
    final /* synthetic */ elk b;

    ema(elk elk, String str, long j) {
        this.b = elk;
        this.a = j;
        super(str);
    }

    public void a() {
        RealTimeChatService.b(this.b.b, this.a + 1000);
    }
}
