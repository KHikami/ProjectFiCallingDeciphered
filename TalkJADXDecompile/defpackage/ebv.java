package defpackage;

/* renamed from: ebv */
public interface ebv {
    public static final String[] a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;

    static {
        a = new String[]{"author_first_name", "author_full_name", "author_chat_id", "text", "type", "local_url", "remote_url", "conversation_id", "conversation_name", "generated_name", "conversation_type", "timestamp", "status", "attachment_content_type", "transport_type", "author_gaia_id", "new_conversation_name", "participant_keys", "merge_key", "sms_type", "chat_watermark", "chat_ringtone_uri", "otr_status", "call_media_type", "author_profile_photo_url", "_id", "message_id", "is_user_mentioned"};
        String valueOf = String.valueOf(" AND conversation_pending_leave!=1 AND type!=");
        int ordinal = fwy.HANGOUT_START_EVENT.ordinal();
        String valueOf2 = String.valueOf("type");
        int ordinal2 = fwy.HANGOUT_STOP_EVENT.ordinal();
        String valueOf3 = String.valueOf("conversation_status");
        String valueOf4 = String.valueOf("timestamp");
        String valueOf5 = String.valueOf("chat_watermark");
        String valueOf6 = String.valueOf("timestamp");
        String valueOf7 = String.valueOf("1355097600000000");
        String valueOf8 = String.valueOf("timestamp");
        b = new StringBuilder((((((((String.valueOf(valueOf).length() + 68) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()).append(valueOf).append(ordinal).append(" AND ").append(valueOf2).append("!=").append(ordinal2).append(" AND ").append(valueOf3).append("!=1").append(" AND ").append(valueOf4).append(">").append(valueOf5).append(" AND ").append(valueOf6).append(" > ").append(valueOf7).append(" AND ").append(valueOf8).append(">?").toString();
        String valueOf9 = String.valueOf("conversation_id IN (SELECT conversation_id FROM conversations WHERE conversations.has_chat_notifications) AND (author_chat_id is NULL) AND ((notification_level=30 OR notification_level=-1 OR (notification_level=25 AND is_user_mentioned= 1 ) OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(b);
        c = valueOf.length() != 0 ? valueOf9.concat(valueOf) : new String(valueOf9);
        valueOf9 = String.valueOf("conversation_id IN (SELECT conversation_id FROM conversations WHERE conversations.has_chat_notifications) AND (author_chat_id is NULL) AND ((conversation_notification_level=30 OR conversation_notification_level=25) AND (notification_level=30 OR notification_level=-1 OR notification_level=25 OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(b);
        d = valueOf.length() != 0 ? valueOf9.concat(valueOf) : new String(valueOf9);
        valueOf9 = String.valueOf("conversation_id IN (SELECT conversation_id FROM conversations WHERE conversations.has_chat_notifications) AND (author_chat_id is NULL OR author_chat_id!=?) AND ((notification_level=30 OR notification_level=-1 OR (notification_level=25 AND is_user_mentioned= 1 ) OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(b);
        e = valueOf.length() != 0 ? valueOf9.concat(valueOf) : new String(valueOf9);
        valueOf9 = String.valueOf("conversation_id IN (SELECT conversation_id FROM conversations WHERE conversations.has_chat_notifications) AND (author_chat_id is NULL OR author_chat_id!=?) AND ((conversation_notification_level=30 OR conversation_notification_level=25) AND (notification_level=30 OR notification_level=-1 OR notification_level=25 OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(b);
        if (valueOf.length() != 0) {
            valueOf = valueOf9.concat(valueOf);
        } else {
            valueOf = new String(valueOf9);
        }
        f = valueOf;
        valueOf = String.valueOf(" AND conversation_pending_leave!=1 AND type!=");
        ordinal = fwy.HANGOUT_START_EVENT.ordinal();
        valueOf2 = String.valueOf("type");
        ordinal2 = fwy.HANGOUT_STOP_EVENT.ordinal();
        valueOf3 = String.valueOf("conversation_status");
        valueOf4 = String.valueOf("observed_status");
        valueOf5 = String.valueOf("observed_status");
        valueOf6 = String.valueOf("timestamp");
        valueOf7 = String.valueOf("sms_type");
        g = new StringBuilder(((((((String.valueOf(valueOf).length() + 107) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()).append(valueOf).append(ordinal).append(" AND ").append(valueOf2).append("!=").append(ordinal2).append(" AND ").append(valueOf3).append("!=1").append(" AND ").append(valueOf4).append("!=1").append(" AND ").append(valueOf5).append("!=-1").append(" AND ").append(valueOf6).append(">? AND ").append(valueOf7).append("=-1").toString();
        valueOf9 = String.valueOf("(author_chat_id is NULL) AND ((notification_level=30 OR notification_level=-1 OR (notification_level=25 AND is_user_mentioned= 1 ) OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(g);
        h = valueOf.length() != 0 ? valueOf9.concat(valueOf) : new String(valueOf9);
        valueOf9 = String.valueOf("(author_chat_id is NULL) AND ((conversation_notification_level=30 OR conversation_notification_level=25) AND (notification_level=30 OR notification_level=-1 OR notification_level=25 OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(g);
        i = valueOf.length() != 0 ? valueOf9.concat(valueOf) : new String(valueOf9);
        valueOf9 = String.valueOf("(author_chat_id is NULL OR author_chat_id!=?) AND ((notification_level=30 OR notification_level=-1 OR (notification_level=25 AND is_user_mentioned= 1 ) OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(g);
        j = valueOf.length() != 0 ? valueOf9.concat(valueOf) : new String(valueOf9);
        valueOf9 = String.valueOf("(author_chat_id is NULL OR author_chat_id!=?) AND ((conversation_notification_level=30 OR conversation_notification_level=25) AND (notification_level=30 OR notification_level=-1 OR notification_level=25 OR sms_type IN (0, 1, 2)))");
        valueOf = String.valueOf(g);
        k = valueOf.length() != 0 ? valueOf9.concat(valueOf) : new String(valueOf9);
        valueOf = c;
        valueOf9 = String.valueOf("sms_type");
        l = new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf9).length()).append(valueOf).append(" AND ").append(valueOf9).append("!=-1").toString();
        valueOf = e;
        valueOf9 = String.valueOf("sms_type");
        m = new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf9).length()).append(valueOf).append(" AND ").append(valueOf9).append("!=-1").toString();
    }
}
