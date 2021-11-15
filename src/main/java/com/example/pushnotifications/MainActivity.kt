package com.example.pushnotifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun createChannel()
    {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            val title = "Channel Title"
            val info = "Info"
            val imp = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(PushNotif.CHANNEL_ID, title, imp).apply {
                description = info
            }
            val notificationManager: NotificationManager= getSystemService(Context.NOTIFICATION_SERVICE)as NotificationManager
                    notificationManager.createNotificationChannel(channel)
        }

    }

}