object Versions {
    const val gradle = "4.0.0"
    const val kotlin = "1.3.72"
    const val appcompat = "1.1.0"
    const val core_ktx = "1.2.0"
    const val material_component = "1.0.0"
    const val multi_dex = "2.0.1"
    const val constraint_layout = "1.1.3"
    const val retrofit = "2.7.1"
    const val ok_http = "4.4.0"
    const val work = "2.3.2"
    const val rx_java = "2.2.17"
    const val rx_android = "2.1.1"
    const val gson = "2.8.6"
    const val dagger = "2.26"
    const val lifecycle = "2.2.0"
    const val room = "2.2.4"
    const val paging = "2.1.1"
    const val glide = "4.11.0"
    const val timber = "4.7.1"
    const val shimmer = "0.5.0"

    /* test */
    const val junit = "4.12"
    const val ext_junit = "1.1.1"
    const val runner = "1.2.0"
    const val espresso = "3.2.0"
    const val mockito = "1.5.0"
    const val mockito_inline = "2.13.0"
    const val arch = "2.1.0"
}

object Plugin {
    const val android_application = "com.android.application"
    const val kotlin_android = "android"
    const val kotlin_android_extension = "android.extensions"
    const val kotlin_android_kapt = "kapt"
}

object Libs {
    const val gradle_lib = "com.android.tools.build:gradle:${Versions.gradle}"
    const val gradle_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Dependencies {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    const val material_component = "com.google.android.material:material:${Versions.material_component}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val app_compat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val multi_dex = "androidx.multidex:multidex:${Versions.multi_dex}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

    const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val view_model = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}"

    const val room_runtime = "androidx.room:room-runtime:${Versions.room}"
    const val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    const val room_rx_java = "androidx.room:room-rxjava2:${Versions.room}"
    const val room_testing = "androidx.room:room-testing:${Versions.room}"

    const val paging_runtime = "androidx.paging:paging-runtime:${Versions.paging}"
    const val paging_rx_java = "androidx.paging:paging-rxjava2:${Versions.paging}"
    const val paging_common = "androidx.paging:paging-common:${Versions.paging}"

    const val work_runtime = "androidx.work:work-runtime:${Versions.work}"
    const val work_rx_java = "androidx.work:work-rxjava2:${Versions.work}"

    const val dagger_android = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val dagger_processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glide_integration = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofit_rx_java = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    const val ok_http = "com.squareup.okhttp3:okhttp:${Versions.ok_http}"
    const val ok_http_url_connection = "com.squareup.okhttp3:okhttp-urlconnection:${Versions.ok_http}"
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.ok_http}"

    const val rx_java = "io.reactivex.rxjava2:rxjava:${Versions.rx_java}"
    const val rx_android = "io.reactivex.rxjava2:rxandroid:${Versions.rx_android}"

    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.shimmer}"
}

object TestDependencies {
    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    const val junit = "junit:junit:${Versions.junit}"
    const val kotlin_test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"

    const val test_runner = "androidx.test:runner:${Versions.runner}"
    const val test_ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val test_espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val arch_core_testing = "androidx.arch.core:core-testing:${Versions.arch}"

    const val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito}"
    const val mockito_inline = "org.mockito:mockito-inline:${Versions.mockito_inline}"
}

object RepoUrl {
    const val gradle = "https://plugins.gradle.org/m2/"
    const val jit_pack = "https://jitpack.io"
}