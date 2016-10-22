import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: PG */
final class dmb extends dlq {
    private /* synthetic */ Socket a;

    dmb(Socket socket) {
        this.a = socket;
    }

    protected final IOException b(IOException iOException) {
        IOException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    protected final void b() {
        try {
            this.a.close();
        } catch (Throwable e) {
            dly.a.log(Level.WARNING, "Failed to close timed out socket " + this.a, e);
        } catch (Throwable e2) {
            if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                throw e2;
            }
            dly.a.log(Level.WARNING, "Failed to close timed out socket " + this.a, e2);
        }
    }
}
