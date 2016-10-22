import java.util.Locale;

final class mqc extends mps<Boolean> {
    final /* synthetic */ mqb a;

    mqc(mqb mqb, Boolean bool) {
        this.a = mqb;
        super(bool);
    }

    protected String a() {
        return ((Boolean) this.b).toString().toUpperCase(Locale.ROOT);
    }
}
