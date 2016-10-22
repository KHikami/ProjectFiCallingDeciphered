import android.app.Activity;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcAdapter.CreateNdefMessageCallback;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;

public final class djn extends dr implements CreateNdefMessageCallback {
    private NfcAdapter a;
    private Handler b;
    private dhz c;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gwb.s("onCreate NfcHangoutFragment");
        this.b = new Handler();
    }

    public NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        NdefMessage ndefMessage = null;
        gwb.t("createNdefMessage");
        synchronized (this.b) {
            this.b.post(new djo(this));
            try {
                this.b.wait();
            } catch (InterruptedException e) {
                gwb.t("InterruptedException while creating NdefMessage.");
                return ndefMessage;
            }
        }
        if (this.c == null) {
            gwb.t("Could not fetch HangoutRequest. Will not send NdefMessage.");
            return ndefMessage;
        }
        try {
            NdefRecord createExternal = NdefRecord.createExternal("com.google.android.apps.hangouts", "hangoutrequest", gwb.a(this.c));
            return new NdefMessage(new NdefRecord[]{createExternal});
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2);
            gwb.t(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Cannot serialize hangout request: ").append(valueOf).toString());
            return ndefMessage;
        }
    }

    void a() {
        did s = dgg.a().s();
        if (s == null) {
            gwb.t("HangoutState is null. Will not send NdefMessage");
        } else {
            ikd p = s.p();
            if (p != null) {
                iqs k = p.k();
                if (k != null) {
                    this.c = s.e().b(k.a());
                }
            }
        }
        synchronized (this.b) {
            this.b.notify();
        }
    }

    public void onResume() {
        super.onResume();
        this.a = NfcAdapter.getDefaultAdapter(getActivity());
        if (this.a != null) {
            this.a.setNdefPushMessageCallback(this, getActivity(), new Activity[0]);
        }
    }
}
