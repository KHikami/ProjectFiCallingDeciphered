package defpackage;

/* renamed from: efw */
public final /* synthetic */ class efw {
    public static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        b = new int[bcj.values().length];
        try {
            b[bcj.INVITE_MORE_TO_GROUPCHAT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            b[bcj.CREATE_NEW_ONE_ON_ONE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            b[bcj.CREATE_NEW_GROUP_CONVERSATION.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            b[bcj.FORK_CONVERSATION.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            b[bcj.UPGRADE_TO_GROUPCHAT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            b[bcj.INVITE_MORE_TO_HANGOUT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            b[bcj.INVITE_GAIA_IDS_TO_HANGOUT.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            b[bcj.CREATE_NEW_HANGOUT.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        a = new int[gou.values().length];
        try {
            a[gou.CONTACTS.ordinal()] = 1;
        } catch (NoSuchFieldError e9) {
        }
        try {
            a[gou.DOMAIN.ordinal()] = 2;
        } catch (NoSuchFieldError e10) {
        }
        try {
            a[gou.GOOGLE_PLUS.ordinal()] = 3;
        } catch (NoSuchFieldError e11) {
        }
        try {
            a[gou.FREQUENT.ordinal()] = 4;
        } catch (NoSuchFieldError e12) {
        }
    }
}
