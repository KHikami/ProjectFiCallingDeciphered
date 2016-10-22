package defpackage;

/* renamed from: egu */
final /* synthetic */ class egu {
    static final /* synthetic */ int[] a;

    static {
        a = new int[bcj.values().length];
        try {
            a[bcj.CREATE_NEW_ONE_ON_ONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[bcj.CREATE_NEW_GROUP_CONVERSATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[bcj.FORK_CONVERSATION.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[bcj.UPGRADE_TO_GROUPCHAT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[bcj.INVITE_MORE_TO_GROUPCHAT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
