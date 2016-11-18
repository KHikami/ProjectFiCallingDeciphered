package defpackage;

public enum dqd {
    CALL_JOINED(2594, 2598),
    MESSAGE_RECEIVED(2593, 2597),
    MESSAGE_SENT(2592, 2596);
    
    public final int d;
    public final int e;

    private dqd(int i, int i2) {
        this.d = i;
        this.e = i2;
    }
}
