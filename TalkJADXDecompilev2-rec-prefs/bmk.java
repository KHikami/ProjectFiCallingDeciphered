package p000;

interface bmk {
    public static final String[] f3972a = new String[]{"_id", "phone_id", "full_name", "profile_photo_url"};
    public static final String f3973b;
    public static final String f3974c;

    static {
        String valueOf = String.valueOf("participant_type=");
        valueOf = new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(edq.PHONE.ordinal()).toString();
        f3973b = valueOf;
        String valueOf2 = String.valueOf("conversation_id");
        f3974c = new StringBuilder((String.valueOf(valueOf).length() + 7) + String.valueOf(valueOf2).length()).append(valueOf).append(" AND ").append(valueOf2).append("=?").toString();
    }
}
