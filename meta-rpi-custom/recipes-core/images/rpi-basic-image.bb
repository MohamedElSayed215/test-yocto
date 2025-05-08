DESCRIPTION = "Basic Yocto image for Raspberry Pi 3 with opkg, connman, libcamera, and Picamera2"
LICENSE = "MIT"

inherit core-image

# Ensure quilt-native is installed to avoid quilt-native dependency errors
IMAGE_INSTALL += " \
    quilt-native \
    packagegroup-core-boot \
    packagegroup-core-ssh-dropbear \
    bash \
    nano \
    python3 \
    opkg \
    connman \
    libcamera \
    libcamera-apps \
    python3-picamera2 \
    "

IMAGE_FEATURES += "package-management ssh-server-dropbear"
