final /* synthetic */ class bnu {
    static final /* synthetic */ int[] a;

    static {
        a = new int[fwy.values().length];
        try {
            a[fwy.MEMBERSHIP_CHANGE_JOIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[fwy.MEMBERSHIP_CHANGE_LEAVE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[fwy.MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[fwy.CONVERSATION_RENAME.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[fwy.ERROR_FORK.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
