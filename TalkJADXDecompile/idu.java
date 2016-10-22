import android.content.Intent;

public class idu extends Exception {
    private final Intent a;

    public idu(String str, Intent intent, Throwable th) {
        super(str, th);
        this.a = intent;
    }
}
