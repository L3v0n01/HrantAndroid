package com.adobe.hrantandroid

import android.app.Activity
import androidx.core.app.ShareCompat

/**
 * Created by Levon Arzumanyan on 11/23/21.
 * Project Name: ARMED
 * NOORLOGIC
 */

fun Activity.shareText(message: String) {
    val mimeType = "text/plain"
    val shareIntent = ShareCompat.IntentBuilder.from(this)
        .setText(message)
        .setType(mimeType)
        .intent

    if (shareIntent.resolveActivity(packageManager) != null) {
        startActivity(shareIntent)
    }
}