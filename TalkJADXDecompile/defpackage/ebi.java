package defpackage;

/* renamed from: ebi */
interface ebi {
    public static final String[] a;
    public static final String b;

    static {
        a = new String[]{"author_first_name", "type", "conversation_id", "conversation_name", "generated_name", "conversation_type", "timestamp", "participant_keys", "call_media_type"};
        String valueOf = String.valueOf("conversation_id IN (SELECT conversation_id FROM conversations WHERE conversations.has_video_notifications=1) AND author_chat_id!=? AND conversation_notification_level!=10 AND conversation_pending_leave!=1 AND (type=");
        int ordinal = fwy.HANGOUT_START_EVENT.ordinal();
        String valueOf2 = String.valueOf("type");
        int ordinal2 = fwy.HANGOUT_STOP_EVENT.ordinal();
        String valueOf3 = String.valueOf("conversation_status");
        String valueOf4 = String.valueOf("timestamp");
        String valueOf5 = String.valueOf("hangout_watermark");
        String valueOf6 = String.valueOf("author_full_name");
        String valueOf7 = String.valueOf("timestamp");
        b = new StringBuilder(((((((String.valueOf(valueOf).length() + 93) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()).append(valueOf).append(ordinal).append(" OR ").append(valueOf2).append("=").append(ordinal2).append(") AND ").append(valueOf3).append("!=1").append(" AND ").append(valueOf4).append(">").append(valueOf5).append(" AND ").append(valueOf6).append(" IS NOT NULL AND ").append(valueOf7).append(" > 1355097600000000").toString();
    }
}
