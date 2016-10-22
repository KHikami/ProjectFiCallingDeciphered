public enum bci {
    PERSONAL(1),
    PRIVATE_SHARED(2),
    PUBLIC_SHARED(3),
    FOLLOWING(4),
    MY_CIRCLES(5),
    VISIBLE_CIRCLE_MEMBERS(6),
    EXTENDED(7),
    DOMAIN(8),
    PUBLIC(9),
    BLOCKED(10),
    ALL_CIRCLES(11);
    
    private final int l;

    private bci(int i) {
        this.l = i;
    }
}
