DESCRIPTION = "Basic Yocto image for Raspberry Pi 3 with opkg, connman, libcamera, and Picamera2"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += " \
    packagegroup-core-boot \
    packagegroup-core-ssh-dropbear \
    bash \
    nano \
    python3 \
    python3-pip \
    python3-setuptools \
    opkg \
    connman \
    libcamera \
    libcamera-apps \
    python3-picamera2 \
    "

IMAGE_FEATURES += "package-management ssh-server-dropbear"
