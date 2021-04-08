package com.example.deepspeechmodule

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import com.example.componentframework.SapphireFrameworkService
import org.mozilla.*

class DeepSpeechModule: SapphireFrameworkService(){
    override fun onBind(intent: Intent?): IBinder? {
        Log.i(CLASS_NAME,"DeepSpeech service started")
        var binder: IBinder = Binder()

        return binder
    }
}