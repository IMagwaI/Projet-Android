package com.example.myapplication.widget

import android.app.Service
import android.appwidget.AppWidgetManager
import android.content.Intent
import android.os.IBinder
import com.example.myapplication.widget.NewAppWidget

class MemoQuotesService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val appWidgetManager = AppWidgetManager.getInstance(this)
        val allWidgetIds = intent?.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS)

        if (allWidgetIds != null) {
            for (appWidgetId in allWidgetIds) {
                NewAppWidget.updateAppWidget(this, appWidgetManager, appWidgetId)
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}