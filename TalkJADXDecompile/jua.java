import android.os.Handler.Callback;
import android.os.Message;

final class jua implements Callback {
    final /* synthetic */ jtz a;

    jua(jtz jtz) {
        this.a = jtz;
    }

    public boolean handleMessage(Message message) {
        return this.a.a(message);
    }
}
