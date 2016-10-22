import java.util.Locale;

public final class bny {
    public static final String[] a;
    public static final String b;
    private static final String c;

    static {
        c = String.format(Locale.US, "CASE WHEN %s IN (%d, %d, %d, %d) THEN 1 ELSE 0 END", new Object[]{"status", Integer.valueOf(fwx.UPLOADING.ordinal()), Integer.valueOf(fwx.AWAIT_READY.ordinal()), Integer.valueOf(fwx.QUEUED.ordinal()), Integer.valueOf(fwx.SENDING.ordinal())});
        a = new String[]{"_id", "message_id", "conversation_id", "author_chat_id", "author_gaia_id", "text", "timestamp", "status", "type", "local_url", "remote_url", "width_pixels", "height_pixels", "attachment_name", "latitude", "longitude", "address", "attachment_target_url", "expiration_timestamp", "off_the_record", "attachment_content_type", "sms_message_size", "sms_priority", "sms_timestamp_sent", "external_ids", "mms_subject", "sms_raw_sender", "sms_raw_recipients", "persisted", "sms_message_status", "image_id", "stream_url", "stream_expiration", "sms_type", "new_conversation_name", "participant_keys", "transport_type", "sending_error", "call_media_type", "voicemail_length", "image_rotation", "attachment_blob_data", "receive_type", "init_timestamp", "in_app_msg_latency", "notified", "observed_status", "attachment_uploading_progress", "attachments"};
        b = String.valueOf(c).concat(" desc, timestamp desc");
    }

    public static String[] a() {
        return new String[]{Integer.toString(fwy.HANGOUT_START_EVENT.ordinal()), Long.toString(glj.a() * 1000)};
    }

    public static String[] a(long j) {
        return new String[]{Integer.toString(fwy.HANGOUT_START_EVENT.ordinal()), Long.toString(glj.a() * 1000), Long.toString(j)};
    }
}
