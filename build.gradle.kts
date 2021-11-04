plugins {
    `java-platform`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform("com.google.firebase:firebase-bom:29.0.0"))

    constraints {
        group("AndroidX") {
            val activityVersion = "1.4.0"
            api("androidx.activity:activity-ktx:$activityVersion")
            api("androidx.activity:activity-compose:$activityVersion")
            api("androidx.annotation:annotation:1.2.0")
            api("androidx.appcompat:appcompat:1.3.1")
            api("androidx.browser:browser:1.3.0")
            api("androidx.constraintlayout:constraintlayout:2.1.1")
            api("androidx.coordinatorlayout:coordinatorlayout:1.1.0")
            api("androidx.core:core-ktx:1.7.0")
            api("androidx.core:core-splashscreen:1.0.0-alpha02")
            api("androidx.datastore:datastore-preferences:1.0.0")
            api("androidx.documentfile:documentfile:1.0.1")
            api("androidx.drawerlayout:drawerlayout:1.1.1")
            api("androidx.dynamicanimation:dynamicanimation-ktx:1.0.0-alpha03")
            api("androidx.fragment:fragment-ktx:1.3.6")
            val lifecycleVersion = "2.3.1"
            api("androidx.lifecycle:lifecycle-common:$lifecycleVersion")
            api("androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion")
            api("androidx.lifecycle:lifecycle-livedata:$lifecycleVersion")
            api("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
            api("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")
            api("androidx.lifecycle:lifecycle-process:$lifecycleVersion")
            api("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
            val navigationVersion = "2.3.5"
            api("androidx.navigation:navigation-fragment-ktx:$navigationVersion")
            api("androidx.navigation:navigation-ui-ktx:$navigationVersion")
            api("androidx.paging:paging-runtime:3.0.1")
            api("androidx.preference:preference-ktx:1.1.1")
            api("androidx.recyclerview:recyclerview:1.2.1")
            api("androidx.recyclerview:recyclerview-selection:1.1.0")
            val roomVersion = "2.3.0"
            api("androidx.room:room-compiler:$roomVersion")
            api("androidx.room:room-runtime:$roomVersion")
            api("androidx.room:room-ktx:$roomVersion")
            api("androidx.security:security-crypto:1.0.0-rc04")
            api("androidx.startup:startup-runtime:1.1.0")
            api("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
            api("androidx.transition:transition:1.4.1")
            api("androidx.viewpager2:viewpager2:1.1.0-beta01")
            api("androidx.webkit:webkit:1.4.0")
            api("androidx.work:work-runtime-ktx:2.7.0")
        }
        group("AndroidX Test") {
            api("androidx.arch.core:core-testing:2.1.0")
            api("androidx.test:core-ktx:1.4.0")
            api("androidx.test.ext:junit:1.1.3")
            api("androidx.test:rules:1.4.0")
            api("androidx.test:runner:1.4.0")
            api("androidx.test.uiautomator:uiautomator:2.2.0")
            api("androidx.work:work-testing:2.7.0")
        }

        group("Coil") {
            val coilVersion = "1.4.0"
            api("io.coil-kt:coil:$coilVersion")
            api("io.coil-kt:coil-compose:$coilVersion")
            api("io.coil-kt:coil-gif:$coilVersion")
        }
        group("exoplayer") {
            val exoplayerVersion = "2.14.2"
            api("com.google.android.exoplayer:exoplayer-core:$exoplayerVersion")
            api("com.google.android.exoplayer:exoplayer-ui:$exoplayerVersion")
        }
        group("Google") {
            api("com.google.android.libraries.places:places:2.5.0")
            api("com.google.android.libraries.maps:maps:3.1.0-beta")
            api("com.google.maps.android:android-maps-utils-v3:2.3.0")
            api("com.google.maps.android:maps-v3-ktx:3.2.0")
            api("com.google.maps.android:maps-utils-v3-ktx:3.2.0")
            api("com.google.auto.value:auto-value-annotations:1.8.2")
        }
        group("GooglePlayServices") {
            api("com.google.android.gms:play-services-location:18.0.0")
            api("com.google.android.gms:play-services-tasks:17.2.1")
            api("com.google.android.gms:play-services-basement:17.6.0")
            api("com.google.android.gms:play-services-base:17.6.0")
            api("com.google.android.gms:play-services-gcm:17.0.0")
            api("com.google.android.gms:play-services-mlkit-text-recognition:17.0.0")
        }
        group("Accompanist") {
            val accompanistVersion = "0.20.1"
            api("com.google.accompanist:accompanist-pager:$accompanistVersion")
            api("com.google.accompanist:accompanist-insets:$accompanistVersion")
        }
        group("Jetpack Compose") {
            val composeVersion = "1.0.4"
            api("androidx.compose.compiler:compiler:${composeVersion}")
            api("androidx.compose.runtime:runtime:${composeVersion}")
            api("androidx.compose.ui:ui:${composeVersion}")
            api("androidx.compose.ui:ui-util:${composeVersion}")
            api("androidx.compose.ui:ui-tooling:${composeVersion}")
            api("androidx.compose.foundation:foundation:${composeVersion}")
            api("androidx.compose.material:material:${composeVersion}")
            api("androidx.compose.material:material-icons-core:${composeVersion}")
            api("androidx.compose.material:material-icons-extended:${composeVersion}")
            api("androidx.compose.ui:ui-test-junit4:${composeVersion}")
            api("com.google.android.material:compose-theme-adapter:${composeVersion}")
            api("androidx.constraintlayout:constraintlayout-compose:1.0.0-rc01")
            api("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.0")
        }
        group("Koin") {
            val koinVersion = "3.1.3"
            api("io.insert-koin:koin-android:$koinVersion")
            api("io.insert-koin:koin-androidx-compose:$koinVersion")
            api("io.insert-koin:koin-core:$koinVersion")
            api("io.insert-koin:koin-test:$koinVersion")
        }
        group("KotlinX") {
            val coroutinesVersion = "1.5.2"
            api("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")
            api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")
            api("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion")
            api("org.jetbrains.kotlinx:kotlinx-datetime:0.3.1")
            val serializationVersion = "1.3.0"
            api("org.jetbrains.kotlinx:kotlinx-serialization-core:$serializationVersion")
            api("org.jetbrains.kotlinx:kotlinx-serialization-json:$serializationVersion")
            api("org.jetbrains.kotlinx:kotlinx-io-jvm:0.1.16")
        }
        group("Ktor") {
            val ktorVersion = "1.6.5"
            api("io.ktor:ktor-client-core:$ktorVersion")
            api("io.ktor:ktor-client-okhttp:$ktorVersion")
            api("io.ktor:ktor-client-logging:$ktorVersion")
            api("io.ktor:ktor-client-json:$ktorVersion")
            api("io.ktor:ktor-client-serialization:$ktorVersion")
            api("io.ktor:ktor-client-gson:$ktorVersion")
            api("io.ktor:ktor-client-encoding:$ktorVersion")
            api("io.ktor:ktor-client-mock:$ktorVersion")
        }
        group("Logging") {
            val slf4jVersion = "1.7.32"
            api("org.slf4j:slf4j-api:$slf4jVersion")
            api("org.slf4j:slf4j-simple:$slf4jVersion")
            api("com.github.tony19:logback-android:2.0.0")
            api("io.github.microutils:kotlin-logging:2.0.11")
        }
        group("Loupe") {
            api("com.igreenwood.loupe:loupe:1.2.1")
            api("com.igreenwood.loupe:extensions:1.0.0")
        }
        group("OkHttp") {
            val okHttp3Version = "4.9.2"
            api("com.squareup.okhttp3:okhttp:$okHttp3Version")
            api("com.squareup.okhttp3:logging-interceptor:$okHttp3Version")
            api("com.squareup.okhttp3:mockwebserver:$okHttp3Version")
        }
        group("Camera") {
            val cameraVersion = "1.1.0-alpha10"
            api("androidx.camera:camera-camera2:$cameraVersion")
            api("androidx.camera:camera-lifecycle:$cameraVersion")
            api("androidx.camera:camera-view:1.0.0-alpha30")
        }

        group("AMap") {
            api("com.amap.api:3dmap:8.1.0")
            api("com.amap.api:location:5.5.1")
            api("com.amap.api:search:7.9.0")
        }

        group("Chucker") {
            val chuckerVersion = "3.5.2"
            api("com.github.chuckerteam.chucker:library:$chuckerVersion")
            api("com.github.chuckerteam.chucker:library-no-op:$chuckerVersion")
        }
        group("Tencent"){
            api("com.tencent.bugly:crashreport:3.4.4")
        }

        api("org.jetbrains.kotlin:kotlin-test-junit:1.5.31")
        api("com.google.android.material:material:1.4.0")
        api("net.openid:appauth:0.10.0")
        api("io.arrow-kt:arrow-core-data:0.12.1")
        api("com.google.android.flexbox:flexbox:3.0.0")
        api("com.google.code.gson:gson:2.8.9")
        api("io.mockk:mockk:1.12.0")
        api("junit:junit:4.13.2")
        api("org.robolectric:robolectric:4.6.1")
        api("org.hamcrest:hamcrest:2.2")
        api("com.google.truth:truth:1.1.3")
        api("org.json:json:20210307")
        api("com.applandeo:material-calendar-view:1.7.0")
        api("com.benasher44:uuid:0.3.1")
        api("com.squareup.leakcanary:leakcanary-android:2.7")
        api("com.facebook.shimmer:shimmer:0.5.0")
        api("com.jakewharton:process-phoenix:2.0.0")
        api("com.github.barteksc:android-pdf-viewer:2.8.2")
        api("com.airbnb.android:lottie:4.2.0")
        api("com.github.PhilJay:MPAndroidChart:3.1.0")
        api("com.onesignal:OneSignal:4.6.1")
        api("com.github.wrdlbrnft:better-barcodes:0.3.0.46")
        api("com.kirich1409.viewbindingpropertydelegate:vbpd-noreflection:1.4.2")
        api("app.cash.turbine:turbine:0.7.0")
        api("com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.6")
        api("com.valentinilk.shimmer:compose-shimmer:1.0.1")
    }
}

/**
 * convenience pass-through function to group dependencies
 */
inline fun <T> T.group(@Suppress("UNUSED_PARAMETER") groupName: String = "", block: T.() -> Unit) = block()

fun String.offsetVersion(major: Int): String {
    val curMajor = substringBefore('.').toInt()
    val rest = substringAfter('.')
    return "${curMajor + major}.$rest"
}
