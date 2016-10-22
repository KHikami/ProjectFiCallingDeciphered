final /* synthetic */ class blh {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fwy.values().length];
        try {
            a[fwy.OUTGOING_USER_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[fwy.OFF_THE_RECORD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[fwy.ON_THE_RECORD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[fwy.MEMBERSHIP_CHANGE_JOIN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[fwy.MEMBERSHIP_CHANGE_LEAVE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[fwy.CONVERSATION_RENAME.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
    }
}
