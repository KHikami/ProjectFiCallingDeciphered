package defpackage;

/* renamed from: bcj */
public enum bcj {
    CREATE_NEW_GROUP_CONVERSATION,
    FORK_CONVERSATION,
    UPGRADE_TO_GROUPCHAT,
    INVITE_MORE_TO_GROUPCHAT,
    INVITE_MORE_TO_HANGOUT,
    INVITE_GAIA_IDS_TO_HANGOUT,
    CREATE_NEW_HANGOUT,
    CREATE_NEW_ONE_ON_ONE;

    public boolean a() {
        return this == CREATE_NEW_GROUP_CONVERSATION || this == INVITE_MORE_TO_GROUPCHAT || this == UPGRADE_TO_GROUPCHAT || this == FORK_CONVERSATION || this == INVITE_MORE_TO_HANGOUT || this == INVITE_GAIA_IDS_TO_HANGOUT || this == CREATE_NEW_HANGOUT;
    }

    public boolean b() {
        return this == CREATE_NEW_GROUP_CONVERSATION || this == FORK_CONVERSATION || this == UPGRADE_TO_GROUPCHAT || this == INVITE_MORE_TO_GROUPCHAT || this == CREATE_NEW_ONE_ON_ONE;
    }
}
