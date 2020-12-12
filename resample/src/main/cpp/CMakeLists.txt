# Sets the minimum version of CMake required to build your native library.
# This ensures that a certain set of CMake features is available to
# your build.

cmake_minimum_required(VERSION 3.4.1)

# Specifies a library name, specifies whether the library is STATIC or
# SHARED, and provides relative paths to the source code. You can
# define multiple libraries by adding multiple add_library() commands,
# and CMake builds them for you. When you build your app, Gradle
# automatically packages shared libraries with your APK.

add_library(
        # Library name
        resample

        # Sets the library as a shared library.
        SHARED

        # Sources
        common.h
        fastest_coeffs.h
        high_qual_coeffs.h
        mid_qual_coeffs.h
        samplerate.c
        src_linear.c
        src_sinc.c
        src_zoh.c

        # jni files
        resample.c
)

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
        resample
        android
        log)