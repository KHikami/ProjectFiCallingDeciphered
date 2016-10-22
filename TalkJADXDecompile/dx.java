import android.os.Handler;
import android.os.Message;

final class dx extends Handler {
    final /* synthetic */ dw a;

    dx(dw dwVar) {
        this.a = dwVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.j /*1*/:
                if (this.a.g) {
                    this.a.a(false);
                }
            case wi.l /*2*/:
                this.a.f_();
                this.a.d.o();
            default:
                super.handleMessage(message);
        }
    }
}
