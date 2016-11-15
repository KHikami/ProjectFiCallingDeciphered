import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

final class gfa extends AsyncTask<Void, Void, Long> {//TeleStunPing
    private static final byte[] a;//sample packet format 1?
    private static final byte[] b;//sample packet format 2?
    private static final byte[] c;//sample packet format 3?
    private final gfc d;//socket/task orchestrator
    private gfb e;//is actually gdz

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        //in background, run ping test
        return c();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        //when I complete (if I did complete) run my a(long) (which updates gdz)
        a((Long) obj);
    }

    static {
        a = new byte[]{(byte) 0, (byte) 1};
        b = new byte[]{(byte) 1, (byte) 1};
        c = new byte[]{a[0], a[1], (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    }

    //called by gdz to create a TeleStunPing Object
    gfa(Context context, gfb gfb) {
        gfc gfc = (gfc) jyn.b(context, gfc.class);//grabs related gfc object if it exists
        if (gfc != null) {
            this.d = gfc;
        } else {
            this.d = new gfc();//creates a new one if not
        }
        this.e = gfb;//saves the calling gfb/(gdz) object
    }

    void a() {
        glk.c("Babel_telephony", "TeleStunPing.startPing", new Object[0]);
        executeOnExecutor(this.d.b(), new Void[0]);//exceute using AsyncTask setting with a void object? (guess it sends out a ping)
    }

    void b() {
        glk.c("Babel_telephony", "TeleStunPing.cancelPing", new Object[0]);
        this.e = null;//reset calling gdz object
        cancel(true);//call cancel async task
    }

    private Long c() {
        String valueOf;
        Long l = null;
        try {
            InetAddress byName = InetAddress.getByName("stun.l.google.com");//pings this address
            try {
                DatagramSocket a = this.d.a();//grabs the socket to try
                a.setSoTimeout(1000);//ping with a timeout of 1000
                int i = 0;
                while (!isCancelled() && i < 3) {//tries 3 times => if 3 hops packet lost stop
                    try {
                        i++;
                        long b = glj.b();//grabs time difference
                        if (a(a, byName, 19302)) {//a(DatagramSocket, address, int)
                            //if ping returns succesfully (note: this takes a while...)
                            l = Long.valueOf(glj.b() - b);//record ping amount
                            //current time in real time minus original recorded time
                            break;
                        }
                    } finally {
                        a.close();
                    }
                }
                a.close();
            } catch (SocketException e) {
                valueOf = String.valueOf(e);
                glk.e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 54).append("TeleStunPing.doInBackground, unable to create socket: ").append(valueOf).toString(), new Object[0]);
            }
        } catch (UnknownHostException e2) {
            valueOf = String.valueOf(e2);
            glk.e("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 64).append("TeleStunPing.doInBackground, unable to get stun server address: ").append(valueOf).toString(), new Object[0]);
        }
        return l;//return recording ping amount
    }

    private void a(Long l) {
        boolean z = false;//default ping success is false
        String valueOf = String.valueOf(l);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 36).append("TeleStunPing.onPostExecute, result: ").append(valueOf).toString(), new Object[0]);
        if (this.e != null) {//if related gdz exists
            gfb gfb = this.e;//store original
            this.e = null;// clear calling gdz
            if (l != null) {//if I did have ping, set ping successful to true
                z = true;
            }
            gfb.a(z, gwb.a(l));//calls gdz.a(boolean,long) (formats the recorded ping latency into a long)
        }
    }

    //actual pinger
    private static boolean a(DatagramSocket datagramSocket, InetAddress inetAddress, int i) {
        byte[] bArr = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(c, c.length, inetAddress, 19302);//creates a new packet to send
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr, 1024);
        try {
            datagramSocket.send(datagramPacket);//tries to send packet 1
            datagramSocket.receive(datagramPacket2);//waits for a receive of packet 2?
            if (datagramPacket2.getLength() > 2 && bArr[0] == b[0] && bArr[1] == b[1]) {
                return true;//ping successful!
            }
            return false; //ping ended up being corrupted?
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 44).append("TeleStunPing.bindToStunServer, bind failed: ").append(valueOf).toString(), new Object[0]);
            return false;
        }
    }
}
