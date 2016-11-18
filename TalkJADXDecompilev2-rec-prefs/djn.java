package p000;

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
    private NfcAdapter f9957a;
    private Handler f9958b;
    private dhz f9959c;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gwb.m2349s("onCreate NfcHangoutFragment");
        this.f9958b = new Handler();
    }

    public NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        NdefMessage ndefMessage = null;
        gwb.m2358t("createNdefMessage");
        synchronized (this.f9958b) {
            this.f9958b.post(new djo(this));
            try {
                this.f9958b.wait();
            } catch (InterruptedException e) {
                gwb.m2358t("InterruptedException while creating NdefMessage.");
                return ndefMessage;
            }
        }
        if (this.f9959c == null) {
            gwb.m2358t("Could not fetch HangoutRequest. Will not send NdefMessage.");
            return ndefMessage;
        }
        try {
            NdefRecord createExternal = NdefRecord.createExternal("com.google.android.apps.hangouts", "hangoutrequest", gwb.m1948a(this.f9959c));
            return new NdefMessage(new NdefRecord[]{createExternal});
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2);
            gwb.m2358t(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Cannot serialize hangout request: ").append(valueOf).toString());
            return ndefMessage;
        }
    }

    void m12062a() {
        did s = dgg.m11692a().m11727s();
        if (s == null) {
            gwb.m2358t("HangoutState is null. Will not send NdefMessage");
        } else {
            ikd p = s.m11994p();
            if (p != null) {
                iqs k = p.m22139k();
                if (k != null) {
                    this.f9959c = s.m11981e().m11888b(k.m22949a());
                }
            }
        }
        synchronized (this.f9958b) {
            this.f9958b.notify();
        }
    }

    public void onResume() {
        super.onResume();
        this.f9957a = NfcAdapter.getDefaultAdapter(getActivity());
        if (this.f9957a != null) {
            this.f9957a.setNdefPushMessageCallback(this, getActivity(), new Activity[0]);
        }
    }
}
