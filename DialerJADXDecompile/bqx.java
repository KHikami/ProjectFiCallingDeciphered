import android.content.Intent;

public class bqx extends Exception {
    public final Intent b;

    public bqx(String str, Intent intent) {
        super(str);
        this.b = intent;
    }
}
