rootProject.extra.apply {
    set("androidPlugin", "com.android.tools.build:gradle:4.1.2")
    set("kotlinVersion", "1.4.21")
}

repositories {
    maven("https://maven.aliyun.com/nexus/content/groups/public/")
    google()
    jcenter()
}
