import java.util.UUID;

final class ljg extends lja {
    static final ljo b;

    static {
        b = new ljg("Noop", UUID.randomUUID(), ljm.a);
    }

    private ljg(String str, UUID uuid, ljm ljm) {
        super(str, uuid, ljm);
    }

    private ljg(ljo ljo, String str, ljm ljm) {
        super(str, ljo, ljm);
    }

    public ljo a(String str, ljm ljm) {
        return new ljg((ljo) this, str, ljm);
    }

    public void e() {
    }
}
