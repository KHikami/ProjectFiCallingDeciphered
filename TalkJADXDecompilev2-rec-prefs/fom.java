package p000;

public enum fom {
    HANGOUTS_API("https://www.googleapis.com/chat/v1android/", "debug.conserver.frontend.url"),
    HANGOUTS_UPLOAD_API("https://www.googleapis.com/upload/chat/v1android/", "debug.conserver.upload.url"),
    MESI_API("https://www.googleapis.com/hangouts/v1android/", "debug.mesi.frontend.url"),
    PLUSI("https://www.googleapis.com/plusi/v3/ozInternal/", "debug.plus.frontend.url"),
    GOOGLE_VOICE("https://www.googleapis.com/voice/v1/", "debug.voice.frotend.url");
    
    public final String f13582f;
    public final kda f13583g;

    public static fom m15816a(String str) {
        return (fom) Enum.valueOf(fom.class, str);
    }

    private fom(String str, String str2) {
        this.f13582f = str2;
        this.f13583g = new kda(str2, str);
    }
}
