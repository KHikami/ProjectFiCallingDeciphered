final class mow {
    static final mov a;

    static {
        a = a("com.google.common.flogger.backend.android.AndroidPlatform", "com.google.common.flogger.backend.system.DefaultPlatform");
    }

    private static mov a(String... strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                return (mov) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                stringBuilder.append('\n').append(str).append(": ").append(th);
                i++;
            }
        }
        throw new IllegalStateException(stringBuilder.insert(0, "No logging platforms found:").toString());
    }
}
