interface bmk {
    public static final String[] a;
    public static final String b;
    public static final String c;

    static {
        a = new String[]{"_id", "phone_id", "full_name", "profile_photo_url"};
        String valueOf = String.valueOf("participant_type=");
        valueOf = new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(edq.PHONE.ordinal()).toString();
        b = valueOf;
        String valueOf2 = String.valueOf("conversation_id");
        c = new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(valueOf2).length()).append(valueOf).append(" AND ").append(valueOf2).append("=?").toString();
    }
}
