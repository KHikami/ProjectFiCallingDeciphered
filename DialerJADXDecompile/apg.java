import com.android.dialer.app.filterednumber.BlockedNumbersSettingsActivity;

/* compiled from: PG */
final class apg implements auo {
    private /* synthetic */ BlockedNumbersSettingsActivity a;
    private /* synthetic */ ape b;

    apg(ape ape, BlockedNumbersSettingsActivity blockedNumbersSettingsActivity) {
        this.b = ape;
        this.a = blockedNumbersSettingsActivity;
    }

    public final void a() {
        this.b.getContext().startActivity(buf.z(this.b.getContext()));
        this.a.finish();
    }
}
