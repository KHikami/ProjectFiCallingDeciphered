import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cht implements bpg {
    final /* synthetic */ bko a;

    public cht(bko bko) {
        this.a = bko;
    }

    public void a(bpd bpd) {
        RealTimeChatService.a(this.a, bpd.a, fwy.LOCATION_REQUEST_RECEIVER);
        RealTimeChatService.a(this.a, bpd.a, fwy.LOCATION_REQUEST_SENDER);
    }
}
